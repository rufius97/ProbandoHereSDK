package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;

import com.ventulabs.probandoheresdk.R;

import java.util.ArrayList;
import java.util.List;

import es.icp.icp_commons.CustomSmartDialog;
import es.icp.icp_commons.DialogConfig;
import es.icp.icp_commons.Interfaces.CustomSmartDialogSiNoResponse;
import es.icp.icp_commons.Objects.SmartButton;

public class Dx {

    public static DialogConfig.UltraConfig ultraConfig = new DialogConfig.UltraConfig.Builder()
                                                                                    .setMinHeight(0.3f)
                                                                                    .build();

    public static void valores(Context context, String texto, String valorPositivo, String valorNegativo, Response<Object> response) {

        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.question_icon)).setTitulo(context.getString(R.string.atencion)).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false)
                .setTextoNegativo(valorNegativo).setTextoPositivo(valorPositivo).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {
                response.positivo(0, true);
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {
                response.negativo(1, false);
            }
        });
    }

    public static void siNoRojo(Context context, String texto, Response<Object> response) {
        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.question_icon)).setTitulo(context.getString(R.string.atencion)).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.no)).setColorTitulo(R.color.rojo).setTextoPositivo(context.getString(R.string.si)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {
                response.positivo(Constantes.SI, true);
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {
                response.negativo(Constantes.NO, false);
            }
        });
    }

    public static void siNo(Context context, String texto, Response<Object> response) {
        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.question_icon)).setTitulo(context.getString(R.string.atencion)).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.no)).setTextoPositivo(context.getString(R.string.si)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {
                response.positivo(Constantes.SI, true);
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {
                response.negativo(Constantes.NO, false);
            }
        });
    }

    public static void siNo(Context context, String titulo, String texto, String textoPositivo, String textoNegativo, Response<Object> response) {
        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.question_icon)).setTitulo(titulo).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(textoNegativo).setTextoPositivo(textoPositivo).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {
                response.positivo(Constantes.SI, true);
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {
                response.negativo(Constantes.NO, false);
            }
        });
    }




   /* public static void input(Context context, String titulo, String texto, String hint, Response<String> response) {
    .setTextoEditText(defecto)*/

    public static void input(Context context, String titulo, String texto, String hint, String defecto, Response<String> response) {
        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.edit_icon)).setTitulo(titulo).
                setMostrarEditText(true).setHint(hint).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.dx_cancelar)).setTextoPositivo(context.getString(R.string.dx_aceptar)).setMostrarCantidad(false).setTextoEditText(defecto).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {

                    @Override
                    public void positivo(String valor, AlertDialog dialog) {
                        response.positivo(0, valor.trim());
                    }

                    @Override
                    public void negativo(String valor, AlertDialog dialog) {
                        response.negativo(1, valor.trim());
                    }
                }

        );
    }

    public static void input(Context context, String titulo, String texto, String hint, Response<String> response) {
        input(context, titulo, texto, hint, "", response);
    }

    public static void input(Context context, String titulo, String texto, String hint, Secuencial<String> response) {
        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.edit_icon)).setTitulo(titulo).
                setMostrarEditText(true).setHint(hint).
                setMensaje(texto).setMostrarNegativo(true).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.dx_cancelar)).setTextoPositivo(context.getString(R.string.dx_aceptar)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {

                    @Override
                    public void positivo(String valor, AlertDialog dialog) {
                        response.siguiente(0, valor.trim());
                    }

                    @Override
                    public void negativo(String valor, AlertDialog dialog) {
                        response.siguiente(1, valor.trim());
                    }
                }

        );
    }

    public static void input(Context context, String texto, Response<String> response) {
        input(context, context.getString(R.string.dx_atencion), texto, "", response);
    }

    public static void error(Context context, String texto) {
        error(context, context.getString(R.string.error), texto);
    }

    public static void error(Context context, String titulo, String texto) {
        error(context, titulo, texto, null);
    }

    public static void error(Context context, String texto, Secuencial<Object> response) {
        error(context, context.getString(R.string.error), texto, response);
    }

    public static void error(Context context, String titulo, String texto, Secuencial<Object> response) {

        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.error_icon)).setTitulo(titulo).
                setMensaje(texto).setMostrarNegativo(false).setMostrarPositivo(true).setAutoDismiss(true).setColorTitulo(android.R.color.holo_red_light).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.no)).setTextoPositivo(context.getString(R.string.aceptar)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(0, true);
                }
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(1, false);
                }
            }
        });
    }

    public static void confirmacion(Context context, String texto) {
        confirmacion(context, texto, null);
    }

    public static void confirmacion(Context context, String texto, Secuencial<Object> response) {

        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.atencion_icon)).setTitulo(context.getString(R.string.atencion)).

                setMensaje(texto).setMostrarNegativo(false).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.no)).setTextoPositivo(context.getString(R.string.aceptar)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(0, true);
                }
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(1, false);
                }
            }
        });
    }


    public static void confirmacionBultos(Context context, String texto, Secuencial<Object> response) {

        DialogConfig config = new DialogConfig.Builder().makeULTRA(ultraConfig).setMostrarIconoTitulo(true).setIconoTitulo(context.getDrawable(R.drawable.caja_multibulto)).setTitulo(context.getString(R.string.atencion)).

                setMensaje(texto).setMostrarNegativo(false).setMostrarPositivo(true).setAutoDismiss(true).setMostrarImagenPredeterminada(false).setTextoNegativo(context.getString(R.string.no)).setTextoPositivo(context.getString(R.string.aceptar)).setMostrarCantidad(false).build();

        new CustomSmartDialog().dialogGenerico(context, config, new CustomSmartDialogSiNoResponse() {
            @Override
            public void positivo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(0, true);
                }
            }

            @Override
            public void negativo(String valor, AlertDialog dialog) {

                if (response != null) {
                    response.siguiente(1, false);
                }
            }
        });
    }



    public interface Response<T> {

        void positivo(int code, T data);

        void negativo(int code, T data);
    }

    public interface Secuencial<T> {

        void siguiente(int code, T data);
    }

    public static class SuperDxResponse<T> implements Response<T> {
        @Override
        public void positivo(int code, T data) {

        }

        @Override
        public void negativo(int code, T data) {

        }
    }
}
