package com.ventulabs.probandoheresdk.informacion;

public class EntregasRequest extends BaseRequest {

    private int    tipo;
    private String albaran;
    private String albaran_tr;
    private String peticion;
    private int    bulto;
    private String clave_situacion;
    private String observaciones                         = "";
    private String observacionesRechazo                  = "";
    private String usuario;
    private String fecha_tracking;
    private int    codigo_incidencia;
    private int    tipo_incidencia;
    private int    motivo_rechazo;
    private String codigo_lectura;
    private String firma;
    private String dni;
    private String nombre_mensajero;
    private int    tipoConexion;
    private int    scl;
    private int    idOsc;
    private int    estado;
    private int    documentacionIncorrecta               = Constantes.NO;
    private String claveSituacionDocumentacionIncorrecta = "";
    private String dniFirma                              = "";
    private String observacionesFirma                    = "";
    private String audioObservacionesFirma               = "";

    private String latitudEntrega  = "";
    private String longitudEntrega = "";

    private int                  generaIntentoEntrega = Constantes.NO;
    private ValidacionDNIRequest validacionDNIRequest = new ValidacionDNIRequest();
    private NuevaCita nuevaCita;
    //----------------------------------------------------
    // obsercaciones
    private String    obsCliente;
    private String    obsInternas;
    private String    obsEntrega;
    //----------------------------------------------------
    // definicion de datos para la entrga parcial
    private int       entregaOtroDestinatario;
    private int                  entregaParcial;
    private int                  entregaVecino;
    private int       entregaConserje;
    private String    personaEntrega;
    private String    dniEntrega;
    private String    direccionEntrega;
    private String    codigoPostalEntrega;
    private String    fotografiaEntrega;
    private int       noProporcionaInformacion;

    private String fotografiaVerificacionObservaciones;
    private String fotografiaValidacionBancaria;

    private String latitudTransportista      = "";
    private String longitudTransportista     = "";
    private String distanciaDireccionEntrega = "";

    public int getTipo ()                                                                               { return tipo; }

    public void setTipo (int tipo)                                                                      { this.tipo = tipo; }

    public String getPeticion ()                                                                        { return peticion; }

    public void setPeticion (String peticion)                                                           { this.peticion = peticion; }

    public int getBulto ()                                                                              { return bulto; }

    public void setBulto (int bulto)                                                                    { this.bulto = bulto; }

    public String getClave_situacion ()                                                                 { return clave_situacion; }

    public void setClave_situacion (String clave_situacion)                                             { this.clave_situacion = clave_situacion; }

    public String getObservaciones ()                                                                   { return observaciones; }

    public void setObservaciones (String observaciones)                                                 { this.observaciones = observaciones; }

    public String getObservacionesRechazo ()                                                            { return observacionesRechazo; }

    public void setObservacionesRechazo (String observacionesRechazo)                                   { this.observacionesRechazo = observacionesRechazo; }

    public String getUsuario ()                                                                         { return usuario; }

    public void setUsuario (String usuario)                                                             { this.usuario = usuario; }

    public String getFecha_tracking ()                                                                  { return fecha_tracking; }

    public void setFecha_tracking (String fecha_tracking)                                               { this.fecha_tracking = fecha_tracking; }

    public int getCodigo_incidencia ()                                                                  { return codigo_incidencia; }

    public void setCodigo_incidencia (int codigo_incidencia)                                            { this.codigo_incidencia = codigo_incidencia; }

    public String getCodigo_lectura ()                                                                  { return codigo_lectura; }

    public void setCodigo_lectura (String codigo_lectura)                                               { this.codigo_lectura = codigo_lectura; }

    public String getFirma ()                                                                           { return firma; }

    public void setFirma (String firma)                                                                 { this.firma = firma; }

    public String getDni ()                                                                             { return dni; }

    public void setDni (String dni)                                                                     { this.dni = dni; }

    public String getNombre_mensajero ()                                                                { return nombre_mensajero; }

    public void setNombre_mensajero (String nombre_mensajero)                                           { this.nombre_mensajero = nombre_mensajero; }

    public String getAlbaran ()                                                                         { return albaran; }

    public void setAlbaran (String albaran)                                                             { this.albaran = albaran; }

    public String getAlbaran_tr ()                                                                      { return albaran_tr; }

    public void setAlbaran_tr (String albaran_tr)                                                       { this.albaran_tr = albaran_tr; }

    public int getTipoConexion ()                                                                       { return tipoConexion; }

    public void setTipoConexion (int tipoConexion)                                                      { this.tipoConexion = tipoConexion; }

    public int getScl ()                                                                                { return scl; }

    public void setScl (int scl)                                                                        { this.scl = scl; }

    public int getIdOsc ()                                                                              { return idOsc; }

    public void setIdOsc (int idOsc)                                                                    { this.idOsc = idOsc; }

    public int getEstado ()                                                                             { return estado; }

    public void setEstado (int estado)                                                                  { this.estado = estado; }

    public int getDocumentacionIncorrecta ()                                                            { return documentacionIncorrecta; }

    public void setDocumentacionIncorrecta (int documentacionIncorrecta)                                { this.documentacionIncorrecta = documentacionIncorrecta; }

    public ValidacionDNIRequest getValidacionDNIRequest ()                                              { return validacionDNIRequest; }

    public void setValidacionDNIRequest (ValidacionDNIRequest validacionDNIRequest)                     { this.validacionDNIRequest = validacionDNIRequest; }

    public NuevaCita getNuevaCita ()                                                                    { return nuevaCita; }

    public void setNuevaCita (NuevaCita nuevaCita)                                                      { this.nuevaCita = nuevaCita; }

    public String getDniFirma ()                                                                        { return dniFirma; }

    public void setDniFirma (String dniFirma)                                                           { this.dniFirma = dniFirma; }

    public String getObservacionesFirma ()                                                              { return observacionesFirma; }

    public void setObservacionesFirma (String observacionesFirma)                                       { this.observacionesFirma = observacionesFirma; }

    public int getGeneraIntentoEntrega ()                                                               { return generaIntentoEntrega; }

    public void setGeneraIntentoEntrega (int generaIntentoEntrega)                                      { this.generaIntentoEntrega = generaIntentoEntrega; }

    public String getClaveSituacionDocumentacionIncorrecta ()                                           { return claveSituacionDocumentacionIncorrecta; }

    public void setClaveSituacionDocumentacionIncorrecta (String claveSituacionDocumentacionIncorrecta) { this.claveSituacionDocumentacionIncorrecta = claveSituacionDocumentacionIncorrecta; }

    public String getObsCliente ()                                                                      { return obsCliente; }

    public void setObsCliente (String obsCliente)                                                       { this.obsCliente = obsCliente; }

    public String getObsInternas ()                                                                     { return obsInternas; }

    public void setObsInternas (String obsInternas)                                                     { this.obsInternas = obsInternas; }

    public String getObsEntrega ()                                                                      { return obsEntrega; }

    public void setObsEntrega (String obsEntrega)                                                       { this.obsEntrega = obsEntrega; }

    public int getEntregaOtroDestinatario ()                                                            { return entregaOtroDestinatario; }

    public void setEntregaOtroDestinatario (int entregaOtroDestinatario)                                { this.entregaOtroDestinatario = entregaOtroDestinatario; }

    public int getEntregaParcial ()                                                                     { return entregaParcial; }

    public void setEntregaParcial (int entregaParcial)                                                  { this.entregaParcial = entregaParcial; }

    public int getEntregaVecino ()                                                                      { return entregaVecino; }

    public void setEntregaVecino (int entregaVecino)                                                    { this.entregaVecino = entregaVecino; }

    public int getEntregaConserje ()                                                                    { return entregaConserje; }

    public void setEntregaConserje (int entregaConserje)                                                { this.entregaConserje = entregaConserje; }

    public String getPersonaEntrega ()                                                                  { return personaEntrega; }

    public void setPersonaEntrega (String personaEntrega)                                               { this.personaEntrega = personaEntrega; }

    public String getDniEntrega ()                                                                      { return dniEntrega; }

    public void setDniEntrega (String dniEntrega)                                                       { this.dniEntrega = dniEntrega; }

    public String getDireccionEntrega ()                                                                { return direccionEntrega; }

    public void setDireccionEntrega (String direccionEntrega)                                           { this.direccionEntrega = direccionEntrega; }

    public String getCodigoPostalEntrega ()                                                             { return codigoPostalEntrega; }

    public void setCodigoPostalEntrega (String codigoPostalEntrega)                                     { this.codigoPostalEntrega = codigoPostalEntrega; }

    public String getFotografiaEntrega ()                                                               { return fotografiaEntrega; }

    public void setFotografiaEntrega (String fotografiaEntrega)                                         {
        this.fotografiaEntrega = fotografiaEntrega;
    }

    public int getNoProporcionaInformacion ()                                                           { return noProporcionaInformacion; }

    public void setNoProporcionaInformacion (int noProporcionaInformacion)                              { this.noProporcionaInformacion = noProporcionaInformacion; }

    public String getFotografiaVerificacionObservaciones ()                                             { return fotografiaVerificacionObservaciones; }

    public void setFotografiaVerificacionObservaciones (String fotografiaVerificacionObservaciones)     { this.fotografiaVerificacionObservaciones = fotografiaVerificacionObservaciones; }

    public String getLatitudEntrega ()                                                                  { return latitudEntrega; }

    public void setLatitudEntrega (String latitudEntrega)                                               { this.latitudEntrega = latitudEntrega; }

    public String getLongitudEntrega ()                                                                 { return longitudEntrega; }

    public void setLongitudEntrega (String longitudEntrega)                                             { this.longitudEntrega = longitudEntrega; }

    public String getFotografiaValidacionBancaria ()                                                    { return fotografiaValidacionBancaria; }

    public void setFotografiaValidacionBancaria (String fotografiaValidacionBancaria)                   { this.fotografiaValidacionBancaria = fotografiaValidacionBancaria; }

    public String getLatitudTransportista ()                                                            { return latitudTransportista; }

    public void setLatitudTransportista (String latitudTransportista)                                   { this.latitudTransportista = latitudTransportista; }

    public String getLongitudTransportista ()                                                           { return longitudTransportista; }

    public void setLongitudTransportista (String longitudTransportista)                                 { this.longitudTransportista = longitudTransportista; }

    public String getAudioObservacionesFirma ()                                                         { return audioObservacionesFirma; }

    public void setAudioObservacionesFirma (String audioObservacionesFirma)                             { this.audioObservacionesFirma = audioObservacionesFirma; }

    public String getDistanciaDireccionEntrega ()                                                       { return distanciaDireccionEntrega; }

    public void setDistanciaDireccionEntrega (String distanciaDireccionEntrega)                         { this.distanciaDireccionEntrega = distanciaDireccionEntrega; }

    public int getTipo_incidencia ()                                                                    { return tipo_incidencia; }

    public void setTipo_incidencia (int tipo_incidencia)                                                { this.tipo_incidencia = tipo_incidencia; }

    public int getMotivo_rechazo ()                                                                     { return motivo_rechazo; }

    public void setMotivo_rechazo (int motivo_rechazo)                                                  { this.motivo_rechazo = motivo_rechazo; }

    @Override
    public String toString () {
        return "EntregasRequest{" + "albaran='" + albaran + '\'' + ", albaran_tr='" + albaran_tr + '\'' + ", peticion='" + peticion + '\'' + ", bulto=" + bulto + ", clave_situacion='" + clave_situacion + '\'' + ", observaciones='" + observaciones + '\'' + ", observacionesRechazo='" + observacionesRechazo + '\'' + ", usuario='" + usuario + '\'' + ", fecha_tracking='" + fecha_tracking + '\'' + ", codigo_incidencia=" + codigo_incidencia + ", codigo_lectura='" + codigo_lectura + '\'' + ", firma='" + firma + '\'' + ", dni='" + dni + '\'' + ", nombre_mensajero='" + nombre_mensajero + '\'' + ", tipoConexion=" + tipoConexion + ", scl=" + scl + ", idOsc=" + idOsc + ", documentacionIncorrecta=" + documentacionIncorrecta + ", claveSituacionDocumentacionIncorrecta='" + claveSituacionDocumentacionIncorrecta + '\'' + ", dniFirma='" + dniFirma + '\'' + ", observacionesFirma='" + observacionesFirma + '\'' + ", latitudEntrega='" + latitudEntrega + '\'' + ", longitudEntrega='" + longitudEntrega + '\'' + ", generaIntentoEntrega=" + generaIntentoEntrega + ", validacionDNIRequest=" + validacionDNIRequest + ", nuevaCita=" + nuevaCita + ", obsCliente='" + obsCliente + '\'' + ", obsInternas='" + obsInternas + '\'' + ", obsEntrega='" + obsEntrega + '\'' + ", entregaOtroDestinatario=" + entregaOtroDestinatario + ", entregaParcial=" + entregaParcial + ", entregaVecino=" + entregaVecino + ", entregaConserje=" + entregaConserje + ", personaEntrega='" + personaEntrega + '\'' + ", dniEntrega='" + dniEntrega + '\'' + ", direccionEntrega='" + direccionEntrega + '\'' + ", codigoPostalEntrega='" + codigoPostalEntrega + '\'' + ", fotografiaEntrega='" + fotografiaEntrega + '\'' + ", noProporcionaInformacion=" + noProporcionaInformacion + ", fotografiaVerificacionObservaciones='" + fotografiaVerificacionObservaciones + '\'' + '}';
    }
}
