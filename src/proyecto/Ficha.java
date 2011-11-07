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
public class Ficha {
 
    static Scanner lea=new Scanner (System.in);
    public static int comidos = 0;
    public int filaini,colini;

       public Ficha (int fila,int col){

           this.filaini = fila;
           this.colini = col;
       }

       public void mov() {
            System.out.println("Ingrese la posición a mover");
            filaini=lea.nextInt();
            colini=lea.nextInt();
        }
        public void comer(){
            System.out.println("Usted ha comido una pieza o Ficha");
        }


    }

