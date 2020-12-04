package com.ventulabs.probandoheresdk.informacion;

public class BaseResponse extends BaseObject {

    public int RETCODE;

    public String MENSAJE;

    public String JSON_OUT;

    public int getRETCODE() {
        return RETCODE;
    }

    public void setRETCODE(int RETCODE) {
        this.RETCODE = RETCODE;
    }

    public String getMENSAJE() {
        return MENSAJE;
    }

    public void setMENSAJE(String MENSAJE) {
        this.MENSAJE = MENSAJE;
    }

    public String getJSON_OUT() {
        return JSON_OUT;
    }

    public void setJSON_OUT(String JSON_OUT) {
        this.JSON_OUT = JSON_OUT;
    }

    @Override
    public String toString() {
        return "ObjectResponse{" + "RETCODE=" + RETCODE + ", MENSAJE='" + MENSAJE + '\'' + ", DATA='" + JSON_OUT + '\'' + '}';
    }


}
