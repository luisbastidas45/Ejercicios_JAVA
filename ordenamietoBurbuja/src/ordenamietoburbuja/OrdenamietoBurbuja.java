
package ordenamietoburbuja;

public class OrdenamietoBurbuja {


    public static void main(String[] args) {
        
        int[] lista = {5,2,4,3,6,1};
        int apoyo;
        
        
        
        for (int i = 0; i < 5; i++){
            for (int j = i+1; j < 6; j++){
                if (lista[i] < lista[j]){
                    apoyo = lista[i];
                    lista[i] = lista[j];
                    lista[j] = apoyo;
                }
            }
            
        }
 
        System.out.println("lista ordenada");
        for (int i = 0; i < 6; i++){
            System.out.print (lista[i]+" ");
        }
        
        //proximo video 53
    }
    
}
