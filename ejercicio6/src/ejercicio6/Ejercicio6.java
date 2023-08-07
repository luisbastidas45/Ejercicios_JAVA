
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero total de horas: ");
        int num = entrada.nextInt();
        
        int semana = num / 168; //128 sale de multiplicar 24 horas por 7 dias
        int dia = (num - (semana * 168))/24; // a las horas que ingresaron le vamos a restar el valor de las semanas dando como resultado, las horas sobrantes y ahora las dividimos entre 24 para calcular los dias
        float hora = (num - (semana * 168) - (dia * 24)); //como necesitamos conocer cuantas horas nos quedan simplemente a las horas ingresadas le borramos las semanas, los dias y da como resultado el sobrante de estas
         
        System.out.println("La cantidad de horas ingresada "+num+" es igual a "+semana+" semana(s)");
        System.out.println("La cantidad de horas ingresada "+num+" es igual a "+dia+" dia(s)");
        System.out.println("La cantidad de horas ingresada "+num+" es igual a "+hora+" hora(s)");
        
        
    }
    
}
