import javax.swing.*;
import java.awt.event.*;

public class Formulario_JButton extends JFrame implements ActionListener{
	
  JButton boton1;
 

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JButton(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		boton1 = new JButton("Cerrar"); //Nombre del boton
		boton1.setBounds(210,470,100,30);
		add(boton1); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton1.addActionListener(this);// le decimos al programa que este elemento tendrá una funcionalidad
	}

	//Ahora programamos la funcionalidad de nuestro boton

	public void actionPerformed(ActionEvent e) { //esto sirve para capturar el evento
	
		if(e.getSource() == boton1){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			System.exit(0); // cierra la interfaz gráfica	
		}

	}

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JButton formulario1 = new Formulario_JButton(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}