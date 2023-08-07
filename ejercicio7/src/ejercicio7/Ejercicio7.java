
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        double a =5, b = -20, c = 15, x1,x2;
        
        x1 = (-(b) + Math.sqrt((Math.pow(b, 2)) - 4 * (a *c))) / (2* a);
        x2 = (-(b) - Math.sqrt((Math.pow(b, 2)) - 4 * (a * c))) / (2 * a);
            
        System.out.println("El resultado de esta raiz de segundo grado es igual x1 = "+x1+" y el valor de x2 = "+x2);
       
    }
    
}
