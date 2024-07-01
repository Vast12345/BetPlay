package com.personsAbtract;

public class periodista extends Rol_Person{
  public periodista(){
    super("Periodista");
  }
  @Override
  public String decirRol(){
    return "Soy Periodista";
  }
}
