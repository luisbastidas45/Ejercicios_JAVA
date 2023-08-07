
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la nota 1: ");
        float nota1 = entrada.nextFloat();
        
        System.out.print("Ingrese la nota 2: ");
        float nota2 = entrada.nextFloat();
        
        System.out.print("Ingrese la nota 3: ");
        float nota3 = entrada.nextFloat();
        
        float resultado = nota1 + nota2 + nota3;
        float promedio = resultado / 3;
      
        System.out.println("La suma de las 3 notas ingresadas por el usuario son: "+resultado);
        System.out.println("El promedio de las 3 notas es: "+promedio);
        
    }
    
}
