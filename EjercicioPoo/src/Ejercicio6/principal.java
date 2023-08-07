
package Ejercicio6;

import java.util.Scanner;


public class principal {
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        numeros z1 = new numeros(1.0 , 1.0);
        numeros z2 = new numeros(1.0 , 1.0);
        
        numeros operacion = new numeros();
        
        numeros accion;
        
        int opcion = 0;
        
        while (opcion != 5){
            System.out.println("\tMENU PRINCIPAL\t");
            System.out.println("1. sumar dos numeros complejos");
            System.out.println("2. multiplicar dos numeros complejos");
            System.out.println("3. comparar dos numeros complejos (iguales o no)");
            System.out.println("4. sumar un numero complejo y un entero");
            System.out.println("5. salir");
            System.out.print("\nSelecciona una opcion: ");
            opcion = entrada.nextInt();
            
            if (opcion == 5){
                break;
            }
            if (opcion == 1){
                accion = operacion.sumar(z1,z2);
                System.out.println("("+accion.getReal()+","+accion.getImag()+")");
                break;
            }
            if (opcion == 2){
                accion = operacion.multiplicar(z1,z2);
                System.out.println("("+accion.getReal()+","+accion.getImag()+")");
            }
            if (opcion == 3){
                boolean resultado = operacion.igual(z1, z2);
                
                if (resultado == true){
                    System.out.println("Los numeros complejos ingresados presentan el mismo valor");
                }
                else {
                    System.out.println("Los numeros complejos ingresados son diferentes");
                }
            }
            
        }
        
  
        
        
        
    }
}
