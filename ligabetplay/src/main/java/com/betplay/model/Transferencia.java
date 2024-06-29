package com.betplay.model;

import java.time.LocalDate;

public class Transferencia {
    private int id;
    private Jugador jugador;
    private Equipo equipoOrigen;
    private Equipo equipoDestino;
    private double monto;
    private LocalDate fecha;
    public Transferencia() {

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
    public Equipo getEquipoOrigen() {
        return equipoOrigen;
    }
    public void setEquipoOrigen(Equipo equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }
    public Equipo getEquipoDestino() {
        return equipoDestino;
    }
    public void setEquipoDestino(Equipo equipoDestino) {
        this.equipoDestino = equipoDestino;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
