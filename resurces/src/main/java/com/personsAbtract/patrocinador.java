package com.personsAbtract;

public class patrocinador extends  Rol_Person{
    public patrocinador(){
        super("Soy patrocinador");
    }
    @Override
    public String decirRol(){
        return "Soy Patrocinador De la Liga Betplay";
    }
}
