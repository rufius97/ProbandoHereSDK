package com.ventulabs.probandoheresdk.informacion;

public class LineasRecogidas_WS {

    private int    ID_OSL;
    private String DESCRIPCION_REFERENCIA;
    private String DATO_COTEJO;
    private int    TIPO_COTEJO;

    public int getID_OSL ()                                               { return ID_OSL; }

    public void setID_OSL (int ID_OSL)                                    { this.ID_OSL = ID_OSL; }

    public String getDESCRIPCION_REFERENCIA ()                            { return DESCRIPCION_REFERENCIA; }

    public void setDESCRIPCION_REFERENCIA (String DESCRIPCION_REFERENCIA) { this.DESCRIPCION_REFERENCIA = DESCRIPCION_REFERENCIA; }

    public String getDATO_COTEJO ()                                       { return DATO_COTEJO; }

    public void setDATO_COTEJO (String DATO_COTEJO)                       { this.DATO_COTEJO = DATO_COTEJO; }

    public int getTIPO_COTEJO ()                                          { return TIPO_COTEJO; }

    public void setTIPO_COTEJO (int TIPO_COTEJO)                          { this.TIPO_COTEJO = TIPO_COTEJO; }

    @Override
    public String toString () {
        return "LineasRecogidas_WS{" + "ID_OSL=" + ID_OSL + ", DESCRIPCION_REFERENCIA='" + DESCRIPCION_REFERENCIA + '\'' + ", DATO_COTEJO='" + DATO_COTEJO + '\'' + ", TIPO_COTEJO=" + TIPO_COTEJO + '}';
    }
}
