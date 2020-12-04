package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.ArrayList;

public class WS_Pedidos {


    public static void damePedidos (Context context, PedidosRequest request, Repo.ResponseArray<Pedidos> responseArray) {

        String url = "/DamePedidos";

        try {
            WebService.SendRequest(context, request, url, Constantes.POST, PedidosResponse.class, new VolleyCallback<Void, PedidosResponse>() {
                @Override
                public void onSuccess (int code, PedidosResponse responsePedidos, JSONObject response) {

                    ArrayList<Pedidos> pedidos = MapPedidos.fromBD(context, responsePedidos.pedidos);

                    if (Config.AGRUPAR_PEDIDOS_ALBARAN_TR) pedidos = HelperPedidos.agruparPedidosAlbaranTR(pedidos);

                    responseArray.response(code, pedidos);
                }

                @Override
                public void onError (int code, VolleyError error) {
                }

                @Override
                public void offline (int code) {
                    responseArray.response(Constantes.WS_OFFLINE, null);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void dameInfoPedidos (Context context, PedidosRequest request, Repo.ResponseArray<Pedidos> responseArray) {

        String url = "/DameInfoPedido";

        try {

            WebService.SendRequest(context, request, url, Constantes.POST, PedidosResponse.class, new VolleyCallback<Void, PedidosResponse>() {
                @Override
                public void onSuccess (int code, PedidosResponse responsePedidos, JSONObject response) {
                    responseArray.response(code, MapPedidos.fromBD(context, responsePedidos.pedidos));
                }

                @Override
                public void onError (int code, VolleyError error) {

                }

                @Override
                public void offline (int code) {
                    responseArray.response(Constantes.WS_OFFLINE, null);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
