package com.ventulabs.probandoheresdk.informacion;

public class Relaciones extends BaseObject {
    private             int                 idOscEnvio;
    private             int                 idOscRecogida;

    public Relaciones() {}

    public int getIdOscEnvio ()                      { return idOscEnvio; }

    public void setIdOscEnvio (int idOscEnvio)       { this.idOscEnvio = idOscEnvio; }

    public int getIdOscRecogida ()                   { return idOscRecogida; }

    public void setIdOscRecogida (int idOscRecogida) { this.idOscRecogida = idOscRecogida; }

    @Override
    public String toString () {
        return "Relaciones{" + "idOscEnvio=" + idOscEnvio + ", idOscRecogida=" + idOscRecogida + '}';
    }
}
