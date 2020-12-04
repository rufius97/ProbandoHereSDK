package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;

import androidx.core.content.ContextCompat;

import com.ventulabs.probandoheresdk.R;

public class UtilsTextos {

    public static Spanned destacar(Object texto) {
        return new SpannableString(destacar(texto, true));
    }

    public static Spanned destacar(Object texto, Boolean html) {
        if (html) return Html.fromHtml("<b><big>" + texto + "</b></big>");
        return new SpannableString("<b><big>" + texto + "</b></big>");
    }

    public static Spanned small(Object texto) {
        return small(texto, true);
    }

    public static Spanned small(Object texto, Boolean html) {
        if (html) Html.fromHtml("<small>" + texto + "</small>");
        return new SpannableString("<small>" + texto + "</small>");
    }

    public static Spanned destacar2Digitos(String cp, int color) {
        String strColor = String.format("#%06X", 0xFFFFFF & color);
        String cpf;
        if (cp != null && cp.length() > 2) {
            String cp1  = cp.substring(0, cp.length() - 2);
            String cp2  = cp.substring(cp.length() - 2);
            String cp2f = "<span style='color:" + strColor + "'><big><strong>" + cp2 + "</strong></big></span>";
             cpf = cp1 + cp2f;

        }else{
            cpf = "00000";
        }

        return Html.fromHtml(cpf);
    }

    public static Spanned negrita(Object texto) {
        return new SpannableString(negrita(texto, true));
    }

    public static Spanned negrita(Object texto, Boolean html) {
        if (html) return Html.fromHtml("<b>" + texto + "</b>");
        return new SpannableString("<b>" + texto + "</b>");
    }

    public static Spanned cursiva(Object texto) {
        return new SpannableString(destacar(texto, true));
    }

    public static Spanned cursiva(Object texto, Boolean html) {
        if (html) return Html.fromHtml("<i>" + texto + "</i>");
        return new SpannableString("<i>" + texto + "</i>");
    }

    public static Spanned enRojo(Context context, Object texto) {
        return (enColor(context, String.valueOf(texto), R.color.rojo, true));
    }

    public static Spanned enVerde(Context context, Object texto) {
        return (enColor(context, texto, R.color.verde, true));
    }

    public static Spanned enNaranja(Context context, Object texto) {
        return (enColor(context, texto, R.color.naranja, true));
    }

    public static String enColor(Context context, Object texto, int color) {
        return enColor(context, texto, color, false).toString();
    }

    public static Spanned enColor(Context context, Object texto, int color, boolean html) {
        int    c    = ContextCompat.getColor(context.getApplicationContext(), color);
        String hCol = "#" + Integer.toHexString(c).substring(2);

        if (html) return Html.fromHtml("<font color='" + hCol + "'>" + texto + "</font>");
        return new SpannableString("<font color='" + hCol + "'>" + texto + "</font>");
    }
}
