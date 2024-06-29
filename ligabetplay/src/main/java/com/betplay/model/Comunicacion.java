package com.betplay.model;

import java.time.LocalDate;
import java.util.List;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    private LocalDate fechaPublicacion;
    private List<Usuario> lstDestinatarios;
    public Comunicacion() {
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public List<Usuario> getLstDestinatarios() {
        return lstDestinatarios;
    }
    public void setLstDestinatarios(Usuario usuario) {
        this.lstDestinatarios.add(usuario);
    }
}
