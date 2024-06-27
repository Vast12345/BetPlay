package com.betplay.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    private Estadio estadio;
    private String nomEntrenador;
    private List<Jugador> lstJugadores;
    private List<Partido> lstPartidos;
    public Equipo() {
        
    }

    public Equipo() {
        lstJugadores = new ArrayList<Jugador>();
        lstPartidos = new ArrayList<Partido>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public String getNomEntrenador() {
        return nomEntrenador;
    }
    public void setNomEntrenador(String nomEntrenador) {
        this.nomEntrenador = nomEntrenador;
    }
    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(Jugador jugador) {
        this.lstJugadores.add(jugador);
    }
    public List<Partido> getLstPartidos() {
        return lstPartidos;
    }
    public void setLstPartidos(Partido partido) {
        this.lstPartidos.add(partido);
    }
    
}
