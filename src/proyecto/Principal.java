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
        int contador=0;
        String jugador1[], jugador2[];
        jugador1=new String [10];
        jugador2=new String [10];
        

         do
        {

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
                jugador1[contador]=lea.next();
                System.out.print("Ingrese el nombre del Payer 2: ");
                jugador2[contador]=lea.next();
                tab.printTablero();
                int turn=1;
                 if(turn==1)
                            System.out.print("Jugador 1 mueva: ");
                        else
                            System.out.print("Jugador 2 mueva: ");

                        System.out.print("Ingrese la fila de la pieza: ");
                        int posfila = lea.nextInt();
                        System.out.print("Ingrese la columna de la pieza: ");
                        int poscol = lea.nextInt();
                        
                String Ficha = tab.tablero[posfila][poscol].toString();

                if (( Ficha.substring(0, 1)).equals("P")){
                    if(Ficha.equals("PV")&&turn==2){
                                Ficha peon = new Peon(posfila,poscol,turn);
                                peon.mov();

                            }else if(Ficha.equals("PR")&&turn==1){
                                Ficha peon = new Peon(posfila,poscol,turn);
                                peon.mov();

                            }else
                                System.out.println("Moviemiento equivocado");


                }  else if (( Ficha.substring(0, 1)).equals("T")){
                    if(Ficha.equals("TV")&&turn==2){
                                Ficha torre = new Torre(posfila,poscol,turn);
                                torre.mov();

                            }else if(Ficha.equals("TR")&&turn==1){
                                Ficha torre = new Torre(posfila,poscol,turn);
                                torre.mov();

                            }else
                                System.out.println("Moviemiento equivocado");


                }  else if (( Ficha.substring(0, 1)).equals("E")){
                    if(Ficha.equals("EV")&&turn==2){
                                Ficha elefante = new Elefante(posfila,poscol,turn);
                                elefante.mov();

                            }else if(Ficha.equals("ER")&&turn==1){
                                Ficha elefante = new Elefante(posfila,poscol,turn);
                                elefante.mov();

                            }else
                                System.out.println("Moviemiento equivocado");


                }  else if (( Ficha.substring(0, 1)).equals("C")){
                    if(Ficha.equals("CV")&&turn==2){
                                Ficha caballo = new Caballos(posfila,poscol,turn);
                                caballo.mov();

                            }else if(Ficha.equals("CR")&&turn==1){
                                Ficha caballo = new Caballos(posfila,poscol,turn);
                                caballo.mov();

                            }else
                                System.out.println("Moviemiento equivocado");


                }  else if (( Ficha.substring(0, 1)).equals("V")){
                    if(Ficha.equals("VV")&&turn==2){
                                Ficha consejero = new Consejero(posfila,poscol,turn);
                                consejero.mov();

                            }else if(Ficha.equals("VR")&&turn==1){
                                Ficha consejero = new Consejero(posfila,poscol,turn);
                                consejero.mov();

                            }else
                                System.out.println("Moviemiento equivocado");


                }  else {
                    System.out.print ("Empy");
                }
           break;


            case 2:
                System.out.println("Estadisticas del Juego");
            case 3:
                System.out.println("Saliendo del Juego...");
                break;
        }

        }while(opcion1!=3);

    }
   }



