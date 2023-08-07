
package insercionordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class InsercionOrdenamiento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[], num, pos, apoyo;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos en el arreglo: "));
        
        arreglo = new int[num];
        
        System.out.println("\tRellene el arreglo\t");
        for (int i  = 0; i < num; i++){
            System.out.print((i+1)+": Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Ordenamiento por insercion 
        for (int i = 0; i < num; i++){
            pos = i; 
            apoyo = arreglo[i];
            
            while ((pos > 0) && (arreglo[pos-1] > apoyo)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            
            arreglo[pos] = apoyo;
        }
        
        System.out.println("\n\tElementos ordenados\t");
        for(int i = 0; i < num; i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
