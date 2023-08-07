/*
Construir un programa para trabajar con 2 numeros complejos, implemente el siguiente menu.
1. Sumar dos numeros complejos
2. Multiplicar dos numeros complejos
3. Comparar 2 numeros complejos (iguales o no)
4. Multiplicar un numero complejo por un numero entero. 
*/
package Ejercicio6;


public class numeros {
    private double real;
    private double imag;

    //constructor sin parametros
    public numeros() {
 
    }
    
    //conatructor con parametros
    public numeros(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    
    
    public numeros sumar(numeros a, numeros b){
        numeros  aux = new numeros();
        
        aux.real = a.real + b.real;
        aux.imag = a.imag + b.imag;
                
        return aux;        
    }

    public numeros multiplicar(numeros a, numeros b){
        numeros aux =  new numeros();
        
        aux.real = (a.real * b.real) - (a.imag * b.imag);
        aux.imag = (a.real * b.imag) + (b.real * a.imag);
        
        return aux;
    }
    
    public boolean  igual (numeros a, numeros b){
        boolean resultado = false;
        
        if (a.real == b.real && a.imag == b.imag){
        resultado = true;
    }
        return resultado;
    }

}
    

