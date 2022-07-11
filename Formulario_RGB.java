import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario_RGB extends JFrame implements ActionListener {

	private JLabel label1, label2, label3;
	private JComboBox combo1, combo2, combo3;
	private JButton boton1;

  public Formulario_RGB () {
	setLayout(null);
	label1 = new JLabel ("Rojo:");
	label1.setBounds(10,10,100,20);
	add(label1);

	combo1 = new JComboBox();
	combo1.setBounds(120,10,50,30);
	for(int i = 0; i<=255; i++){
		combo1.addItem(String.valueOf(i));

	}
	add(combo1);

	label2 = new JLabel ("Verde:");
	label2.setBounds(10,50,100,20);
	add(label2);

	combo2 = new JComboBox();
	combo2.setBounds(120,50,50,30);
	for(int i = 0; i<=255; i++){
		combo2.addItem(String.valueOf(i));

	}
	add(combo2);

	label3 = new JLabel ("Azul:");
	label3.setBounds(10,90,100,20);
	add(label3);

	combo3 = new JComboBox();
	combo3.setBounds(120,90,50,30);
	for(int i = 0; i<=255; i++){
		combo3.addItem(String.valueOf(i));

	}
	add(combo3);

	boton1 = new JButton("Fijar color");
	boton1.setBounds(10,130,100,30);
	add(boton1);
	boton1.addActionListener(this);
  }


  public void actionPerformed(ActionEvent e){
     if(e.getSource () == boton1){
	String cad1 = combo1.getSelectedItem().toString();//recuperamos los datos del JcomboBox
	String cad2 = combo2.getSelectedItem().toString();
	String cad3 = combo3.getSelectedItem().toString();
	
	//volvemos a parsear a entero
	int rojo  = Integer.parseInt(cad1);
	int verde = Integer.parseInt(cad2);
	int azul  = Integer.parseInt(cad3);

	//Creamos objeto de tipo color con la libreria importada awt
	Color color1 = new Color(rojo,verde,azul); //variables que el usuario irá modificando
	boton1.setBackground(color1);
     }
  
}
  public static void main(String args[]) {
	Formulario_RGB formulario1 = new Formulario_RGB();
	formulario1.setBounds(0,0,190,220);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
	formulario1.setLocationRelativeTo(null);
  }
}
