
package condicionales;

import javax.swing.JOptionPane;


public class Condicionales {

    public static void main(String[] args) {
        /*
        //Estructura basica
       int numero, dato = 5;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       if(numero == dato){
          JOptionPane.showMessageDialog(null, "El numero es igual...");
       }
       else {
           JOptionPane.showMessageDialog(null, "El numero es diferente...");
       }
       */
       
        //Condicionales mulltiples switch
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre 1 y 5: "));
            
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "El numero ingresado es 1...");
                        break;
            case 2: JOptionPane.showMessageDialog(null,"El numero ingresado es 2...");
                        break;
            case 3: JOptionPane.showMessageDialog(null,"El numero ingresado es 3...");
                        break;
            case 4: JOptionPane.showMessageDialog(null,"El numero ingresado es 4...");
                        break;
            case 5: JOptionPane.showMessageDialog(null, "El numero ingresado es 5...");
                        break;
            default: JOptionPane.showMessageDialog(null, "El numero que acabas de ingresar se encuentra por fuera del rango definido..");
                        break;
                      
        }
     
    }    
}


