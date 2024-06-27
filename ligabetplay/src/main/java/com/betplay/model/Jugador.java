package com.betplay.model;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private String posicion;
    private String nacionalidad;
    private int numeroCamiseta;
    private Equipo equipo;
    private List<Lesion> lstLesiones;
    private List<Rendimiento> lstRendimientos;
    public Jugador() {
        
    }

    public Jugador() {
        lstLesiones = new ArrayList<Lesion>();
        lstRendimientos = new ArrayList<Rendimiento>();
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
    public List<Lesion> getLstLesiones() {
        return lstLesiones;
    }
    public void setLstLesiones(Lesion lesion) {
        this.lstLesiones.add(lesion);
    }
    public List<Rendimiento> getLstRendimientos() {
        return lstRendimientos;
    }
    public void setLstRendimientos(Rendimiento rendimiento) {
        this.lstRendimientos.add(rendimiento);
    }
}
