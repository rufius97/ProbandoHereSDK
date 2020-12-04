package com.ventulabs.probandoheresdk.informacion;


import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface VolleyCallback<T, K> {

    void onSuccess(int code, K object, JSONObject response);

    void onError(int code, VolleyError error);

    void offline(int code);
}
