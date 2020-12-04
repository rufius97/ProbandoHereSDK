package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ventulabs.probandoheresdk.R;

import org.json.JSONObject;

import es.icp.icp_commons.CheckRequest;
import es.icp.icp_commons.Interfaces.NewVolleyCallBack;
import es.icp.icp_commons.Objects.CheckRequestException;
import es.icp.icp_commons.Objects.ParametrosPeticion;

class WebService {

    public static <T, K extends BaseResponse> void SendRequestURL(final Context context, BaseRequest request, String url, int method, Class<K> clazz, final VolleyCallback<T, K> callback) {
        processRequest(context, request, url, method, clazz, callback);
    }

    public static <T, K extends BaseResponse> void SendRequest(final Context context, BaseRequest request, String urlPart, int method, Class<K> clazz, final VolleyCallback<T, K> callback) {
//        final String url = Config.URL + urlPart;
        final String url = ((Config.IS_DEBUG) ? Config.URL_DESARROLLO : Config.URL_PRODUCCION) + urlPart;
        processRequest(context, request, url, method, clazz, callback);
    }

    private static <T, K extends BaseResponse> void processRequest(final Context context, BaseRequest request, String url, int method, Class<K> clazz, final VolleyCallback<T, K> callback) {
        JSONObject json = request.toJsonObject();

        BaseResponse objectResponse = new BaseResponse();
        ParametrosPeticion parametros = new ParametrosPeticion();
        parametros.setClase(objectResponse.getClass());
        parametros.setUrl(url);
        parametros.setMethod(method == Constantes.POST ? ParametrosPeticion.Method.POST : ParametrosPeticion.Method.GET);
        parametros.setJSONObject(json);


        try {

            JSONObject finalJson = json;
            CheckRequest.CheckAndSend(context, parametros, new NewVolleyCallBack() {
                @Override
                public void onSuccess(Object result) {

                    try {
                        BaseResponse response = (BaseResponse) result;

                        K obj = clazz.newInstance();
                        obj.setRETCODE(response.RETCODE);
                        obj.setMENSAJE(response.MENSAJE);

                        if (response.getRETCODE() != Constantes.WS_OK) {

                            callback.onSuccess(response.RETCODE, obj, finalJson);
                            return;
                        }

                        if (response.getJSON_OUT()!= null && !response.getJSON_OUT().isEmpty()) {
                            obj = new Gson().fromJson(response.getJSON_OUT(), clazz);
                            //K kResponse = new Gson().fromJson(jsonOut.getDATA(), clazz);

                        }
                        callback.onSuccess(response.RETCODE, obj, finalJson);

                    } catch (Exception e) {
                        e.printStackTrace();
                        callback.onError(Constantes.WS_ERROR, null);
                    }
                }

                @Override
                public void onError(VolleyError error) {
                    //el error de mensaje lo capturamos aqui, así dejamos mas independiente la libreria
                    String mensaje = "";
                    if (Config.WS_OCULTACION_ERRORES) mensaje = Config.WS_MENSAJE_OCULTAR_ERRORES;
                    mensaje = context.getString(R.string.error_establecer_comunicacion);
                    Dx.error(context, mensaje);
                    callback.onError(Constantes.WS_ERROR, error);


                }

                @Override
                public void onOffline() {
                    callback.offline(Constantes.WS_OFFLINE);
                }
            }, true, 0, "", true); //utilizo GLobalVaribles para no ensuciar todas las llamdas de los metodos.
            //todo: volver a activar cuando se recibe quede fina la ejecucion de acciones tras un error de comunicacion

        } catch (CheckRequestException e) {
            e.printStackTrace();
        }
    }
}