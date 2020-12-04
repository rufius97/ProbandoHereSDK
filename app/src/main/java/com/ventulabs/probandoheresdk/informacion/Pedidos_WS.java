package com.ventulabs.probandoheresdk.informacion;

import java.util.ArrayList;

public class Pedidos_WS {

    private int                            ID;
    private String                         PETICION;
    private String                         ALBARAN_VENTA;
    private String                         ALBARAN_TR;
    private int                            ID_CONEXION;
    private int                            SCL;
    private String                         NOMBRE_CLIENTE;
    private String                         NUM_DOCUMENTO;
    private String                         DIRECCION_ENTREGA;
    private String                         TELEFONO          = "";
    private String                         TELEFONO2         = "";
    private String                         TELEFONO3         = "";
    private String                         POBLACION;
    private String                         PROVINCIA;
    private String                         COD_POSTAL;
    private String                         COD_PAIS;
    private String                         COD_RUTA;
    private String                         F_INSERT;
    private int                            ESTADO;
    private String                         F_ESTADO;
    private String                         CLAVE_SITUACION;
    private int                            COD_INCIDENCIA;
    private int                            TIPO_INCIDENCIA;
    private String                         CUENTA_TR;
    private String                         ID_SOLICITUD;
    private int                            SERVICIO_ESPECIAL;
    private String                         OBS_CLIENTE;
    private String                         OBS_ENTREGA;
    private String                         OBS_INTERNAS;
    private String                         F_ENTREGA_CONCERTADA;
    private int                            FRANJA_HORARIA;
    private int                            DOCUMENTACION_INCORRECTA;
    private boolean                        ENTREGA_PARCIAL;
    private boolean                        ENTREGA_VECINO;
    private boolean                        ENTREGA_CONSERJE;
    private String                         DE_OTRO_DESTINATARIO;
    private String                         CODIGO_POSTAL_ENTREGA;
    private String                         PERSONA_ENTREGA;
    private String                         DNI_ENTREGA;
    private String                         LATITUD;
    private String                         LONGITUD;
    private String                         CODIGO_AYUDA;
    private int                            TIPO_ENTREGA      = Constantes.DESTINATARIO_VACIO;
    private ArrayList<Bultos_WS>           BULTOS;
    private ArrayList<OpcionesEntregas_WS> OPCIONES_ENTREGAS;
    private String                         CODIGO_ETIQUETA;
    private String                         COD_RUTA_TEMPORAL = "";
    private ArrayList<LineasRecogidas_WS>  LINEAS_RECOGIDAS  = new ArrayList<>();
    private ArrayList<Relaciones_WS>       RELACIONES        = new ArrayList<>();
    private int                            TIPO_ENVIO        = Constantes.TIPO_ENVIO;
    private int                            MOTIVO_RECHAZO    = Constantes.SIN_TIPO_RECHAZO;
    private int                            ID_CLIENTE;

    private String REMIT_NOMBRE     = "";
    private String REMIT_NIF        = "";
    private String REMIT_DIRECCION  = "";
    private String REMIT_COD_POSTAL = "";
    private String REMIT_POBLACION  = "";
    private String REMIT_PROVINCIA  = "";
    private String REMIT_COD_PAIS   = "";
    private String REMIT_CONTACTO   = "";
    private String REMIT_TELEFONO   = "";

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPETICION() {
        return PETICION;
    }

    public void setPETICION(String PETICION) {
        this.PETICION = PETICION;
    }

    public String getALBARAN_VENTA() {
        return ALBARAN_VENTA;
    }

    public void setALBARAN_VENTA(String ALBARAN_VENTA) {
        this.ALBARAN_VENTA = ALBARAN_VENTA;
    }

    public String getALBARAN_TR() {
        return ALBARAN_TR;
    }

    public void setALBARAN_TR(String ALBARAN_TR) {
        this.ALBARAN_TR = ALBARAN_TR;
    }

    public int getID_CONEXION() {
        return ID_CONEXION;
    }

    public void setID_CONEXION(int ID_CONEXION) {
        this.ID_CONEXION = ID_CONEXION;
    }

    public int getSCL() {
        return SCL;
    }

    public void setSCL(int SCL) {
        this.SCL = SCL;
    }

    public String getNOMBRE_CLIENTE() {
        return NOMBRE_CLIENTE;
    }

    public void setNOMBRE_CLIENTE(String NOMBRE_CLIENTE) {
        this.NOMBRE_CLIENTE = NOMBRE_CLIENTE;
    }

    public String getNUM_DOCUMENTO() {
        return NUM_DOCUMENTO;
    }

    public void setNUM_DOCUMENTO(String NUM_DOCUMENTO) {
        this.NUM_DOCUMENTO = NUM_DOCUMENTO;
    }

    public String getDIRECCION_ENTREGA() {
        return DIRECCION_ENTREGA;
    }

    public void setDIRECCION_ENTREGA(String DIRECCION_ENTREGA) {
        this.DIRECCION_ENTREGA = DIRECCION_ENTREGA;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getPOBLACION() {
        return POBLACION;
    }

    public void setPOBLACION(String POBLACION) {
        this.POBLACION = POBLACION;
    }

    public String getPROVINCIA() {
        return PROVINCIA;
    }

    public void setPROVINCIA(String PROVINCIA) {
        this.PROVINCIA = PROVINCIA;
    }

    public String getCOD_POSTAL() {
        return COD_POSTAL;
    }

    public void setCOD_POSTAL(String COD_POSTAL) {
        this.COD_POSTAL = COD_POSTAL;
    }

    public String getCOD_PAIS() {
        return COD_PAIS;
    }

    public void setCOD_PAIS(String COD_PAIS) {
        this.COD_PAIS = COD_PAIS;
    }

    public String getCOD_RUTA() {
        return COD_RUTA;
    }

    public void setCOD_RUTA(String COD_RUTA) {
        this.COD_RUTA = COD_RUTA;
    }

    public String getF_INSERT() {
        return F_INSERT;
    }

    public void setF_INSERT(String f_INSERT) {
        F_INSERT = f_INSERT;
    }

    public int getESTADO() {
        return ESTADO;
    }

    public void setESTADO(int ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getF_ESTADO() {
        return F_ESTADO;
    }

    public void setF_ESTADO(String f_ESTADO) {
        F_ESTADO = f_ESTADO;
    }

    public ArrayList<Bultos_WS> getBULTOS() {
        return BULTOS;
    }

    public void setBULTOS(ArrayList<Bultos_WS> BULTOS) {
        this.BULTOS = BULTOS;
    }

    public String getCLAVE_SITUACION() {
        return CLAVE_SITUACION;
    }

    public void setCLAVE_SITUACION(String CLAVE_SITUACION) {
        this.CLAVE_SITUACION = CLAVE_SITUACION;
    }

    public int getCOD_INCIDENCIA() {
        return COD_INCIDENCIA;
    }

    public void setCOD_INCIDENCIA(int COD_INCIDENCIA) {
        this.COD_INCIDENCIA = COD_INCIDENCIA;
    }

    public int getTIPO_INCIDENCIA() {
        return TIPO_INCIDENCIA;
    }

    public void setTIPO_INCIDENCIA(int TIPO_INCIDENCIA) {
        this.TIPO_INCIDENCIA = TIPO_INCIDENCIA;
    }

    public String getCUENTA_TR() {
        return CUENTA_TR;
    }

    public void setCUENTA_TR(String CUENTA_TR) {
        this.CUENTA_TR = CUENTA_TR;
    }

    public String getID_SOLICITUD() {
        return ID_SOLICITUD;
    }

    public void setID_SOLICITUD(String ID_SOLICITUD) {
        this.ID_SOLICITUD = ID_SOLICITUD;
    }

    public int getSERVICIO_ESPECIAL() {
        return SERVICIO_ESPECIAL;
    }

    public void setSERVICIO_ESPECIAL(int SERVICIO_ESPECIAL) {
        this.SERVICIO_ESPECIAL = SERVICIO_ESPECIAL;
    }

    public String getOBS_CLIENTE() {
        return OBS_CLIENTE;
    }

    public void setOBS_CLIENTE(String OBS_CLIENTE) {
        this.OBS_CLIENTE = OBS_CLIENTE;
    }

    public String getOBS_ENTREGA() {
        return OBS_ENTREGA;
    }

    public void setOBS_ENTREGA(String OBS_ENTREGA) {
        this.OBS_ENTREGA = OBS_ENTREGA;
    }

    public String getOBS_INTERNAS() {
        return OBS_INTERNAS;
    }

    public void setOBS_INTERNAS(String OBS_INTERNAS) {
        this.OBS_INTERNAS = OBS_INTERNAS;
    }

    public String getF_ENTREGA_CONCERTADA() {
        return F_ENTREGA_CONCERTADA;
    }

    public void setF_ENTREGA_CONCERTADA(String f_ENTREGA_CONCERTADA) {
        F_ENTREGA_CONCERTADA = f_ENTREGA_CONCERTADA;
    }

    public int getFRANJA_HORARIA() {
        return FRANJA_HORARIA;
    }

    public void setFRANJA_HORARIA(int FRANJA_HORARIA) {
        this.FRANJA_HORARIA = FRANJA_HORARIA;
    }

    public int getDOCUMENTACION_INCORRECTA() {
        return DOCUMENTACION_INCORRECTA;
    }

    public void setDOCUMENTACION_INCORRECTA(int DOCUMENTACION_INCORRECTA) {
        this.DOCUMENTACION_INCORRECTA = DOCUMENTACION_INCORRECTA;
    }

    public boolean isENTREGA_PARCIAL() {
        return ENTREGA_PARCIAL;
    }

    public void setENTREGA_PARCIAL(boolean ENTREGA_PARCIAL) {
        this.ENTREGA_PARCIAL = ENTREGA_PARCIAL;
    }

    public boolean isENTREGA_VECINO() {
        return ENTREGA_VECINO;
    }

    public void setENTREGA_VECINO(boolean ENTREGA_VECINO) {
        this.ENTREGA_VECINO = ENTREGA_VECINO;
    }

    public boolean isENTREGA_CONSERJE() {
        return ENTREGA_CONSERJE;
    }

    public void setENTREGA_CONSERJE(boolean ENTREGA_CONSERJE) {
        this.ENTREGA_CONSERJE = ENTREGA_CONSERJE;
    }

    public String getDE_OTRO_DESTINATARIO() {
        return DE_OTRO_DESTINATARIO;
    }

    public void setDE_OTRO_DESTINATARIO(String DE_OTRO_DESTINATARIO) {
        this.DE_OTRO_DESTINATARIO = DE_OTRO_DESTINATARIO;
    }

    public String getCODIGO_POSTAL_ENTREGA() {
        return CODIGO_POSTAL_ENTREGA;
    }

    public void setCODIGO_POSTAL_ENTREGA(String CODIGO_POSTAL_ENTREGA) {
        this.CODIGO_POSTAL_ENTREGA = CODIGO_POSTAL_ENTREGA;
    }

    public String getPERSONA_ENTREGA() {
        return PERSONA_ENTREGA;
    }

    public void setPERSONA_ENTREGA(String PERSONA_ENTREGA) {
        this.PERSONA_ENTREGA = PERSONA_ENTREGA;
    }

    public String getDNI_ENTREGA() {
        return DNI_ENTREGA;
    }

    public void setDNI_ENTREGA(String DNI_ENTREGA) {
        this.DNI_ENTREGA = DNI_ENTREGA;
    }

    public String getLATITUD() {
        return LATITUD;
    }

    public void setLATITUD(String LATITUD) {
        this.LATITUD = LATITUD;
    }

    public String getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(String LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

    public String getCODIGO_AYUDA() {
        return CODIGO_AYUDA;
    }

    public void setCODIGO_AYUDA(String CODIGO_AYUDA) {
        this.CODIGO_AYUDA = CODIGO_AYUDA;
    }

    public ArrayList<OpcionesEntregas_WS> getOPCIONES_ENTREGAS() {
        return OPCIONES_ENTREGAS;
    }

    public void setOPCIONES_ENTREGAS(ArrayList<OpcionesEntregas_WS> OPCIONES_ENTREGAS) {
        this.OPCIONES_ENTREGAS = OPCIONES_ENTREGAS;
    }

    public int getTIPO_ENTREGA() {
        return TIPO_ENTREGA;
    }

    public void setTIPO_ENTREGA(int TIPO_ENTREGA) {
        this.TIPO_ENTREGA = TIPO_ENTREGA;
    }

    public String getCODIGO_ETIQUETA() {
        return CODIGO_ETIQUETA;
    }

    public void setCODIGO_ETIQUETA(String CODIGO_ETIQUETA) {
        this.CODIGO_ETIQUETA = CODIGO_ETIQUETA;
    }

    public String getCOD_RUTA_TEMPORAL() {
        return COD_RUTA_TEMPORAL;
    }

    public void setCOD_RUTA_TEMPORAL(String COD_RUTA_TEMPORAL) {
        this.COD_RUTA_TEMPORAL = COD_RUTA_TEMPORAL;
    }

    public ArrayList<LineasRecogidas_WS> getLINEAS_RECOGIDAS() {
        return LINEAS_RECOGIDAS;
    }

    public void setLINEAS_RECOGIDAS(ArrayList<LineasRecogidas_WS> LINEAS_RECOGIDAS) {
        this.LINEAS_RECOGIDAS = LINEAS_RECOGIDAS;
    }

    public ArrayList<Relaciones_WS> getRELACIONES() {
        return RELACIONES;
    }

    public void setRELACIONES(ArrayList<Relaciones_WS> RELACIONES) {
        this.RELACIONES = RELACIONES;
    }

    public int getTIPO_ENVIO() {
        return TIPO_ENVIO;
    }

    public void setTIPO_ENVIO(int TIPO_ENVIO) {
        this.TIPO_ENVIO = TIPO_ENVIO;
    }

    public String getREMIT_NOMBRE() {
        return REMIT_NOMBRE;
    }

    public void setREMIT_NOMBRE(String REMIT_NOMBRE) {
        this.REMIT_NOMBRE = REMIT_NOMBRE;
    }

    public String getREMIT_NIF() {
        return REMIT_NIF;
    }

    public void setREMIT_NIF(String REMIT_NIF) {
        this.REMIT_NIF = REMIT_NIF;
    }

    public String getREMIT_DIRECCION() {
        return REMIT_DIRECCION;
    }

    public void setREMIT_DIRECCION(String REMIT_DIRECCION) {
        this.REMIT_DIRECCION = REMIT_DIRECCION;
    }

    public String getREMIT_COD_POSTAL() {
        return REMIT_COD_POSTAL;
    }

    public void setREMIT_COD_POSTAL(String REMIT_COD_POSTAL) {
        this.REMIT_COD_POSTAL = REMIT_COD_POSTAL;
    }

    public String getREMIT_POBLACION() {
        return REMIT_POBLACION;
    }

    public void setREMIT_POBLACION(String REMIT_POBLACION) {
        this.REMIT_POBLACION = REMIT_POBLACION;
    }

    public String getREMIT_PROVINCIA() {
        return REMIT_PROVINCIA;
    }

    public void setREMIT_PROVINCIA(String REMIT_PROVINCIA) {
        this.REMIT_PROVINCIA = REMIT_PROVINCIA;
    }

    public String getREMIT_COD_PAIS() {
        return REMIT_COD_PAIS;
    }

    public void setREMIT_COD_PAIS(String REMIT_COD_PAIS) {
        this.REMIT_COD_PAIS = REMIT_COD_PAIS;
    }

    public String getREMIT_CONTACTO() {
        return REMIT_CONTACTO;
    }

    public void setREMIT_CONTACTO(String REMIT_CONTACTO) {
        this.REMIT_CONTACTO = REMIT_CONTACTO;
    }

    public String getREMIT_TELEFONO() {
        return REMIT_TELEFONO;
    }

    public void setREMIT_TELEFONO(String REMIT_TELEFONO) {
        this.REMIT_TELEFONO = REMIT_TELEFONO;
    }

    public String getTELEFONO2() {
        return TELEFONO2;
    }

    public void setTELEFONO2(String TELEFONO2) {
        this.TELEFONO2 = TELEFONO2;
    }

    public String getTELEFONO3() {
        return TELEFONO3;
    }

    public void setTELEFONO3(String TELEFONO3) {
        this.TELEFONO3 = TELEFONO3;
    }

    public int getMOTIVO_RECHAZO() {
        return MOTIVO_RECHAZO;
    }

    public void setMOTIVO_RECHAZO(int MOTIVO_RECHAZO) {
        this.MOTIVO_RECHAZO = MOTIVO_RECHAZO;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    @Override
    public String toString() {
        return "Pedidos_WS{" +
                "ID=" + ID +
                ", PETICION='" + PETICION + '\'' +
                ", ALBARAN_VENTA='" + ALBARAN_VENTA + '\'' +
                ", ALBARAN_TR='" + ALBARAN_TR + '\'' +
                ", ID_CONEXION=" + ID_CONEXION +
                ", SCL=" + SCL +
                ", NOMBRE_CLIENTE='" + NOMBRE_CLIENTE + '\'' +
                ", NUM_DOCUMENTO='" + NUM_DOCUMENTO + '\'' +
                ", DIRECCION_ENTREGA='" + DIRECCION_ENTREGA + '\'' +
                ", TELEFONO='" + TELEFONO + '\'' +
                ", TELEFONO2='" + TELEFONO2 + '\'' +
                ", TELEFONO3='" + TELEFONO3 + '\'' +
                ", POBLACION='" + POBLACION + '\'' +
                ", PROVINCIA='" + PROVINCIA + '\'' +
                ", COD_POSTAL='" + COD_POSTAL + '\'' +
                ", COD_PAIS='" + COD_PAIS + '\'' +
                ", COD_RUTA='" + COD_RUTA + '\'' +
                ", F_INSERT='" + F_INSERT + '\'' +
                ", ESTADO=" + ESTADO +
                ", F_ESTADO='" + F_ESTADO + '\'' +
                ", CLAVE_SITUACION='" + CLAVE_SITUACION + '\'' +
                ", COD_INCIDENCIA=" + COD_INCIDENCIA +
                ", TIPO_INCIDENCIA=" + TIPO_INCIDENCIA +
                ", CUENTA_TR='" + CUENTA_TR + '\'' +
                ", ID_SOLICITUD='" + ID_SOLICITUD + '\'' +
                ", SERVICIO_ESPECIAL=" + SERVICIO_ESPECIAL +
                ", OBS_CLIENTE='" + OBS_CLIENTE + '\'' +
                ", OBS_ENTREGA='" + OBS_ENTREGA + '\'' +
                ", OBS_INTERNAS='" + OBS_INTERNAS + '\'' +
                ", F_ENTREGA_CONCERTADA='" + F_ENTREGA_CONCERTADA + '\'' +
                ", FRANJA_HORARIA=" + FRANJA_HORARIA +
                ", DOCUMENTACION_INCORRECTA=" + DOCUMENTACION_INCORRECTA +
                ", ENTREGA_PARCIAL=" + ENTREGA_PARCIAL +
                ", ENTREGA_VECINO=" + ENTREGA_VECINO +
                ", ENTREGA_CONSERJE=" + ENTREGA_CONSERJE +
                ", DE_OTRO_DESTINATARIO='" + DE_OTRO_DESTINATARIO + '\'' +
                ", CODIGO_POSTAL_ENTREGA='" + CODIGO_POSTAL_ENTREGA + '\'' +
                ", PERSONA_ENTREGA='" + PERSONA_ENTREGA + '\'' +
                ", DNI_ENTREGA='" + DNI_ENTREGA + '\'' +
                ", LATITUD='" + LATITUD + '\'' +
                ", LONGITUD='" + LONGITUD + '\'' +
                ", CODIGO_AYUDA='" + CODIGO_AYUDA + '\'' +
                ", TIPO_ENTREGA=" + TIPO_ENTREGA +
                ", BULTOS=" + BULTOS +
                ", OPCIONES_ENTREGAS=" + OPCIONES_ENTREGAS +
                ", CODIGO_ETIQUETA='" + CODIGO_ETIQUETA + '\'' +
                ", COD_RUTA_TEMPORAL='" + COD_RUTA_TEMPORAL + '\'' +
                ", LINEAS_RECOGIDAS=" + LINEAS_RECOGIDAS +
                ", RELACIONES=" + RELACIONES +
                ", TIPO_ENVIO=" + TIPO_ENVIO +
                ", MOTIVO_RECHAZO=" + MOTIVO_RECHAZO +
                ", ID_CLIENTE=" + ID_CLIENTE +
                ", REMIT_NOMBRE='" + REMIT_NOMBRE + '\'' +
                ", REMIT_NIF='" + REMIT_NIF + '\'' +
                ", REMIT_DIRECCION='" + REMIT_DIRECCION + '\'' +
                ", REMIT_COD_POSTAL='" + REMIT_COD_POSTAL + '\'' +
                ", REMIT_POBLACION='" + REMIT_POBLACION + '\'' +
                ", REMIT_PROVINCIA='" + REMIT_PROVINCIA + '\'' +
                ", REMIT_COD_PAIS='" + REMIT_COD_PAIS + '\'' +
                ", REMIT_CONTACTO='" + REMIT_CONTACTO + '\'' +
                ", REMIT_TELEFONO='" + REMIT_TELEFONO + '\'' +
                '}';
    }
}


