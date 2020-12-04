package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import java.util.ArrayList;

public class HelperPedidos {

    public static Pedidos damePedidoCodigo (ArrayList<Pedidos> pedidos, String codigoPedido) {
        codigoPedido = codigoPedido.trim().toUpperCase();
        for (Pedidos p : pedidos) {
            if (p.getCodigoPedido().toUpperCase().equals(codigoPedido)) return p;

            for (Bultos bulto : p.getBultos()) {
                if (bulto.getCodigo().toUpperCase().equals(codigoPedido)) return p;
            }
        }
        return null;
    }

    public static boolean leerBulto (Pedidos pedido, String codigoBulto) {
        for (Bultos bulto : pedido.getBultos()) {
            if (bulto.getCodigo().toUpperCase().equals(codigoBulto)) {
                bulto.setLeido(true);
                return true;
            }
        }
        return false;
    }

    public static boolean bultosLeidos (Pedidos pedido) {
        for (Bultos bulto : pedido.getBultos()) {
            if (!bulto.getLeido()) return false;
        }
        return true;
    }

    public static ArrayList<Pedidos> filtrar (ArrayList<Pedidos> pedidos, int[] estados) {
        ArrayList<Pedidos> pedidosTmp = new ArrayList<Pedidos>();
        for (Pedidos pedido : pedidos) {

            //int estadoPedido = pedido.getEstado();
            for (int i = 0; i < estados.length; i++) {
                int estado = estados[i];
                if (pedido.getEstado() == estado) {
                    pedidosTmp.add(pedido);
                }
            }
        }

        return pedidosTmp;
    }

    public static ArrayList<Pedidos> soloConRutaTemporal (ArrayList<Pedidos> pedidos) {
        ArrayList<Pedidos> pedidosTmp = new ArrayList<Pedidos>();
        for (Pedidos pedido : pedidos) {
            //int estadoPedido = pedido.getEstado();
                if (pedido.isEnTraspaso()    ) {
                    pedidosTmp.add(pedido);
                }

        }


        return pedidosTmp;
    }

    public static ArrayList<Pedidos> buscar (ArrayList<Pedidos> pedidos, String busca) {
        ArrayList<Pedidos> pedidosTmp = new ArrayList<Pedidos>();
        busca = busca.toUpperCase();
        if (pedidos == null || pedidos.size() == 0) return pedidosTmp;
        for (Pedidos pedido : pedidos) {
          //  MyLog.v(pedido.toString());
            if ((pedido.getPeticion().toUpperCase().contains(busca)) || (pedido.getCodigoPedido().toUpperCase().contains(busca)) || (pedido.getAlbaran().toUpperCase().contains(busca)) || (pedido.getAlbaraTR().toUpperCase().contains(busca)) || (pedido.getPoblacion().toUpperCase().contains(busca)) || (pedido.getProvincia().toUpperCase().contains(busca)) || (pedido.getCodPostal().toUpperCase().contains(busca)) || (pedido.getNombreCliente().toUpperCase().contains(busca)) || (pedido.getDireccion().toUpperCase().contains(busca))) {
                pedidosTmp.add(pedido);
            }
        }
        //MyLog.c("Pedidos: " + pedidos.size() + " Res Buscar:" + pedidosTmp.size());
        return pedidosTmp;
    }

    public static boolean existeAlbaraTR (ArrayList<Pedidos> arr, Pedidos p) {
        for (Pedidos pedido : arr) {
            if (pedido.getAlbaraTR().equals(p.getAlbaraTR())) return true;
        }
        return false;
    }

    public static Pedidos damePedidoAlbaranTR (ArrayList<Pedidos> arr, Pedidos p) {

        for (Pedidos pedido : arr) {
            if (pedido.getAlbaraTR().equals(p.getAlbaraTR())) return pedido;
        }
        return null;
    }

    public static ArrayList<Pedidos> agruparPedidosAlbaranTR (ArrayList<Pedidos> pedidos) {
        ArrayList<Pedidos> pedidosTmp = new ArrayList<Pedidos>();

        for (Pedidos pedido : pedidos) {
            Pedidos pedidoTR = pedido;
            if (pedido.getAlbaraTR() != null) {
                pedidoTR = HelperPedidos.damePedidoAlbaranTR(pedidosTmp, pedido);
            }

            if (pedidoTR == null) {
                pedidosTmp.add(pedido);
            } else {

                for (Bultos b : pedido.getBultos()) {
                    pedidoTR.addBulto(b);
                }
            }
        }

        return pedidosTmp;
    }

    public static Pedidos copiar (Pedidos pedidoOriginal, boolean copiarBultos) {
        Pedidos pedido = new Pedidos();

        pedido.setSistema(pedidoOriginal.getSistema());
        pedido.setPeticion(pedidoOriginal.getPeticion());
        pedido.setPeticionUni2(pedidoOriginal.getPeticionUni2());
        pedido.setCodigoPedido(pedidoOriginal.getCodigoPedido());
        pedido.setCodRuta(pedidoOriginal.getCodRuta());
        pedido.setNombreCliente(pedidoOriginal.getNombreCliente());
        pedido.setDireccion(pedidoOriginal.getDireccion());
        pedido.setTelefono(pedidoOriginal.getTelefono());
        pedido.setTelefono2(pedidoOriginal.getTelefono2());
        pedido.setTelefono3(pedidoOriginal.getTelefono3());
        pedido.setCodPostal(pedidoOriginal.getCodPostal());
        pedido.setPoblacion(pedidoOriginal.getPoblacion());
        pedido.setProvincia(pedidoOriginal.getProvincia());
        pedido.setPais(pedidoOriginal.getPais());
        pedido.setObservacionesFirma(pedidoOriginal.getObservacionesFirma());
        pedido.setObservacionesRechazo(pedidoOriginal.getObservacionesRechazo());
        pedido.setDniScl(pedidoOriginal.getDniScl());
        pedido.setNombreMensjero(pedidoOriginal.getNombreMensjero());
        pedido.setEstado(pedidoOriginal.getEstado());
        pedido.setFirmado(pedidoOriginal.isFirmado());
        pedido.setClaveSituacion(pedidoOriginal.getClaveSituacion());
        pedido.setCodigoIncidencia(pedidoOriginal.getCodigoIncidencia());
        pedido.setTipoIncidencia(pedidoOriginal.getTipoIncidencia());
        pedido.setMotivoRechazo(pedidoOriginal.getMotivoRechazo());
        pedido.setRutaFirma(pedidoOriginal.getRutaFirma());
        pedido.setAlbaran(pedidoOriginal.getAlbaran());
        pedido.setAlbaraTR(pedidoOriginal.getAlbaraTR());
        pedido.setTieneIncidencia(pedidoOriginal.isTieneIncidencia());
        pedido.setConexion(pedidoOriginal.getConexion());
        pedido.setScl(pedidoOriginal.getScl());
        pedido.setCuentaTr(pedidoOriginal.getCuentaTr());
        pedido.setIdSolicitud(pedidoOriginal.getIdSolicitud());
        pedido.setServicioEspecial(pedidoOriginal.getServicioEspecial());
        pedido.setDniFirma(pedidoOriginal.getDniFirma());
        pedido.setLongitudEntrega(pedidoOriginal.getLongitudEntrega());
        pedido.setLatitudEntrega(pedidoOriginal.getLatitudEntrega());
        pedido.setEntregarOtroDestinatario(pedidoOriginal.isEntregarOtroDestinatario());
        pedido.setCodigoAyuda(pedidoOriginal.getCodigoAyuda());
        pedido.setValidacionBancaria(pedidoOriginal.isValidacionBancaria());
        pedido.setRutaImagenValidacionBancaria(pedidoOriginal.getRutaImagenValidacionBancaria());
        pedido.setCodRutaTemporal(pedidoOriginal.getCodRutaTemporal());

        pedido.setBultos(new ArrayList<Bultos>());

        if (copiarBultos) {
            for (Bultos bultoOriginal : pedidoOriginal.getBultos()) {
                Bultos bulto = new Bultos();
                bulto.setCodigoPedido(bultoOriginal.getCodigoPedido());
                bulto.setOrden(bultoOriginal.getOrden());
                bulto.setCodigo(bultoOriginal.getCodigo());
                bulto.setPeso(bultoOriginal.getPeso());
                bulto.setLeido(bultoOriginal.getLeido());
                pedido.addBulto(bulto);
            }
        }

        //datos del remitente, se utiliza en las recogidas
        pedido.setRemitNombre(pedidoOriginal.getRemitNombre());
        pedido.setRemitNif(pedidoOriginal.getRemitNif());
        pedido.setRemitDireccion(pedidoOriginal.getRemitDireccion());
        pedido.setRemitCod_postal(pedidoOriginal.getRemitCod_postal());
        pedido.setRemitPoblacion(pedidoOriginal.getRemitPoblacion());
        pedido.setRemitProvincia(pedidoOriginal.getRemitProvincia());
        pedido.setRemitCod_pais(pedidoOriginal.getRemitCod_pais());
        pedido.setRemitContacto(pedidoOriginal.getRemitContacto());
        pedido.setRemitTelefono(pedidoOriginal.getRemitTelefono());

        pedido.setTipo(pedidoOriginal.getTipo());

        ArrayList<LineasRecogidas> lineasRecogidasArrayList = new ArrayList<>();

        //lineas de recogidas
        for (LineasRecogidas lws : pedidoOriginal.getLineasRecogidas()) {
            LineasRecogidas lr = new LineasRecogidas();
            lr.setIdOsl(lws.getIdOsl());
            lr.setDescripcion(lws.getDescripcion());
            lr.setDatoCotejo(lws.getDatoCotejo());
            lr.setTipoCotejo(lws.getTipoCotejo());
            lr.setCorrecto(lws.isCorrecto());
            lineasRecogidasArrayList.add(lr);
        }
        pedido.setLineasRecogidas(lineasRecogidasArrayList);

        //relaciones entre los pedidos
        ArrayList<Relaciones> relaciones = new ArrayList<>();
        for (Relaciones rws : pedidoOriginal.getRelaciones()) {
            Relaciones r = new Relaciones();
            r.setIdOscEnvio(rws.getIdOscEnvio());
            r.setIdOscRecogida(rws.getIdOscRecogida());
            relaciones.add(r);
        }
        pedido.setRelaciones(relaciones);

        return pedido;
    }

    public static boolean tieneObservaciones (Pedidos pedido) {
        if (pedido.getObservacionesEntrega() != null && pedido.getObservacionesEntrega().trim().length() > 0)
            return true;
        if (pedido.getObservacionesCliente() != null && pedido.getObservacionesCliente().trim().length() > 0)
            return true;
        if (pedido.getObservacionesInternas() != null && pedido.getObservacionesInternas().trim().length() > 0)
            return true;

        return false;
    }

    public static String dameObservaciones (Pedidos pedido) {
        StringBuilder builder = new StringBuilder();

        builder.append("");
        //observaciones del cliente
        if ((pedido.getObservacionesCliente() != null) && (pedido.getObservacionesCliente().trim().length() > 0)) {
            builder.append(String.format("%s <br/> %s <br/><br/>", UtilsTextos.destacar("Obs. Cliente", false), pedido.getObservacionesCliente().trim()));
        }

        //observaciones para la entrega
        if ((pedido.getObservacionesEntrega() != null) && (pedido.getObservacionesEntrega().trim().length() > 0)) {
            builder.append(String.format("%s <br/> %s <br/><br/>", UtilsTextos.destacar("Obs. Entrega", false), pedido.getObservacionesEntrega().trim()));
        }

        //observaciones internas
        if ((pedido.getObservacionesInternas() != null) && (pedido.getObservacionesInternas().trim().length() > 0)) {
            builder.append(String.format("%s <br/> %s <br/><br/>", UtilsTextos.destacar("Obs. Internas", false), pedido.getObservacionesInternas().trim()));
        }
        return builder.toString();
    }

    public static ArrayList<Integer> getPedidosRelacionados (ArrayList<Pedidos> pedidos, Pedidos pedido) {
        ArrayList<Integer> idPedidos = new ArrayList<>();
        for (Pedidos p : pedidos) {
            if ((p.getDniScl().toLowerCase().equals(pedido.getDniScl().toLowerCase())) && p.getIdCab() != pedido.getIdCab()) {
                idPedidos.add(p.getIdCab());
            }
        }

        return idPedidos;
    }

}
