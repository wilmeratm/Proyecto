/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
import java.util.Scanner;
public class Principal {

    public static void main (String Args []){
        Scanner lea= new Scanner (System.in);
        int opcion1;
        String jugador1[], jugador2[];
        jugador1=new String [10];
        jugador2=new String [10];
        

        for (int i=0; i<10; i++){

        System.out.println("****Bienvenid@s****");
        System.out.println("****Menu Principal****");
        System.out.println(" ");
        System.out.println("1. Jugar Chaturaga   ");
        System.out.println("2. Estadisticas del Juego  ");
        System.out.println("3. Salir  ");
        System.out.println (" ");
        System.out.print("Seleccione una opcion: ");
        opcion1=lea.nextInt();
        Tablero tab= new Tablero();
        
        switch (opcion1){

            case 1:
                System.out.print("Ingrese el nombre del Player 1: ");
                jugador1[0]=lea.next();
                System.out.print("Ingrese el nombre del Payer 2: ");
                jugador2[0]=lea.next();
                tab.printTablero();
                System.out.print("Jugador 1 mueva: ");
                break;


            case 2:
            case 3:
                System.out.println("Saliendo del Juego...");
                break;
        }

       

    }
   }
}


