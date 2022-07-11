import javax.swing.*;
import java.awt.event.*;


public class Formulario_JComboBox extends JFrame implements ItemListener {
		
  private JComboBox combo1;

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_JComboBox(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		combo1 = new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);

		combo1.addItem("rojo");
		combo1.addItem("verde");
		combo1.addItem("azul");
		combo1.addItem("amarillo");
		combo1.addItem("negro");
		combo1.addItemListener(this); // indicamos que combo1 tendrá un evento
		

	}

//Programamos la funcionalidad de nuestro boton

	public void itemStateChanged(ItemEvent e){
		
		if(e.getSource() == combo1) {
			String seleccion = combo1.getSelectedItem().toString(); //convertimos esas palabras a texto
			setTitle(seleccion);
		}	


	}

	
	

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_JComboBox formulario1 = new Formulario_JComboBox(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,200,150);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}