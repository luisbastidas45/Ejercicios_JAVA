
package Ejercicio3;

import java.util.Scanner;

public class principal {
    
    public static int indiceCocheMasBarato(vehiculos coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        
        for(int i = 0; i < coches.length; i++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tIntroduce las propiedades del vehiculo\t");
        String marca, modelo;
        float precio;
        int cantidad, indiceBarato;
        
        System.out.print("Introduce el numero de vehiculos que se desean ingresar: ");
        cantidad = entrada.nextInt();
        
        //creamos los objetos para los coches
        vehiculos coche[] = new vehiculos[cantidad];
        
        for (int i = 0; i < cantidad; i++){
            entrada.nextLine();
            System.out.println("\nDigite las caracteristas del vehiculo "+(i+1)+" : ");
            System.out.print("Ingrese la marca del vehiculo: ");
            marca = entrada.nextLine();
            System.out.print("Ingrese el modelo del vehiculo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduce el precio de vehiculo: ");
            precio = entrada.nextFloat();
            
            coche[i] = new vehiculos(marca,modelo,precio);
        }
        
        
        indiceBarato = indiceCocheMasBarato(coche);
        System.out.println("\tlos datos del vehiculo mas barato es: \t");
        System.out.println(coche[indiceBarato].mostrarDatos());
    }
}
