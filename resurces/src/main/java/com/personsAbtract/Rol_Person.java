package com.personsAbtract;

public abstract class Rol_Person {
    protected String nombreRol;

    protected Rol_Person(){
    }
    
    protected Rol_Person(String nombreRol){
        this.nombreRol = nombreRol;
    }

    public String getNombreRol(){
        return nombreRol;
    }
    public abstract String decirRol();
    public class jugador extends Rol_Person{
        public jugador(){
            super("Jugador");
        }
    
        @Override
        public String decirRol(){
            return "Soy Jugador";
        }
        
    }
    public class adminliga extends Rol_Person{
        public  adminliga(){
            super("adminliga");
        }
    
    
        @Override
        public  String decirRol(){
            return "soy administrador de la liga BetPlay";
        }
    }
    
    public class arbitros extends Rol_Person {
    
        public arbitros(){
            super("Arbrito");
        }
    
        @Override
        public String decirRol(){
            return "Soy Arbrito";
        }
    }
    public class entrenador extends Rol_Person {

        public entrenador(){
            super("Entrenador");
        }
    
        @Override
        public String decirRol(){
            return "Soy Entrenador";
        }
    }
    public class medico extends Rol_Person{
        public medico(){
            super("Medico");
        }
        @Override
        public String decirRol(){
            return "Soy medico";
        }
    }
    public class patrocinador extends  Rol_Person{
        public patrocinador(){
            super("Soy patrocinador");
        }
        @Override
        public String decirRol(){
            return "Soy Patrocinador De la Liga Betplay";
        }
    }
    public class periodista extends Rol_Person{
        public periodista(){
          super("Periodista");
        }
        @Override
        public String decirRol(){
          return "Soy Periodista";
        }
      }
    
    
}
