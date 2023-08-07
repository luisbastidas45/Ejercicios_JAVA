
package Ejercicio4;

import java.util.Scanner;


public class main {
    
    public static int getTiempoGanador( atletismo corredor[]){
        int indice = 0;
        float tiempo;
        
        tiempo = corredor[0].getTiempoAtleta();
        
        for (int i = 0; i < corredor.length; i++){
            if (corredor[i].getTiempoAtleta() < tiempo){
                tiempo = corredor[i].getTiempoAtleta();
                indice = i;
            }
        }       
        return indice;
    }
    
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int numAtleta;
        String nombreAtleta;
        float tiempoAtleta;
        System.out.print("Ingresa la cantidad de atletas que participan en la carrera: ");
        int cantidadAtletas = entrada.nextInt();
        
        atletismo corredores[] = new atletismo[cantidadAtletas];
        
        for (int i = 0; i < corredores.length; i++){
            entrada.nextLine();
            System.out.println("Ingrese los datos del corredor n°: "+(i+1));
            System.out.print("Ingresa el numero del atleta: ");
            numAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese el nombre del atleta: ");
            nombreAtleta = entrada.nextLine();
            System.out.print("Ingresa el tiempo que le tomo al atleta completar la carrera: ");
            tiempoAtleta = entrada.nextFloat();
            
            corredores[i] = new atletismo(numAtleta,nombreAtleta,tiempoAtleta);            
        }
        
        int indice = getTiempoGanador(corredores);
        System.out.println(corredores[indice].mostrarResultado());
    }
}
