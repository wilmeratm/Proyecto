/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
public class Rey extends Ficha {

     Tablero table= new Tablero();
   int filter, colter;

   public Rey ( int filini, int colini, int turn){
       super( filini, colini);
       if( turn==1){
            table.jugador1=1;
        }else if ( turn ==2){
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

        int restacolumna1 = colter-colini;
        int restacolumna2 = colini-colter;
        int restafilaAde= filter - filaini;
        int restacolumnaAde= colter - colini;
        int restafilaAtras= filaini-filter;
        int restacolumnaAtras= colini-colter;
        int filix= filter;
        int filix2 = filter;
        int conta=0;


        if ( restacolumna1 == 1 && filix== filaini ){
        if (Tablero.jugador1==1){
        if ( filter !=-1 && colter != -1){

               if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "RV";
         table.tablero[filaini][colini]= "_";

        } else  {
             if ( table.tablero[filter][colter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con su REY");
                    comidos++;
            } else if ( table.tablero[filter][colter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con su REY");
                comidos++;
                } else if ( table.tablero[filter][colter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con su REY");
                comidos++;
                } else if ( table.tablero[filter][colter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con su REY");
                comidos++;
                 } else if ( table.tablero[filter][colter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con su REY");
                comidos++;
                } else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con su REY");
                    comidos++;
             }

             }
               table.printTablero();
         }
            System.out.println("<<<< JUEGO TERMINADO >>>>");



    } else if( Tablero.jugador2==2){
        if ( restacolumna2 == 1 && filix2 == super.filaini ){
        if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "RR";
         table.tablero[filaini][colini]= "_";


        } else {
         if ( table.tablero[filter][colter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con su REY");
                    comidos++;
        } else if ( table.tablero[filter][colter].equals("CV")){
                System.out.println("Jugador 2 ha comido un Caballo con su REY");
                comidos++;
        } else if ( table.tablero[filter][colter].equals("EV")){
                System.out.println("Jugador 2 ha comido un Elefante con su REY");
                comidos++;
        } else if ( table.tablero[filter][colter].equals("VV")){
                System.out.println("Jugador 2 ha comido su Consejero con un Peon");
                comidos++;
        } else if ( table.tablero[filter][colter].equals("TV")){
                System.out.println("Jugador 2 ha comido una Torre con su REY");
                comidos++;
        }else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con su REY");
                    comidos++;
             }
            }
        }
        table.printTablero();

        }else {
             System.out.println("<<<<< JUEGO TERMINADO >>>>> ");
        }


    }
        //movimiento del caballo
        if (conta==0){
            conta++;
            if (Tablero.jugador1==1){
        if ( filter !=-1 && colter != -1){
            if ( filter <=table.tablero.length && colter <=table.tablero[filter].length){
                if( restafilaAde==1 || restafilaAtras==1 && restacolumna1==2){
            if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "RV";
         table.tablero[filaini][colini]= "_";
            table.printTablero();

            } else {
            if ( table.tablero[filter][colter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con su REY");
                    comidos++;
            } else if ( table.tablero[filter][colter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con su REY");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con su REY");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con su REY");
                    comidos++;
                 } else if ( table.tablero[filter][colter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con su REY");
                    comidos++;
                } else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con su REY");
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
                if( restafilaAde==1 || restafilaAtras==1 && restacolumna1==2){
                    if( table.tablero[filter][colter].equals("-")){
                        table.tablero[filter][colter]= "RR";
                        table.tablero[filaini][colini]= "_";
                        table.printTablero();

                    } else {
                        if ( table.tablero[filter][colter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("CV")){
                    System.out.println("Jugador 2 ha comido un Caballo con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("EV")){
                    System.out.println("Jugador 2 ha comido un Elefante con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("VV")){
                    System.out.println("Jugador 2 ha comido su Consejero con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("TV")){
                    System.out.println("Jugador 2 ha comido una Torre con su REY");
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

        if (Tablero.jugador1==1){
        if ( filter !=-1 && colter != -1){
            if ( restafilaAde==1 && restacolumnaAde==1 || restafilaAtras==1 && restacolumnaAtras==1){

            if( table.tablero[filter][colter].equals("-")){
         table.tablero[filter][colter]= "RV";
         table.tablero[filaini][colini]= "_";
            table.printTablero();

            } else {
            if ( table.tablero[filter][colter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con su REY");
                    comidos++;
            } else if ( table.tablero[filter][colter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con su REY");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con su REY");
                    comidos++;
                } else if ( table.tablero[filter][colter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con su REY");
                    comidos++;
                 } else if ( table.tablero[filter][colter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con su REY");
                    comidos++;
                } else if (table.tablero[filter][colter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con su REY");
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
            if ( restafilaAde==1 && restacolumnaAde==1 || restafilaAtras==1 && restacolumnaAtras==1){

                    if( table.tablero[filter][colter].equals("-")){
                        table.tablero[filter][colter]= "RR";
                        table.tablero[filaini][colini]= "_";
                        table.printTablero();

                    } else {
                        if ( table.tablero[filter][colter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("CV")){
                    System.out.println("Jugador 2 ha comido un Caballo con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("EV")){
                    System.out.println("Jugador 2 ha comido un Elefante con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("VV")){
                    System.out.println("Jugador 2 ha comido su Consejero con su REY");
                        comidos++;
                    } else if ( table.tablero[filter][colter].equals("TV")){
                    System.out.println("Jugador 2 ha comido una Torre con un su REY");
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


