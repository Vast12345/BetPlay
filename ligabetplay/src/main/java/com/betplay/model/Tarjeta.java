package com.betplay.model;

import java.time.LocalTime;

public class Tarjeta {
    private int id;
    private Jugador jugador;
    private Partido partido;
    private String tarjeta;
    private LocalTime minuto;
    public Tarjeta() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Jugador getJugador() {
        return jugador;
    }
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public String getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    public LocalTime getMinuto() {
        return minuto;
    }
    public void setMinuto(LocalTime minuto) {
        this.minuto = minuto;
    }

    
}
