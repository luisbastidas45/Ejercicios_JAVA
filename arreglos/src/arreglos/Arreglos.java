
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {
        
       //ejercicio 1: leer 5 numeros, guardarlos en un arrglo y mostrarlos en el mismo orden introducidos,
       
       /*
       Scanner entrada = new Scanner(System.in);
       int[] numeros = new int[5];
       
       for (int i = 0; i < 5; i++){
           System.out.print("Ingrese el N° "+(i+1)+" : ");
           numeros[i] = entrada.nextInt();
       }
       for (int i: numeros){
           System.out.println("Numero ingresado: "+i);
       }
       */
       // ejercicio 2: leer 5 numeros, guardalos en un arreglo y mostrarlos en el orden inverso introducido
       
       /*
       Scanner entrada = new Scanner(System.in);
       float[] numeros = new float[5];
       
       for (int i = 0; i < 5;i++){
           System.out.print((i+1)+": Ingrese un numero: ");
           numeros[i] = entrada.nextFloat();
       }
       
 
       
       for (int i = (numeros.length)-1; i >= 0; i--){
           System.out.println("Numero ingresado: "+ numeros[i]);
       }
       */
       //ejercicio 3: Leer 5 numeros, almacenarlos en un arreglo y realizar la media de los numeros positivos, negativos y contar cantidad de ceros
       
       /*
       Scanner entrada = new Scanner(System.in);
       
       int[] numeros = new int[5];
       int con_p = 0, con_n = 0, con_c = 0;
       float med_p,med_n;
       float sum_p = 0,sum_n = 0;
       
       for (int i = 0; i < 5; i++){
           System.out.print((i+1)+". Ingrese el numero: ");
           numeros[i] = entrada.nextInt();
       }
       
       for (int i = 0; i < numeros.length;i++){
           if (numeros[i] > 0) {
               sum_p +=numeros[i];
               con_p++;
           }
           if (numeros[i] < 0){
               sum_n += numeros[i];
               con_n++;
           }
           if (numeros[i] == 0){
               con_c++;
           }
       }
       
       med_p = sum_p / con_p;
       med_n = sum_n / con_n;
       
        System.out.println("La media de los numeros positivos es: "+med_p);
        System.out.println("La media de los numeros negativos es: "+med_n);
        System.out.println("La cantidad de ceros ingresados es: "+con_c);
       */
        //ejercicio 4: leer 10 numeros enteros. guardarlos en un arreglo y se deben mostrar de manera escalonada el primero luego el ultimo y asi.
        
        /*
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+": Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        int num_apoyo = (numeros.length) - 1;
        for (int i = 0; i < (numeros.length)/2; i++){
            System.out.println("Numero ingresado: "+numeros[i]);
            System.out.println("Numeros ingresado: "+ numeros[num_apoyo]);
            num_apoyo--;
        }
        */
        
        //Ejercicio 5: leer por teclado dos tablas de 10 numeros enteros y mezclaras de forma que quede intercaldo
        
        /*
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla_combinada = new int[20];
        
        System.out.println("\tDatos tabla 1\t");
        for (int i = 0; i < 10; i++){
            tabla1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            System.out.println((i+1)+": numero: "+tabla1[i]);
        }
        
        System.out.println("'\n\tDatos tabla 2\t");
        for (int i = 0; i < 10; i++){
            tabla2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            System.out.println((i+1)+": numero: "+tabla2[i]);
        }
        
   
        int j = 0;
        for (int i = 0; i < 10; i++){
           
            tabla_combinada[j] = tabla1[i];
            j++;
            tabla_combinada[j] = tabla2[i];
            j++;           
        }   
        
        System.out.println("'\nDATOS INTERCALADOS\n");
        for (int i: tabla_combinada){
            System.out.println(i+": Numero: "+ i);
        }
        */
        //ejercicio 6: leer los datos correspondientes a dos tablas de 12 elementos numericos y mezclarlos. 3 de la primera luego 3 de la segunda y asi sucesivamente
        /*
        int[] tabla1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[]  tabla2 = {13,14,15,16,17,18,19,20,21,22,23,24};
        int[] tabla3 = new int[(tabla1.length +  tabla2.length)];
        
       int apoyo = 0;
       int prueba = 0;
             
        for (int i = 0 ;i < 12; i+=3){
         
                for (int j = i; j < i + 3; j++) {
                    tabla3[apoyo++] = tabla1[j];
                }
                for (int j = i; j < i + 3; j++) {
                    tabla3[apoyo++] = tabla2[j];
                }
         }
        
        for (int i = 0; i < 24; i++){
            System.out.println(tabla3[i]);
        }
        
        */
        
        //ejercicio 7: leer 10 numeros e indicar si se encuentran ordenados de forma ascendente, descendente o estan desordenados
        /*
        int[] tabla = new int[10];
        boolean ascender = false, descender = false, igual = false;
        
        
        for (int i = 0; i < 10; i++){
            tabla[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+": Ingrese un numero: "));
        }
        
        for (int i = 0; i < 9; i++){
            if(tabla[i] < tabla[i+1]){ //creciente
                ascender = true;
            }
            if(tabla[i] > tabla[i+1]){ //decreciente
                descender = true;
            }
            if (tabla[i] == tabla[i+1]){
                igual = true;
            }
        }
        
        if (ascender == true && descender == false){
            System.out.println("numeros crecientes");
        }
        if (ascender == false && descender == true){
            System.out.println("numeros decrecientes");
        }
        if (ascender == false && descender == false  && igual == true){
            System.out.println("Los numeros son iguales");
        }
        if (ascender == true && descender == true){
            System.out.println("Los numeros estan en desorden");
        }
        */
        //Ejercicio 8: declarar una tabla de 10 elemenrtos. leer por teclado 8 numeros y despues se debe pedir un numero y una psicion y desplazar los demas numeros
         
        /*
        int[] tabla = new int[10];
        int[] tabla2 = new int[10];
        int num, posicion;
        
        for (int i = 0; i < 8; i++){
            tabla[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+": Ingrese un numero: "));
       }        
        
        System.out.println("Tabla inicial");
        for (int i = 0; i < tabla.length ; i++){
            System.out.println(i+" ---- "+tabla[i]);
        }
       
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero a ingresar en el arreglo: "));
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion donde desea agregar el numero (0-9): "));
        
      
            for (int j = 0; j < 10; j++){
                  tabla2[j]  = tabla[j];         
            }
            
            tabla[posicion] = num;
            
            for (int i = posicion; i< 9; i++){
                tabla[i+1] = tabla2[i];
            }
            
            
            tabla[posicion] = num;
        System.out.println("Tabla FINAL");
        for (int i = 0; i < tabla.length ; i++){
            System.out.println(i+" ---- "+tabla[i]);
        }   
        */
        // Ejercicio 9: Crear un prgrama que lea por teclado 10 numeros entreros y desplace a todos una posicion donde el ultimo pasa a ser el primero
        /*
        int[] tabla = {1,2,3,4,5,6,7,8,9,10};
        int ultimo = tabla[tabla.length - 1];
        

        
        for (int i = 8; i >= 0; i--){
            tabla[i+1] = tabla[i];
        }
        tabla[0] = ultimo;
        
        for (int i = 0; i < tabla.length; i++){
            System.out.println(tabla[i]);
        }
        */
                
        //Ejercicio 10: crear un array de diez posiciones y pedir por teclado N que es el valor a desplazar 
        
        /*
        int[] tabla = {1,2,3,4,5,6,7,8,9,10};  // lleno el arreglo
        int[] tabla2 =new int [10]; // creo una copia
        int t = tabla.length - 1 ; // adquiero el tamaño de la tabla
        int desplazar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el desplazamiento que desea: "));
 
        
        int num = t - desplazar; // esto me permite conocer obtener la cantidad de posicones desde la poscion de desplazamiento en adelante
        int num2 =num +1; // me sirve para conocer las posiciones finales que ahora se deplazan a las posicones iniciales 
        
        //crear copia del arreglo
        for (int i = 0; i < 10; i++){
            tabla2[i] = tabla[i];
        }
        
        //  lleno el arreglo desde la ultima posicion hasta la posicion del desplazamiento 
        // num me ayuda a conocer las posiciones de la copia de la tabla que debo asignar a esa posicion de la tabla original 
        //en este caso las posiciones 0,1,2,3,4
        // por ejemplo si el desplazamiento es 5 entonces num = 4 ((10-1)-5) entonces en esas posicones me guardara las primeras posiciones de la copia del arreglo
        for (int i = 9; i >= desplazar; i--, num--){
            tabla[i] = tabla2[num];
        }
        
        //recorre de 0 hasta la posicion de desplazamiento 
        // num2 por ejemplo si el desplzamiento es 5 entonces num2 = 5 --> (num1=4)+1 me asegura que recorrera la copia del arreglo en las posiciones que faltan 
        // en este caso las posiciones 5,6,7,8,9 del arreglo copia
        for (int i = 0; i < desplazar; i++,num2++){
            tabla[i] = tabla2[num2];
        }
        
        //mostrar datos
        for (int i = 0; i < tabla.length; i++){
            System.out.println(tabla[i]);
        }
        */
        // Ejercicio 11 llenar un arreglo de tamaño 10 con 5 numeros.. luego ir pidiendo numeros e irlos ubicando en el lugar correspondiente
        
        /*
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];
        int num, apoyo = 0;
        
        
        for (int i = 0; i < 5; i++){
            System.out.print("Ingresa un numero: ");
            num = entrada.nextInt();
            tabla[i] = num;
        }
        
        //ordendar los primeros 5 numeros ingresados
        
        for (int i = 0; i < 9; i++){
            for (int j = i+1; j < 10; j++){
                if (tabla[i] > tabla[j]){
                    apoyo = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = apoyo;
                }
            }
        }
        System.out.println("Primer vista");
        for (int i = 0; i< 10; i++){
            if (tabla[i] != 0){
                System.out.println(tabla[i]);
            }
            
        }
        
        System.out.println("\n");
        apoyo = 0;
        
        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            tabla[0] = num;
            
            for (int j = 0; j < 9; j++){
                for (int k = j + 1; k < 10; k++ ){
                    if (tabla[j] > tabla[k]){
                        apoyo = tabla[j];
                        tabla[j] = tabla[k];
                        tabla[k] = apoyo;
                    }
                }
            }
            System.out.println("Numero agregado...");
            for (int w = 0; w < 10; w++){
                if (tabla[w] != 0){
                    System.out.print(tabla[w]+"  ");
                }
            }
            System.out.println("\n");
        }
        
        System.out.println("\nVista terminada");
        for (int i = 0; i < 10; i++){
            System.out.println(tabla[i]);
        }
        */
        
        // ejercicio 12:  leer por teclado 10 numeros y una posicion entre 0 y 9. eliminar el elemento situado en la posicion dada sin dejar huecos
        /*
        int[] tabla = new int[10];
        int posicion;
        
        for (int i = 0; i < 10; i++){
            tabla[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+": Ingrese un numero: "));
        }
        
        System.out.println("\tArreglo original\t");
        for (int i = 0; i < 10; i++){
            System.out.println(i+" --- "+tabla[i]);
        }

        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del numero que desea borrar (0 - 9): "));
        
        for(int i = posicion; i < 9; i++){
            tabla[i] = tabla[i+1]; 
        }
        tabla[9] = 0;
        
        System.out.println("\n\tTabla con la eliminacion de la posicon\t");
        
        for (int i = 0;  i < 10; i++){
            System.out.println(i+" --- "+tabla[i]);
        }
        */
        
        //Ejercicio 13:  leer una tabla de 10 numeros enteros. separla y guardar primero los pares y luego los impares
        /*
        int[] tabla = new int[10];
        int apoyo = 0;
        
        for (int i = 0; i < 10; i++){
            tabla[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+": Ingrese un numero: "));
        }
        
        for (int i = 0; i < 9; i++ ){
            for (int j = i+1; j < 10; j++ ){
                if (tabla[i] % 2 != 0 && tabla[j] % 2 == 0){
                    apoyo = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = apoyo;
                }
            }
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println(tabla[i]);
        }
       */
        // ejercicio14: tener dos series de 10 enteros ordenados crecientemente.. combinar los datos en un tercer arreglo y garantizar que siga ordenado
        
        /*
        int[] tabla1 = {1,6,8,15,36,24,8,9,70,4};
        int[] tabla2 = {41,20,2,5,64,51,10,14,13,32};
        int t = tabla1.length + tabla2.length;
        int[] tabla3 = new int[t];
        int j = 0, apoyo = 0;
        
        
        for (int i = 0; i < 10 ; i++){
            tabla3[j++] = tabla1[i];
            tabla3[j++] = tabla2[i];            
        }
        
        for (int i = 0; i < t-1; i++){
            for (int k = i+1; k< t; k++){
                if (tabla3[i] > tabla3[k]){
                    apoyo = tabla3[i];
                    tabla3[i] = tabla3[k];
                    tabla3[k] = apoyo;
                }
            }
        }
        
        for (int i = 0; i < t; i++){
        System.out.println(tabla3[i]);
    }
        */
        
        //Ejercicio 15: leer 10 numeros ordenados. leer N y buscarlo en la tabla  y mostrar las posiciones donde se encuentra el dato en caso contrario mostrar un mensaje
        /*
        int[] tabla = {31,57,86,5,31,26,37,13,9,22};
        int apoyo = 0,num, cont=0, apoyo2 = 0;
        
        for (int i = 0; i < tabla.length -1 ; i++){
            for (int j = i+1; j < tabla.length; j++){
                if (tabla[i] > tabla[j]){
                    apoyo = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = apoyo;
                }
            }
        }

         System.out.println("\tArreglo ardenado\t"); 
         for (int i = 0; i < 10; i++){
             System.out.println(i+" --- "+tabla[i]);
         }
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar: "));
        
        for (int i = 0; i < 10; i++){
            if (tabla[i] == num){
                cont++;
            }
        }
       
            
        int[] tabla2 = new int[cont];

        if ( tabla2.length == 0){
            JOptionPane.showMessageDialog(null,"El numero que usted ingreso no se encuentra en el arreglo...");
        }
        else {
            for (int i = 0; i < 10; i++){
                if (tabla[i] == num){
                    tabla2[apoyo2] = i;
                    apoyo2++;
                }
            }
            
            System.out.print("El numero "+ num+" se encuentra en la(s) posicion(es): ");
            for (int i = 0; i < tabla2.length; i++){
                System.out.print(tabla2[i]+" ");
            }
        }
        */
                
         //ejercicio 16: hay 3 trimestres y 5 notas de estudiantes en cada trimestre.. mostrar la media del grupo en cada trimestre 
         // y la media del alumno que se encuentre en la posicion N que se lee por teclado. 
         Scanner entrada = new Scanner(System.in);
         double[] trimestre1 = {4.1,3.5,2.1,5.0,3.8}; //18.5  // 3.7
         double[] trimestre2 = {2.5,4.6,1.3,3.2,4.0}; //15.6   // 3.12
         double[] trimestre3 = {1.5,2.6,4.5,3.4,5.0}; //17            // 3.4    //51.1 / 15 = 3.4066666
         String[] nombres = {"Monica","Felipe","Daniel","Sofia","Cristian"};
         
         
         double promedioGeneral = 0, promedioAlumno = 0;
         double promedio1 = 0, promedio2 = 0, promedio3 = 0;
         int total = (trimestre1.length + trimestre2.length + trimestre3.length);
         int posicion;
         
         for (int i = 0; i < 5; i++){
             promedioGeneral += trimestre1[i];
             promedioGeneral += trimestre2[i];
             promedioGeneral += trimestre3[i];
             
             promedio1 += trimestre1[i];
             promedio2 += trimestre2[i];
             promedio3 += trimestre3[i];
         }
         
         System.out.println("El promedio general de todos los trimestres es: "+promedioGeneral/total);
         System.out.println("El promedio del primer trimestre es igual a: "+ promedio1 / trimestre1.length);
         System.out.println("El promedio del segundo trimestre es igual a: "+ promedio2 / trimestre2.length);
         System.out.println("El promedio del tercer trimestre es igual a: "+ promedio3 / trimestre3.length);
         
         System.out.println("\n");
          
          for (int i = 0; i< 5; i++){
               System.out.println(" * ("+i+") "+nombres[i]+" - "+trimestre1[i]+" - "+trimestre2[i]+" - "+trimestre3[i]);
          }
         
         System.out.println("\n");
          
          System.out.print("Ingrese la posicion del estudiante  del cual desea conocer la medio (0 -4): ");
          posicion = entrada.nextInt();
          
          promedioAlumno = trimestre1[posicion] + trimestre2[posicion] + trimestre3[posicion];
          
          System.out.println("\n");
          
          System.out.println("El promedio de "+nombres[posicion] +" es: "+promedioAlumno/3);
        }      
    }

        
       
        
    

    


