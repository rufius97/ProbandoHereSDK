package com.ventulabs.probandoheresdk.mapas;

import java.util.ArrayList;

public class FindSequenceResult {

    private ArrayList<Result> results;

    public FindSequenceResult() {
    }

    public FindSequenceResult(ArrayList<Result> results) {
        this.results = results;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "FindSequenceResult{" +
                "results=" + results +
                '}';
    }
}
