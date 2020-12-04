package com.ventulabs.probandoheresdk.informacion;

import android.os.Parcel;
import android.os.Parcelable;

public class Bultos extends BaseObject{

    private String  codigoPedido = "";
    private int     orden        = 0;
    private String  codigo       = "";
    private String  peso         = "0";
    private Boolean leido        = false;
    private Boolean leidoEntrada = false;
    private boolean voluminiso   = false;

    public Bultos() {}

    @Override
    public String toString () {
        return "Bultos{" + "codigoPedido='" + codigoPedido + '\'' + ", orden=" + orden + ", codigo='" + codigo + '\'' + ", peso='" + peso + '\'' + ", leido=" + leido + ", leidoEntrada=" + leidoEntrada + ", voluminiso=" + voluminiso + '}';
    }

    public String getCodigoPedido ()                   { return codigoPedido; }

    public void setCodigoPedido (String codigoPedido)  { this.codigoPedido = codigoPedido; }

    public int getOrden ()                             { return orden; }

    public void setOrden (int orden)                   { this.orden = orden; }

    public String getCodigo ()                         { return codigo; }

    public void setCodigo (String codigo)              { this.codigo = codigo; }

    public Boolean getLeido ()                         { return leido; }

    public void setLeido (Boolean leido)               { this.leido = leido; }

    public Boolean getLeidoEntrada () { return leidoEntrada; }

    public void setLeidoEntrada (Boolean leidoEntrada) { this.leidoEntrada = leidoEntrada; }

    public String getPeso () { return peso; }

    public void setPeso (String peso) { this.peso = peso; }

    public boolean getVoluminiso () { return voluminiso; }

    public void setVoluminiso (boolean voluminiso) { this.voluminiso = voluminiso; }

}
