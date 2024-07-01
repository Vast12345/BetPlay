package com.personsAbtract;

public class person{
    private String Nombre;
    private String Apellido;
    private String dni;
    private String edad;
    private String contacto;
    private Rol_Person nombreRol;

    public person(String Apellido, String Nombre, String contacto, String dni, String edad, Rol_Person nombreRol) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.contacto = contacto;
        this.dni = dni;
        this.edad = edad;
        this.nombreRol = nombreRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Rol_Person getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(Rol_Person nombreRol) {
        this.nombreRol = nombreRol;
    }

    public void callRol(){
        System.out.println(nombreRol.decirRol());
    }
    
    

    
}
