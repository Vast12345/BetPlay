package com.betplay.model;

import java.time.LocalTime;

public class Actividad {
    private int id;
    private String descripcion;
    private LocalTime duracion;
    public Actividad() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalTime getDuracion() {
        return duracion;
    }
    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
    
}
