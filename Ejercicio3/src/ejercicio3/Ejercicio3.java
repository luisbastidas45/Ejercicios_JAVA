
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

  
    public static void main(String[] args) {
        float salario = 1000;
        float comision = 150;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del carro vendido: ");
        float valor = entrada.nextFloat();
        
        float total = (float) (salario + comision + (valor * (5.0 / 100)));
        System.out.println("El salario que debe recibir el trabajador es de: "+ total);
        
        
    }
    
}
