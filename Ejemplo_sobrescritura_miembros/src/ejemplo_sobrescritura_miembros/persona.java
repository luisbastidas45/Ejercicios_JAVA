
package ejemplo_sobrescritura_miembros;


public class persona extends Animal {
    
    @Override 
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
