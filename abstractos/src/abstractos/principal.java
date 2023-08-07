
package abstractos;


public class principal {
    public static void main(String[] args){
        // no puyedo crear objetos de SerVivo porque es abstracto 
        Planta planta = new Planta();
        AnimalHervivoro animal = new AnimalHervivoro(); 
        
        
        planta.alimentarse();
        animal.alimentarse();
    }
}
