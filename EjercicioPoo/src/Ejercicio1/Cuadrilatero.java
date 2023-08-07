/*
Construir un programa que calcule el area y el perimetro de un cuadrilatero dada 
la longitud de sus dos lados. Los valores de la longitud deberan
entroducirse por linea de ordenes. Si es un cuadrado, solo se proporcionara la longitud 
de uno de los lados al constructor
*/
package Ejercicio1;


public class Cuadrilatero {
    // atributos
    private float lado1;
    private float lado2;
    
    //metodos construtor 1 (cuadrilatero "lados diferentes")
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //metodo constructor 2 (cuadrado "lados iguales")
    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1; //se coloca manual
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
 
    
    

    
}
