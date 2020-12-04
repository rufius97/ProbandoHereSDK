package com.ventulabs.probandoheresdk.informacion;

public class Bultos_WS {
    public int     ID_CAB;
    public int     NUM_BULTO;
    public String  PESO;
    public String  COD_BULTO;
    public boolean VOLUMINOSO_SCL;

    public int getID_CAB ()                            { return ID_CAB; }

    public void setID_CAB (int ID_CAB)                 { this.ID_CAB = ID_CAB; }

    public int getNUM_BULTO ()                         { return NUM_BULTO; }

    public void setNUM_BULTO (int NUM_BULTO)           { this.NUM_BULTO = NUM_BULTO; }

    public String getPESO ()                           { return PESO; }

    public void setPESO (String PESO)                  { this.PESO = PESO; }

    public String getCOD_BULTO ()                      { return COD_BULTO; }

    public void setCOD_BULTO (String COD_BULTO)        { this.COD_BULTO = COD_BULTO; }

    public boolean getVOLUMINOSO_SCL ()                    { return VOLUMINOSO_SCL; }

    public void setVOLUMINOSO_SCL (boolean VOLUMINOSO_SCL) { this.VOLUMINOSO_SCL = VOLUMINOSO_SCL; }

    @Override
    public String toString () {
        return "Bultos_WS{" + "ID_CAB=" + ID_CAB + ", NUM_BULTO=" + NUM_BULTO + ", PESO=" + PESO + ", COD_BULTO='" + COD_BULTO + '\'' + '}';
    }
}
