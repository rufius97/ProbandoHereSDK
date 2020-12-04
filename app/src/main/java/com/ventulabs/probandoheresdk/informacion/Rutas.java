package com.ventulabs.probandoheresdk.informacion;


public class Rutas extends BaseObject {

    private int    id;
    private String codigo;
    private String descripcion;
    private String codigosPostales;
    private String fecha;

    //private int    usuarioAsociado;
    private String usuario;
    private String descripcionUsuario;

    public Rutas(int id, String descripcion, String codigosPostales) {
        this.id              = id;
        this.descripcion     = descripcion;
        this.codigosPostales = codigosPostales;
    }

    public Rutas()                                               { }

    public int getId()                                           { return id; }

    public void setId(int id)                                    { this.id = id; }

    public String getDescripcion()                               { return descripcion; }

    public void setDescripcion(String descripcion)               { this.descripcion = descripcion; }

    public String getCodigosPostales()                           { return codigosPostales; }

    public void setCodigosPostales(String codigosPostales)       { this.codigosPostales = codigosPostales; }

    public String getFecha()                                     { return fecha; }

    public void setFecha(String fecha)                           { this.fecha = fecha; }

    public String getUsuario()                                   { return usuario; }

    public void setUsuario(String usuario)                       { this.usuario = usuario; }

    public String getDescripcionUsuario()                        { return descripcionUsuario; }

    public void setDescripcionUsuario(String descripcionUsuario) { this.descripcionUsuario = descripcionUsuario; }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Rutas{" + "id=" + id + ", codigo='" + codigo + '\'' + ", descripcion='" + descripcion + '\'' + ", codigosPostales='" + codigosPostales + '\'' + ", fecha='" + fecha + '\'' + ", usuario='" + usuario + '\'' + ", descripcionUsuario='" + descripcionUsuario + '\'' + '}';
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
