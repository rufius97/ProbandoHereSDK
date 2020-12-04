package com.ventulabs.probandoheresdk.informacion;

public class PedidosRequest extends BaseRequest {

    private int    ID_OSC = Constantes.VALOR_VACIO;
    private String albaran;
    private int    ID_RUTA;
    private String COD_RUTA;
    private String f_entrega;
    private int    AGRUPADO;

    public int getID_OSC ()              { return ID_OSC; }

    public void setID_OSC (int ID_OSC)   { this.ID_OSC = ID_OSC; }

    public int getID_RUTA ()             { return ID_RUTA; }

    public void setID_RUTA (int ID_RUTA) { this.ID_RUTA = ID_RUTA; }

    public int getAGRUPADO () {
        return AGRUPADO;
    }

    public void setAGRUPADO (int AGRUPADO) {
        this.AGRUPADO = AGRUPADO;
    }

    public String getCOD_RUTA () {
        return COD_RUTA;
    }

    public void setCOD_RUTA (String COD_RUTA) {
        this.COD_RUTA = COD_RUTA;
    }

    public String getAlbaran ()             { return albaran; }

    public void setAlbaran (String albaran) { this.albaran = albaran; }

    public String getF_entrega () {
        return f_entrega;
    }

    public void setF_entrega (String f_entrega) { this.f_entrega = f_entrega; }
}
