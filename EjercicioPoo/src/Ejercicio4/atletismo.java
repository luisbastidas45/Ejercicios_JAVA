/*
construir un programa para una competencia de atletismo, el programa debe gestionar 
una serie de atletas caracterizads por su numero de atleta, nombre y tiempo de carrera
al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
package Ejercicio4;

public class atletismo {
    //atributos
    private int numAtleta;
    private String nombreAtleta;
    private float tiempoAtleta;
    
    //metodos

    public atletismo(int numAtleta, String nombreAtleta, float tiempoAtleta) {
        this.numAtleta = numAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoAtleta = tiempoAtleta;
    }

    public float getTiempoAtleta() {
        return tiempoAtleta;
    }
    
    public String mostrarResultado(){
        return "El ganador de la carrera es:"+"\n"+"El N°de atleta es:  "+numAtleta+"\n"+"El nombre del atleta es: "+nombreAtleta+"\n"+"El tiempo empleado de carrare es: "+tiempoAtleta;
    }
}
