package com.betplay.model;

import java.time.LocalTime;

public class Incidente {
    private int id;
    private Partido partido;
    private String descripcion;
    private LocalTime minuto;
    public Incidente() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalTime getMinuto() {
        return minuto;
    }
    public void setMinuto(LocalTime minuto) {
        this.minuto = minuto;
    }

    
}
