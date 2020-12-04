package com.ventulabs.probandoheresdk.informacion;

import android.os.Parcel;
import android.os.Parcelable;

public class NuevaCita{
    private             String                                                 codigoPedido      = "";
    private             String                                                 fecha             = "";
    private             int                                                    turno             = -1;  //0: Indeterminado, 1: Por la mañana 2_ por la tarde
    private             String                                                 observacionesCita = "";

    public NuevaCita() {}

    public String getCodigoPedido ()                            { return codigoPedido; }

    public void setCodigoPedido (String codigoPedido)           { this.codigoPedido = codigoPedido; }

    public String getFecha ()                                   { return fecha; }

    public void setFecha (String fecha)                         { this.fecha = fecha; }

    public int getTurno ()                                      { return turno; }

    public void setTurno (int turno)                            { this.turno = turno; }

    public String getObservacionesCita ()                       { return observacionesCita; }

    public void setObservacionesCita (String observacionesCita) { this.observacionesCita = observacionesCita; }

    @Override
    public String toString () {
        return "Reexpedicion{" + "codigoPedido='" + codigoPedido + '\'' + ", fecha='" + fecha + '\'' + ", turno=" + turno + ", observaciones='" + observacionesCita + '\'' + '}';
    }

}
