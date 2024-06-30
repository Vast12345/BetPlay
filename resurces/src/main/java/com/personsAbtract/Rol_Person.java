package com.personsAbtract;

public abstract class Rol_Person {
    protected String nombreRol;

    protected Rol_Person(){
    }
    
    protected Rol_Person(String nombreRol){
        this.nombreRol = nombreRol;
    }

    public String getNombreRol(){
        return nombreRol;
    }

    public abstract String decirRol();
}
