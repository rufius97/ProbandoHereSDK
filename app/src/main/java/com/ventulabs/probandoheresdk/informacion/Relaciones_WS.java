package com.ventulabs.probandoheresdk.informacion;

public class Relaciones_WS {

    private int ID_OSC_ENVIO;
    private int ID_OSC_RECOGIDA;

    public int getID_OSC_ENVIO ()                        { return ID_OSC_ENVIO; }

    public void setID_OSC_ENVIO (int ID_OSC_ENVIO)       { this.ID_OSC_ENVIO = ID_OSC_ENVIO; }

    public int getID_OSC_RECOGIDA ()                     { return ID_OSC_RECOGIDA; }

    public void setID_OSC_RECOGIDA (int ID_OSC_RECOGIDA) { this.ID_OSC_RECOGIDA = ID_OSC_RECOGIDA; }

    @Override
    public String toString () {
        return "Relaciones_WS{" + "ID_OSC_ENVIO=" + ID_OSC_ENVIO + ", ID_OSC_RECOGIDA=" + ID_OSC_RECOGIDA + '}';
    }
}
