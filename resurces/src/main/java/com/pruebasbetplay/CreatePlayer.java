package com.pruebasbetplay;

import java.util.Scanner;

public class CreatePlayer {
    public Handle_Global_Temas Handle_Player = new Handle_Global_Temas();
    
    public  void registrarPlayer() {
        Scanner SC = new Scanner(System.in);
        
        while (true) { 
            System.out.println("1. Añadir un player");
            System.out.println("2. Actualizar player");
            System.out.println("3. Buscar player");
            System.out.println("4. Eliminar player");
            System.out.println("5. Listar todos player");
            System.out.println("6. Salir");
            int choice = SC.nextInt();

            switch (choice) {
                case 1 :
                    



                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
