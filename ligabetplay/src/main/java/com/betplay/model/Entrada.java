package com.betplay.model;

import java.time.LocalDate;

public class Entrada {
    private int id;
    private Partido partido;
    private Usuario comprador;
    private LocalDate fechaCompra;
    private int cantidad;
    private double precioTotal;
    private String ubicacion;
    public Entrada () {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public Usuario getComprador() {
        return comprador;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
