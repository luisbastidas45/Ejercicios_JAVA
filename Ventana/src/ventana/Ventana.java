
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Ventana extends JFrame {
    
    public JPanel panel;
    
    public Ventana (){
        //establecemos el tamaño de la ventana
        this.setSize(500,500); //ancho luego largo
         setTitle("Estableciendo el titulo"); //establecer el titulo de la ventana 
        
        //setLocation(500,200); // primero X luego Y
        
       // setBounds(500,200,500,500); //engloba tamaño y posicion de la ventana (X,Y,ancho,largo)
       setLocationRelativeTo(null); // establecer la ventana en el centrp de la pantalla
       
       //setResizable(false); // Establecer si la ventana puedo o no cambiar de tamaño
       setMinimumSize(new Dimension(400,400)); // establecer el tamaño minimo de la ventana
       
      // this.getContentPane().setBackground(Color.BLUE);
      iniciarComponentes();
        
     setDefaultCloseOperation(EXIT_ON_CLOSE); // finalizar el programa cuando la cierre
      
        
    }
    
    private void iniciarComponentes(){
      colocarPaneles();
      //colocarEtiquetas();
     // colocarBotones();
     //colocarRadioBotones();
     //colocarCajasDeTexto();
    // colocarAreasDeTexto();
    colocarListasDesplegables();
    }
    
    private void colocarPaneles(){
         panel = new JPanel();
        //panel.setBackground(Color.GREEN);
       panel.setLayout(null); //desactivando el diseño para poder ubicar la etiqueta en cualquier lugar      
        this.getContentPane().add(panel); //agregamos el panel a la ventana
    }
    
    
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel(); // creamos una etiqueta de texto y establecemos la alineacion horintoal del texto 
        etiqueta.setText("Mundial 2014"); //establecemos el valor de la etiqueta
        etiqueta.setBounds(85,10,300,80); //cambiar coordenadas y tamaño de  la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // establecemos la alineacion horizontal de la etiqueta
        
        etiqueta.setForeground(Color.blue); // cambiar el color de la letra de la etiqueta
        etiqueta.setOpaque(true); // desactivar el diseño de la etiqueta para que me permita ver el fondo
        etiqueta.setBackground(Color.PINK); // cambiar el color de fondo de la etiqueta
        
        etiqueta.setFont(new Font("chiller",Font.BOLD,40)); //establecemos la fuente del texto  nombre de la letra, el estilo y el tamaño de letra
        
        panel.add(etiqueta); // agregamos la etiqueta al panel
        
        
        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("brasil14.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 30, 458,458 );
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(458, 300, Image.SCALE_SMOOTH))); // ancho-alto-escalado
        panel.add(etiqueta2);        
    }
    
    private void colocarBotones(){
        //Boton 1 - boton de texto
        JButton boton1 = new JButton();
        
        boton1.setText("Click"); //establecemos un texto al boton
        boton1.setBounds(100, 100, 100, 40); //posicionamos el boton
        boton1.setEnabled(true); //habilitar o desabilitar el boton
        
        boton1.setForeground(Color.blue); // cambiamos el color de la letra
        boton1.setFont(new Font("chiller",Font.BOLD,30)); //Caracterisiticas de la letra 
        
        panel.add(boton1); //agregamos el boton al panel
        
        //Boton 2 - boton de imagen
        JButton boton2 = new JButton();
        
        boton2.setBounds(100, 200, 100, 40);
        
        ImageIcon clickAqui = new ImageIcon("brasil.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.CYAN);
        panel.add(boton2);
        
        //Boton3 - boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100,300,110,50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN,4,false));
        panel.add(boton3);
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion1",true);
        radioBoton1.setBounds(50,100,100,50);
        radioBoton1.setEnabled(true); //habilitar o deshabilitar el radio boton
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion2",false);
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion3",false);
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup(); // me permite tener marcada una sola opcion 
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarCajasDeTexto(){ //colocar caja de texto pequeña de una sola linea
        JTextField cajaTexto = new JTextField(); //cajas de tecto de una sola linea
        cajaTexto.setBounds(50,50,200,30);
        cajaTexto.setText("Hola...");
        
        System.out.println("TExto en la caja: "+cajaTexto.getText());
        panel.add(cajaTexto);
        
    }
    
    private void colocarAreasDeTexto(){ //colcoar un area de texto mas extensa
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        
        panel.add(areaTexto);
    }
    
    private void colocarListasDesplegables(){
        
        String [] paises = {"Colombia","Peru","Ecuador","Brasil","Argentina","Chile"};
        JComboBox listaDesplegable1 = new JComboBox(paises);        
        listaDesplegable1.setBounds(20,20,100,30);
        panel.add(listaDesplegable1);
    }
}


