import javax.swing.*;
import java.awt.event.*;


public class Formulario_Video32 extends JFrame implements ActionListener {
		
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollPane1; 
  JButton boton_agregar;
  String texto = "";

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_Video32(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		
		//caja de texto
		textfield1 = new JTextField(); //lo dejamos vacio para que el usuario  
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
 
		// el JtextArea queda dentro de ScrollPane
		textarea1 = new JTextArea();
		scrollPane1 = new JScrollPane(textarea1); //text area queda dentro del scroll pane
		scrollPane1.setBounds(10,50,400,300); // (x,y,Ancho,alto)
		add(scrollPane1);

/* En el constructor damos diseño a nuestros componentes
*  y luego en el main diseñamos nuestra interfaz gráfica
*/

		boton_agregar = new JButton("Agregar");
		boton_agregar.setBounds(250,10,90,30);
		add(boton_agregar);
		boton_agregar.addActionListener(this);

	}

//Programamos la funcionalidad de nuestro boton

	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == boton_agregar ) {
			texto += textfield1.getText() + "\n"; //texto funciona como acumulador con +=, diagonal inversa es para dejar salto de linea
			textarea1.setText(texto); //coloca el texto dentro de textArea
			textfield1.setText("");//limpia el textField
		}
}

	
	

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_Video32 formulario1 = new Formulario_Video32(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}