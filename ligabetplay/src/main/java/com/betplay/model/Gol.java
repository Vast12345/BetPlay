package com.betplay.model;

import java.time.LocalTime;

public class Gol {
    private int id;
    private Jugador jugador;
    private Equipo equipo;
    private LocalTime minuto;
    private Partido partido;
    public Gol() {
        
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
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public LocalTime getMinuto() {
        return minuto;
    }
    public void setMinuto(LocalTime minuto) {
        this.minuto = minuto;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }


}
