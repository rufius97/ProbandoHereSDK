package com.ventulabs.probandoheresdk.informacion;


public class BaseRequest extends BaseObject {
    public String     PACKAGE;
    public String     USUARIO;
    public int        VERSION;
    public String     ENTORNO      = String.valueOf(Constantes.SISTEMA_ANDROID);
    public String     FECHA_ACCION = UtilsFechas.getHoy("YYYY-MM-dd'T'HH:mm:ss");


    public String getPACKAGE() {
        return PACKAGE;
    }

    public void setPACKAGE(String PACKAGE) {
        this.PACKAGE = PACKAGE;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public int getVERSION() {
        return VERSION;
    }

    public void setVERSION(int VERSION) {
        this.VERSION = VERSION;
    }

    public String getFECHA_ACCION() {
        return FECHA_ACCION;
    }

    public void setFECHA_ACCION(String FECHA_ACCION) {
        this.FECHA_ACCION = FECHA_ACCION;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "PACKAGE='" + PACKAGE + '\'' +
                ", USUARIO='" + USUARIO + '\'' +
                ", VERSION=" + VERSION +
                ", ENTORNO='" + ENTORNO + '\'' +
                ", FECHA_ACCION='" + FECHA_ACCION + '\'' +
                '}';
    }
}
