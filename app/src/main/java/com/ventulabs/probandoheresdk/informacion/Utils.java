package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;
import es.icp.icp_commons.CustomSmartDialog;
import es.icp.icp_commons.DialogConfig;

public class Utils {

    public static void mostrarMensajeRecordatorio (String texto, int duracion, String titulo, Context context) {
        DialogConfig config = new DialogConfig.Builder()
                .makeULTRA()
                .setMostrarIconoTitulo(false)                               // mostrar icono en el titulo
                //.setIconoTitulo(R.drawable.ic_launcher_round)             // icono del titulo
                .setTitulo(titulo)                                          // titulo
                .setTiempo(duracion)                                        // tiempo para la automorision
                .showTemporizador(true)                                     // mostrar progressbar de automorision
                .setMensaje(texto)                                          // mensaje de automorision
                .setMostrarNegativo(false)                                  // sin boton negativo
                .setMostrarPositivo(false)                                  // sin boton postivo
                .setColorTitulo(android.R.color.holo_blue_light)            // color de fondo para la barra del titulo
                .setMostrarImagenPredeterminada(false)                      // sin ninguna imagen por defecto
                .build();

        new CustomSmartDialog().dialogGenerico(context, config, null);

    }

}
