
package ventana;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana2 extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaDeTexto;
    private JButton boton;
    
    public ventana2() {
        setBounds(50,50,500,500); //posicion y tamaño de la ventana
        setLocationRelativeTo(null);
        setTitle("Eventos"); //titulo de la ventana
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30,10,200,30);
        etiqueta.setFont(new Font("cooper black",Font.BOLD,18));
        panel.add(etiqueta);
    }
    
    private void colocarCajaDeTexto(){
        cajaDeTexto = new JTextField();
        cajaDeTexto.setBounds(30,50,300,30);
        panel.add(cajaDeTexto);
    }
    
    private void colocarBoton(){
        boton = new JButton("¡Pulsa Aqui !");
        boton.setBounds(150,100,150,40);
        boton.setFont(new Font("arial",Font.BOLD,15));
        panel.add(boton);
        
        saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
        
        //Agregando evento de tipo ActionListener // que algo suceda cuando precione el boton
        ActionListener  oyenteDeAccion = new ActionListener(){ //crear un objeto 
            
            
        
        @Override //para implementar el actionListener tiene que ser abstracto 
        public void actionPerformed (ActionEvent ae){  // esto sucedera cuando se de click al boton
            saludo.setText("Hola "+cajaDeTexto.getText());
        }
    };
    boton.addActionListener(oyenteDeAccion); //
}
}
