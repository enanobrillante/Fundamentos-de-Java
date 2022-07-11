import javax.swing.*;
import java.awt.event.*;

public class Formulario_JTextField extends JFrame implements ActionListener{
		
  private JButton boton_aceptar,boton_exit;
  private JLabel label1;
  private JTextField textfield1;

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JTextField(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		
		boton_aceptar = new JButton("Aceptar"); //Nombre del boton
		boton_aceptar.setBounds(10,80,100,30);
		add(boton_aceptar); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton_aceptar.addActionListener(this);// le decimos al programa que este elemento tendrá una funcionalidad

		
		

		boton_exit = new JButton("Salir"); //Nombre del boton
		boton_exit.setBounds(120,80,100,30);
		add(boton_exit); //todo lo anterior lo agregue en esta etiqueta
		//luego con addACtionListener el elemento queda a la espera
		boton_exit.addActionListener(this);

		
		//caja de texto
		textfield1 = new JTextField();
		textfield1.setBounds(120,17,150,20);
		add(textfield1);



		label1 = new JLabel("Usuario:");
		label1.setBounds(10,10,100,30); // (x,y,Ancho,alto)
		add(label1);
	}

	//Ahora programamos la funcionalidad de nuestro boton
	//esto sirve para capturar el evento
	public void actionPerformed(ActionEvent e) { 
	
		
		if(e.getSource() == boton_aceptar){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			
			String texto = textfield1.getText(); //Recuperamos l texto escrito y lo guardamos
			setTitle(texto);
				
		}
		if(e.getSource() == boton_exit){ //getSource contiene el objeto donde se origino el evento y lo guarda en e
			
			System.exit(0); // cierra la interfaz gráfica	
		}

	}

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JTextField formulario1 = new Formulario_JTextField(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,300,150);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}