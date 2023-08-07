
package ejerciciociclos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EjercicioCiclos {

 
    public static void main(String[] args) {
        
        //ejercicio 1: leer un numero y mostrar su cuadrado, repetir el proceso hasta que se ingrese un numero negativo
        
        /*
        Scanner entrada = new Scanner(System.in);
        
        int num = 1, cuadrado;
        
        while (num > 0){
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            
            cuadrado = (int) Math.pow(num,2);
            System.out.println("El numero ingresado elevado al cuadrado es: "+cuadrado);
        }
        
        */
        
        //ejercicio 2: lleer un numero e indicar si es positivo o negativo. el proceso se repite hasta que se introduzca un cero
        
        /*
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while (num != 0){
            if (num  > 0){
                JOptionPane.showMessageDialog(null,"El numero ingresado es positivo...");
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero ingresado es negativo...");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        }
        */
        
        //ejercicio3: Leer numeros hasta que se introduzca un 0. para cada numero ingresado indicar si es par o impar. 
        
        /*
        Scanner entrada = new Scanner(System.in);
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero diferente de 0: "));
        
        while (num != 0){
            if (num % 2 == 0){
                JOptionPane.showMessageDialog(null,"El numero ingresado es par...");
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero ingresado es impar...");
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero diferente de o: "));
        }
        */
        
        //ejercicio 5: pedir numeros hasta que se teclee un negativo, mostrar cuantos numeros se han introducido.
        
        /*
        Scanner entrada = new Scanner(System.in);
        int num, contador = 0;
        
        System.out.print("Ingresa un numero: ");
        num = entrada.nextInt();
        
        while (num > 0){
            contador++;
            System.out.println("Se ha introducido el numero "+ num+" y se han introducido "+contador+" numeros.");
            
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
        }
        */
        //ejercicio 5: Relaizar un juego donde se genere un numero aleatorio  y luego intetar adivinarlo. el sistema le ndica si el debes ingresar un numero mas grande o pequeño
        
        /*
        int num_aleatorio,num, contador = 1;
        
        num_aleatorio = (int) (Math.random() * 101);
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
                
        
        while(num_aleatorio != num ){
            contador ++;
            
            if (num > num_aleatorio){
                System.out.println("Upss te pasaste...");
            }
            else {
                System.out.println("Intenta con un numero mas  grande...");
            }
            num =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));            
        }
        JOptionPane.showMessageDialog(null,"Acertaste el numero  "+num_aleatorio+ " luego de "+contador+" intentos...");
        */
        
        //ejercicio 6: pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
        /*
        int num, sum = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero diferente de 0: "));
        // esta mal hecho con do while... 
        do {
            sum += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero diferente de 0: "));
        }while(num != 0);
        
        System.out.println("La suma de todos los numeros ingresados es: "+sum);
        */
                
        //ejecicio 7: pedir nmeros hasta que se introdcuzca uno negatio y calcular la media 
        
        /*
        int num, contador = 1,sum = 0;
        float promedio = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while (num > 0){
            contador++;
            sum += num;
            
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        }
        promedio = (sum / (contador - 1)) ;
        
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
        */
        //ejercicio 8: pedir un numero N y mostrar todos los numeros del 1 a N
        
        /*
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
        */
        //ejercicio 9: escribir los numeros del 100 al 0 de 7 en 7
        
        /*
        for (int i = 100; i >= 0; i-=7){
            System.out.println(i);
        }
        */
        // ejercicio 10: pedir 10 numeros y escribri la suma total
        
        /*
        Scanner entrada = new Scanner(System.in);
        int sum = 0,num;
        
        for(int i = 1; i  <= 10; i++){
            System.out.print("Numero "+ i+" : ");
            num = entrada.nextInt();
            
            sum += num;
        }
        
        System.out.println("La suma de los numeros ingresados es: "+ sum);
        */
        //Ejercicio 11: mostrar el producto de los 10 primeros numeros impares
        
        /*
        int producto = 1, contador = 1;
        
        for (int i = 1; contador  <= 10; i++){
            if (i % 2 != 0 ){
                System.out.println(contador+": El numero "+ i+" es impar");
                producto *= i;
                contador ++;
            }
        }
        System.out.println("El producto de los 10 primeros numeros impares es: "+producto);
        */
        //ejercicio 12: calcular el factorial de un numero ingresado
        
        /*
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        int factorial = num;
        
        for (int i = (num-1);i >= 1;i--){
            factorial *=  i;
        }
        System.out.println("El  factorial es: "+factorial);
        */
        //Ejercicio 13: pedir 10 numeros calcular la media de los numeros positivos, negativos y cantidad de ceros
        
        /*
        int  cont_p = 0,cont_n = 0,cont_general = 0, contador_cero = 0;
        float num,sum_p = 0,sum_n = 0;
        float med_p,med_n;
        
        do{
            num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
            cont_general++;
       
            if (num > 0){
                sum_p += num;
                cont_p++;
            }
            if (num < 0){
                sum_n += num;
                cont_n++;
            }
            
            if (num == 0){
                contador_cero++;
            }
            
            System.out.println(cont_general+": Numero "+ num);
        }while(cont_general < 10); 
        
        med_p = sum_p / cont_p;
        med_n = sum_n / cont_n;
        
        System.out.println("La media de los numeros positivos es: "+med_p);
        System.out.println("La media de los numeros negativos es: "+med_n);
        System.out.println("La cantidad de ceros ingresados es: "+contador_cero);
        */
        //Ejercicio 14: pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000
        
        /*
        float sueldo, sum = 0;
        int cont = 0;
        
        for (int i = 1; i <= 10;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
            System.out.println(i+": Sueldo: "+sueldo);
            
            sum += sueldo;
            
            if (sueldo > 1000){
                cont++;
            }
        }
        
        System.out.println("La suma de todos los sueldos da como resultado: "+sum);
        System.out.println("La cantidad de sueldos mayores a 1000 es de: "+cont);
        
        */
        
        //ejercicio 15: dadas las edades de 5 alumnos, mostrar la media de edad y estatura.. la cantidad de alumnos mayores de 18 cuantos miden mas de 1.75
        
        /*
        int cont_edad = 0,cont_estatura = 0;
        float media_edad = 0,media_estatura = 0, estatura, sum_estatura = 0, edad,sum_edad = 0;
        
        for (int i = 1; i <= 5; i++ ){
            edad = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la edad del alumno "+i+": "));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la estatura del alumno "+i+": "));
            
            System.out.println(i+": edad = "+edad+" y estatura = "+estatura);
            
            if (edad > 18){
                cont_edad++;
            }            
            if (estatura > 1.75){
                cont_estatura++;
            }
            
           sum_edad += edad;
           sum_estatura += estatura; 
            
        }
        media_edad = sum_edad / 5;
        media_estatura = sum_estatura / 5;
        
        System.out.println("\n La media de edades es igual a "+media_edad);
        System.out.println("La media de estaturas es igual a "+media_estatura);
        System.out.println("La cantidad de personas mayores a 18 es igual a "+cont_edad);
        System.out.println("La cantidad de personas con estatura mayor a 1.75 es igual a "+cont_estatura);
        */
        // ejercicio 16: pedir un numero entre 0 y 10 y mostrar la tabla de multiplicar de dicho numero
        
        /*
        int num,multiplicacion;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entre 0 y 10: "));
        
        if (num > 0 && num <= 10){
            for (int i = 0; i < 11; i++){
                multiplicacion = num * i;
                System.out.println(num+" x "+i+" = "+multiplicacion);
            }
        }
        else {
            System.out.println("El numero que aca de ingresar se encuentra por fuera del rango permitido...");
         */
          // mostrar las tablas de multiplicar del 1 al 10
          
          /*
          int multi;
          
          for (int i = 1; i <=10;i++){
              for (int j = 1; j <= 10; j++){
                   multi = j * i;
                   
                   System.out.println(i+" x "+j+" = "+multi);
              }
              System.out.println("\n");
        }
         */ 
        //ejercicio 17: pedir codigo de un articulo, la cantidad vendida en litros y el precio por litro.. se pide facturacion total, cantidad en litros vendidos del articulo 1 y cantidad de facturas en mas de 600
        
        /*
        int codigo, cant_litros,precio_litro, sum_total = 0, sum_litros = 0,v_grande = 0, cont = 0;
        
        for (int i = 1; i <= 5; i++){
            codigo =Integer.parseInt(JOptionPane.showInputDialog("Articulo "+i+"\nIngrese el codigo del producto: "));
            cant_litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo "+i+" \nIngrese la cantidad de litros a vender: "));
            precio_litro = Integer.parseInt(JOptionPane.showInputDialog("Articulo "+i+"\nIngrese el precio del litro: "));
            
            sum_total += (cant_litros * precio_litro);
            sum_litros += cant_litros;
            
            if (codigo == 1){
                cont++;
            }
            
            if (cant_litros * precio_litro > 600){
                v_grande++;
            }
                       
        }
        
        System.out.println("La facturacion total fue de: "+ sum_total);
        System.out.println("La cantidad de litros vendidos es de: "+ sum_litros);
        System.out.println("El articulo 1 fue vendido en "+cont+" ocasion.");
        System.out.println("El numero de facturas que superan los 600 es: "+v_grande);
        
        */
        
        // hacer una modificacion al ejercicio anterior. solo existen 3 productos con precios 
        //1. 0.6$ litro
        //2. 3$ litro
        //1.25$ litro
        // pedir codigo de un articulo, la cantidad vendida en litros y el precio por litro.. se pide facturacion total, cantidad en litros vendidos del articulo 1 y cantidad de facturas en mas de 600
        
        /*
        int articulo, cant_vendida,cont = 0,v_grande = 0;
        float sum_total = 0, total;
        
        for (int i = 1; i <= 5; i++){
            total = 0;
            articulo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+" \nIngrese el codigo del articulo: "));
            cant_vendida = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nIngrese la cantidad de litros vendidos: "));
            
            if (articulo == 1){
                sum_total += cant_vendida * 0.6;
                cont++;
                
                total = (float) (cant_vendida * 0.6);
            }
            if (articulo == 2){
                sum_total += cant_vendida * 2.3;
                total = (float) (cant_vendida * 2.3);
            }
            if (articulo == 3){
                sum_total += cant_vendida * 1.25;
                total = (float) (cant_vendida * 1.25);
            }
           
            
            if (total > 600){
                v_grande++;
            }
            
            System.out.println("Producto "+articulo+" litros vendidos "+ cant_vendida+" el total a pagar es de "+total);
            
        }
            System.out.println("El total a facturar: "+sum_total);
            System.out.println("La cantidad de articulos del producto 1 vendidos fue: "+cont);
            System.out.println("Las facturas en mas de 600 son "+v_grande);
        */
                
         //ejercicio 19: dadas 6 notas escribit la cantidad de alumnos aprobados, condicionados y reprobados
         /*
         float nota;
         int aprobado = 0,reprobado = 0,condicionado = 0;
         
         for (int i = 1; i <= 6; i++){
            nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante N "+i+" : "));
            
            if (nota < 2.5){
               reprobado++;
            }
            else if (nota >= 2.5 && nota < 3.0){
                condicionado++;
            }
            else if (nota >= 3.0 && nota <= 5.0){
                aprobado++;
            }
            else {
                System.out.println("El valor ingresado no es valido..");
            }
             System.out.println("La nota "+i+" es igual a: "+nota);
         }
         System.out.println("La cantidad de estudiantes reprobados es de: "+reprobado);
         System.out.println("La cantidad de estudiantes condicionados es de: "+condicionado);
         System.out.println("La cantidad de estudiantes aprobados es de: "+aprobado);
         */
         //ejercicio 20: pedir un numero n e introducir n sueldos y mostrar el sueldo maximo.
         /*
         int n;
         float mayor = 0, sueldo;
         
         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a ingresar: "));
         
         
         while (n >= 1){
             sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a ingresar: "));
             System.out.println(n+" sueldo: "+sueldo);
             if (sueldo > mayor){
                 mayor = sueldo;
             }
             n--;             
         }
         System.out.println("\nEl sueldo mayor ingresado es de: "+mayor);
         
         */
         //ejercicio 21: pedir 10 numeros e indicar si se inrtodujo un negativo con booleanos 
         
         int num;
         boolean verificar = true;
         
         for (int i = 1; i <= 10;i++){
             num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
             System.out.println("Numero "+i+" es: "+num);
             
             if (num < 0){
                 verificar = false;
             }             
         }
         if (verificar != true){
             System.out.println("Si se ingreso un numero negativo: ");
         }
         else {
             System.out.println("No se han ingresado numeros negativos");
         }
         
         
    }
    
}
