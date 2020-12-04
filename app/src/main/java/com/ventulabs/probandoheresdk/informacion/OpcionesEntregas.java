package com.ventulabs.probandoheresdk.informacion;

import android.os.Parcel;
import android.os.Parcelable;

public class OpcionesEntregas extends BaseObject{
    private             int                       id;
    private             int                       idCab;
    private             String                    codigoPedido;
    private             String                    descripcion;

    public OpcionesEntregas() {}
    public int getId ()                               { return id; }

    public void setId (int id)                        { this.id = id; }

    public int getIdCab ()                            { return idCab; }

    public void setIdCab (int idCab)                  { this.idCab = idCab; }

    public String getCodigoPedido ()                  { return codigoPedido; }

    public void setCodigoPedido (String codigoPedido) { this.codigoPedido = codigoPedido; }

    public String getDescripcion ()                   { return descripcion; }

    public void setDescripcion (String descripcion)   { this.descripcion = descripcion; }


    @Override
    public String toString () {
        return "OpcionesEntregas{" + "id=" + id + ", idCab=" + idCab + ", codigoPedido='" + codigoPedido + '\'' + ", descripcion='" + descripcion + '\'' + '}';
    }
}
