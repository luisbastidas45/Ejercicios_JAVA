
package busquedasecuencial;

import javax.swing.JOptionPane;


public class BusquedaSecuencial {

  
    public static void main(String[] args) {
        int[] arreglo = {7,9,2,6,3,8};
        int pos = 0,i = 0,num;
        boolean comprobar = false;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero que deseas buscar: "));
        
        while((i < 5) && (comprobar == false)){
            if (arreglo[i] == num){
                pos = i;
                comprobar = true;
            }
            i++;
        }
        
        if (comprobar == false){
            System.out.println("El numero que estas buscando no se encuentra en el arreglo..");
        }
        else {
            System.out.println("El numero ingresado si se encuentra en el arreglo en la posicon: "+pos);
        }
        
        // siguiente video 56
    }
    
}
