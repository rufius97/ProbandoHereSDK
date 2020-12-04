package com.ventulabs.probandoheresdk.informacion;

import java.util.ArrayList;

abstract public class Repo<T> {

    //protected static Application app;

    //PrimitivasRoom<T> room;

    public Repo() {
        //this.app = Init.application;
    }

    public interface ResponseData<T> {
        void response(int code, T data);

        void error(int code, T data);
    }

    public interface ResponseArray<T> {
        void response(int code, ArrayList<T> data);

        void error(int code, ArrayList<T> data);
    }

    public static class SuperResponseData<T> implements ResponseData<T> {
        @Override
        public void response(int code, T data) { }

        @Override
        public void error(int code, T data) { }
    }

    public static class SuperResponseArray<T> implements ResponseArray<T> {
        @Override
        public void response(int code, ArrayList<T> data) { }

        @Override
        public void error(int code, ArrayList<T> data) { }
    }
}
