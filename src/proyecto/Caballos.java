/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
public class Caballos extends Ficha {

    Tablero table= new Tablero();
   int filter, colter;

   public Caballos ( int filini, int colini){
       super( filini, colini);
   }

    @Override
   public void mov (){
       System.out.print("Esta Seleccionando una Torre");
        System.out.println("Ingrese Fila");
        filter= lea.nextInt();
        System.out.println("Ingrese Columna");
        colter=lea.nextInt();

        int restaFila1= filter - filaini;
        int restaFila2= filaini - filter;
        int restacolumna= colter-colini;


        if (Tablero.jugador1==1){
        if ( filter !=-1 && colter != -1){
            if ( filter <=table.tablero.length && colter <=table.tablero[filter].length){
                if( restaFila1==1 || restaFila2==1 && restacolumna==2){
            if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "CV";
         table.tablero[filaini][colini]= "_";
            table.printTablero();

            } else {
            if ( table.tablero[filter][colter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con un Caballo");
                    comidos++;
            } else if ( table.tablero[filter][colter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con un Caballo");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con un Caballo");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con un Caballo");
                    comidos++;
                 } else if ( table.tablero[filter][colter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con un Caballo");
                    comidos++;
                } else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con un Caballo");
                    comidos++;
             }
         }
        table.printTablero();
            }
            }
            System.out.println("Movimiento no Valido");
        }
                System.out.println("Movimiento no valido");

        } else if ( Tablero.jugador2==2){
            if ( filter !=-1 && colter != -1){
            if ( filter <=table.tablero.length && colter <=table.tablero[filter].length){
                if( restaFila1==1 || restaFila2==1 && restacolumna==2){
                    if( table.tablero[filter][colter].equals("-")){
                        table.tablero[filter][colter]= "CR";
                        table.tablero[filaini][colini]= "_";
                        table.printTablero();

                    } else {
                        if ( table.tablero[filter][colter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con un Caballo");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("CV")){
                    System.out.println("Jugador 2 ha comido un Caballo con un Caballo");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("EV")){
                    System.out.println("Jugador 2 ha comido un Elefante con un Caballo");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("VV")){
                    System.out.println("Jugador 2 ha comido su Consejero con un Caballo");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("TV")){
                    System.out.println("Jugador 2 ha comido una Torre con un Caballo");
                        comidos++;
                 }
             }
            table.printTablero();
            }
                System.out.println("Movimiento no Valido");
        }
                System.out.println("Movimiento no Valido");
        }
            System.out.println("<<<<<< Juego Terminado >>>>>>");
    }
    }
}


