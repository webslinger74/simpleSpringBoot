package com.example.stevens.first.boot.controllers;

public class MyResponseClass {

    private Boolean error;
    private String version;

    public MyResponseClass(Boolean error, String version) {
        this.error = error;
        this.version = version;
    }

    public MyResponseClass() {
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
