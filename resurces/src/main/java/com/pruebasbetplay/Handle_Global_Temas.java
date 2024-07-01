package com.pruebasbetplay;

import java.util.Hashtable;
import java.util.Map;

import com.personsAbtract.equipo;
import com.personsAbtract.person;

public class Handle_Global_Temas {
    private  static  Handle_Global_Temas instancia;
    Hashtable<int, equipo> Team = new Hashtable<>();    


    public  handleTeam(){
        equipos = new Hashtable<>();
        jugadores = new Hashtable<>();


    }
    public static synchronized Handle_Global_Temas getInstancia() {
        if (instancia == null) {
            instancia = new Handle_Global_Temas();
        }
        return instancia;
    }
    


}
