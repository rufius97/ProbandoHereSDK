package com.ventulabs.probandoheresdk;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

import java.io.File;

import es.icp.icp_commons.PreferenciasHelper;
import es.icp.icp_commons.Services.GeoTracking;

public class Init extends Application {

    public static Application application;

    public static Context     context;
    public static GeoTracking gt = null;

    @Override
    public void onCreate () {
        super.onCreate();
        application = Init.this;
        context     = getApplicationContext();

    }

    public static void startGeoTrackingService(Context context) {
        gt = GeoTracking.getInstance(context);
        gt.startGeoTracking(5000, 10000);
    }
}
