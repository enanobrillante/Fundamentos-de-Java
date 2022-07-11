import javax.swing.*;
import java.awt.event.*;

public class Formulario_JButton_JLabel extends JFrame implements ActionListener{
	
  private JButton boton1,boton2,boton3,boton_exit;
  private JLabel label1;

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JButton_JLabel(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		
		boton1 = new JButton("boton1"); //Nombre del boton
		boton1.setBounds(40,100,90,30);
		add(boton1); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton1.addActionListener(this);// le decimos al programa que este elemento tendrá una funcionalidad

		boton2 = new JButton("boton2"); //Nombre del boton
		boton2.setBounds(140,100,90,30);
		add(boton2); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton2.addActionListener(this);

		boton3 = new JButton("boton3"); //Nombre del boton
		boton3.setBounds(240,100,90,30);
		add(boton3); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton3.addActionListener(this);
		

		boton_exit = new JButton("Salir"); //Nombre del boton
		boton_exit.setBounds(140,150,90,30);
		add(boton_exit); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton_exit.addActionListener(this);


		label1 = new JLabel("En espera...");
		label1.setBounds(10,10,300,30);
		add(label1);
	}

	//Ahora programamos la funcionalidad de nuestro boton
	//esto sirve para capturar el evento
	public void actionPerformed(ActionEvent e) { 
	
		if(e.getSource() == boton1){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			label1.setText("Ha presionado el boton 1");
				
		}
		if(e.getSource() == boton2){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			label1.setText("Ha presionado el boton 2");
				
		}
		if(e.getSource() == boton3){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			label1.setText("Ha presionado el boton 3");
				
		}
		if(e.getSource() == boton_exit){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			
			System.exit(0); // cierra la interfaz gráfica	
		}

	}

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JButton_JLabel formulario1 = new Formulario_JButton_JLabel(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}