import javax.swing.*;
import java.awt.event.*;

public class Formulario_JTextArea extends JFrame {
		
  private JTextField textfield1;
  private JTextArea textarea1;
 

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JTextArea(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		
		//caja de texto
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300); // (x,y,Ancho,alto)
		add(textarea1);
	}

	
	

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JTextArea formulario1 = new Formulario_JTextArea(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}