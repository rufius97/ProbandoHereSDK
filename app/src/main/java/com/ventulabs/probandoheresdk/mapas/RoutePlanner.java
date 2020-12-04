package com.ventulabs.probandoheresdk.mapas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.android.volley.VolleyError;
import com.here.sdk.core.Color;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.GeoPolyline;
import com.here.sdk.core.errors.InstantiationErrorException;
import com.here.sdk.mapview.MapCamera;
import com.here.sdk.mapview.MapImage;
import com.here.sdk.mapview.MapImageFactory;
import com.here.sdk.mapview.MapMarker;
import com.here.sdk.mapview.MapPolyline;
import com.here.sdk.mapview.MapScene;
import com.here.sdk.mapview.MapView;
import com.here.sdk.routing.CalculateRouteCallback;
import com.here.sdk.routing.CarOptions;
import com.here.sdk.routing.Route;
import com.here.sdk.routing.RoutingEngine;
import com.here.sdk.routing.RoutingError;
import com.here.sdk.routing.Waypoint;
import com.ventulabs.probandoheresdk.R;
import com.ventulabs.probandoheresdk.informacion.Pedidos;
import com.ventulabs.probandoheresdk.informacion.Utils;
import com.ventulabs.probandoheresdk.informacion.VolleyCallback;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import es.icp.icp_commons.CheckRequest;
import es.icp.icp_commons.Interfaces.NewVolleyCallBack;
import es.icp.icp_commons.Objects.CheckRequestException;
import es.icp.icp_commons.Objects.Coordenada;
import es.icp.icp_commons.Objects.ParametrosPeticion;

public class RoutePlanner {

    private static final String TAG = RoutePlanner.class.getName();

    private       Context             context;
    private       MapView             mapView;
    private final List<MapMarker>     mapMarkerList = new ArrayList<>();
    private final List<MapPolyline>   mapPolylines  = new ArrayList<>();
    private       ArrayList<Waypoint> waypoints     = new ArrayList<>();
    private       RoutingEngine       routingEngine;
    private       GeoCoordinates      startGeoCoordinates;
    private       GeoCoordinates      destinationGeoCoordinates;
    private       MapCamera           camera;
    private       Paint               paint;
    private       int                 contador      = 0;

    public RoutePlanner(Context context, MapView mapView) {
        this.context = context;
        this.mapView = mapView;
        camera       = mapView.getCamera();
        double distanceInMeters = 1000 * 10;
        camera.lookAt(new GeoCoordinates(52.520798, 13.409408), distanceInMeters);
        paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, android.R.color.black));
        paint.setTextSize(24);

        try {
            routingEngine = new RoutingEngine();
        } catch (InstantiationErrorException e) {
            throw new RuntimeException("Initialization of RoutingEngine failed: " + e.error.name());
        }
    }

    public void addRoute(Coordenada puntoPartida, ArrayList<Pedidos> pedidos) {
        startGeoCoordinates = new GeoCoordinates(puntoPartida.getLatitud(), puntoPartida.getLongitud());
        Waypoint startWaypoint = new Waypoint(startGeoCoordinates);
        waypoints = new ArrayList<>(Collections.singletonList(startWaypoint));
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        for (Pedidos pedido : pedidos) {
            try {
                Number latitud = null, longitud = null;
                if (pedido.getLatitudEntrega() != null && pedido.getLongitudEntrega() != null) {
                    latitud  = format.parse(pedido.getLatitudEntrega());
                    longitud = format.parse(pedido.getLongitudEntrega());
                }
                if (latitud != null && longitud != null && latitud.doubleValue() != 0 && longitud.doubleValue() != 0) {
                    waypoints.add(new Waypoint(new GeoCoordinates(latitud.doubleValue(), longitud.doubleValue())));
                } else {
                    // TODO: 30/11/2020 Gestionar los puntos que no estén todavía normalizados
                }
            } catch (NumberFormatException | ParseException e) {
                e.printStackTrace();
            }
        }

        calcularRuta();
    }

    private void calcularRuta() {
        clearMap();
        routingEngine.calculateRoute(
                waypoints,
                new CarOptions(),
                new CalculateRouteCallback() {
                    @Override
                    public void onRouteCalculated(@Nullable RoutingError routingError, @Nullable List<Route> routes) {
                        if (routingError == null) {
                            Route route = routes.get(0);
                            showRouteDetails(route);
                            showRouteOnMap(route);
                            zoomRoute(route);
                        } else {
                            showDialog("Error while calculating a route:", routingError.toString());
                        }
                    }
                });
    }

    private void zoomRoute(Route route) {
        GeoBox routeGeoBox = route.getBoundingBox();
        camera.lookAt(routeGeoBox, new MapCamera.OrientationUpdate());
    }

    private void showRouteDetails(Route route) {
        long estimatedTravelTimeInSeconds = route.getDurationInSeconds();
        int  lengthInMeters               = route.getLengthInMeters();

        String routeDetails =
                "Travel Time: " + formatTime(estimatedTravelTimeInSeconds)
                        + ", Length: " + formatLength(lengthInMeters);

        showDialog("Route Details", routeDetails);
    }

    private String formatTime(long sec) {
        int hours   = (int) (sec / 3600);
        int minutes = (int) ((sec % 3600) / 60);

        return String.format(Locale.getDefault(), "%02d:%02d", hours, minutes);
    }

    private String formatLength(int meters) {
        int kilometers      = meters / 1000;
        int remainingMeters = meters % 1000;

        return String.format(Locale.getDefault(), "%02d.%02d km", kilometers, remainingMeters);
    }

    public void optimizarRuta() {
        String mode = "fastest";
        String type = "car";
        String traffic = "disabled";
        String app_id = "fQsaeFcVy6ZVyhsL2wqJ";
        String app_code = "SGLPj9ltarT3rCBiBJBFDg";
        String departure = "2016-10-14T07:30:00%2b02:00";
        String restTimes = "durations:16200,2700,32400,39600";
        String serviceTimes = "work";
        String end = "";
        String improveFor = "DISTANCE";//"TIME";

        String peticion = "https://wse.api.here.com/2/findsequence.json?mode=" + mode + ";" + type + ";traffic:" + traffic + ";" +
                "&app_id=" + app_id +
                "&app_code=" + app_code +
                "&start=" + waypoints.get(0).coordinates.latitude + "%2C" + waypoints.get(0).coordinates.longitude +
                "&departure=" + departure +
                "&restTimes=" + restTimes + ";serviceTimes:" + serviceTimes +
                "&end=" + end;

        for (int i = 1; i < waypoints.size(); i++) {
            Waypoint waypoint = waypoints.get(i);
            peticion += "&destination" + i + "=" + waypoint.coordinates.latitude + "%2C" + waypoint.coordinates.longitude;
        }

        peticion += "&improveFor=" + improveFor;

        try {
            CheckRequest.CheckAndSend(
                    context,
                    new ParametrosPeticion(
                            ParametrosPeticion.Method.GET,
                            peticion,
                            null,
                            FindSequenceResult.class
                    ),
                    new NewVolleyCallBack() {
                        @Override
                        public void onSuccess(Object result) {
                            FindSequenceResult findSequenceResult = (FindSequenceResult) result;
                            procesarDestinos(((FindSequenceResult) result).getResults().get(0).getWaypoints());
                        }

                        @Override
                        public void onError(VolleyError error) {
                            error.toString();
                        }

                        @Override
                        public void onOffline() {

                        }
                    },
                    true
            );
        } catch (CheckRequestException e) {
            e.printStackTrace();
        }
    }

    private void procesarDestinos(ArrayList<Punto> destinos) {
        ArrayList<Waypoint> waypoints = new ArrayList<>();
        for (Punto destino : destinos) {
            String id = destino.getId();
            if (id.equals("start")) waypoints.add(this.waypoints.get(0));
            else {
                int index = Integer.parseInt(id.substring(11));
                waypoints.add(this.waypoints.get(index));
            }
        }
        this.waypoints = waypoints;

        calcularRuta();
    }

    private void showRouteOnMap(Route route) {
        // Show route as polyline.
        GeoPolyline routeGeoPolyline;
        try {
            routeGeoPolyline = new GeoPolyline(route.getPolyline());
        } catch (InstantiationErrorException e) {
            // It should never happen that a route polyline contains less than two vertices.
            return;
        }

        float widthInPixels = 10;
        MapPolyline routeMapPolyline = new MapPolyline(routeGeoPolyline,
                widthInPixels,
                Color.valueOf(0, 0.56f, 0.54f, 0.63f)); // RGBA

        mapView.getMapScene().addMapPolyline(routeMapPolyline);
        mapPolylines.add(routeMapPolyline);

        addCircleMapMarker(waypoints.get(0).coordinates, R.drawable.icon_map);

        if (waypoints.size() > 1) {
            for (int i = 1; i < waypoints.size() - 1; i++) {
                Waypoint waypoint = waypoints.get(i);
                addCircleMapMarker(waypoint.coordinates, R.drawable.icon_map);
            }
        }

        if (waypoints.size() > 0) {
            addCircleMapMarker(waypoints.get(waypoints.size() - 1).coordinates, R.drawable.icon_map);
        }

        mapView.getMapScene().setLayerState(MapScene.Layers.TRAFFIC_FLOW, MapScene.LayerState.VISIBLE);
        mapView.getMapScene().setLayerState(MapScene.Layers.TRAFFIC_INCIDENTS, MapScene.LayerState.VISIBLE);

//        float widthInPixels = 10;
//        for (Section section : route.getSections()) {
//            MapPolyline routeMapPolyline = null;
//            int color = ContextCompat.getColor(context, android.R.color.holo_green_light);
//            if (section.getTrafficSpeeds().)
//
//            try {
//                routeMapPolyline = new MapPolyline(new GeoPolyline(section.getPolyline()),
//                        widthInPixels,
//                        Color.valueOf(0, 0.56f, 0.54f, 0.63f));
//            } catch (InstantiationErrorException e) {
//                e.printStackTrace();
//            }
//
//            mapView.getMapScene().addMapPolyline(routeMapPolyline);
//            mapPolylines.add(routeMapPolyline);
//        }
    }

    public void clearMap() {
        clearWaypointMapMarker();
        clearRoute();
        contador = 0;
    }

    private void clearWaypointMapMarker() {
        for (MapMarker mapMarker : mapMarkerList) {
            mapView.getMapScene().removeMapMarker(mapMarker);
        }
        mapMarkerList.clear();
    }

    private void clearRoute() {
        for (MapPolyline mapPolyline : mapPolylines) {
            mapView.getMapScene().removeMapPolyline(mapPolyline);
        }
        mapPolylines.clear();
    }

    private void addCircleMapMarker(GeoCoordinates geoCoordinates, int resourceId) {
        Bitmap.Config conf   = Bitmap.Config.ARGB_8888;
        Bitmap        bmp    = Bitmap.createBitmap(200, 200, conf);
        Canvas        canvas = new Canvas(bmp);
        Bitmap        b      = BitmapFactory.decodeResource(context.getResources(), resourceId);
        canvas.drawBitmap(b, 0, 0, paint);
        canvas.drawText(String.valueOf(contador + 1), 0, 50, paint);
        contador++;

        MapImage  mapImage  = MapImageFactory.fromBitmap(bmp);
        MapMarker mapMarker = new MapMarker(geoCoordinates, mapImage);

        mapView.getMapScene().addMapMarker(mapMarker);
        mapMarkerList.add(mapMarker);

//        MapImage mapImage = MapImageFactory.fromResource(context.getResources(), resourceId);
//        MapMarker mapMarker = new MapMarker(geoCoordinates, mapImage);
////        mapMarker.set
//        mapView.getMapScene().addMapMarker(mapMarker);
//        mapMarkerList.add(mapMarker);
    }

    private void showDialog(String title, String message) {
        Utils.mostrarMensajeRecordatorio(message, 3000, title, context);
    }
}
