package com.personsAbtract;

public class adminliga extends Rol_Person{
    public  adminliga(){
        super("adminliga");
    }


    @Override
    public  String decirRol(){
        return "soy administrador de la liga BetPlay";
    }
}
