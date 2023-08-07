/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero
y actualice su posicion dentro del mismo. Los movimientos posibles son ARRIBA,ABAJO, IQUIERDA y DERECHA
TRas cada movimiento el programa mostrara la nueva direccion elegida y las coordenadas 
de situacion del objeto dentro del tablero.
*/
package Ejercicio2;


public class movimiento {
    
        //atributos 
        private int coordenadaX;
        private int coordenadaY;
        
        int val1, val2;
        int[] posicion = {val1,val2};
        
        //metodos 

    public movimiento(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
        
    public int[] getMoverArriba(){
        int arriba = coordenadaY + 1;
        posicion[0] = coordenadaX;
        posicion[1] = arriba;
        return posicion;
    }
    
    public int[] getMoverAbajo(){
        int abajo = coordenadaY - 1;
        posicion[0] = coordenadaX;
        posicion[1] = abajo;
        return posicion;
    }
    
    public int[] getMoverIzquierda(){
        int izquierda = coordenadaX - 1;
        posicion[0] = izquierda;
        posicion[1] = coordenadaY;
        return posicion;
    }
    
    public int[] getMoverDerecha(){
        int derecha = coordenadaX + 1;
        posicion[0] = derecha;
        posicion[1] = coordenadaY;
        return posicion;
    }
    
    public void getMostrar(){
        System.out.println("La posicion en X es: "+coordenadaX);
        System.out.println("La posicion en Y es: "+coordenadaY);
    }
        
    
}
