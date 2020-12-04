package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import java.util.ArrayList;

public class RepoPedidos {


    public static void damePedidos (Context context, Rutas ruta, int agrupado, Repo.ResponseArray<Pedidos> responseArray) {

        PedidosRequest pedidosRequest = new PedidosRequest();
        pedidosRequest.setCOD_RUTA("R1");
        pedidosRequest.setUSUARIO("d.gomez");
        pedidosRequest.setF_entrega(UtilsFechas.getHoy("yyyy-MM-dd"));

        pedidosRequest.setAGRUPADO(agrupado);

        WS_Pedidos.damePedidos(context, pedidosRequest, new Repo.ResponseArray<Pedidos>() {
            @Override
            public void response (int code, ArrayList<Pedidos> pedidos) {
                if (pedidos != null && pedidos.size() > 0) {
                    for (Pedidos pedido : pedidos) {
                        pedido.setPedidosAsociados(HelperPedidos.getPedidosRelacionados(pedidos, pedido));
                    }
                }
                switch (code) {
                    case Constantes.WS_OK:
                        //reeemplazamos el contenido local con los bultos que obtenemos y lo cargamos en el hilo de la pagina prncipal
                        responseArray.response(code, pedidos);
                        break;
                    case Constantes.WS_OFFLINE:
                        break;
                    default:

                        break;
                }
            }

            @Override
            public void error (int code, ArrayList<Pedidos> data) {

            }
        });
    }

}
