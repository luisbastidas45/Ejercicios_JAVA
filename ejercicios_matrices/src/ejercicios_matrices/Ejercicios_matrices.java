
package ejercicios_matrices;

import javax.swing.JOptionPane;

public class Ejercicios_matrices {

    public static void main(String[] args) {
        //ejercicio1: Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no
        
        /*
        Una matriz es simetrica cuando:
            * cuando es una matriz cuadrada (nfilas = nColumnas)
            * Cuando se obtiene la misma matriz al cambiar sus filas por sus columnas 
        */
       
        /*
        int matriz[][],nFilas,nColumnas;
        boolean  simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz"));
        
        matriz = new int[nFilas][nColumnas];
        
        //llenar la matriz
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j< nColumnas; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"Ingrese un numero: "));
            }
        }
        
        if (nFilas == nColumnas){ //primer condicion,  filas = columnas
            int i = 0, j;
            while ((i < nFilas) && (simetrica == true)){
                j = 0;
                while ((j < nColumnas) && (simetrica == true)){
                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            
            if (simetrica == true){
                JOptionPane.showMessageDialog(null,"La matriz si es simetrica");
            }
            else{
                JOptionPane.showMessageDialog(null,"la matriz no es simetrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }
        
        */
        
        //Ejercicio2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
        /*
        int matriz1[][], matriz2[][], matriz3[][],nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz"));
        
        matriz1 = new int[nFilas][nColumnas];
        matriz2 = new int[nFilas][nColumnas];
        matriz3 = new int[nFilas][nColumnas];
        
        //llenado de la primer matriz
        for (int i = 0; i < nFilas; i++){
            for (int  j = 0; j < nColumnas; j++){
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("\tllenado de la primer matriz\t"+"\n"+"Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"Ingrese un numero: "));
            }
        }
        
        //llenado de la segunda matriz
        for (int i = 0; i < nFilas; i++){
            for (int  j = 0; j < nColumnas; j++){
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("\tllenado de la segunda matriz\t"+"\n"+"Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"Ingrese un numero: "));
            }
        }
        
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("\tResultado de la matriz sumada\t");
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                System.out.print(matriz3[i][j]);
            }
            System.out.print("\n");
        }
        */
        
        //Ejercicio3 Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
        /*
        int nFilas = 3;
        int nColumnas = 3;
        
        int matriz[][] = new int[nFilas][nColumnas];
        
        //llenado de la matriz
        for (int i = 0; i  < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"Ingrese un numero: "));
            }
        }
        
        System.out.println("\tMatriz Original\n");
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        int apoyo;
        
        for (int i = 0; i < nFilas ; i++){
            for (int j = 0; j < i ; j++){
                apoyo = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = apoyo;
            }
        }
        System.out.println("\tMatriz transpuesta\t");
                for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++ ){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        */
                
        //Ejercicio 4: crear una matriz de tamaño 7x7.. rellenarala de forma que los elementos de la diagonal principal sean 1 y el resto cero
        /*
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        //mostrar matriz
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\tmatriz dos\t");
        
        int cont = 6;
        for (int i = 0; i < 7; i++){
            for (int j = 6; j >= 0; j--){
                 if (cont == j){
                     matriz[j][i] = 1;
                 }
                 else{
                     matriz[j][i] = 0;
                 }
            }
            cont--;
        }
        
        //mostrar matriz
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        */
                
        //Ejercicio 5: cerar y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna
        /*
        int matriz[][], nFilas, nColumnas;


        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz"));
    
        int[] sumaFila = new int[nFilas];
        int[] sumaColumna = new int[nColumnas];
        
        matriz = new int[nFilas][nColumnas];
        
        //llenar la matriz
        for (int i = 0; i< nFilas; i++){
            for (int j =0; j < nColumnas; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Fila: "+(i+1)+"\n"+"Columna: "+(j+1)+"\n"+"Ingrese un numero: "));
            }
        }

        
        //sumas filas 
        for (int i = 0; i < nFilas; i++){

            for (int j = 0; j < nColumnas; j++){
                 sumaFila[i] += matriz[i][j];
                 sumaColumna[j] += matriz[i][j];
            }

        }
        
        //resultado suma filas
        for (int i = 0; i < sumaFila.length; i++){
            System.out.println("fila: "+i+" = "+sumaFila[i]);
        }
        
        //resltado suma columnas
        for (int i = 0; i < sumaColumna.length; i++){
            System.out.println("Columna "+i+" = "+sumaColumna[i]);
        }
        
        //mostrar matriz
        System.out.println("\tMatriz\t");
        for (int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        */
        
        //ejercicio 6: utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.
        
        /*
        int num1 = 5; //filas
        int num2 = 9; //columnas
        int matriz1[][] = {{1,2,3,4,5,6,7,8,9},{9,8,7,4,6,5,1,2,3},{3,5,4,7,8,9,6,1,4},{3,4,8,5,2,9,7,4,1},{1,6,8,9,4,2,3,6,4}};
        int matriz2[][] = new int[num2][num1];
        
        System.out.println("\tMatriz Original\t");
        for (int i = 0; i < num1; i++){
            for (int j = 0; j < num2; j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        for (int i = 0; i < num2; i++){
            for (int j = 0; j < num1; j++ ){
                matriz2[i][j] =  matriz1[j][i];
            }
        }
        
        
         System.out.println("\tMatriz transpuesta\t");
        for (int i = 0; i < num2; i++){
            for (int j = 0; j < num1; j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.print("\n");
        }
        */     
        //Ejercicio7: crear una matriz de tamaño 5x5  todos sus elementos deben ser cero a exepcion de los bordes
        
        int matriz[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i  == 0 || i == 4){
                    matriz[i][j] = 1;
                }
                else if ( j  == 0 || j == 4){
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        // mostrar la matriz
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        //proximo video 61
    }
    
}
