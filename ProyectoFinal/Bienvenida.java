import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

//ActionListener porque crearemos un evento desde un boton
public class Bienvenida extends JFrame implements ActionListener{
    
    private JTextField textfield1;
    private JLabel label1,label2,label3,label4;
    private JButton boton1;
    public static String texto = ""; // para que todas las clases tengan acceso
    // static indica un atributo de clase, que es una caracteristica propia de la clase
	
    public Bienvenida(){ //Constructor
        setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0)); //Establece el color de fondo en el formulario
        
	
	setIconImage(new ImageIcon(getClass().getResource("images/email.png")).getImage());
	
	//getImage : obtiene la imagen de la ruta especificada, luego getResource la carga
	//getClass obtiene la clase donde se quiere mostrar la imagen
	//Luego se crea un obejo ImageIcon que va a colocar nuestra imagen en el icono de la interfas gráfica
        
        
	//Colocar imagen dentro de un Label
	ImageIcon imagen = new ImageIcon ("images/email.png"); //Creamos un objeto tipo ImageIcon
        label1 = new JLabel(imagen); //Colocamos la imagen dentro del Label
        label1.setBounds(25,15,300,100);
	add(label1);
        
        label2 = new JLabel("Sistema de control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono",3,18)); //Designamos la fuente del label :(tipografía, negrita/cursiva=3, tamaño)
        label2.setForeground(new Color(255,255,255)); //Color del texto
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre completo");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono",1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        label4 = new JLabel("2019 The Chota-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        
        textfield1 = new JTextField();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224)); //Fondo del textfield
        textfield1.setFont(new Font("Andale Mono",1,14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);
        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255)); //Fondo del boton
        boton1.setFont(new Font("Andale Mono",1,14)); //Fuente del boton
        boton1.setForeground(new Color(255,0,0)); //Texto del boton
        boton1.addActionListener(this); //queda preparado para un evento
        add(boton1); //Todo lo anterior se agregar al componente boton1
    }//Final del constructor
    
    

	
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== boton1){
            				//.trim sirve para borrar los espacios 
		texto = textfield1.getText().trim(); //el método getText nos permite recuperar el texto dentro de un componente
	    if(texto.equals("")) { // valida si el usuario escribió texto o no
		JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
	    } else {
		
		Licencia formLicencia = new Licencia();
		formLicencia.setBounds(0,0,600,370);
		formLicencia.setVisible(true); //Abre la ventana licencia
		formLicencia.setResizable(false);
		formLicencia.setLocationRelativeTo(null);
		this.setVisible(false); //No muestra la ventana bienvenida, la esconde
  
	    }
        }
    }//fin actionPerformed
    
    public static void main(String args[]) {
        Bienvenida formBienvenida = new Bienvenida();
        formBienvenida.setBounds(0,0,350,450);
        formBienvenida.setVisible(true);
        formBienvenida.setResizable(false);
        formBienvenida.setLocationRelativeTo(null);
    }

    
}
