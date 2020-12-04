package com.ventulabs.probandoheresdk.informacion;

import java.util.ArrayList;

public class HelperEstados {

    private static ArrayList<RelacionEstados> mapeos = new ArrayList<>();

    public static int[] dameTodosEstados() {
        int[] estados = {Constantes.ESTADO_ENVIO_EN_REPARTO, Constantes.ESTADO_ENVIO_EN_INCIDENCIA, Constantes.ESTADO_ENVIO_RETENIDO_EN_CUARENTENA,
                Constantes.ESTADO_ENVIO_RECHAZADO, Constantes.ESTADO_ENVIO_CANCELADO, Constantes.ESTADO_ENVIO_ANULADO,
                Constantes.ESTADO_ENVIO_EXTRAVIADO, Constantes.ESTADO_ENVIO_DEVUELTO_ORIGEN, Constantes.ESTADO_ENVIO_ENTREGADO,
                Constantes.ESTADO_RECOGIDA_ASIGNADA, Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA, Constantes.ESTADO_RECOGIDA_REALIZADA,
                Constantes.ESTADO_RECOGIDA_RECHAZADA, Constantes.ESTADO_RECOGIDA_CANCELADA, Constantes.ESTADO_RECOGIDA_EXTRAVIADA};
        return estados;
    }

    public static int[] bultosSeleccionRuta() {
        int[] estados = {Constantes.ESTADO_ENVIO_EN_REPARTO, Constantes.ESTADO_ENVIO_EN_INCIDENCIA, Constantes.ESTADO_ENVIO_RETENIDO_EN_CUARENTENA,
                Constantes.ESTADO_ENVIO_RECHAZADO, Constantes.ESTADO_ENVIO_CANCELADO, Constantes.ESTADO_ENVIO_ANULADO,
                Constantes.ESTADO_ENVIO_DEVUELTO_ORIGEN, Constantes.ESTADO_ENVIO_ENTREGADO, Constantes.ESTADO_RECOGIDA_ASIGNADA,
                Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA, Constantes.ESTADO_RECOGIDA_REALIZADA};
        return estados;
    }

    public static int[] dameEnReparto() {
        int[] estados = {Constantes.ESTADO_ENVIO_EN_REPARTO, Constantes.ESTADO_RECOGIDA_ASIGNADA};
        return estados;
    }

    public static int[] dameEntregados() {
        int[] estados = {Constantes.ESTADO_ENVIO_ENTREGADO, Constantes.ESTADO_RECOGIDA_REALIZADA};
        return estados;
    }

    public static int[] dameDevolucion() {
        int[] estados = {Constantes.ESTADO_ENVIO_EN_INCIDENCIA, Constantes.ESTADO_ENVIO_RETENIDO_EN_CUARENTENA, Constantes.ESTADO_ENVIO_RECHAZADO,
                Constantes.ESTADO_ENVIO_CANCELADO, Constantes.ESTADO_ENVIO_ANULADO, Constantes.ESTADO_ENVIO_EXTRAVIADO, Constantes.ESTADO_ENVIO_DEVUELTO_ORIGEN,
                Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA, Constantes.ESTADO_RECOGIDA_RECHAZADA, Constantes.ESTADO_RECOGIDA_CANCELADA};
        return estados;
    }

    public static int[] dameExtraviados() {
        int[] estados = {Constantes.ESTADO_ENVIO_EXTRAVIADO};
        return estados;
    }

    public static int[] dameEnTraspaso() {
        int[] estados = {Constantes.ESTADO_PEDIDO_EN_TRASPASO};
        return estados;
    }

    public static ArrayList<RelacionEstados> getMapeos() {
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_EN_INCIDENCIA, Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_RECHAZADO, Constantes.ESTADO_RECOGIDA_RECHAZADA));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_CANCELADO, Constantes.ESTADO_RECOGIDA_CANCELADA));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_ANULADO, Constantes.ESTADO_RECOGIDA_ANULADA));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_EXTRAVIADO, Constantes.ESTADO_RECOGIDA_EXTRAVIADA));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_DEVUELTO_ORIGEN, Constantes.ESTADO_RECOGIDA_DEVUELTO_ORIGEN));
        mapeos.add(new RelacionEstados(Constantes.ESTADO_ENVIO_ENTREGADO, Constantes.ESTADO_RECOGIDA_REALIZADA));
        return mapeos;
    }

    /**
     * Obtiene el estado dependiendo del tipo de pedido que estemos pasando, hay muchos estados que cambian si es un envio o una recogida,
     * con esta funcion se obtiene el estado relacionado dependiendo del tipo.
     * La relacion de los estados se encjenta mapeada en la funcion getMapeos
     *
     * @param pedido Pedido sobre el que se quiere obtener el estado
     * @param estado Estado que se quiere obtener
     * @return
     */
    public static int getEstadoRelacionado(Pedidos pedido, int estado) {
        for (RelacionEstados relacionEstados : getMapeos()) {
            if (relacionEstados.estadoEnvio == estado || relacionEstados.estadoRecogida == estado) {
                return (pedido.getTipo() == Constantes.TIPO_RECOGIDA) ? relacionEstados.estadoRecogida : relacionEstados.estadoEnvio;
            }
        }

        return estado;
    }


    public static boolean estaEnRuta(Pedidos pedido) {
        switch (pedido.getTipo()) {

            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_EN_REPARTO);

            case Constantes.TIPO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_RECOGIDA_ASIGNADA);

            default:
                return false;
        }
    }


    public static boolean estaEntregado(Pedidos pedido) {
        switch (pedido.getTipo()) {

            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_ENTREGADO);

            case Constantes.TIPO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_RECOGIDA_REALIZADA);

            default:
                return false;
        }
    }

    public static boolean estaIncidencia(Pedidos pedido) {
        switch (pedido.getTipo()) {

            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_EN_INCIDENCIA);

            case Constantes.TIPO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA);

            default:
                return false;
        }
    }

    public static boolean estaRechazado(Pedidos pedido) {
        switch (pedido.getTipo()) {

            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_RECHAZADO);

            case Constantes.TIPO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_RECHAZADO);

            default:
                return false;
        }
    }

    public static boolean estaNuevaFechaConcertada(Pedidos pedido) {
        switch (pedido.getTipo()) {

            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:

                return (pedido.getEstado() == Constantes.ESTADO_ENVIO_EN_INCIDENCIA && pedido.getTipoIncidencia() == Constantes.INCIDENCIA_CAMBIO_FECHA_CONCERTADA);

            case Constantes.TIPO_RECOGIDA:
                return (pedido.getEstado() == Constantes.ESTADO_RECOGIDA_EN_INCIDENCIA && pedido.getTipoIncidencia() == Constantes.INCIDENCIA_CAMBIO_FECHA_CONCERTADA);

            default:
                return false;
        }
    }

    public static boolean estaFueraRuta(Pedidos pedido) {
        return (HelperEstados.estaIncidencia(pedido) && pedido.getTipoIncidencia() == Constantes.INCIDENCIA_FUERA_RUTA);


    }

    public static class RelacionEstados {
        private int estadoEnvio;
        private int estadoRecogida;

        public RelacionEstados(int estadoEnvio, int estadoRecogida) {
            this.estadoEnvio    = estadoEnvio;
            this.estadoRecogida = estadoRecogida;
        }
    }
}
