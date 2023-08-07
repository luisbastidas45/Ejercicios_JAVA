
package Ejercicio2;

import java.util.Scanner;

public class main {
    public static void main (String[] args){
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tMovimiento atraves de un tablero de 6x6\t");
        System.out.println("\tel centro esta en 0,0\t");
        System.out.println("0. salir");
        System.out.println("1. arriba");
        System.out.println("2. abajo");
        System.out.println("3. izquierda");
        System.out.println("4. derecha");
        System.out.print("Elije una opcion: ");
        opcion = entrada.nextInt();
        int[] val;
        
        movimiento m1 = new movimiento(0,0);
        
        
        while (opcion != 0){

            switch(opcion){
                case 1: {
                    val = m1.getMoverArriba();
                    m1 = new movimiento(val[0],val[1]); 
                    m1.getMostrar();
                    break;
                }
                case 2:{
                    val = m1.getMoverAbajo();
                    m1 = new movimiento(val[0],val[1]);
                    m1.getMostrar();
                    break;
                }
                case 3:{
                    val = m1.getMoverIzquierda();
                    m1 = new movimiento(val[0],val[1]);
                    m1.getMostrar();
                    break;
                }
                case 4:{
                    val = m1.getMoverDerecha();
                    m1 = new movimiento(val[0],val[1]);
                    m1.getMostrar();
                    break;
                }
                default: {
                       System.out.println("Opcion Incorrecta");
                        }
            }
             System.out.println("0. salir");
            System.out.println("1. arriba");
            System.out.println("2. abajo");
            System.out.println("3. izquierda");
            System.out.println("4. derecha");
            System.out.print("Elije una opcion: ");
            opcion = entrada.nextInt();
        }
        
    }
}
