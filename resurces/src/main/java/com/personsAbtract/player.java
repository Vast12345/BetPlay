package com.personsAbtract;

public class player extends person {
    

    private  String posicion;
    private String nacionalidad;
    private String numeroCamiseta;
    private  String lesionesDesc;

    

    public player() {
        super ();
    }


    
    public player( String lesionesDesc, String nacionalidad, String numeroCamiseta, String posicion, String Apellido, String Nombre, String contacto, String dni, String edad, Rol_Person nombreRol) {
        super();
        this.lesionesDesc = lesionesDesc;
        this.nacionalidad = nacionalidad;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
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
