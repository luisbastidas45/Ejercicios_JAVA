
package Ejercicio1;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args){
        Cuadrilatero c1; //creamos el objeto pero no lo inicializamos 
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("introduce el valor de uno de los lados: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de otro de los lados: "));
        
        if (lado1 == lado2){ //es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else{ // es un cuadrilatero
            c1 = new Cuadrilatero(lado1,lado2);
        }
        
        System.out.println("El perimetro es igual a: "+c1.getPerimetro());
        System.out.println("El area es igual a: "+c1.getArea());
    }
        
}
