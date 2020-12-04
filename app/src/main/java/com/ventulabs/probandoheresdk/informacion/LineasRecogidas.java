package com.ventulabs.probandoheresdk.informacion;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class LineasRecogidas extends BaseObject {
    @NonNull
    private             int                      idOsl;
    private             String                   descripcion;
    private             String                   datoCotejo;
    private             int                      tipoCotejo;
    private             boolean                  correcto;
    private             String                   textoCotejo;

    public LineasRecogidas() {}

    public String getTextoCotejo ()                 { return textoCotejo; }

    public void setTextoCotejo (String textoCotejo) { this.textoCotejo = textoCotejo; }

    public int getIdOsl ()                          { return idOsl; }

    public void setIdOsl (int idOsl)                { this.idOsl = idOsl; }

    public String getDescripcion ()                 { return descripcion; }

    public void setDescripcion (String descripcion) { this.descripcion = descripcion; }

    public String getDatoCotejo ()                  { return datoCotejo; }

    public void setDatoCotejo (String datoCotejo)   { this.datoCotejo = datoCotejo; }

    public int getTipoCotejo ()                     { return tipoCotejo; }

    public void setTipoCotejo (int tipoCotejo)      { this.tipoCotejo = tipoCotejo; }

    public boolean isCorrecto ()                    { return correcto; }

    public void setCorrecto (boolean correcto)      { this.correcto = correcto; }
}
