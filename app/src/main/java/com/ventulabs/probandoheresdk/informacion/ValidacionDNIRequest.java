package com.ventulabs.probandoheresdk.informacion;

public class ValidacionDNIRequest {

    private String IdSolicitud;
    private String Login;
    private String Password;
    private String Albaran;
    private String NumCuenta;
    private String Documento1;
    private String Documento2;
    private String NumDocumento;
    private int    TipoCliente;
    private int    IdCliente;
    private int    Operacion;
    private String Aux1;
    private String Aux2;
    private String Foto;
    private int    Tipo;

    public String getIdSolicitud()                   { return IdSolicitud; }

    public void setIdSolicitud(String idSolicitud)   { IdSolicitud = _l(idSolicitud, 30); }

    public String getLogin()                         { return Login; }

    public void setLogin(String login)               { Login = _l(login, 20); }

    public String getPassword()                      { return Password; }

    public void setPassword(String password)         { Password = _l(password, 20); }

    public String getAlbaran()                       { return Albaran; }

    public void setAlbaran(String albaran)           { Albaran = _l(albaran, 30); }

    public String getNumCuenta()                     { return NumCuenta; }

    public void setNumCuenta(String numCuenta)       { NumCuenta = _l(numCuenta, 20); }

    public String getDocumento1()                    { return Documento1; }

    public void setDocumento1(String documento1)     { Documento1 = documento1; }

    public String getDocumento2()                    { return Documento2; }

    public void setDocumento2(String documento2)     { Documento2 = documento2; }

    public String getNumDocumento()                  { return NumDocumento; }

    public void setNumDocumento(String numDocumento) { NumDocumento = _l(numDocumento, 15); }

    public int getTipoCliente()                      { return TipoCliente; }

    public void setTipoCliente(int tipoCliente)      { TipoCliente = tipoCliente; }

    public int getIdCliente()                        { return IdCliente; }

    public void setIdCliente(int idCliente)          { IdCliente = idCliente;}

    public int getOperacion()                        { return Operacion; }

    public void setOperacion(int operacion)          { Operacion = operacion; }

    public String getAux1()                          { return Aux1; }

    public void setAux1(String aux1)                 { Aux1 = _l(aux1, 100); }

    public String getAux2()                          { return Aux2; }

    public void setAux2(String aux2)                 { Aux2 = _l(aux2, 100); }

    public String getFoto()                          { return Foto; }

    public void setFoto(String foto)                 { Foto = foto; }

    public int getTipo()                             { return Tipo; }

    public void setTipo(int tipo)                    { Tipo = tipo; }

    private String _l(String cadena, int limite) {
        if (cadena == null) return "";
        if (cadena.trim().length() > limite) return cadena.substring(0, limite);
        return cadena;
    }

    @Override
    public String toString() {
        return "ValidacionDNIRequest{" + "IdSolicitud='" + IdSolicitud + '\'' + ", Login='" + Login + '\'' + ", Password='" + Password + '\'' + ", Albaran='" + Albaran + '\'' + ", NumCuenta='" + NumCuenta + '\'' + ", Documento1='0x0'" + ", Documento2='0x0', NumDocumento='" + NumDocumento + '\'' + ", TipoCliente=" + TipoCliente + ", IdCliente=" + IdCliente + ", Operacion=" + Operacion + ", Aux1='" + Aux1 + '\'' + ", Aux2='" + Aux2 + '\'' + ", Foto='0x0', Tipo=" + Tipo + '}';
    }
}
