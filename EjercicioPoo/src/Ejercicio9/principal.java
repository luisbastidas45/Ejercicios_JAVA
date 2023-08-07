
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>(); //arreglo dinamico
    public static void main(String[] args){
        //llenar un poligono
        llenarPoligono();
        
        //mostrar los datos y area  de los poligonos
        mostrarResultados();
    }
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        Scanner entrada = new Scanner(System.in);
        do{
            do{
                System.out.println("Digite que poligono desea ");
                System.out.println("1. Trinagulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
            }while(opcion < 1 || opcion > 2);
            
            switch(opcion){
                case 1: llenarTriangulo();//llenar un triangulo
                    break;
                case 2: llenarRectangulo(); //llenar un rectangulo
                    break;
            }
            System.out.print("Desea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nIIngrese el valor del lado1: ");
        lado1 = entrada.nextInt();
        System.out.print("IIngrese el valor del lado2: ");
        lado2 = entrada.nextInt();
        System.out.print("IIngrese el valor del lado3: ");
        lado3 = entrada.nextInt();
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nIngrese el valor del lado1: ");
        lado1 = entrada.nextInt();
        System.out.print("Ingrese el valor del lado2: ");
        lado2 = entrada.nextInt();
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        // recorriendo el arreglo de poligonos
        for(Poligonos poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area es igual a: "+poli.area());
            System.out.println(" ");
        }
    }
}
