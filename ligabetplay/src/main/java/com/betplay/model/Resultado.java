package com.betplay.model;

public class Resultado {
    private int id;
    private Partido partido;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    public Resultado() {

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
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
}   
