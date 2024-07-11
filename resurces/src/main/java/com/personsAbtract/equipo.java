package com.personsAbtract;

import java.util.ArrayList;
import java.util.List;

public class equipo {
    
    private String id;
    private String nombre;
    private final List<player> jugadores;


    public equipo(String id, List<person> jugadores, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(player jugadores) {
        this.jugadores.add(jugadores);
    }
    

    
    
}
