
package ordenamientos;


public class Ordenamientos {

    public static void main(String[] args) {
        
        System.out.println("asda");
        int[] lista = {4,5,2,1,3};
        int apoyo = 0;
        
        for (int i = 0; i < 4; i++){
            for (int j = i+1; j < 5; j++){
                if (lista[i] > lista[j]){
                    apoyo = lista[i];
                    lista[i] = lista[j]; 
                    lista[j] = apoyo;
                }
                 System.out.print( lista[i] + "- ");
            }
           
        }
        
        System.out.println("Lista ordenda65");
        for (int i=0; i < 5; i++){
            System.out.println(lista[i]);
        }
    }
    
}
