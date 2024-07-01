package com.personsAbtract;

public class entrenador extends Rol_Person {

    public entrenador(){
        super("Entrenador");
    }

    @Override
    public String decirRol(){
        return "Soy Entrenador";
    }
}
