/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author stefany
 */
public class Tablero {



    public static final int jugador1= 1;
    public static final int jugador2= 2;

    String tablero[][] = new String [9][9];

   public void printTablero(){
       tablero[0][0]=".";
       tablero[0][1]="1"+"";
       tablero[0][2]="2"+"";
       tablero[0][3]="3"+"";
       tablero[0][4]="4"+"";
       tablero[0][5]="5"+"";
       tablero[0][6]="6"+"";
       tablero[0][7]="7"+"";
       tablero[0][8]="8";
       tablero[1][0]="1";
       tablero[1][1]="TV";
       tablero[1][2]="PV";
       tablero[1][3]="-";
       tablero[1][4]="-";
       tablero[1][5]="-";
       tablero[1][6]="-";
       tablero[1][7]="PR";
       tablero[1][8]="TR";
       tablero[2][0]="2";
       tablero[2][1]="CV";
       tablero[2][2]="PV";
       tablero[2][3]="-";
       tablero[2][4]="-";
       tablero[2][5]="-";
       tablero[2][6]="-";
       tablero[2][7]="PR";
       tablero[2][8]="CR";
       tablero[3][0]="3";
       tablero[3][1]="EV";
       tablero[3][2]="PV";
       tablero[3][3]="-";
       tablero[3][4]="-";
       tablero[3][5]="-";
       tablero[3][6]="-";
       tablero[3][7]="PR";
       tablero[3][8]="ER";
       tablero[4][0]="4";
       tablero[4][1]="VV";
       tablero[4][2]="PV";
       tablero[4][3]="-";
       tablero[4][4]="-";
       tablero[4][5]="-";
       tablero[4][6]="-";
       tablero[4][7]="PR";
       tablero[4][8]="RR";
       tablero[5][0]="5";
       tablero[5][1]="RV";
       tablero[5][2]="PV";
       tablero[5][3]="-";
       tablero[5][4]="-";
       tablero[5][5]="-";
       tablero[5][6]="-";
       tablero[5][7]="PR";
       tablero[5][8]="ER";
       tablero[6][0]="6";
       tablero[6][1]="EV";
       tablero[6][2]="PV";
       tablero[6][3]="-";
       tablero[6][4]="-";
       tablero[6][5]="-";
       tablero[6][6]="-";
       tablero[6][7]="PR";
       tablero[6][8]="ER";
       tablero[7][0]="7";
       tablero[7][1]="CV";
       tablero[7][2]="PV";
       tablero[7][3]="-";
       tablero[7][4]="-";
       tablero[7][5]="-";
       tablero[7][6]="-";
       tablero[7][7]="PR";
       tablero[7][8]="CR";
       tablero[8][0]="8";
       tablero[8][1]="TV";
       tablero[8][2]="PV";
       tablero[8][3]="-";
       tablero[8][4]="-";
       tablero[8][5]="-";
       tablero[8][6]="-";
       tablero[8][7]="PR";
       tablero[8][8]="TR";

       for (int i=0; i< tablero.length; i++){
            for (int k=0; k<tablero[i].length; k++){
            System.out.print(tablero[i][k]);
             System.out.print(".");
         }
            System.out.println("\n");
 }
    }

}
   
    










