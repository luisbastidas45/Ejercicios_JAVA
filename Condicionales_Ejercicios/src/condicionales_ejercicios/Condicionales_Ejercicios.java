
package condicionales_ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Condicionales_Ejercicios {

  
    public static void main(String[] args) {
        
        /*
       //ejercicio 1: leer un numero mostrar si es multiplo de 10
             
       int numero;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 10: "));
       
      
         if (numero % 10 == 0){
             JOptionPane.showMessageDialog(null,"El numero que se ha ingresado si es multiplo de 10...");
         }
         else {
             JOptionPane.showMessageDialog(null,"El numero ingresado no es multiplo de 10... ");
         }

         */
        
        /*
        // ejercicio2: pedir dos numeros y decir cual es el mayor o si son iguales..
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:  "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero:  "));
        
        if (num1 == num2){
            JOptionPane.showMessageDialog(null, "Los numeros ingresados son iguales...");
        }
        else {
            if (num1 > num2){
                JOptionPane.showMessageDialog(null,"El numero mayor que ingresaste es: "+num1);
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero mayor que ingresaste es: "+num2);
            }
        }
        */
        
        /*
        // ejercicio3: leer un caracter y comprobar si es una letra mayuscula
        char letra;
        
        letra = JOptionPane.showInputDialog("ingrese un caracter: ").charAt(0);
        
        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null,"El caracter que ha sido ingresado si corresponde a una mayuscula....");
        }
        else {
            JOptionPane.showMessageDialog(null,"el caracter ingresado corresponde a una letra minuscula...");
        }
        
        */
        
        /*
        //ejercicio4: calcular cuanto paga una persona que ha hecho una compra superor a 300 si tiene 20% de descuento
        
        float pago,total;
        
        pago = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la compra: "));
        
        if (pago > 300){
            total = (float) (pago - (pago * (20.0 / 100)));
            JOptionPane.showMessageDialog(null,"Felicidades !!! su valor a pagar es de: "+total);
        }
        else {
            JOptionPane.showMessageDialog(null,"El valor a pagar es de: "+pago);
        }
        */
        
        /*
        //calcular el salario de un obrero. si trabaja 40 horas o menos se le paga 16 por hora
        //si trabaja mas de 40 horas se le paga 16 por las 40 horas y 20 por cada hora extra
       
        int hora, pago;
        
        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas laboradas por el obrero: "));
        
        if (hora <= 40){
            pago = hora * 16;
        }
        else {
            pago = (40 * 16)+((hora - 40) *  20);
        }
        
        JOptionPane.showMessageDialog(null, "Se debe pagar al obrero: "+pago);
        */
        
        /*
        //leer dos numeros e imprimir si ambos son pares o impares
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        if (num1 % 2 == 0 && num2 % 2 == 0){
            JOptionPane.showMessageDialog(null, "Los dos numeros ingresados son pares");
        }
        else {
            if(num1 % 2 == 0 && num2 % 2 != 0){
                JOptionPane.showMessageDialog(null,"El primer numero ingresado es par y el segundo numero impar...");
            }
            if(num1 % 2 != 0 && num2 % 2 == 0){
                JOptionPane.showMessageDialog(null,"El primer numero ingresado es impar y el segundo numero par...");
            }
            if(num1 % 2 != 0 && num2 % 2 != 0){
                JOptionPane.showMessageDialog(null,"Los numeros ingresados son impares...");
            }
            
        }
        
        */
        
        /*
        //pedir 3 numeros y ordenarlos de menor a mayor
        
        int num1,num2,num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero: "));

        //n1 mayor que todos
        if ((num1 > num2) && (num2 > num3)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num1+" "+ num2+" "+ num3);
        }
        else if ((num1 > num3) && (num3 > num2)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num1+" "+ num3+" "+ num2);
        }
        
        //n2 mayor que todos
        else if ((num2 > num1) && (num1 > num3)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num2+" "+ num1+" "+ num3);
        }
        else if ((num2 > num3) && (num3 > num1)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num2+" "+ num3+" "+ num1);
        }
        
        //n3 mayor que todos
         else if ((num3 > num1) && (num1 > num2)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num3+" "+ num1+" "+ num2);
        }
        else if ((num3 > num2) && (num2 > num1)){
            JOptionPane.showMessageDialog(null,"El orden de los nuemeros es: "+ num3+" "+ num2+" "+ num1);
        }
        */
        
        
        /*
        //ejercicio 8: pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene 
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99 999: "));
        
            if (numero >= 0 && numero <= 9 ){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es de 1 cifra...");
            }
            else if (numero >= 10 && numero <= 99){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es de 2 cifra...");
            }
            else if (numero >= 100 && numero <= 999){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es de 3 cifra...");
            }
            else if (numero >= 1000 && numero <= 9999){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es de 4 cifra...");
            }
            else if (numero >= 10000 && numero <= 99999){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es de 5 cifra...");
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero ingresado se encuentra por fuera del rango especificado...");
            }
            
            */
        
            /*
            //ejercicio 9: pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. suponiendoq que todos los meses son de 30 dias 
            
            int dia, mes, año;
            
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
           mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
            año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
            
            if (dia >= 1 && dia <=30){
                if (mes >=1  &&  mes <= 12){
                    if (año != 0){
                        JOptionPane.showMessageDialog(null,"La fecha que has ingresado es valida...");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La fecha ingresada presenta un error en el año...");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"La fecha ingresada presenta un error en el mes...");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"La fecha ingresada presenta un error en el dia...");
            }
            
            */
            
            
            /*
            //ejercicio 10: pedir dia, mes y año e indicar si la fecha es correcta. con meses de 28,30 y 31 dias sin año bisiesto
            
            int dia,mes, año;
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Ingrese el dia: ");
            dia = entrada.nextInt();
            
            System.out.print("Ingrese el mes: ");
            mes = entrada.nextInt();
            
            System.out.print("Ingrese el año: ");
            año = entrada.nextInt();
            
            if (dia >= 1 && dia <=31){
                if (mes >= 1 && mes <= 12){
                    if (año != 0){
                        if (dia == 28 && mes != 2){
                            System.out.println("Error el unico mes que tiene 28 dias es Febrero..");
                        }
                        else if (dia == 30 && ( mes != 4 && mes != 6 && mes != 9 && mes != 11) ){
                            System.out.println("Error los unicos meses que tienen 30 dias son abril (04), julio(06), septiembre (09) y noviembre(11)");
                        }
                        else if (dia == 31&& ( mes != 1 && mes != 2 && mes != 3 && mes != 5 && mes != 7 && mes != 8 && mes != 10 && mes != 12) ){
                            System.out.println("Error este mes no tiene 31 dias...");
                        }
                        else{
                            System.out.println("La fecha imgreesada es correcta...");
                        }
                    }
                    else{
                        System.out.println("La fecha ingresada presenta un error en el año..");
                    }
                }
                else{
                    System.out.println("La fecha ingresada presenta un error en el mes...");
                }
            }
            else{
                System.out.println("La fecha ingresada presenta un error en el dia...");
            }
            
            */
            
            
            /*
            //ejercicio 1: construir una calculadora con las 4 operaciones, indicar la operacion por medio del primer caracter
            
            char oper;
            float suma,resta,multi,divi;
            float num1, num2;
            
            oper = JOptionPane.showInputDialog("Ingresa el tipo de operacion que deseas realizar: ").charAt(0);
            
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            
            if (oper == 'S'|| oper == 's'){                
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es igual a: "+suma);
            }
            else if(oper == 'R' || oper == 'r') {
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es igual a: "+resta);
            }
            else if (oper == 'M' || oper == 'm'){
                multi = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es igual a: "+multi);
            }
            else if (oper == 'D' || oper == 'd'){
                divi = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la divicion es igual a: "+divi);
            }
            else {
                JOptionPane.showMessageDialog(null,"La operacion que se ha indicado no existe o no se encuentra disponible...");
            }
            */
            
            /*
            //ejercicio 12: pedir una nota de 0 a 5 e indicar si es insuficiente, suficiente, bien, notable, sobresaliente
            
            float nota;
            
            nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
            
            if (nota >=0 && nota <=1.0){
                JOptionPane.showMessageDialog(null,"Su nota es insuficiente...");
            }
            else if (nota >=1.1 && nota <=2.9){
                JOptionPane.showMessageDialog(null,"Su nota es suficiente... ");
            }
            else if (nota >= 3.0 && nota <=3.9){
                JOptionPane.showMessageDialog(null,"Su nota es bien...");
            }
             else if (nota >= 4.0 && nota <=4.5){
                JOptionPane.showMessageDialog(null,"Su nota es notable...");
            }
              else if (nota >= 4.6 && nota <=5.0){
                JOptionPane.showMessageDialog(null,"Su nota es sobresaliente...");
            }
            else {
                JOptionPane.showMessageDialog(null,"La nota ingresada es incorrecta...");
            }
            
            */
            //Ejercicio 14: converir kg a otras unidades posibles. mostrar un menu con las opciones posibles.
            int opcion;
            float kg, conversion;
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\t conversion de KG \t \n 1. Tonelada \n 2. Gramo "
                    + "\n 3. Miligramo \n 4. Libra \n 5.  Onza"));
            
            kg = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el valor de KG a convertir: "));            
            switch (opcion){
                case 1: conversion = kg / 1000;
                            JOptionPane.showMessageDialog(null,kg+" Kg convertidos a Toneladas es: "+conversion+ " Toneladas");
                            break;
                            
                case 2: conversion = kg * 1000;
                            JOptionPane.showMessageDialog(null,kg+" Kg convertidos a gramos es:  "+ conversion +" Gramos");
                            break;
                            
                case 3: conversion = kg * 1000000;
                            JOptionPane.showMessageDialog(null,kg+" Kg convertidos a miligramos es:  "+ conversion +" Miligramos");
                            break;
                    
                case 4:conversion = kg * (float)2.205;
                           JOptionPane.showMessageDialog(null,kg+" Kg convertidos a libras es:  "+ conversion +" Libras");
                           break;
                           
                case 5: conversion = kg * (float)35.274;
                           JOptionPane.showMessageDialog(null,kg+" Kg convertidos a onzas  es:  "+ conversion +" Onzas");
                           break;
                    
                 default: JOptionPane.showMessageDialog(null, "La opcion seleccionada no es valida...");
                              break;
            }
            
        }
    }
    

