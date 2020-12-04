package com.ventulabs.probandoheresdk.mapas;

import java.util.ArrayList;

public class Result {

    private ArrayList<Punto> waypoints;

    public Result() {
    }

    public Result(ArrayList<Punto> waypoints) {
        this.waypoints = waypoints;
    }

    public ArrayList<Punto> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(ArrayList<Punto> waypoints) {
        this.waypoints = waypoints;
    }

    @Override
    public String toString() {
        return "Result{" +
                "waypoints=" + waypoints +
                '}';
    }
}
