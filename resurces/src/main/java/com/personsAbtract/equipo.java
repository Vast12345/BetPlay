package com.personsAbtract;

import java.util.ArrayList;
import java.util.List;

public class equipo {
    private String id;
    private String nombre;
    private final List<person> jugadores;


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

    public List<person> getJugadores() {
        return jugadores;
    }

    public void setJugadores(person jugadores) {
        this.jugadores.add(jugadores);
    }
    

    public void showPlayerTeam(){
        for (person jugador : jugadores) {
            System.out.println("Player ID : " + jugador.getDni() + "Nombre : " + jugador.getNombre() + "Apellido : " + jugador.getApellido() + "Edad : " + jugador.getEdad() + "Contacto : " + jugador.getContacto());
        }
    }
}
