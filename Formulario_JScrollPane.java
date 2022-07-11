import javax.swing.*;


public class Formulario_JScrollPane extends JFrame {
		
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollPane1; 
 

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JScrollPane(){
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

	}

	
	

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JScrollPane formulario1 = new Formulario_JScrollPane(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}