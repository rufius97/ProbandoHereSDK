package com.ventulabs.probandoheresdk.informacion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;

import androidx.core.content.FileProvider;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelperImage {

    public static File createImageFile (Context context, Pedidos pedido) throws IOException {
        String rutaFirmaPedido = HelperFile.dameNombrePedidoFirma(context, pedido);
        File   image           = new File(rutaFirmaPedido);
        return image;
    }

    public static boolean eliminarFichero (String ruta) {
        try {
            File file = new File(ruta);
            return file.delete();
        } catch (Exception ex) {
            return false;
        }
    }

    public static String imageEnbase64 (String fichero) {
        if (fichero == null || fichero.isEmpty()) return "";

        File file = new File(fichero);
        if (!file.exists()) return "";

        File   mSaveBit; // Your image file
        Bitmap bitmap = BitmapFactory.decodeFile(fichero);

        Bitmap bmNew = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 4, bitmap.getHeight() / 4, false);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        bmNew.compress(Bitmap.CompressFormat.PNG, Constantes.COMPRESION_IMAGENES, out);

        byte[] imagenEnBytes = out.toByteArray();

        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.encodeToString(imagenEnBytes, Base64.DEFAULT);
    }

    public static String audioEnbase64 (String fichero) {
        File file = new File(fichero);

       // Base64.encodeToString(fileToBytes(file));

        String encoded = Base64.encodeToString(fileToBytes(file), 0);
        return  encoded;
    }

    public static byte[] fileToBytes (File f) {

        try {
            FileInputStream fis = new FileInputStream(f);
            ;
            int  size      = (int) f.length();
            byte bytes[]   = new byte[size];
            byte tmpBuff[] = new byte[size];

            int read = fis.read(bytes, 0, size);
            if (read < size) {
                int remain = size - read;
                while (remain > 0) {
                    read = fis.read(tmpBuff, 0, remain);
                    System.arraycopy(tmpBuff, 0, bytes, size - remain, read);
                    remain -= read;
                }
            }

            fis.close();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public static byte[] imageToBytes (String fichero) {

        if (fichero.isEmpty()) return null;

        File file = new File(fichero);
        if (!file.exists()) return null;

        File   mSaveBit; // Your image file
        Bitmap bitmap = BitmapFactory.decodeFile(fichero);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 25, out);
        byte[] imagenEnBytes = out.toByteArray();
        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return imagenEnBytes;
    }

    public static boolean saveFile (Context context, String nombre, Bitmap bitmap) {
        String filename = HelperFile.dameRutaFicheros(context) + "/" + nombre;

        try (FileOutputStream out = new FileOutputStream(filename)) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, out); // bmp is your Bitmap instance
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Uri abrirCapturarImagenURI (Context context, String fichero, int codigoResponse) {
        HelperFile.eliminarFichero(fichero);
        File   outFileAnverso  = new File(fichero);
        Uri    uri             = FileProvider.getUriForFile(context, context.getPackageName()+".provider", new File(outFileAnverso.toString()));
        Intent cameraImgIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraImgIntent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        ((Activity) context).startActivityForResult(cameraImgIntent, codigoResponse);
        return uri;
    }

    public static void abrirFotoURI (Context context, String ruta) {
        File   f        = new File(ruta);
        Intent intent   = new Intent();
        Uri    photoURI = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName()+".provider", f);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(photoURI);
        context.startActivity(intent);
    }
}
