/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
public class Peon extends Ficha {

    Tablero tab = new Tablero();
    int filater, columter;

    public Peon ( int fila, int columna ){
        super ( fila , columna );
    }

    @Override
    public void mov()
    {
        System.out.print("Esta Seleccionando un Peon");
        System.out.println("Ingrese Fila");
        filater= lea.nextInt();
        System.out.println("Ingrese Columna");
        columter=lea.nextInt();

        int restacolumna1 = columter-super.colini;
        int filix= filater;
        int restacolumna2 = super.colini-columter;
        int filix2 = filater;

        if ( filater!=-1 && columter != -1){

        
        if(Tablero.jugador1==1){
                if ( restacolumna1 == 1 && filix== super.filaini ){
               if( tab.tablero[filater][columter].equals("-")){
         tab.tablero[filater][columter]= "PV";
         tab.tablero[filaini][colini]= "_";
         
        } else  {
             if ( tab.tablero[filater][columter].equals("PR") ){
                    System.out.println("Jugador 1 ha comido un Peon con un Peon");
                    comidos++;
            } else if ( tab.tablero[filater][columter].equals("CR")){
                System.out.println("Jugador 1 ha comido un Caballo con un Peon");
                comidos++;
                } else if ( tab.tablero[filater][columter].equals("ER")){
                System.out.println("Jugador 1 ha comido un Elefante con un Peon");
                comidos++;
                } else if ( tab.tablero[filater][columter].equals("VR")){
                System.out.println("Jugador 1 ha comido su Consejero con un Peon");
                comidos++;
                 } else if ( tab.tablero[filater][columter].equals("TR")){
                System.out.println("Jugador 1 ha comido una Torre con Peon");
                comidos++;
                } else if (tab.tablero[filater][columter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con un Peon");
                    comidos++;
             }

             }
               tab.printTablero();
         }
        
            

    } else if( Tablero.jugador2==2){
        if ( restacolumna2 == 1 && filix2 == super.filaini ){
        if( tab.tablero[filater][columter].equals("-")){
         tab.tablero[filater][columter]= "PR";
         tab.tablero[filaini][colini]= "_";
         

        } else {
         if ( tab.tablero[filater][columter].equals("PV") ){
                    System.out.println("Jugador 2 ha comido un Peon con un Peon");
                    comidos++;
        } else if ( tab.tablero[filater][columter].equals("CV")){
                System.out.println("Jugador 2 ha comido un Caballo con un Peon");
                comidos++;
        } else if ( tab.tablero[filater][columter].equals("EV")){
                System.out.println("Jugador 2 ha comido un Elefante con un Peon");
                comidos++;
        } else if ( tab.tablero[filater][columter].equals("VV")){
                System.out.println("Jugador 2 ha comido su Consejero con un Peon");
                comidos++;
        } else if ( tab.tablero[filater][columter].equals("TV")){
                System.out.println("Jugador 2 ha comido una Torre con Peon");
                comidos++;
        }else if (tab.tablero[filater][columter].equals("RR")){
                    System.out.println("Jugador 1 ha comido Rey Rojo con un Peon");
                    comidos++;
             }
            }
        }
        tab.printTablero();

        }else {
             System.out.println("<<<<< JUEGO TERMINADO >>>>> ");
        }
        
        } 
           
            
        }
    
    }
    





