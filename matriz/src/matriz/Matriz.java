
package matriz;

import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        //declarar una matriz manual mente
        /*
        int matriz[][] = { {1,2,3}, {2,4,5}, {3,6,9}}; // cada 3 numeros representan una fila
        
        for (int i = 0; i < 3; i++ ){ // numero de filas
            for (int j = 0; j < 3; j++){ // numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        */
        
        //declarar una matriz por teclado
        
        int matriz[][],nFilas,nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("\tIngrese el numero de filas de la matriz\t"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("\tIngrese el numero de columnas de la matriz\t"));
        
        matriz = new int[nFilas][nColumnas];
        
        //llenar la matriz
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"\tIngrese un numero\t"));
            }
        }
        
        //mostrar la matriz
        
        for (int i = 0; i  < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
