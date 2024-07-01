package com.personsAbtract;



public class medico extends Rol_Person{
    public medico(){
        super("Medico");
    }
    @Override
    public String decirRol(){
        return "Soy medico";
    }
}


