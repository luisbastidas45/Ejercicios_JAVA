/*
Crear un programa para simular un equipo de futbol ( futbolistas, entrenador y doctor para lo que se tendra
- una super clase persona, con los siguientes datos: nombre, apellido, edad.
- la sub clase futbolista tendra los siguientes datos: dorsal y posicion
- la sub clase doctor, la titulacion y los años de experiencia


HAcer un menu donde se tengan las siguientes opciones:
viaje de equipo, entrenamiento, partido de futbol, planificar entrenamiento, entrevistas, curar lesion. 
*/

package Ejercicio10;

import java.util.Scanner;


public class principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Futbolista futbolista = new Futbolista(10,"Delantero","Lionel","Messi",34);
        Doctor doctor = new Doctor("Medico Deportivo",5,"Laura","Gonzales",25);
        
        do{
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de fútbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevistas");
            System.out.println("6. Curar lesión");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();   
            
            switch(opcion) {
                case 1: System.out.println("El equipo esta viajando");
                            break;
                case 2: System.out.println("Realizando entrenamiento");
                            break;
                case 3: System.out.println("El equipo esta jugando un partido");
                            break;
                case 4: System.out.println("el entrenador esta planificando un entrenamiento");
                            break;
                case 5: System.out.println("El equipo esta dando una entrevista");
                            break;
                case 6: System.out.println("El doctor esta curando una lesion");
                            break;
                case 0: System.out.println("Saliendo del programa");
                            break;
                default:
                            System.out.println("Opcion invalida, intentelo de nuevo");
                            break;
                  
            }
            
        }while(opcion != 0);
    
    //llenar personas
        
    }
}
