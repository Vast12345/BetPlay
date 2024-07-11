package com.personsAbtract;

public class player extends person {
    

    private  String posicion;
    private String nacionalidad;
    private String numeroCamiseta;
    private  String lesionesDesc;

    

    public player() {
        super ();
    }


    public player(String posicion, String nacionalidad, String numeroCamiseta, String lesionesDesc) {
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.numeroCamiseta = numeroCamiseta;
        this.lesionesDesc = lesionesDesc;
    }
    
    public player(String Nombre, String Apellido, String contacto, String dni, Rol_Person nombreRol, String edad,
            String posicion, String nacionalidad, String numeroCamiseta, String lesionesDesc) {
        super(Nombre, Apellido, contacto, dni, nombreRol, edad);
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.numeroCamiseta = numeroCamiseta;
        this.lesionesDesc = lesionesDesc;
    }





    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getLesionesDesc() {
        return lesionesDesc;
    }

    public void setLesionesDesc(String lesionesDesc) {
        this.lesionesDesc = lesionesDesc;
    }

    public void callmyname(){
        System.out.println("my name: " + getNombre() + "Nacionality: " + getNacionalidad());
    }

    


    
}
