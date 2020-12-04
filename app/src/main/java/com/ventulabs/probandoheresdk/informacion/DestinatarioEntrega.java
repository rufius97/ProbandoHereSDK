package com.ventulabs.probandoheresdk.informacion;

import android.os.Parcel;
import android.os.Parcelable;

public class DestinatarioEntrega extends BaseRequest {
    private             String                       codigoPedido                = "";
    private             int                          tipoDestinaratio            = Constantes.DESTINATARIO_VACIO;
    private             String                       nombreDestinatario;
    private             String                       direccion                   = "";
    private             String                       codigoPostal                = "";
    private             String                       dni                         = "";
    private             String                       rutaFotografia              = "";
    private             boolean                      noQuiereDarInformacion      = false;
    private             String                       telefono                    = "";
    private             String                       descripcionTipoDestinarario = "";

    public DestinatarioEntrega() {
    }

    public String getTelefono ()                           { return telefono; }

    public void setTelefono (String telefono)              { this.telefono = telefono; }

    public String getCodigoPedido ()                       { return codigoPedido; }

    public void setCodigoPedido (String codigoPedido)      { this.codigoPedido = codigoPedido; }

    public int getTipoDestinaratio ()                      { return tipoDestinaratio; }

    public void setTipoDestinaratio (int tipoDestinaratio) { this.tipoDestinaratio = tipoDestinaratio; }

    @Override
    public String toString () {
        return "DestinatarioEntrega{" + "codigoPedido='" + codigoPedido + '\'' + ", tipoDestinaratio=" + tipoDestinaratio + ", nombreDestinatario='" + nombreDestinatario + '\'' + ", direccion='" + direccion + '\'' + ", codigoPostal='" + codigoPostal + '\'' + ", dni='" + dni + '\'' + ", rutaFotografia='" + rutaFotografia + '\'' + ", noQuiereDarInformacion=" + noQuiereDarInformacion + ", telefono='" + telefono + '\'' + ", nombreTipoDestinarario='" + descripcionTipoDestinarario + '\'' + '}';
    }

    public String getNombreDestinatario ()                                 { return nombreDestinatario; }

    public void setNombreDestinatario (String nombreDestinatario)          { this.nombreDestinatario = nombreDestinatario; }

    public String getDireccion ()                                          { return direccion; }

    public void setDireccion (String direccion)                            { this.direccion = direccion; }

    public String getCodigoPostal ()                                       { return codigoPostal; }

    public void setCodigoPostal (String codigoPostal)                      { this.codigoPostal = codigoPostal; }

    public String getDni ()                                                { return dni; }

    public void setDni (String dni)                                        { this.dni = dni; }

    public boolean isNoQuiereDarInformacion ()                             { return noQuiereDarInformacion; }

    public void setNoQuiereDarInformacion (boolean noQuiereDarInformacion) { this.noQuiereDarInformacion = noQuiereDarInformacion; }

    public String getRutaFotografia ()                                     { return rutaFotografia; }

    public void setRutaFotografia (String rutaFotografia)                  { this.rutaFotografia = rutaFotografia; }

    public String getDescripcionTipoDestinarario ()                                 {        return descripcionTipoDestinarario;    }

    public void setDescripcionTipoDestinarario (String descripcionTipoDestinarario) { this.descripcionTipoDestinarario = descripcionTipoDestinarario;    }
}
