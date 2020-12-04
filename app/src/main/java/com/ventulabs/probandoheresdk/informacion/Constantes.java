package com.ventulabs.probandoheresdk.informacion;

import com.android.volley.Request;

public class Constantes {

    public static final int SISTEMA_ANDROID = 1;

    public static final int OK = 0;

    public static final int SI = 1;
    public static final int NO = 0;

    public static final String APK           = "icp_express.apk";
    public static final String PREF_MODO_APP = "modo_app";

    public final static String FORMATO_FECHA          = "yyyy-MM-dd";
    public final static String FORMATO_FECHA_PANTALLA = "dd-MM-yyyy";
    public final static String FORMATO_DATE_TIME      = "YYYY-MM-dd'T'HH:mm:ss";

    //CONTANTES DE NOMBRE DE PREFERENCIAS DE USUARIOS
    public static final String LOGIN_USERNAME                 = "LOGIN_USERNAME";
    public static final String LOGIN_PASSWORD                 = "LOGIN_PASSWORD";
    public static final String LOGIN_RECORDAR                 = "LOGIN_RECORDAR";  //Para recordar si tenemos el cuadro para recordar el usuario y la clave o no
    public static final String MENSAJE_ETIQUETAS              = "MENSAJE_ETIQUETAS";
    public static final String MENSAJE_ETIQUETAS_LEIDO        = "MENSAJE_ETIQUETAS_LEIDO";
    public static final String MENSAJE_BUENAS_PRACTICAS       = "MENSAJE_BUENAS_PRACTICAS";
    public static final String MENSAJE_BUENAS_PRACTICAS_LEIDO = "MENSAJE_BUENAS_PRACTICAS_LEIDO";

    public static final int    CODE_PERMISSIONS             = 4001;
    public static final String TAG_PEDIDO                   = "PEDIDO";
    public static final String TAG_TIPO_DESTINATARIO        = "TIPO_DESTINATARIO";
    public static final String TAG_GENERA_INTENTO_ENTREGA   = "GENERA_INTENTO_ENTREGA";
    public static final String TAG_PEDIDOS_FILTRADOS        = "pedidos_filtrados";
    public static final String TAG_PERMITIR_ENTREGA         = "permitir_entrega";
    public static final String TAG_INCIDENCIA               = "incidencia";
    public static final String TAG_MODO_DEVOLUCIONES        = "MODO_BOX_DEVOLUCIONES";
    public static final String TAG_FIRMA                    = "FIRMA";
    public static final String TAG_NOTIFICACIONES_GENERALES = "NOTIFICACIONES_GENERALES";
    public static final String TAG_MOSTAR_MAL_DOCUMENTADA   = "MOSTRAR_MAL_DOCUMENTADA";

    public static final String BARCODE_STRING_EXTRA  = "BARCODE";
    public static final int    OBSERVACIONES_REQUEST = 2001;
    public static final int    FOTOGRAFIA_DNI_ANVERSO_REQUEST_CODE = 3001;
    public static final int    FOTOGRAFIA_DNI_REVERSO_REQUEST_CODE = 3002;
    public static final int    FOTOGRAFIA_OTRO_DESINATARIO         = 3003;
    public static final int    FOTOGRAFIA_VERIFICACION_ENTREGA     = 3004;
    public static final int    FOTOGRAFIA_VERIFICACION_BANCARIA    = 3005;
    public static final int    BARCODE_REQUEST_CODE                = 7001;
    public static final int    BARCODE_TRASPASO_PEDIDO             = 7002;
    public static final int    BARCODE_ANADIR_COTEJO               = 7003;
    public static final int    BARCODE_ANADIR_BULTO                = 7004;
    public static final int    BARCODE_LEER_COTEJO                 = 7005;
    public static final int    BARCODE_BULTO_REQUEST_CODE          = 8001;
    public static final int    FIRMA_REQUEST_CODE                  = 9001;
    public static final int    INCIDENCIA_REQUEST_CODE             = 10001;
    public static final int    INCIDENCIA_RESULT_CODE              = 10001;
    public static final int    INCIDENCIA_RECHAZO_RESULT_CODE      = 10002;
    public static final int    EDITAR_CABECERA_REQUEST_CODE        = 10003;
    public static final int    EDITAR_CABECERA_RESULT_CODE         = 10003;

    //Estados de un pedido que puede seleccionar un repartidor
    public static final int REPARTIDOR_ESTADO_EN_REPARTO        = 0;
    public static final int REPARTIDOR_ESTADO_ENTREGADO         = 1;
    public static final int REPARTIDOR_ESTADO_AUSENTE           = 2;
    public static final int REPARTIDOR_ESTADO_DIRECCIÓN_ERRONEA = 3;
    public static final int REPARTIDOR_ESTADO_RECHAZO           = 4;
    public static final int REPARTIDOR_ESTADO_EXTRAVIADO        = 5;
    public static final int REPARTIDOR_MAL_DOCUMENTADA          = 6;

    public static final int    REPARTIDOR_RECHAZO_DESISTIMIENTO    = 401;
    public static final int    REPARTIDOR_RECHAZO_ARTICULO_ERRONEO = 402;
    public static final int    REPARTIDOR_RECHAZO_ARTICULO_DANADO  = 403;
    public static final int    REPARTIDOR_RECHAZO_FALTAN_ARTICULOS = 404;
    public static final int    REPARTIDOR_RECHAZO_OTROS         = 405;
    //--------------------------------------------------------------------------------------
    // PREFIJOS PARA ALMACENAR FICHEROS
    //--------------------------------------------------------------------------------------
    public static final String PREF_FICHERO_VERIFICAR_DNI       = "V";
    public static final String PREF_FICHERO_FIRMA               = "F";
    public static final String PREF_FICHERO_DESTINATARIO_PEDIDO = "OD";
    public static final String PREF_FICHERO_VERIFICAR_PEDIDO    = "VR";
    public static final String PREF_FICHERO_VALIDACION_BANCARIA = "VB";
    public static final String PREF_FICHERO_AUDIO_FIRMA         = "AF";
    //--------------------------------------------------------------------------------------
    // ESTADO EN EL QUE SE ENCUENTRA UN PEDIDO. ESTE ESTADO ES EL QUE SE ALMACENA EN
    //--------------------------------------------------------------------------------------
    public static final int    PEDIDO_ESTADO_EN_RUTA            = 1050;
    public static final int    PEDIDO_ESTADO_INCIDENCIA            = 1060;
    public static final int    PEDIDO_ESTADO_ENTREGADO             = 1100;

    public static final int RECOGIDA_ASIGNADA_CHOFER = 4010;
    public static final int RECOGIDA_EN_INCIDENCIA   = 4020;
    public static final int RECOGIDA_EN_REALIZADA    = 4050;

    //--------------------------------------------------------------------------------------
    //ESTADOS EN LOS QUE PUEDE ENCONTRARSE UN PEDIDO
    //--------------------------------------------------------------------------------------
    public static final int ESTADO_ENVIO_EN_REPARTO             = 1050;
    public static final int ESTADO_ENVIO_EN_INCIDENCIA          = 1060;
    public static final int ESTADO_ENVIO_RETENIDO_EN_CUARENTENA = 1070;
    public static final int ESTADO_ENVIO_RECHAZADO              = 1080;
    public static final int ESTADO_ENVIO_CANCELADO              = 1090;
    public static final int ESTADO_ENVIO_ANULADO                = 1091;
    public static final int ESTADO_ENVIO_EXTRAVIADO             = 1095;
    public static final int ESTADO_ENVIO_DEVUELTO_ORIGEN        = 1099;
    public static final int ESTADO_ENVIO_ENTREGADO              = 1100;
    public static final int ESTADO_PEDIDO_EN_TRASPASO           = 9999; //TODO: ESTE TIPO NO ESTA DEFINIDO AUN, SE PONE PARA CUANDO SE HABILITE...
    //Recogidas
    public static final int ESTADO_RECOGIDA_ASIGNADA            = 4010;
    public static final int ESTADO_RECOGIDA_EN_INCIDENCIA       = 4020;
    public static final int ESTADO_RECOGIDA_REALIZADA           = 4050;
    public static final int ESTADO_RECOGIDA_RECHAZADA           = 4080;
    public static final int ESTADO_RECOGIDA_CANCELADA           = 4090;
    public static final int ESTADO_RECOGIDA_ANULADA             = 4091;
    public static final int ESTADO_RECOGIDA_EXTRAVIADA          = 4095;
    public static final int ESTADO_RECOGIDA_DEVUELTO_ORIGEN     = 4099;

    //--------------------------------------------------------------------------------------
    // INDICDENCIAS EN LAS QUE PUEDE ENCONTRARSE UN PEDIDO
    //--------------------------------------------------------------------------------------
    public static final int INCIDENCIA_AUSENTE                 = 1;
    public static final int INCIDENCIA_AUSENCIA_REITERADA      = 2;
    public static final int INCIDENCIA_DIRECCION_INCORRECTA    = 3;
    public static final int INCIDENCIA_FUERA_RUTA              = 4;
    public static final int INCIDENCIA_CAMBIO_FECHA_CONCERTADA = 5;
    public static final int INCIDENCIA_RECHAZO                 = 60;
    public static final int INCIDENCIA_EXTRAVIADO              = 6;

    //AUN NO CREADAS EN BD
    public static final int INCIDENCIA_DNI_NO_COINCIDENTE = 8;
    public static final int INCIDENCIA_MAL_DOCUMENTADA    = 9;

    //--------------------------------------------------------------------------------------
    // CLAVES DE SITUACIN EN LAS QUE PUEDE ESTAR UN PEDIDO
    //--------------------------------------------------------------------------------------
    public static final String CLAVE_SITUACION_AUSENTE            = "IE001";
    public static final String CLAVE_SITUACION_DIRECCION_ERRONEA  = "IE002";
    public static final String CLAVE_SITUACION_ESTADO_RECHAZADO   = "IE003";
    public static final String CLAVE_SITUACION_EXTRAVIADO         = "IE033"; //misma clave para envio y recogidas, luego en procesos posterrior se cambian a los extraviados del pedido y la recogida
    public static final String CLAVE_SITUACION_PEDIDO_ENTREGADO   = "IE006";
    public static final String CLAVE_SITUACION_EN_RUTA            = "IE009";
    public static final String CLAVE_SITUACION_MAL_DOCUMENTADA    = "IE012";
    public static final String CLAVE_SITUACION_NUEVA_CITA         = "IE031";
    public static final String CLAVE_SITUACION_AUSENCIA_REITERADA = "IE028";
    public static final String CLAVE_SITUACION_DNI_NO_COINCIDENTE = "A1170";

    public static final String CLAVE_SITUACION_ENVIO_CANCELADO             = "IE018";
    public static final String CLAVE_SITUACION_ENVIO_ANULADO               = "IE020";
    public static final String CLAVE_SITUACION_ENVIO_INCIDENCIA_FUERA_RUTA = "IE029";
    public static final String CLAVE_SITUACION_ENVIO_RETENIDO_CUARENTENA   = "IE026";

    public static final String CLAVE_SITUACION_CAMBIO_DIRECCION = "IE030";

    public static final String CLAVE_SITUACION_RECOGIDA_REALIZADA       = "IR005";//""IE015";
    public static final String CLAVE_SITUACION_RECOGIDA_ASIGNADA_CHOFER = "IR003";//"IE016";
    public static final String CLAVE_SITUACION_RECOGIDA_INCIDENCIA      = "IR004";//"IE016";
    public static final String CLAVE_SITUACION_RECOGIDA_RECHAZO         = "IR009";
    public static final String CLAVE_SITUACION_RECOGIDA_EXTRAVIADA      = "IR013";

    public static final String CLAVE_SITUACION_EN_TRASPASO     = "TRP";
    //--------------------------------------------------------------------------------------
    // INDICDENCIAS QUE PUEDEN GENERARNSE AL SELECCIONAR UN RECHAZO
    //--------------------------------------------------------------------------------------
    public static final int    CODIGO_INCIDENCIA_DESISTIMIENTO = 1;
    public static final int    CODIGO_INCIDENCIA_ARTICULO_ERRONEO                     = 2;
    public static final int    CODIGO_INCIDENCIA_ARTICULO_DANADO                      = 3;
    public static final int    CODIGO_INCIDENCIA_FALTAN_ARTICULOS                     = 4;
    public static final int    CODIGO_INCIDENCIA_RECHAZO_OTROS                        = 5;
    public static final int    SIN_CODIGO_INCIDENCIA                                  = 0;
    public static final int    SIN_TIPO_RECHAZO                = 0;
    //-------------------- LOGS -------------------
    //Preferencias, claves.
    public static final String LOG_OUT                         = "LOG_OUT";
    public static final String GUARDAR_LOG                     = "GUARDAR_LOG";  //almacena el log de lo que va realizando el usuario en un fichero
    public static final String NIVEL_DETALLE_LOG               = "NIVEL_DETALLE_LOG";  //Nivel de detalle de log que vamos a almacenar
    public static final String START_LOG                       = "START";
    public static final String STOP_LOG                        = "STOP";
    public static final String AUTOLOGIN                       = "AUTOLOGIN";
    //--------------------------------------------------------------------------------------
    //Metodos utilizados para enviar la comunicacion con el    WS
    //--------------------------------------------------------------------------------------
    public static final int    POST                                                   = Request.Method.POST;
    public static final int    GET                                                    = Request.Method.GET;
    //--------------------------------------------------------------------------------------
    //Codigos que se transmiten entre capas, normalmente tras la ejecucion de un Callback
    //--------------------------------------------------------------------------------------
    public static final int    WS_OK                                                  = 0;  //Respuesta de OK por parte de una llamda de WS
    public static final int    WS_ERROR                                               = -1; //Respuesta de ERROR por parte de una llamda de WS
    public static final int    WS_OFFLINE                                             = 99; //Respuesta de OFFLINE por parte de una llamda de WS
    public static final int    TODO_OK                                                = 0;  //Para cuando enviemos un codigo de respiesta que sea OK
    public static final int    ERROR_PROCESO                                          = 999; //Para cuando enviemos un codigo de respiesta que sea ERROR, peo que el ws esta funcionando ok
    //--------------------------------------------------------------------------------------
    //Codigos de validacion DNI en la entrega.
    //--------------------------------------------------------------------------------------
    public static final int    VALIDACION_TIPO_ENTREGA_ESTANDAR                       = 0;
    public static final int    VERIFICACION_TIPO_ENTREGA_DNI                          = 1;
    public static final int    VALIDACION_TIPO_ENTREGA_DNI_FOTO                       = 2;
    public static final int    VALIDACION_TIPO_ENTREGA_RECOGIDA_MATERIAL              = 3;
    public static final int    VALIDACION_TIPO_ENTREGA_RECOGIDA_DOCUMENTO             = 4;
    public static final int    VALIDACION_TIPO_ENTREGA_RECOGIDA_MATERIAL_DOCUMENTO    = 5;
    public static final int    VALIDACION_TIPO_ENTREGA_DNI_FOTO_EXTRACTO_BANCARIO     = 6;
    public static final int    VALIDACION_TIPO_ENTREGA_RECOGIDA_VALIDACION_IMEI       = 7;
    public static final int    VALIDACION_TIPO_ENTREGA_DNI_ESTANDAR_FOTO_DNI          = 8;
    public static final int    VALIDACION_TIPO_ENTREGA_DNI_ESTANDAR_FOTO_DNI_EXTRACTO = 9;
    //--------------------------------------------------------------------------------------
    // TURNOS
    //--------------------------------------------------------------------------------------
    public static final int    TURNO_INDIFERENTE                                      = 0;
    public static final int    TURNO_MANANA                                           = 1;
    public static final int    TURNO_TARDE                                            = 2;
    //--------------------------------------------------------------------------------------
    // TIPOS DE DESTINATARIOS
    //--------------------------------------------------------------------------------------
    public static final int    DESTINATARIO_VACIO                                     = 0;
    public static final int    DESTINATARIO_VECINO                                    = 1;
    public static final int    DESTINATARIO_CONSERJE                                  = 2;
    public static final int    DESTINARAIO_BUZON                                      = 3;
    public static final int    DESTINARAIO_LOCAL                                      = 4;
    //--------------------------------------------------------------------------------------
    // TIPOS DE eventos
    //--------------------------------------------------------------------------------------
    public static final int    EVENTO_ACCESO_A_LA_APP                                 = 1;
    public static final int    EVENTO_CONSULTA_PEDIDO                                 = 2;
    public static final int    EVENTO_RUTA_SELECCIONADA                               = 3;
    public static final int    EVENTO_CAMBIO_DE_FECHA_NUEVA_CITA                      = 7;
    public static final int    EVENTO_CAMBIO_DE_TRAMO_HORARIO_EN_NUEVA_CITA           = 8;
    public static final int    EVENTO_MAL_DOCUMENTADA                                 = 9;
    public static final int    EVENTO_LLAMADA_TELEFÓNICA                              = 10;
    public static final int    COMPRESION_IMAGENES                                    = 100;
    //--------------------------------------------------------------------------------------
    //Tipos de Envio
    //--------------------------------------------------------------------------------------
    public static final int    TIPO_ENVIO                                             = 1;
    public static final int    TIPO_RECOGIDA                                          = 4;
    public static final int    TIPO_ENVIO_RECOGIDA                                    = 2;

    //--------------------------------------------------------------------------------------
    //Tipos de cotejo
    //--------------------------------------------------------------------------------------

    public static final int COTEJO_SIN_COTEJO = 0;
    public static final int COTEJO_IMEI       = 1;

    //--------------------------------------------------------------------------------------
    // Numero digitos cotejo
    //--------------------------------------------------------------------------------------

    public static final int NUM_DIGITOS_COTEJO = 3;

    public static final int VALOR_VACIO = 0;

    //--------------------------------------------------------------------------------------
    // Tipos de lectura de bultos
    //--------------------------------------------------------------------------------------
    public static final int TIPO_LECTURA_RECOGIDA         = 0;
    public static final int TIPO_LECTURA_ENVIO            = 1;
    public static final int TIPO_LECTURA_DEVOLUCION       = 2;
    public static final int TIPO_LECTURA_INCIDENCIA       = 3;
    public static final int TIPO_LECTURA_SELECCIONAR_RUTA = 4;
    //--------------------------------------------------------------------------------------
    //Tipos de perfiles
    //--------------------------------------------------------------------------------------
    public static final int PERFIL_ADMINISTRADOR          = 1;
    public static final int PERFIL_OFICINA                = 2;
    public static final int PERFIL_ALMACEN                = 3;
    public static final int PERFIL_SHUTTLE                = 4;
    public static final int PERFIL_TRANSPORTISTA          = 5;
    public static final int PERFIL_CONSULTA               = 6;

    //--------------------------------------------------------------------------------------
    // ID cliente - CUENTA_TR
    //--------------------------------------------------------------------------------------
    public static final int ID_CLIENTE_SIMYO          = 1;
    public static final int ID_CLIENTE_ORANGE_FIJOS   = 2;
    public static final int ID_CLIENTE_ORANGE_MOVILES = 3;
    public static final int ID_CLIENTE_JAZZTEL        = 4;
    public static final int ID_CLIENTE_ORANGE_B2B     = 5;
    public static final int ID_CLIENTE_PROMOCAIXA     = 6;
    public static final int ID_CLIENTE_WORTEN         = 7;

}



