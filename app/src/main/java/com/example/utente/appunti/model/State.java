package com.example.utente.appunti.model;


public enum State {
    TODO ("To do"),
    DONE ("Done");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    State(String s) {
        this.description = s;
    }
}
