package com.betplay.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Entrenamiento {
    private int id;
    private Equipo equipo;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private List<Actividad> lstActividades;
    private List<Jugador> lstJugadores;
    public Entrenamiento() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public List<Actividad> getLstActividades() {
        return lstActividades;
    }
    public void setLstActividades(Actividad actividad) {
        this.lstActividades.add(actividad);
    }
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(Jugador jugador) {
        this.lstJugadores.add(jugador);
    }
    
}
