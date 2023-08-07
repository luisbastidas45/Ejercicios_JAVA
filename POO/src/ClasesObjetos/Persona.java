
package ClasesObjetos;


public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos
    
    //Metodo constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){        
        System.out.println("soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+ edad);
    }

}
