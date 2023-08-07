package ClasesObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //atributos

  
    
    //metodos
    
    //metodo para pedir al usuario que me dijete 2 numeros 

    
    //metodo para sumar ambos numeros
    public  int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    //metodo para restar ambos numeros
    public  int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    //metodo para maltiplicar los numeros
    public  int multiplicar(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    //metodo para dividir los numeros
    public  int dividir(int num1, int num2){
        int division = num1 / num2;
        return division;
    }
    //metodo para mostrar los numeros
    public void mostrar_resultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
    //metodo para probar el retorono de valor
    public int suma2 (int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
