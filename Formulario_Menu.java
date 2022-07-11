import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario_Menu extends JFrame implements ActionListener {

   private JMenuBar menubar; //Solo se podrá usar una barra
   private JMenu menu1, menu2; // Para crear las pestañas
   private JMenuItem item1,item2,item3,item_exit;

  public Formulario_Menu (){
	setLayout(null);
	menubar = new JMenuBar();  //Creo un objeto JMenuBar
	setJMenuBar(menubar); //Coloca la barra dentro de la interfaz

	menu1 = new JMenu("Opciones");
	menubar.add(menu1); //Se agrega a la barra JMenuBar

	menu2 = new JMenu("Otros");
	menubar.add(menu2);

	

	item1 = new JMenuItem("Rojo");
	item1.addActionListener(this); //Le asigno un evento a esta opcion
	menu1.add(item1);

	item2 = new JMenuItem("Verde");
	item2.addActionListener(this);
	menu1.add(item2);

	item3 = new JMenuItem("Azul");
	item3.addActionListener(this);
	menu1.add(item3);

	item_exit = new JMenuItem("Salir");
	item_exit.addActionListener(this);
	menu2.add(item_exit);
 }


 public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane(); //Tomará todas las caracteristicas de lainterfaz gráfica

	if(e.getSource() == item1){
		fondo.setBackground(new Color(255,0,0));
	}
	if(e.getSource() == item2){
		fondo.setBackground(new Color(0,255,0));
	}
	if(e.getSource() == item3){
		fondo.setBackground(new Color(0,0,255));
	}
	if(e.getSource() == item_exit){
		System.exit(0);
	}
	
 }


  public static void main(String args[]) {
	Formulario_Menu formulario1 = new Formulario_Menu();
	formulario1.setBounds(0,0,400,300);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
	formulario1.setLocationRelativeTo(null);
  }
}
