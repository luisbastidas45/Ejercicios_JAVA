package ClasesObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //metodo

    public static void main(String[] args){
        Coche coche1 = new Coche();
        
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("El coche1 tiene "+coche1.km+" kilometros");
        
        //siguiente video 62
        
    }
}
