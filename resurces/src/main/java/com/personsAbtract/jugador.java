package com.personsAbtract;

public class jugador extends Rol_Person{
    public jugador(){
        super("Jugador");
    }

    @Override
    public String decirRol(){
        return "Soy Jugador";
    }
}
