
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float nota1,nota2,nota3,nota4,promedio;
        
        System.out.print("Ingrese la nota correspondiente a participacion: ");
        nota1 = (float) ((entrada.nextFloat()) * (10.0 / 100));
        
        System.out.print("Ingrese la nota correspondiente al primer examen: ");
        nota2 = (float)((entrada.nextFloat()) * (25.0 / 100));
        
        System.out.print("Ingrese la nota correspondiente de la segunda nota examen: ");
        nota3 = (float)((entrada.nextFloat()) * (25.0 / 100));
        
        System.out.print("Ingrese la nota correspondiente al examen final: ");
        nota4 = (float)((entrada.nextFloat()) * (40.0 / 100));
        
        promedio = (nota1 + nota2 + nota3 + nota4) ;
        
        System.out.println("El promedio de las notas ingresadas corresponde a: "+ promedio);
    }
    
}
