/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
public class Elefante extends Ficha {

    Tablero table= new Tablero();
   int filter, colter;

   public Elefante ( int filini, int colini, int turn){
       super( filini, colini);
       if( turn==1){
            table.jugador1=1;
        }else{
            table.jugador2=2;
        }
   }

    @Override
   public void mov (){
       System.out.print("Esta Seleccionando un Elefante");
        System.out.println("Ingrese Fila");
        filter= lea.nextInt();
        System.out.println("Ingrese Columna");
        colter=lea.nextInt();

        int restafilaAde= filter - filaini;
        int restacolumnaAde= colter - colini;
        int restafilaAtras= filaini-filter;
        int restacolumnaAtras= colini-colter;


        if (Tablero.jugador1==1){
        if ( filter !=-1 && colter != -1){
            if ( restafilaAde==2 && restacolumnaAde==2 || restafilaAtras==2 && restacolumnaAtras==2){
                
            if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "EV";
         table.tablero[filaini][colini]= "_";
            table.printTablero();

            } else {
            if ( table.tablero[filter][colter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con un Elefante");
                    comidos++;
            } else if ( table.tablero[filter][colter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con un Elefante");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con un Elefante");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con un Elefante");
                    comidos++;
                 } else if ( table.tablero[filter][colter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con un Elefante");
                    comidos++;
                } else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con un Elefante");
                    comidos++;
             }
         }
        table.printTablero();
            
            }
            System.out.println("Movimiento no Valido");
        }
                System.out.println("Movimiento no valido");

        } else if ( Tablero.jugador2==2){
            if ( filter !=-1 && colter != -1){
            if ( restafilaAde==2 && restacolumnaAde==2 || restafilaAtras==2 && restacolumnaAtras==2){
                
                    if( table.tablero[filter][colter].equals("-")){
                        table.tablero[filter][colter]= "ER";
                        table.tablero[filaini][colini]= "_";
                        table.printTablero();

                    } else {
                        if ( table.tablero[filter][colter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con un Elefante");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("CV")){
                    System.out.println("Jugador 2 ha comido un Caballo con un Elefante");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("EV")){
                    System.out.println("Jugador 2 ha comido un Elefante con un Elefante");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("VV")){
                    System.out.println("Jugador 2 ha comido su Consejero con un Elefante");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("TV")){
                    System.out.println("Jugador 2 ha comido una Torre con un Elefante");
                        comidos++;
                 }
             }
            table.printTablero();
            
                
        }
                System.out.println("Movimiento no Valido");
        }
            System.out.println("<<<<<< Juego Terminado >>>>>>");
    }
    }

}
