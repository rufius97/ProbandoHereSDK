package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class HelperFile {

    public static String dameRutaFicheros(Context context) {
        String rutaFirmaPedido = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath();
        return rutaFirmaPedido;
    }

    public static  boolean existeFichero(String fichero){
        if (fichero == null) return  false;
        File f = new File(fichero);
        return  f.exists();
    }

    public static boolean eliminarFichero(String fichero){
        File    f = new File(fichero);
        boolean r =f.delete();
        return r;
    }


    public static String dameNombreAudioFirma (Context context, Pedidos pedido) {
        return dameRutaFichero(context, "", pedido, Constantes.PREF_FICHERO_AUDIO_FIRMA,"wav");
    }

    public static String dameNombrePedidoFirma (Context context, Pedidos pedido) {
        return dameRutaFichero(context, "", pedido, Constantes.PREF_FICHERO_FIRMA, "png");
    }

    public static String dameNombreOtroDestinaratioPedido (Context context, Pedidos pedido) {
        return dameRutaFichero(context, "", pedido, Constantes.PREF_FICHERO_DESTINATARIO_PEDIDO, "png");
    }

    public static String dameNombreVerificacionPedido (Context context, Pedidos pedido) {
        return dameRutaFichero(context, "", pedido, Constantes.PREF_FICHERO_VERIFICAR_DNI,"png");
    }

    public static String dameNombreVerificacionDNI (Context context, String tipo, Pedidos pedido) {
        return dameRutaFichero(context, tipo, pedido, Constantes.PREF_FICHERO_VERIFICAR_DNI,"png");
    }

    public static String dameNombreValidacionBancaria (Context context, Pedidos pedido) {
        return dameRutaFichero(context, "", pedido, Constantes.PREF_FICHERO_VALIDACION_BANCARIA, "png");
    }

    private static String dameRutaFichero (Context context, String tipo, Pedidos pedido, String prefijo, String extension) {
        prefijo = (tipo.isEmpty()) ? prefijo : prefijo + "_" + tipo;
        String tiempo          = UtilsFechas.nowToMilis();
        String rutaFirmaPedido = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + prefijo + "_" + pedido.getCodigoPedido() + "_" + tiempo + "."+extension;
        return rutaFirmaPedido;
    }


    public static boolean copyFile(File sourceFile, File destFile)  {
        try{
            if (!destFile.getParentFile().exists())
                destFile.getParentFile().mkdirs();

            if (!destFile.exists()) {
                destFile.createNewFile();
            }

            FileChannel source      = null;
            FileChannel destination = null;

            try {
                source = new FileInputStream(sourceFile).getChannel();
                destination = new FileOutputStream(destFile).getChannel();
                destination.transferFrom(source, 0, source.size());
            } finally {
                if (source != null) {
                    source.close();
                }
                if (destination != null) {
                    destination.close();
                }
            }
            return  true;
        }catch (Exception ex){

            return false;
        }

    }


}
