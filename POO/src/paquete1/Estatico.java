
package paquete1;

public class Estatico {
    //atributo 
    
    private static String frase = "primera frase";
    
    public static void main (String[] args){
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }
}
