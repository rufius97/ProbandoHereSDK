package com.ventulabs.probandoheresdk.informacion;

import java.util.ArrayList;

public class PedidosResponse extends BaseResponse {

    public ArrayList<Pedidos_WS> pedidos;

    @Override
    public String toString() {
        return "PedidosResponse{" + "pedidos=" + pedidos + '}';
    }
}
