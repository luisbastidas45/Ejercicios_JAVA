
package Herencia;


public class Estudiante extends persona{
    private int codigoEstudiante;
    private float notaFinal;
    
   public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
       super(nombre, apellido, edad);
       this.codigoEstudiante = codigoEstudiante;
       this.notaFinal = notaFinal;
   } 
   
   public void mostrarDatos(){
       System.out.println("El nombre del estudiante es: "+getNombre());
       System.out.println("El apellido del estudiante es: "+getApellido());
       System.out.println("La edad del estudiante es: "+getEdad());
       System.out.println("El codigo del estudiate es: "+codigoEstudiante);
       System.out.println("La nota final del estudiante es: "+notaFinal);
   }
}
        