package com.pruebasbetplay;
import java.util.Hashtable;



public class Handle_Global_Temas {
    private  static  Handle_Global_Temas instance;
    private final Hashtable<String, String> Global;


    Handle_Global_Temas(){
        Global = new Hashtable<>();
    }
    public static synchronized Handle_Global_Temas getInstance() {
        if (instance == null) {
            instance = new Handle_Global_Temas();
        }
        return instance;
    }

    public void put(String key, String value){
        Global.put(key, value);
    }

    public String get(String key){
        return Global.get(key);
    }

    public void remove(String Key){
        Global.remove(Key);
    }

    public void actualizar(String key, String newValue) {
        if (Global.containsKey(key)) {
            Global.put(key, newValue);
            System.out.println("Actualizado");
        } else {
            System.out.println("Clave no encontrada");
        }
    }
    


}
