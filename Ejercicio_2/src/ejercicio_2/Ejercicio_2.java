
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de dinero que tine Guillermo: ");
        float N = entrada.nextFloat();
        
        float n2 = N / 2; //esto es lo que tiene luis
        float n3 = (N + n2) / 2; //esto es lo que tiene Juan
        float total = N + n2 +n3;
        System.out.println("La cantidad de dinero de luis es: "+n2);
        System.out.println("La cantidad de dinero de juan es: "+n3);
        System.out.println("La cantidad de dinero entre los tres es de: "+total);
    }
    
}
