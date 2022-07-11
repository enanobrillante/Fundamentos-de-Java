import javax.swing.*;

public class Formulario_JLabel extends JFrame {
	
 private JLabel label1;
 private JLabel label2;

/*El constructor debe tenerel mismo nombre que la clase padre.
* El diseño a cada JLABEL lo haremos dentro del constructor
*/
	public Formulario_JLabel(){
		setLayout(null);
		label1 = new JLabel("Interface gráfica");
		label1.setBounds(10,20,300,30);
		add(label1); //todo lo anterior lo agregue en esta etiqueta

		label2 = new JLabel("Versión 1.0");
		label2.setBounds(10,100,100,30);
		add(label2); //todo lo anterior lo agregue en esta etiqueta
	}
	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JLabel formulario1 = new Formulario_JLabel(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}