/*
definir los atributos de un triangulo isoceles. Para ello defina loa atributos necesarios que se requieren
, proporcine los metodos de consulta, un metodo constructor e implemente metodos para calcilar el permitero
y el area de un triangulo, ademas de implementar un metodo que a partir de un arreglo de triangulos devuleva el area del 
triangulo de mayor superficie 
*/

package Ejercicio_5;


public class triangulo {
    private double base;
    private double lado;

    public triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtener_perimetro(){
        double perimetro = 2 * lado + base;
        return perimetro;
    }
    
    public double obtener_area(){
        double area = (base * Math.sqrt((lado * lado) - (base * base) / 4)) / 2;
        return area;
    }
    
}
