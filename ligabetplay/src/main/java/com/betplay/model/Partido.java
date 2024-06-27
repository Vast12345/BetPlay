package com.betplay.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Partido {
    private int id;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDate fecha;
    private LocalTime hora;
    private Estadio estadio;
    private List<Gol> lstGoles;
    private List<Tarjeta> lstTarjetas;
    private Resultado resultado;
    public Partido() {

    }

    public Partido() {
        lstGoles = new ArrayList<Gol>();
        lstTarjetas = new ArrayList<Tarjeta>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
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
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public List<Gol> getLstGoles() {
        return lstGoles;
    }
    public void setLstGoles(Gol gol) {
        this.lstGoles.add(gol);
    }
    public List<Tarjeta> getLstTarjetas() {
        return lstTarjetas;
    }
    public void setLstTarjetas(Tarjeta tarjeta) {
        this.lstTarjetas.add(tarjeta);
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}
