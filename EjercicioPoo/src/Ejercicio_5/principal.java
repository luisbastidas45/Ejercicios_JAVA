
package Ejercicio_5;

import java.util.Scanner;

public class principal {
    
    public static double mayor_superficie(triangulo triangulos[]){
        double area;
        
        area = triangulos[0].obtener_area();
        
        for (int i = 1; i < triangulos.length; i++){
            if ( area < triangulos[i].obtener_area()){
                area = triangulos[i].obtener_area();
            }
        }
        return area;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        
        int numTriangulos;
        System.out.print("Por favor igresa el numero de triangulos con los cuales vamos a trabajar: ");
        numTriangulos = entrada.nextInt();
        
        triangulo triangulos[] = new triangulo[numTriangulos];
        
        for ( int i = 0; i < triangulos.length; i++){
            System.out.println("\n\tDigite los valores para el triangulo\t "+ (i+1));
            System.out.print("Digite el valor de la base del triangulo");
            base = entrada.nextDouble();
            System.out.print("Digite el valor de uno de los lados del triangulo: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new triangulo(base, lado);
        }
        
        System.out.println("\n\tLos valores de los triangulos ingresados son\t");
        for (int i = 0; i < triangulos.length; i++){
            System.out.println("El perimetro del triangulo es: "+triangulos[i].obtener_perimetro());
            System.out.println("El area del trinagulo es: "+triangulos[i].obtener_area());
        }
        
        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayor_superficie(triangulos));
    }
}
