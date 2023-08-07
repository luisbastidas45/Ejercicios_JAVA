
package ciclos;

import java.util.Scanner;

/* la estructura del ciclo while es la siguiente

  //por su parte este ciclo para ejecutarse depende de si se cumple o no la condicion
    
while (condicion){
    Istruccion;
}


// estructura del do while 

ciclo do while //este ciclo se ejecuta al menos 1 vez independientemente de la condicion (se ejecuta 1 vez asi la condicion no se cumpla)

do {
    Instrucciones;
}while(condicion);


// estructura del ciclo for
//este se usa cuando conocemos de antemano la cantidad de iteraciones que deben realizar

for (inicializacion;; condicion; aumente o decremento){
    instruccion;
}

*/


public class Ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        // ejemplo de while
        
        /*
        int  num = 1,contador;
        
        
        System.out.print(" Ingrese cuantos numeros desea imprimir: ");
        contador = entrada.nextInt();
        
                
        while(num <= contador){
            System.out.println(num);
            num += 1;
        }

        */
        
        
        //ejemplo con do while
        //primero ejecuta luego evalua la condicion
        
        /*
        int num = 1;
        
        do {
            System.out.println(num);
            num++;
        }while(num <= 10);
        
        */
        //ejemplo con el ciclo for 
        
        int num = 10;
        
        for (int i = 5;i <= num; i++){
            System.out.println("El numero es: "+i);
        }
    }
    
}
