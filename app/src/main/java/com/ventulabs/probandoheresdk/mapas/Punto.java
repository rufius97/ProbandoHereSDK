package com.ventulabs.probandoheresdk.mapas;

import java.sql.Array;
import java.util.ArrayList;

public class Punto {

    private String            id;
    private double            lat;
    private double            lng;
    private int               sequence;
    private String            estimatedArrival;
    private String            estimatedDeparture;
    private ArrayList<String> fulfilledConstraints;

    public Punto() {
    }

    public Punto(String id, double lat, double lng, int sequence, String estimatedArrival, String estimatedDeparture, ArrayList<String> fulfilledConstraints) {
        this.id                   = id;
        this.lat                  = lat;
        this.lng                  = lng;
        this.sequence             = sequence;
        this.estimatedArrival     = estimatedArrival;
        this.estimatedDeparture   = estimatedDeparture;
        this.fulfilledConstraints = fulfilledConstraints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public String getEstimatedDeparture() {
        return estimatedDeparture;
    }

    public void setEstimatedDeparture(String estimatedDeparture) {
        this.estimatedDeparture = estimatedDeparture;
    }

    public ArrayList<String> getFulfilledConstraints() {
        return fulfilledConstraints;
    }

    public void setFulfilledConstraints(ArrayList<String> fulfilledConstraints) {
        this.fulfilledConstraints = fulfilledConstraints;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "id='" + id + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", sequence=" + sequence +
                ", estimatedArrival='" + estimatedArrival + '\'' +
                ", estimatedDeparture='" + estimatedDeparture + '\'' +
                ", fulfilledConstraints=" + fulfilledConstraints +
                '}';
    }
}
