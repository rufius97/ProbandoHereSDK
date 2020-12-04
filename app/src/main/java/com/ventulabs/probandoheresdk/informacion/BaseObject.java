package com.ventulabs.probandoheresdk.informacion;


import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;


public class BaseObject {


 /*   @Ignore
    public int    ID_ASOCIADO;
    @Ignore
    public int    RETCODE;
    @Ignore
    public String MENSAJE_INTERNO;
    @Ignore
    public String MENSAJE;
    @Ignore
    public String MENSAJE_APP;

    @Ignore
    public String JSON_OUT;*/

   /* public String getMENSAJE() {
        return MENSAJE;
    }

    public void setMENSAJE(String MENSAJE) {
        this.MENSAJE = MENSAJE;
    }

    public int getID_ASOCIADO() {
        return ID_ASOCIADO;
    }

    public void setID_ASOCIADO(int ID_ASOCIADO) {
        this.ID_ASOCIADO = ID_ASOCIADO;
    }

    public int getRETCODE() {
        return RETCODE;
    }

    public void setRETCODE(int RETCODE) {
        this.RETCODE = RETCODE;
    }

    public String getMENSAJE_INTERNO() {
        return MENSAJE_INTERNO;
    }

    public void setMENSAJE_INTERNO(String MENSAJE_INTERNO) {
        this.MENSAJE_INTERNO = MENSAJE_INTERNO;
    }

    public String getMENSAJE_APP() {
        return MENSAJE_APP;
    }

    public void setMENSAJE_APP(String MENSAJE_APP) {
        this.MENSAJE_APP = MENSAJE_APP;
    }

    public String getJSON_OUT() {
        return JSON_OUT;
    }

    public void setJSON_OUT(String JSON_OUT) {
        this.JSON_OUT = JSON_OUT;
    }*/



    public JSONObject toJsonObject() {
        try {
            return new JSONObject(new Gson().toJson(this));
        } catch (JSONException e) {
            return null;
        }
    }
}
