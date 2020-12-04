package com.ventulabs.probandoheresdk.informacion;

public class Config {

    //Control de DEBUG
    //varible para controlar partes del codigo que se encuentran en desarrollo.
    public static boolean IS_DEBUG      = true;
    public static boolean EN_DESARROLLO = true;//false & IS_DEBUG;

    public static String  FECHA_FORZADA_DEBUG                 = ""; //fecha sobre la que queremos mostrar los pedidos, solo funciona cuando estamos en DEBUG y esta rellena
    public static boolean MOSTRAR_BARRA_EXTRA_PEDIDOS_ADAPTER = false;//indica si se muestra la barra de estados de los pedidos en el adaptar;


    public static final String NOMBRE_BD = "db_icp_express";
    public static final String FONT      = "fonts/calibri.ttf";

    public static final String  URL_DESARROLLO             = "https://integracion.icp.es/WS_ICP_Express/api/icp_express";
    public static final String  URL_PRODUCCION             = "https://logistica3.icp.es/WS_ICP_Express/api/icp_express";
    //url a la que se envia la informacion
    public static final String  URL                        = IS_DEBUG ? URL_DESARROLLO : URL_PRODUCCION;
    public static final String  URL_LOG_ERROR              = (IS_DEBUG ? URL_DESARROLLO : URL_PRODUCCION) + "/SaveLog";
    public static final String  PREFIJO_LOG                = "EXPR_";
    public static final boolean GUARDAR_LOG_FICHERO        = true;  //almacena el log de lo que va realizando el usuario en un fichero
    //Variales confirguracion de VOlley
    public static final int     NUM_RETRY                  = 0; //reintentos
    public static final int     TIMEOUT                    = 15000; //tiempo maximo para esperar respuesta
    //mensajes de ocultacion de erro desde el webservices
    public static final boolean WS_OCULTACION_ERRORES      = false;
    public static final String  WS_MENSAJE_OCULTAR_ERRORES = "Se ha producido un error al establecer la comunicación";
    //configuraciones
    public static final boolean AGRUPAR_PEDIDOS_ALBARAN_TR = true;
    public static final boolean SOLICITAR_FIRMA_RECEPTOR   = true;  // SOLICITA LA FIRMA DEL RECEPTOR
    public static final boolean VALIDAR_FIRMA_RECEPTOR     = false; // VALIDA QUE LA FIRMA HAYA SIDO INTRODUCIDA (obligatoriedad)

    //Validacion del DNI del pedido, va en  funcion del campo SERVICIO_ESPECIAL del pedido
    public static final boolean CONTRAER_CARDVIEW                        = false; //permite contraer cardview del sistema
    public static final boolean MOSTRAR_RUNBOOK                          = true;  //muestra/oculta en runbook en las pantallas
    public static final boolean VALIDAR_DNI                              = true;
    public static final boolean MOSTRAR_TOTALES_RESUMEN_RUTA             = true;
    public static final boolean GUARDAR_BULTOS_LEIDOS_APP                = true;
    public static final boolean GENERAR_INCIDENCIAS_SIN_LEER_BULTOS      = true;  // indica si se pueden generar incidencias en un pedido sin haber leido el bulto previamente
    public static final boolean MOSTRAR_PEDIDOS_GOOGLE_MAPS              = true;  // indica si se pueden colocar los pedidos en Google Maps
    public static final boolean MOSTRAR_TELEFONO_LISTA_PEDIDOS           = false; // indica si se pueden mostar el boton de llamar en la lista de los pedidos
    public static final boolean LECTURA_BULTOS_SELECCIONAR_RUTA          = false; // Indica si hay que leer los bultos en el momento de seleccionar la ruta
    public static final boolean MOSTRAR_ETIQUETA_PRESIONAR_PEDIDO        = true;  // Indica si se muestra la etiqueta al presionar sobre el pedido
    public static final boolean TRASPASAR_PEDIDOS                        = true; // Indica si se pueden traspasar pedidos entre rutas
    public static final boolean DISTANCIA_ADAPTER_PEDIDOS                = false; // Indica si se debe mostrar la distancia entre los pedidos en el adapter
    public static final boolean VALIDAR_OBSERVACIONES_ENTREGA_MULTIMEDIA = true;  // valida la entrega con algun metodo multimedia (audio o imagen) para evitar ESTAFAS
    public static final boolean METODO_ESTAFA_FOTO_VALIDACION            = true;  // mostramos posiblidad de tomar una foto para validar la entrega de un pedido
    public static final boolean METODO_ESTAFA_AUDIO_VALIDACION           = true;  // mostramos la posibilidad de grabar un audio para validar la entrega de un pedido
    public static final boolean MOSTRAR_BOTON_AYUDA_ENTREGA              = false;  // Indica si se muestra o no el boton de ayuda en una entrega
    public static final boolean LECTURA_SACAS                            = false;  //Habitliar/ Deshabilitar la lectura de sacar por parte del SHUTTLE
    public static final boolean VALIDACION_PRIMARIA                      = false;  // Indica si se accede a la pantalla de primaria
    public static final boolean PANTALLA_NOTIFICACIONES                  = false;  // Indica si se accede a la pantalla de notificaciones

    public static final int PORCENTAJE_LECTURA_BULTOS_RUTA    = 0; //Porcentaje de bultos que tienen que ser leidos
    public static final int DIAS_PROXIMA_ENTREGA              = 1; //Dias que se utilizan para la proxima entrega
    public static final int DIAS_ELIMINAR_FICHEROS_MULTIMEDIA = 5; //Dias en los que se eliminan los ficheros multimedia que estan en el dispositivo del usuario
    public static final int DIAS_ELIMINAR_FICHEROS_LOG        = 7; //Dias que se eliminan los ficheros de log

    public static final  int     INTENTOS_FALLIDOS_LECTURA_BARCODE_PARA_ENTRADA_MANUAL = 1;
    //---------------------------------------------------------
    //Control del acceso a la app
    //---------------------------------------------------------
    public static final  boolean AUTO_LOGIN                                            = true;
    public static final  boolean AUTO_LOGIN_PREDETERMINADO                             = true;
    public static        boolean AUTO_LOGIN_ACTIVADO;                                               // se recoge del SharedPreferences antes del login (LoginActivity.java)
    public static        long    TIEMPO_ULTIMA_CONEXION        = (AUTO_LOGIN_ACTIVADO ? Config.TIEMPO_ULTIMA_CONEXION_MAXIMO : Config.TIEMPO_ULTIMA_CONEXION_MINIMO);
    public static final  long    TIEMPO_ULTIMA_CONEXION_MAXIMO = 86400000;  // (24h)  // tiempo máximo desde la última conexión para realizar el autolog en milisegundos
    public static final  long    TIEMPO_ULTIMA_CONEXION_MINIMO                         = 0;         // tiempo mínimo desde la última conexión para realizar el autolog en milisegundos
    //---------------------------------------------------------
    //Cambio entre entornos
    //---------------------------------------------------------
    public static final  boolean CAMBIO_ENTRE_ENTORNOS                                 = true;
    //---------------------------------------------------------
    //Control del acceso a la app
    //---------------------------------------------------------
    public static final  boolean GEO_TRACKING_ENABLED                                  = true;  // servicio de geoTracking que ofrece ICP Commons
    //---------------------------------------------------------
    // Menu NavigationView en MenuActivity.java
    //---------------------------------------------------------
    public static final  boolean MOSTRAR_MENU                                          = true;  // mostrar/ocultar el menú lateral en MenuActivity
    //---------------------------------------------------------
    // Excepciones no controladas
    //---------------------------------------------------------
    public static final  boolean INTERCEPTAR_EXCEPCIONES_NO_CONTROLADAS                = true;  // excepciones no controladas (se interceptan todos los errores sin try/catch)
    public static final  boolean MOSTRAR_ERROR_DETALLE_EXCEPCION                       = false;  // mostrar mensaje detallado en la pantalla (solo debería estar a 'true' para debug)
    //---------------------------------------------------------
    //Control de la actualizacion de la aplicacion
    //---------------------------------------------------------
    public static final  boolean AUTO_UPDATE_APP                                       = true;  //Comprueba si estamos en la ultima version de la app
    public static final  boolean UPDATE_BD                                             = true;  //Actualizacion de la base de datos en la actualizacion de la app
    public static final  boolean ACCEDER_SIN_ULTIMA_VERSION    = false;  //Indica si permite acceder a la app si esta no se encuentra actualizada a la ultima version
    //---------------------------------------------------------
    //Webservice para mostrar las etiquetas
    //---------------------------------------------------------
    public static final  String  URL_API4LABELS_DESARROLLO     = "https://integracion.icp.es/API4LABELS/labels/getLabelICPExpress?customerTicket=%s|0";
    public static final  String  URL_API4LABELS_PRODUCCION     = "https://logistica.icp.es/API4LABELS/labels/getLabelICPExpress?customerTicket=%s|0";
    public static final  String  URL_API4LABELS                = IS_DEBUG ? URL_API4LABELS_DESARROLLO : URL_API4LABELS_PRODUCCION;
    private static final String  URL_VALIDACION_DESARROLLO     = "https://integracion.icp.es/WssTransporte/Servicio.svc";
    private static final String  URL_VALIDACION_PRODUCCION     = "http://logistica2.icp.es/WSsTransporte/Servicio.svc";
    public static final  String  URL_VALIDACION_DNI_WS_ICP     = IS_DEBUG ? Config.URL_VALIDACION_DESARROLLO : Config.URL_VALIDACION_PRODUCCION;
    private static final String  USER_VALIDACION_DESARROLLO    = "asmtest";
    private static final String  USER_VALIDACION_PRODUCCION    = "asmwss";
    public static final  String  USER_VALIDACION               = IS_DEBUG ? USER_VALIDACION_DESARROLLO : USER_VALIDACION_PRODUCCION;
    private static final String  PWD_VALIDACION_DESARROLLO     = "icp2019Pru";
    private static final String  PWD_VALIDACION_PRODUCCION     = "Rw35AsT27Q";
    public static final  String  PWD_VALIDACION                = IS_DEBUG ? PWD_VALIDACION_DESARROLLO : PWD_VALIDACION_PRODUCCION;
}
