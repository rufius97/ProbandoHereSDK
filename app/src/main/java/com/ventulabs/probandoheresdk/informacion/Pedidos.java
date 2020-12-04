package com.ventulabs.probandoheresdk.informacion;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.core.content.ContextCompat;

import com.google.android.gms.maps.model.LatLng;
import com.ventulabs.probandoheresdk.R;

import java.util.ArrayList;

public class Pedidos extends BaseObject {

    private             String                      peticion;
    private             String                      sistema;
    private             String                      peticionUni2                 = "";
    private             String                      codigoPedido                 = "";
    private             String                      codRuta                      = "";
    private             String                      nombreCliente                = "";
    private             String                      direccion                    = "";
    private             String                      telefono                     = "";
    private             String                      telefono2                    = "";
    private             String                      telefono3                    = "";
    private             String                      codPostal                    = "";
    private             String                      poblacion                    = "";
    private             String                      provincia                    = "";
    private             String                      pais                         = "";
    private             String                      observacionesEntrega         = "";//observaciones en la entrega
    private             String                      observacionesCliente         = ""; //observaciones del clientes
    private             String                      observacionesInternas        = ""; //observaciones internas
    private             String                      observacionesRechazo         = "";
    private             String                      dniScl                       = "";
    private             String                      nombreMensjero               = "";
    private             int                         estado                       = Constantes.REPARTIDOR_ESTADO_EN_REPARTO; //inicalmente cuando creamos un pedido se cra en REPARTO
    private             boolean                     firmado                      = false;
    private             String                      claveSituacion               = ""; //se manteiene este campo como campo informativo, la gestion se realiza por medio del campo estado
    private             int                         codigoIncidencia             = Constantes.SIN_CODIGO_INCIDENCIA;
    private             int                         tipoIncidencia               = Constantes.SIN_CODIGO_INCIDENCIA;
    private             int                         motivoRechazo                = Constantes.SIN_CODIGO_INCIDENCIA;
    private             String                      rutaFirma                    = "";
    private             String                      albaran                      = "";
    private             String                      albaraTR                     = "";
    private             boolean                     tieneIncidencia              = false;
    private             int                         conexion;
    private             int                         scl;
    private             int                         idCab;
    private             String                      cuentaTr                     = "";
    private             String                      idSolicitud                  = "";
    private             int                         servicioEspecial             = 0;
    private             String                      codigoAyuda                  = "";
    private             String                      rutaDniAnverso;
    private             String                      rutaDniReverso;
    //propiedades que se rellenan en el momento de firmar la entrega
    private             String                      dniFirma                     = "";
    private             String                      observacionesFirma           = "";
    private             String                      fechaConcertada              = "";
    private             String                      puntoMapa                    = "";
    private             int                         franjaHoraria                = 0;
    private             boolean                     documentacionIncorrecta      = false; //indica si la documentacion necesaria para realizar la entrega es INCORRECTA o no
    private             boolean                     generaIntentoEntrega         = false; //genera intento de entrega para sumar en bd para su posterior gestion
    private             ArrayList<Bultos>           bultos                       = new ArrayList<>();
    private             NuevaCita                   nuevaCita                    = new NuevaCita();
    private             String                      latitudEntrega;
    private             String                      longitudEntrega;
    //entrga en otro destinatario
    private             boolean                     entregarOtroDestinatario     = false;
    private             boolean                     entregaVecino                = false;
    private             boolean                     entregaConserje              = false;
    private             String                      rutaFotografiaVerificacion   = "";  //fotografia que debe de tomarse cuando al entregar un pedido no se quiere proporcionar DNI
    private             String                      rutaAudioVerificacionEntrega = "";
    private             ArrayList<OpcionesEntregas> opcionesEntregases           = new ArrayList<OpcionesEntregas>();
    private             DestinatarioEntrega         destinatarioEntrega          = new DestinatarioEntrega();
    private             boolean                     permitirEntrega              = true;
    private             String                      codigoEtiqueta               = "";
    private             String                      codRutaTemporal              = "";
    //Indicadores si un pedido se encuenra en proceso de traspaso o no
    private             boolean                     enTraspaso                   = false;
    //si estamos en el proceso de validacion bancaria
    private             boolean                     validacionBancaria           = false;
    private             String                      rutaImagenValidacionBancaria = "";
    private             int                         tipo;
    private             boolean                     tieneCotejos                 = false;
    private             ArrayList<LineasRecogidas>  lineasRecogidas;
    //datos del remitente
    private             ArrayList<Relaciones>       relaciones;
    private             String                      remitNombre                  = "";
    private             String                      remitNif                     = "";
    private             String                      remitDireccion               = "";
    private             String                      remitCod_postal              = "";
    private             String                      remitPoblacion               = "";
    private             String                      remitProvincia               = "";
    private             String                      remitCod_pais                = "";
    private             String                      remitContacto                = "";
    private             String                      remitTelefono                = "";
    private             float                       distancia                    = 0;
    private             ArrayList<Integer>          pedidosAsociados             = new ArrayList<>();
    private             int                         idCliente;

    public Pedidos() {
        relaciones      = new ArrayList<>();
        lineasRecogidas = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCab() {
        return idCab;
    }

    public void setIdCab(int idCab) {
        this.idCab = idCab;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isTieneCotejos() {
        return tieneCotejos;
    }

    public void setTieneCotejos(boolean tieneCotejos) {
        this.tieneCotejos = tieneCotejos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList<Bultos> getBultos() {
        return bultos;
    }

    public void setBultos(ArrayList<Bultos> bultos) {
        this.bultos = bultos;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getPeticion() {
        return peticion;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }

    public String getPeticionUni2() {
        return peticionUni2;
    }

    public void setPeticionUni2(String peticionUni2) {
        this.peticionUni2 = peticionUni2;
    }

    public String getDniScl() {
        return dniScl;
    }

    public void setDniScl(String dniScl) {
        this.dniScl = dniScl;
    }

    public String getNombreMensjero() {
        return nombreMensjero;
    }

    public void setNombreMensjero(String nombreMensjero) {
        this.nombreMensjero = nombreMensjero;
    }

    public boolean isTieneIncidencia() {
        return tieneIncidencia;
    }

    public void setTieneIncidencia(boolean tieneIncidencia) {
        this.tieneIncidencia = tieneIncidencia;
    }

    public int getCodigoIncidencia() {
        return codigoIncidencia;
    }

    public void setCodigoIncidencia(int codigoIncidencia) {
        this.codigoIncidencia = codigoIncidencia;
    }

    public int getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setTipoIncidencia(int tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public int getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(int motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public String getAlbaran() {
        return albaran;
    }

    public void setAlbaran(String albaran) {
        this.albaran = albaran;
    }

    public String getAlbaraTR() {
        return albaraTR;
    }

    public void setAlbaraTR(String albaraTR) {
        this.albaraTR = albaraTR;
    }

    public String getObservacionesRechazo() {
        return observacionesRechazo;
    }

    public void setObservacionesRechazo(String observacionesRechazo) {
        this.observacionesRechazo = observacionesRechazo;
    }

    public String getClaveSituacion() {
        return claveSituacion;
    }

    public void setClaveSituacion(String claveSituacion) {
        this.claveSituacion = claveSituacion;
    }

    public boolean isFirmado() {
        return firmado;
    }

    public void setFirmado(boolean firmado) {
        this.firmado = firmado;
    }

    public String getRutaFirma() {
        return rutaFirma;
    }

    public void setRutaFirma(String rutaFirma) {
        this.rutaFirma = rutaFirma;
    }

    public String getObservacionesFirma() {
        return observacionesFirma;
    }

    public void setObservacionesFirma(String observacionesFirma) {
        this.observacionesFirma = observacionesFirma;
    }

    public String getObservacionesEntrega() {
        return observacionesEntrega;
    }

    public void setObservacionesEntrega(String observacionesEntrega) {
        this.observacionesEntrega = observacionesEntrega;
    }

    public String getObservacionesCliente() {
        return observacionesCliente;
    }

    public void setObservacionesCliente(String observacionesCliente) {
        this.observacionesCliente = observacionesCliente;
    }

    public String getObservacionesInternas() {
        return observacionesInternas;
    }

    public void setObservacionesInternas(String observacionesInternas) {
        this.observacionesInternas = observacionesInternas;
    }

    public int getConexion() {
        return conexion;
    }

    public void setConexion(int conexion) {
        this.conexion = conexion;
    }

    public int getScl() {
        return scl;
    }

    public void setScl(int scl) {
        this.scl = scl;
    }

    public String getCuentaTr() {
        return cuentaTr;
    }

    public void setCuentaTr(String cuentaTr) {
        this.cuentaTr = cuentaTr;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getServicioEspecial() {
        return servicioEspecial;
    }

    public void setServicioEspecial(int servicioEspecial) {
        this.servicioEspecial = servicioEspecial;
    }

    public String getRutaDniAnverso() {
        return rutaDniAnverso;
    }

    public void setRutaDniAnverso(String rutaDniAnverso) {
        this.rutaDniAnverso = rutaDniAnverso;
    }

    public String getRutaDniReverso() {
        return rutaDniReverso;
    }

    public void setRutaDniReverso(String rutaDniReverso) {
        this.rutaDniReverso = rutaDniReverso;
    }

    public String getDniFirma() {
        return dniFirma;
    }

    public void setDniFirma(String dniFirma) {
        this.dniFirma = dniFirma;
    }

    public String getFechaConcertada() {
        return fechaConcertada;
    }

    public void setFechaConcertada(String fechaConcertada) {
        this.fechaConcertada = fechaConcertada;
    }

    public int getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public NuevaCita getNuevaCita() {
        return nuevaCita;
    }

    public void setNuevaCita(NuevaCita nuevaCita) {
        this.nuevaCita = nuevaCita;
    }

    public String getPuntoMapa() {
        return peticion.substring(Math.max(peticion.length() - 2, 0));
    }

    public void setPuntoMapa(String puntoMapa) {
        this.puntoMapa = puntoMapa;
    }

    public String getLatitudEntrega() {
        return latitudEntrega;
    }

    public void setLatitudEntrega(String latitudEntrega) {
        this.latitudEntrega = latitudEntrega;
    }

    public String getLongitudEntrega() {
        return longitudEntrega;
    }

    public void setLongitudEntrega(String longitudEntrega) {
        this.longitudEntrega = longitudEntrega;
    }

    public boolean isDocumentacionIncorrecta() {
        return documentacionIncorrecta;
    }

    public void setDocumentacionIncorrecta(boolean documentacionIncorrecta) {
        this.documentacionIncorrecta = documentacionIncorrecta;
    }

    public boolean isGeneraIntentoEntrega() {
        return generaIntentoEntrega;
    }

    public void setGeneraIntentoEntrega(boolean generaIntentoEntrega) {
        this.generaIntentoEntrega = generaIntentoEntrega;
    }

    public boolean isEntregarOtroDestinatario() {
        return entregarOtroDestinatario;
    }

    public void setEntregarOtroDestinatario(boolean entregarOtroDestinatario) {
        this.entregarOtroDestinatario = entregarOtroDestinatario;
    }

    public DestinatarioEntrega getDestinatarioEntrega() {
        return destinatarioEntrega;
    }

    public void setDestinatarioEntrega(DestinatarioEntrega destinatarioEntrega) {
        this.destinatarioEntrega = destinatarioEntrega;
    }

    public boolean isEntregaVecino() {
        return entregaVecino;
    }

    public void setEntregaVecino(boolean entregaVecino) {
        this.entregaVecino = entregaVecino;
    }

    public boolean isEntregaConserje() {
        return entregaConserje;
    }

    public void setEntregaConserje(boolean entregaConserje) {
        this.entregaConserje = entregaConserje;
    }

    public String getRutaFotografiaVerificacion() {
        return rutaFotografiaVerificacion;
    }

    public void setRutaFotografiaVerificacion(String rutaFotografiaVerificacion) {
        this.rutaFotografiaVerificacion = rutaFotografiaVerificacion;
    }

    public boolean isPermitirEntrega() {
        return permitirEntrega;
    }

    public void setPermitirEntrega(boolean permitirEntrega) {
        this.permitirEntrega = permitirEntrega;
    }

    public String getCodigoAyuda() {
        return (codigoAyuda == null || codigoAyuda.isEmpty() || codigoAyuda.trim().length() == 0) ? "A" : codigoAyuda;
    }

    public void setCodigoAyuda(String codigoAyuda) {
        this.codigoAyuda = codigoAyuda;
    }

    public ArrayList<OpcionesEntregas> getOpcionesEntregases() {
        return opcionesEntregases;
    }

    public void setOpcionesEntregases(ArrayList<OpcionesEntregas> opcionesEntregases) {
        this.opcionesEntregases = opcionesEntregases;
    }

    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    public void setCodigoEtiqueta(String codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }

    public String getCodRutaTemporal() {
        return codRutaTemporal;
    }

    public void setCodRutaTemporal(String codRutaTemporal) {
        this.codRutaTemporal = codRutaTemporal;
    }

    public boolean isEnTraspaso() {
        return enTraspaso;
    }

    public void setEnTraspaso(boolean enTraspaso) {
        this.enTraspaso = enTraspaso;
    }

    public boolean isValidacionBancaria() {
        return validacionBancaria;
    }

    public void setValidacionBancaria(boolean validacionBancaria) {
        this.validacionBancaria = validacionBancaria;
    }

    public String getRutaImagenValidacionBancaria() {
        return rutaImagenValidacionBancaria;
    }

    public void setRutaImagenValidacionBancaria(String rutaImagenValidacionBancaria) {
        this.rutaImagenValidacionBancaria = rutaImagenValidacionBancaria;
    }

    public String getRutaAudioVerificacionEntrega() {
        return rutaAudioVerificacionEntrega;
    }

    public void setRutaAudioVerificacionEntrega(String rutaAudioVerificacionEntrega) {
        this.rutaAudioVerificacionEntrega = rutaAudioVerificacionEntrega;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ArrayList<LineasRecogidas> getLineasRecogidas() {
        return lineasRecogidas;
    }

    public void setLineasRecogidas(ArrayList<LineasRecogidas> lineasRecogidas) {
        this.lineasRecogidas = lineasRecogidas;
    }

    public ArrayList<Relaciones> getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(ArrayList<Relaciones> relaciones) {
        this.relaciones = relaciones;
    }

    public String getRemitNombre() {
        return remitNombre;
    }

    public void setRemitNombre(String remitNombre) {
        this.remitNombre = remitNombre;
    }

    public String getRemitNif() {
        return remitNif;
    }

    public void setRemitNif(String remitNif) {
        this.remitNif = remitNif;
    }

    public String getRemitDireccion() {
        return remitDireccion;
    }

    public void setRemitDireccion(String remitDireccion) {
        this.remitDireccion = remitDireccion;
    }

    public String getRemitCod_postal() {
        return remitCod_postal;
    }

    public void setRemitCod_postal(String remitCod_postal) {
        this.remitCod_postal = remitCod_postal;
    }

    public String getRemitPoblacion() {
        return remitPoblacion;
    }

    public void setRemitPoblacion(String remitPoblacion) {
        this.remitPoblacion = remitPoblacion;
    }

    public String getRemitProvincia() {
        return remitProvincia;
    }

    public void setRemitProvincia(String remitProvincia) {
        this.remitProvincia = remitProvincia;
    }

    public String getRemitCod_pais() {
        return remitCod_pais;
    }

    public void setRemitCod_pais(String remitCod_pais) {
        this.remitCod_pais = remitCod_pais;
    }

    public String getRemitContacto() {
        return remitContacto;
    }

    public void setRemitContacto(String remitContacto) {
        this.remitContacto = remitContacto;
    }

    public String getRemitTelefono() {
        return remitTelefono;
    }

    public void setRemitTelefono(String remitTelefono) {
        this.remitTelefono = remitTelefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public ArrayList<Integer> getPedidosAsociados() {
        return pedidosAsociados;
    }

    public void setPedidosAsociados(ArrayList<Integer> pedidosAsociados) {
        this.pedidosAsociados = pedidosAsociados;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    //====================================================================================================================================================================================

    public Drawable getLogo(Context context) {
        Drawable imagenLogo = null;
        switch (this.idCliente) {
            case Constantes.ID_CLIENTE_SIMYO:
                imagenLogo = ContextCompat.getDrawable(context, R.drawable.simyo_logo);
                break;
            case Constantes.ID_CLIENTE_ORANGE_FIJOS:
            case Constantes.ID_CLIENTE_ORANGE_MOVILES:
            case Constantes.ID_CLIENTE_ORANGE_B2B:
                imagenLogo = ContextCompat.getDrawable(context, R.drawable.orange_logo);
                break;
            case Constantes.ID_CLIENTE_JAZZTEL:
                imagenLogo = ContextCompat.getDrawable(context, R.drawable.jazztel_logo);
                break;
            case Constantes.ID_CLIENTE_PROMOCAIXA:
                imagenLogo = ContextCompat.getDrawable(context, R.drawable.caixa_logo);
                break;
            case Constantes.ID_CLIENTE_WORTEN:
                imagenLogo = ContextCompat.getDrawable(context, R.drawable.worten_logo);
                break;
        }
        return imagenLogo;
    }

    public void addBulto(Bultos bulto) {
        if (bultos == null) bultos = new ArrayList<Bultos>();
        boolean existe = false;
        for (Bultos b : bultos) {
            if (bulto.getCodigo().equals(b.getCodigo())) existe = true;
        }

        if (!existe) bultos.add(bulto);
    }

    public ArrayList<Bultos> getBultosLeidos(boolean leidos) {

        ArrayList<Bultos> nn = new ArrayList<>();
        for (Bultos b : bultos) {
            if (b.getLeido() == leidos) nn.add(b);
        }
        return nn;
    }

    public ArrayList<LineasRecogidas> getLineasVerificadas(boolean verificadas) {

        ArrayList<LineasRecogidas> nn = new ArrayList<>();
        for (LineasRecogidas l : lineasRecogidas) {
            if (l.isCorrecto() == verificadas) nn.add(l);
        }
        return nn;
    }

    public boolean todoLeido() {
        for (Bultos b : bultos) {
            if (!b.getLeido()) return false;
        }
        return true;
    }

    public boolean hayBultos() {
        return bultos.size() > 0;
    }

    public boolean hayCotejos() {
        return lineasRecogidas.size() > 0;
    }

    public boolean todoVerificado() {
        for (LineasRecogidas l : lineasRecogidas) {
            if (!l.isCorrecto()) return false;
        }
        return true;
    }

    public boolean marcarButlosLeidos(boolean leidos) {
        try {
            for (Bultos bulto : getBultos()) {
                bulto.setLeido(leidos);
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public String dameTagMapa() {
       /* String direccion = this.getDireccion() + " " + this.getPoblacion() +", " + this.getProvincia() +", " + this.getCodPostal() + ", "  + this.getPais();
        return direccion;*/
        return this.getCodigoPedido();
    }

    public String dameDireccionMapa() {
        switch (tipo) {
            default:
            case Constantes.TIPO_ENVIO:
            case Constantes.TIPO_ENVIO_RECOGIDA:
                return this.getDireccion() + " " + this.getPoblacion() + ", " + this.getProvincia() + ", " + this.getCodPostal() + ", " + this.getPais();

            case Constantes.TIPO_RECOGIDA:
                return this.getRemitDireccion() + " " + this.getRemitPoblacion() + ", " + this.getRemitProvincia() + ", " + this.getRemitCod_postal() + ", " + this.getRemitCod_pais();
        }
    }

    public boolean tieneCotejosRecogida() {
        if (this.lineasRecogidas == null || this.lineasRecogidas.size() == 0) return false;

        for (LineasRecogidas lr : lineasRecogidas) {
            if (lr.getTipoCotejo() != Constantes.COTEJO_SIN_COTEJO) return true;
        }
        return false;
    }

    public boolean tieneBultosVoluminosos() {
        if (getBultos() == null || getBultos().size() == 0) return false;

        for (Bultos bulto : getBultos()) {
            if (bulto != null && bulto.getVoluminiso()) return true;
        }
        return false;
    }

    public LatLng getCoordenadas() {
        try {
            LatLng punto = new LatLng(Double.parseDouble(this.getLatitudEntrega()), Double.parseDouble(this.getLongitudEntrega()));
            return punto;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "peticion='" + peticion + '\'' +
                ", sistema='" + sistema + '\'' +
                ", peticionUni2='" + peticionUni2 + '\'' +
                ", codigoPedido='" + codigoPedido + '\'' +
                ", codRuta='" + codRuta + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", telefono3='" + telefono3 + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", observacionesEntrega='" + observacionesEntrega + '\'' +
                ", observacionesCliente='" + observacionesCliente + '\'' +
                ", observacionesInternas='" + observacionesInternas + '\'' +
                ", observacionesRechazo='" + observacionesRechazo + '\'' +
                ", dniScl='" + dniScl + '\'' +
                ", nombreMensjero='" + nombreMensjero + '\'' +
                ", estado=" + estado +
                ", firmado=" + firmado +
                ", claveSituacion='" + claveSituacion + '\'' +
                ", codigoIncidencia=" + codigoIncidencia +
                ", tipoIncidencia=" + tipoIncidencia +
                ", motivoRechazo=" + motivoRechazo +
                ", rutaFirma='" + rutaFirma + '\'' +
                ", albaran='" + albaran + '\'' +
                ", albaraTR='" + albaraTR + '\'' +
                ", tieneIncidencia=" + tieneIncidencia +
                ", conexion=" + conexion +
                ", scl=" + scl +
                ", idCab=" + idCab +
                ", cuentaTr='" + cuentaTr + '\'' +
                ", idSolicitud='" + idSolicitud + '\'' +
                ", servicioEspecial=" + servicioEspecial +
                ", codigoAyuda='" + codigoAyuda + '\'' +
                ", rutaDniAnverso='" + rutaDniAnverso + '\'' +
                ", rutaDniReverso='" + rutaDniReverso + '\'' +
                ", dniFirma='" + dniFirma + '\'' +
                ", observacionesFirma='" + observacionesFirma + '\'' +
                ", fechaConcertada='" + fechaConcertada + '\'' +
                ", puntoMapa='" + puntoMapa + '\'' +
                ", franjaHoraria=" + franjaHoraria +
                ", documentacionIncorrecta=" + documentacionIncorrecta +
                ", generaIntentoEntrega=" + generaIntentoEntrega +
                ", bultos=" + bultos +
                ", nuevaCita=" + nuevaCita +
                ", latitudEntrega='" + latitudEntrega + '\'' +
                ", longitudEntrega='" + longitudEntrega + '\'' +
                ", entregarOtroDestinatario=" + entregarOtroDestinatario +
                ", entregaVecino=" + entregaVecino +
                ", entregaConserje=" + entregaConserje +
                ", rutaFotografiaVerificacion='" + rutaFotografiaVerificacion + '\'' +
                ", rutaAudioVerificacionEntrega='" + rutaAudioVerificacionEntrega + '\'' +
                ", opcionesEntregases=" + opcionesEntregases +
                ", destinatarioEntrega=" + destinatarioEntrega +
                ", permitirEntrega=" + permitirEntrega +
                ", codigoEtiqueta='" + codigoEtiqueta + '\'' +
                ", codRutaTemporal='" + codRutaTemporal + '\'' +
                ", enTraspaso=" + enTraspaso +
                ", validacionBancaria=" + validacionBancaria +
                ", rutaImagenValidacionBancaria='" + rutaImagenValidacionBancaria + '\'' +
                ", tipo=" + tipo +
                ", tieneCotejos=" + tieneCotejos +
                ", lineasRecogidas=" + lineasRecogidas +
                ", relaciones=" + relaciones +
                ", remitNombre='" + remitNombre + '\'' +
                ", remitNif='" + remitNif + '\'' +
                ", remitDireccion='" + remitDireccion + '\'' +
                ", remitCod_postal='" + remitCod_postal + '\'' +
                ", remitPoblacion='" + remitPoblacion + '\'' +
                ", remitProvincia='" + remitProvincia + '\'' +
                ", remitCod_pais='" + remitCod_pais + '\'' +
                ", remitContacto='" + remitContacto + '\'' +
                ", remitTelefono='" + remitTelefono + '\'' +
                ", distancia=" + distancia +
                ", pedidosAsociados=" + pedidosAsociados +
                ", idCliente=" + idCliente +
                '}';
    }
}
