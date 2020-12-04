package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import java.util.ArrayList;

import es.icp.icp_commons.Loading;

public class MapPedidos {

    public static ArrayList<Pedidos> fromBD (Context context, ArrayList<Pedidos_WS> pedidos_WS) {
        ArrayList<Pedidos> arr = new ArrayList<>();

        Loading.ShowLoading(context, "Trabajando...", "Tratando información. Por favor, espere...", false);

        if (pedidos_WS == null || pedidos_WS.size() == 0) return arr;
        int contador = 0;
        for (Pedidos_WS pedido_ws : pedidos_WS) {

            //if (pedido_ws.getPETICION().equals("000012449411")) MyLog.c("Encontrado 000012449411 tIPO:" + pedido_ws.getTIPO_ENVIO());

           // MyLog.c(pedido_ws.getPETICION() + " Telefono 2_ " + pedido_ws.getTELEFONO2() + " Telefono3 : " + pedido_ws.getTELEFONO3());

            Pedidos pedido = new Pedidos();

            pedido.setIdCab(pedido_ws.getID());
            pedido.setCodigoPedido(pedido_ws.getALBARAN_VENTA());
            pedido.setPeticion(pedido_ws.getPETICION());
            pedido.setNombreCliente(pedido_ws.getNOMBRE_CLIENTE());

            pedido.setTelefono(pedido_ws.getTELEFONO());
            pedido.setTelefono2(pedido_ws.getTELEFONO2());
            pedido.setTelefono3(pedido_ws.getTELEFONO3());

            //procesamos los telefono
            String telefonos[] = new String[]{pedido.getTelefono(), pedido.getTelefono2(), pedido.getTelefono3()};

            for (int i = 0; i < telefonos.length; i++) {
                String telA = telefonos[i];
                for (int j = i; j < telefonos.length; j++) {
                    String telB = telefonos[j];

                    if (i != j && telA.equals(telB)) {
                        if (j == 1) pedido.setTelefono2("");
                        if (j == 2) pedido.setTelefono3("");
                    }
                }
            }


            pedido.setDireccion(pedido_ws.getDIRECCION_ENTREGA());
            pedido.setCodPostal(pedido_ws.getCOD_POSTAL());
            pedido.setPoblacion(pedido_ws.getPOBLACION());
            pedido.setProvincia(pedido_ws.getPROVINCIA());
            pedido.setPais(pedido_ws.getCOD_PAIS());
            pedido.setAlbaran(pedido_ws.getALBARAN_VENTA());
            pedido.setAlbaraTR(pedido_ws.getALBARAN_TR());
            pedido.setScl(pedido_ws.getSCL());
            pedido.setConexion(pedido_ws.getID_CONEXION());
            String claveSituacion = pedido_ws.getCLAVE_SITUACION();

            if (claveSituacion == null || claveSituacion.trim().length() == 0) claveSituacion = Constantes.CLAVE_SITUACION_EN_RUTA;
            if (pedido_ws.getTIPO_ENVIO() == Constantes.TIPO_RECOGIDA && pedido_ws.getESTADO() == Constantes.RECOGIDA_ASIGNADA_CHOFER) claveSituacion = Constantes.CLAVE_SITUACION_RECOGIDA_ASIGNADA_CHOFER;
            if (pedido_ws.getESTADO() == Constantes.PEDIDO_ESTADO_ENTREGADO) claveSituacion = Constantes.CLAVE_SITUACION_PEDIDO_ENTREGADO;


            pedido.setEstado(pedido_ws.getESTADO());
            pedido.setClaveSituacion(claveSituacion);
            pedido.setCodigoIncidencia(pedido_ws.getCOD_INCIDENCIA());
            pedido.setTipoIncidencia( pedido_ws.getTIPO_INCIDENCIA());

            pedido.setCodRuta(pedido_ws.getCOD_RUTA());
            pedido.setCuentaTr(pedido_ws.getCUENTA_TR());
            pedido.setIdSolicitud(pedido_ws.getID_SOLICITUD());
            pedido.setServicioEspecial(pedido_ws.getSERVICIO_ESPECIAL());
            pedido.setObservacionesEntrega(pedido_ws.getOBS_ENTREGA());
            pedido.setObservacionesCliente(pedido_ws.getOBS_CLIENTE());
            pedido.setObservacionesInternas(pedido_ws.getOBS_INTERNAS());
            pedido.setDniScl(pedido_ws.getNUM_DOCUMENTO());
            pedido.setFechaConcertada(pedido_ws.getF_ENTREGA_CONCERTADA());
            pedido.setFranjaHoraria(pedido_ws.getFRANJA_HORARIA());
            pedido.setDocumentacionIncorrecta(pedido_ws.getDOCUMENTACION_INCORRECTA() == Constantes.SI ? true : false);
            pedido.setLongitudEntrega(pedido_ws.getLONGITUD());
            pedido.setLatitudEntrega(pedido_ws.getLATITUD());
            pedido.setCodigoAyuda(pedido_ws.getCODIGO_AYUDA());

            pedido.setMotivoRechazo(pedido_ws.getMOTIVO_RECHAZO());

            //   if (Config.EN_DESARROLLO )pedido.setValidacionBancaria(true);

            pedido.setValidacionBancaria(pedido_ws.getSERVICIO_ESPECIAL() == Constantes.VALIDACION_TIPO_ENTREGA_DNI_FOTO_EXTRACTO_BANCARIO);

            //bultos del pedido
            ArrayList<Bultos> arrBultos = new ArrayList<>();
            if (pedido_ws.getBULTOS() != null) {
                for (Bultos_WS bultoBD : pedido_ws.getBULTOS()) {
                    Bultos bulto = new Bultos();
                    bulto.setOrden(bultoBD.getNUM_BULTO());
                    bulto.setCodigo(bultoBD.getCOD_BULTO());
                    bulto.setPeso(bultoBD.getPESO());
                    bulto.setCodigoPedido(pedido.getCodigoPedido());
                    bulto.setVoluminiso(bultoBD.getVOLUMINOSO_SCL());
                    arrBultos.add(bulto);
                }
            }
            pedido.setBultos(arrBultos);

            //opciones de entregas
            ArrayList<OpcionesEntregas> opcionesEntregas = new ArrayList<>();
            if (pedido_ws.getOPCIONES_ENTREGAS() != null) {
                for (OpcionesEntregas_WS opcionesEntregasDB : pedido_ws.getOPCIONES_ENTREGAS()) {
                    OpcionesEntregas op = new OpcionesEntregas();
                    op.setCodigoPedido(pedido.getCodigoPedido());
                    op.setIdCab(pedido.getIdCab());
                    op.setId(opcionesEntregasDB.getID());
                    op.setDescripcion(opcionesEntregasDB.getDESCRIPCION());
                    opcionesEntregas.add(op);
                }
            }
            pedido.setOpcionesEntregases(opcionesEntregas);
            pedido.setPuntoMapa(pedido.getPeticion().substring(Math.max(pedido.getPeticion().length() - 2, 0)));
            pedido.setCodigoEtiqueta(pedido_ws.getCODIGO_ETIQUETA());
            pedido.setEntregarOtroDestinatario(pedido_ws.getTIPO_ENTREGA() > Constantes.DESTINATARIO_VACIO);

            //direccion de entrega en otro destinaratio
            if (pedido.isEntregarOtroDestinatario()) {
                DestinatarioEntrega destinatarioEntrega = new DestinatarioEntrega();

                destinatarioEntrega.setTipoDestinaratio(pedido_ws.getTIPO_ENTREGA());
                if (pedido_ws.isENTREGA_VECINO()) destinatarioEntrega.setTipoDestinaratio(Constantes.DESTINATARIO_VECINO);
                if (pedido_ws.isENTREGA_CONSERJE()) destinatarioEntrega.setTipoDestinaratio(Constantes.DESTINATARIO_CONSERJE);
                destinatarioEntrega.setDireccion(pedido_ws.getDE_OTRO_DESTINATARIO());
                destinatarioEntrega.setCodigoPostal(pedido_ws.getCODIGO_POSTAL_ENTREGA());
                destinatarioEntrega.setNombreDestinatario(pedido_ws.getPERSONA_ENTREGA());
                destinatarioEntrega.setDni(pedido_ws.getDNI_ENTREGA());
                pedido.setDestinatarioEntrega(destinatarioEntrega);
            }

            //pedido en traspaso
            pedido.setCodRutaTemporal(pedido_ws.getCOD_RUTA_TEMPORAL().trim());
            pedido.setEnTraspaso(!pedido_ws.getCOD_RUTA_TEMPORAL().isEmpty() || pedido_ws.getCOD_RUTA_TEMPORAL().length() > 0);
            if (pedido.getEstado() != Constantes.PEDIDO_ESTADO_ENTREGADO && pedido.isEnTraspaso()) {
                pedido.setClaveSituacion(Constantes.CLAVE_SITUACION_EN_TRASPASO);
                pedido.setEstado(Constantes.ESTADO_PEDIDO_EN_TRASPASO);
            }

            pedido.setTipo(pedido_ws.getTIPO_ENVIO());

            ArrayList<LineasRecogidas> lineasRecogidasArrayList = new ArrayList<>();

            //lineas de recogidas
            for (LineasRecogidas_WS lws : pedido_ws.getLINEAS_RECOGIDAS()) {
                LineasRecogidas lr = new LineasRecogidas();
                lr.setIdOsl(lws.getID_OSL());
                lr.setDescripcion(lws.getDESCRIPCION_REFERENCIA());
                lr.setDatoCotejo(lws.getDATO_COTEJO());
                lr.setTipoCotejo(lws.getTIPO_COTEJO());
                lr.setCorrecto(lr.getTipoCotejo() == Constantes.COTEJO_SIN_COTEJO);
                lineasRecogidasArrayList.add(lr);
            }
            pedido.setLineasRecogidas(lineasRecogidasArrayList);

            //relaciones entre los pedidos
            ArrayList<Relaciones> relaciones = new ArrayList<>();
            for (Relaciones_WS rws : pedido_ws.getRELACIONES()) {
                Relaciones r = new Relaciones();
                r.setIdOscEnvio(rws.getID_OSC_ENVIO());
                r.setIdOscRecogida(rws.getID_OSC_RECOGIDA());
                relaciones.add(r);
            }
            pedido.setRelaciones(relaciones);

            //datos del remitente, se utiliza en las recogidas
            pedido.setRemitNombre(pedido_ws.getREMIT_NOMBRE());
            pedido.setRemitNif(pedido_ws.getREMIT_NIF());
            pedido.setRemitDireccion(pedido_ws.getREMIT_DIRECCION());
            pedido.setRemitCod_postal(pedido_ws.getREMIT_COD_POSTAL());
            pedido.setRemitPoblacion(pedido_ws.getREMIT_POBLACION());
            pedido.setRemitProvincia(pedido_ws.getREMIT_PROVINCIA());
            pedido.setRemitCod_pais(pedido_ws.getREMIT_COD_PAIS());
            pedido.setRemitContacto(pedido_ws.getREMIT_CONTACTO());
            pedido.setRemitTelefono(pedido_ws.getREMIT_TELEFONO());

            pedido.setIdCliente(pedido_ws.getID_CLIENTE());

            //MyLog.c(pedido.getPeticion() + " Telefono 2_ " + pedido.getTelefono2()  + " Telefono3 : " + pedido.getTelefono3()            );

            arr.add(pedido);
        }

        //datos del remitente del pedido en caso de qu este lo tenga, esto se utuiliza en el caso de las recogidas.

        Loading.HideLoading();

        return arr;
    }

    public static ArrayList<EntregasRequest> toEntregasRequest (Context context, ArrayList<Pedidos> pedidos) {
        ArrayList<EntregasRequest> rqts = new ArrayList<>();
        for (Pedidos pedido : pedidos) {
            EntregasRequest r = toEntregasRequest(context, pedido);
            rqts.add(r);
        }
        return rqts;
    }

    public static EntregasRequest toEntregasRequest (Context context, Pedidos pedido) {
        Loading.ShowLoading(context, "Trabajando...", "Tratando información. Por favor, espere...", false);

        EntregasRequest request = new EntregasRequest();

        if (pedido.getBultos() != null && pedido.getBultos().size() > 0) {
            Bultos primerBulto = pedido.getBultos().get(0);
            request.setBulto(primerBulto.getOrden());
            request.setCodigo_lectura(primerBulto.getCodigo()); //para realizar la entrega tomamos el codigo del primer bulto que disponemos
        } else {
            request.setBulto(1);
            request.setCodigo_lectura(""); //para realizar la entrega tomamos el codigo del primer bulto que disponemos
        }

        request.setTipo(pedido.getTipo());
        request.setIdOsc(pedido.getIdCab());
        request.setUsuario("d.gomez");
        request.setNombre_mensajero(pedido.getNombreMensjero());
        request.setPeticion(pedido.getPeticion());
        request.setDni(pedido.getDniScl());
        request.setObservaciones(pedido.getObservacionesFirma());
        request.setObservacionesRechazo(pedido.getObservacionesRechazo());
        request.setAlbaran(pedido.getAlbaran());
        request.setAlbaran_tr(pedido.getAlbaraTR());
        request.setClave_situacion(pedido.getClaveSituacion());
        request.setEstado(pedido.getEstado());



        /**
         *=======================================================================================================================
         *              IMPORTANTE
         *=======================================================================================================================
         * todo: exepciones con los cambios de estado. puesto aqui para no ensuciar el codigo de las claves de situacion, eso se tendra que modificar en los cambios
         * de estado de los pedidos, indicando si el motivo de RECHAZO o AUSENTE es para uno solo o aplica sobre todos lo eelementso de la parada.
         * Habra que crear una clase con las relaciones que exiten entre los esados (rechazo envio con rechazo recogida,...) evitando poner codigos a pincho.
         */



        if (pedido.getTipo() == Constantes.TIPO_RECOGIDA){
            switch (pedido.getEstado()){
                case Constantes.ESTADO_RECOGIDA_RECHAZADA:
                case Constantes.ESTADO_ENVIO_RECHAZADO:
                    request.setEstado(Constantes.ESTADO_RECOGIDA_RECHAZADA);
                    request.setClave_situacion(Constantes.CLAVE_SITUACION_RECOGIDA_RECHAZO);
                    break;
                case Constantes.ESTADO_RECOGIDA_EXTRAVIADA:
                case Constantes.ESTADO_ENVIO_EXTRAVIADO:
                    request.setEstado(Constantes.ESTADO_RECOGIDA_EXTRAVIADA);
                    request.setClave_situacion(Constantes.CLAVE_SITUACION_RECOGIDA_EXTRAVIADA);
                   // request.setTipo_incidencia(0); //si en algun momento se quiere guardar directamente la clave de situacion de Recogida Extraviada, ahora se guarda un IE033
                    break;

            }
        }



        request.setCodigo_incidencia(pedido.getCodigoIncidencia());
        request.setTipo_incidencia(pedido.getTipoIncidencia());
        request.setMotivo_rechazo(pedido.getMotivoRechazo());

        if (pedido.getEstado() ==    HelperEstados.getEstadoRelacionado(pedido, Constantes.ESTADO_ENVIO_ENTREGADO)){
            request.setTipo_incidencia(Constantes.VALOR_VACIO);
            request.setMotivo_rechazo(Constantes.VALOR_VACIO);

        }

        request.setTipoConexion(pedido.getConexion());
        request.setScl(pedido.getScl());
        request.setDocumentacionIncorrecta(pedido.isDocumentacionIncorrecta() ? Constantes.SI : Constantes.NO);
        request.setDniFirma(pedido.getDniFirma());
        request.setObservacionesFirma(pedido.getObservacionesFirma());
        request.setGeneraIntentoEntrega(pedido.isGeneraIntentoEntrega() ? Constantes.SI : Constantes.NO);
        //request.setClaveSituacionDocumentacionIncorrecta(pedido.getClaveSituacionDocumentacionIncorrecta());

        if ((pedido.getRutaFotografiaVerificacion().trim().length() > 0) && (HelperFile.existeFichero(pedido.getRutaFotografiaVerificacion()))) {
            request.setFotografiaVerificacionObservaciones(HelperImage.imageEnbase64(pedido.getRutaFotografiaVerificacion()));
        }

        if ((pedido.getRutaAudioVerificacionEntrega().trim().length() > 0) && (HelperFile.existeFichero(pedido.getRutaAudioVerificacionEntrega()))) {
            request.setAudioObservacionesFirma(HelperImage.audioEnbase64(pedido.getRutaAudioVerificacionEntrega()));
        }

        request.setLatitudEntrega(pedido.getLatitudEntrega());
        request.setLongitudEntrega(pedido.getLongitudEntrega());

        if (Config.SOLICITAR_FIRMA_RECEPTOR) {
            if ((pedido.getRutaFirma().trim().length() > 0) && (HelperFile.existeFichero(pedido.getRutaFirma()))) {
                request.setFirma(HelperImage.imageEnbase64(pedido.getRutaFirma()));
            }
        }

        if (pedido.getServicioEspecial() == Constantes.VALIDACION_TIPO_ENTREGA_DNI_FOTO) request.setValidacionDNIRequest(dameValidacionDNI(pedido));

        if ((pedido.isValidacionBancaria() && pedido.getRutaImagenValidacionBancaria().trim().length() > 0) && (HelperFile.existeFichero(pedido.getRutaImagenValidacionBancaria()))) {
            request.setFotografiaValidacionBancaria(HelperImage.imageEnbase64(pedido.getRutaImagenValidacionBancaria()));
        }

        request.setNuevaCita(pedido.getNuevaCita());
        request.setObsCliente(pedido.getObservacionesCliente());
        request.setObsInternas(pedido.getObservacionesInternas());
        request.setObsEntrega(pedido.getObservacionesEntrega());

        request.setEntregaOtroDestinatario(pedido.isEntregarOtroDestinatario() ? Constantes.SI : Constantes.NO);
        if (pedido.isEntregarOtroDestinatario()) {
            //informacion de la entrega a un tercero
            DestinatarioEntrega destinatarioEntrega = pedido.getDestinatarioEntrega();
            request.setEntregaParcial(0); //todo: a 0 de momento.cuando se habilite este proceso, esto habra que cambiarlo
            request.setEntregaVecino(destinatarioEntrega.getTipoDestinaratio() == Constantes.DESTINATARIO_VECINO ? Constantes.SI : Constantes.NO);

            request.setEntregaConserje(destinatarioEntrega.getTipoDestinaratio() == Constantes.DESTINATARIO_CONSERJE ? Constantes.SI : Constantes.NO);
            request.setPersonaEntrega(destinatarioEntrega.getNombreDestinatario());
            request.setDniEntrega(destinatarioEntrega.getDni());
            request.setDireccionEntrega(destinatarioEntrega.getDireccion());
            request.setCodigoPostalEntrega(destinatarioEntrega.getCodigoPostal());

            if ((destinatarioEntrega.getRutaFotografia().trim().length() > 0) && (HelperFile.existeFichero(destinatarioEntrega.getRutaFotografia()))) {
                request.setFotografiaEntrega(HelperImage.imageEnbase64(destinatarioEntrega.getRutaFotografia()));
            }

            request.setNoProporcionaInformacion(destinatarioEntrega.isNoQuiereDarInformacion() ? Constantes.SI : Constantes.NO); // el SI significa QUE NO QUIERE DAR INFORMACION
        }
        Loading.HideLoading();

        return request;
    }

    private static ValidacionDNIRequest dameValidacionDNI (Pedidos pedido) {

        //TODO : REVISAR LOS VALORES QUE ENTRAN AQUI... TIPO_CLIENTE Y OPERACION PUESTO A CAPON
        ValidacionDNIRequest request = new ValidacionDNIRequest();

        request.setIdSolicitud(pedido.getIdSolicitud());
        request.setLogin(Config.USER_VALIDACION);
        request.setPassword(Config.PWD_VALIDACION);
        request.setAlbaran(pedido.getAlbaran());
        request.setNumCuenta(pedido.getCuentaTr());
        request.setDocumento1(HelperImage.imageEnbase64(pedido.getRutaDniAnverso()));
        request.setDocumento2(HelperImage.imageEnbase64(pedido.getRutaDniReverso()));
        request.setNumDocumento(pedido.getDniScl());
        request.setTipoCliente(2);
        request.setOperacion(0);

        return request;
    }
}
