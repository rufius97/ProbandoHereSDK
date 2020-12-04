package com.ventulabs.probandoheresdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.here.sdk.mapview.MapError;
import com.here.sdk.mapview.MapScene;
import com.here.sdk.mapview.MapScheme;
import com.here.sdk.mapview.MapView;
import com.ventulabs.probandoheresdk.informacion.Constantes;
import com.ventulabs.probandoheresdk.informacion.Dx;
import com.ventulabs.probandoheresdk.informacion.HelperEstados;
import com.ventulabs.probandoheresdk.informacion.HelperPedidos;
import com.ventulabs.probandoheresdk.informacion.Pedidos;
import com.ventulabs.probandoheresdk.informacion.Repo;
import com.ventulabs.probandoheresdk.informacion.RepoPedidos;
import com.ventulabs.probandoheresdk.informacion.Rutas;
import com.ventulabs.probandoheresdk.mapas.RoutePlanner;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    private Context context = MapActivity.this;

    private ArrayList<Pedidos> pedidos;

    private MapView mapView;
    private Button  btnOptimizar;

    private RoutePlanner routePlanner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Init.startGeoTrackingService(context);

        setUpView(savedInstanceState);
        loadMapScene();
    }

    private void setUpView(Bundle savedInstanceState) {
        mapView      = findViewById(R.id.mapView);
        btnOptimizar = findViewById(R.id.btnOptimizar);

        btnOptimizar.setOnClickListener(v -> routePlanner.optimizarRuta());

        mapView.onCreate(savedInstanceState);
    }

    private void loadMapScene() {
        mapView.getMapScene().loadScene(MapScheme.NORMAL_DAY, mapError -> {
            if (mapError == null) {
                routePlanner = new RoutePlanner(context, mapView);
                calcularRuta();
            }
        });
    }

    private void calcularRuta() {
        Rutas rutaUsuario = new Rutas();
        rutaUsuario.setCodigo("R1");
        rutaUsuario.setDescripcion("R1");

        RepoPedidos.damePedidos(context, rutaUsuario, Constantes.NO, new Repo.SuperResponseArray<Pedidos>() {
            @SuppressLint("MissingPermission")
            @Override
            public void response(int code, ArrayList<Pedidos> data) {
                ArrayList<Pedidos> pedidosEnReparto = HelperPedidos.filtrar(data, HelperEstados.dameEnReparto());

                if (pedidosEnReparto == null || pedidosEnReparto.size() == 0) {
                    Dx.confirmacion(context, "No hay pedidos que se encuentren en RUTA");
                    return;
                }

                pedidos = pedidosEnReparto;

                routePlanner.addRoute(Init.gt.getCoordenadas(), pedidosEnReparto);
            }
        });
    }

}
