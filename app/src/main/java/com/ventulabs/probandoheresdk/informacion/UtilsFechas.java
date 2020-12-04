package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilsFechas {

    public static String convertFecha (String fromFormat, String toFormat, String dateToFormat) {

        SimpleDateFormat inFormat = new SimpleDateFormat(fromFormat);
        Date             date     = null;
        try {
            date = inFormat.parse(dateToFormat);
            SimpleDateFormat outFormat = new SimpleDateFormat(toFormat);
            if (date != null) return outFormat.format(date);
        } catch (ParseException e) {
            //Excep.log(e);
            e.printStackTrace();
            return "";
        }

        return "";
    }

    public static String getHoy (String formato) {
        String currentDate = new SimpleDateFormat(formato, Locale.getDefault()).format(new Date());
        return currentDate;
    }

    public static String addDays (String date, String format, int days) {
        //String dt = "2012-01-04";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar         c   = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, days);  // number of days to add, can also use Calendar.DAY_OF_MONTH in place of Calendar.DATE
        SimpleDateFormat sdf1   = new SimpleDateFormat(format);
        String           output = sdf1.format(c.getTime());
        return output;
    }

    public static String nowToMilis ()   { return String.valueOf(System.currentTimeMillis()); }

    public static long nowToMilisLong () { return System.currentTimeMillis(); }

    public static long toMillis (String fecha, String format) {

        SimpleDateFormat sdf  = new SimpleDateFormat(format);
        Date             date = null;
        try {
            date = sdf.parse(fecha);

            long millis = date.getTime();
            return millis;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String fromMillis (long millis, String formato) {
        // Create a DateFormatter object for displaying date in specified format.
        SimpleDateFormat formatter = new SimpleDateFormat(formato);

        // Create a calendar object that will convert the date and time value in milliseconds to date.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return formatter.format(calendar.getTime());
    }

    public static String getNombreDia (Context context, String fecha, String formato) {
        SimpleDateFormat inFormat = new SimpleDateFormat(formato);
        Date             date     = null;
        try {
            date = inFormat.parse(fecha);
            Calendar calendar = Calendar.getInstance();

            String n = new SimpleDateFormat("EEEE", context.getResources().getConfiguration().locale).format(date.getTime());
            return n;

            // 3 letter name form of the day
            //System.out.println(new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));
            // full name form of the day
            //System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static long diferencias (long date1, long date2, TipoRetorno tipo) {

        String fechaFinDia = fromMillis(date1, "yyyy-MM-dd 23:59:59");



        date1 = toMillis(fechaFinDia, "yyyy-MM-dd HH:mm:ss");

        long diff     = date1 - date2;
        long segundos = diff / 1000;
        long minutos  = segundos / 60;
        long horas    = minutos / 60;
        long dias     = horas / 24;


        switch (tipo) {

            case segundos:
                return segundos;
            case minutos:
                return minutos;
            case horas:
                return horas;

            case dias:
                return dias;
        }

        return 0;
    }

    public enum TipoRetorno {
        segundos, minutos, horas, dias
    }
}
