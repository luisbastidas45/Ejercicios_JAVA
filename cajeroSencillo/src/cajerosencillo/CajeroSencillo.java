
package cajerosencillo;

import javax.swing.JOptionPane;


public class CajeroSencillo {

    public static void main(String[] args) {
        //Cajero con saldo inicial de 1000 dolares, con el menu
        //1. Ingresar dinero a la cuenta
        //2. Retirar dinero de la cuenta
        //3. salir
        
        final int saldo = 1000;
        int opcion;
        float movimiento,saldo_actual;
               
        opcion = Integer.parseInt(JOptionPane.showInputDialog(" \t Selecciona la opcion que deseas realizar \t \n 1. Ingresar dinero a la cuenta \n 2. retirar dinero de la cuenta \n 3. salir"));
        
        switch (opcion){
            case 1: movimiento = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas ingresar: "));
            saldo_actual = movimiento + saldo;
            JOptionPane.showMessageDialog(null, "El nuevo saldo en la cuenta es de: "+saldo_actual);
            break;
            case 2: movimiento = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas retirar de la cuenta: "));
            if (movimiento <= saldo){
                saldo_actual = saldo - movimiento;
                JOptionPane.showMessageDialog(null,"El nuevo saldo en la cuenta es de: "+saldo_actual);
            }
            else {
                JOptionPane.showMessageDialog(null,"El cajero no cuenta con la cantidad de dinero solicitada...");
            }
            
            break;
            case 3: JOptionPane.showMessageDialog(null,"\t Ha seleccionado la opcion salir\t \n Hasta una proxima ocasion :) ");
            break;
            default: JOptionPane.showMessageDialog(null,"Has seleccionado una opcion no valida...");
            break;
    }
    
}
    
}
