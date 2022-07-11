import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Formulario_Terminosycondiciones extends JFrame implements ActionListener, ChangeListener {

   	private JLabel label1;
	private JCheckBox check1;
   	private JButton boton_exit, boton1;

  public Formulario_Terminosycondiciones (){
	setLayout(null);
	
	check1 = new JCheckBox("Acepto");
	check1.setBounds(10,50,100,30); 
	check1.addChangeListener(this);
	add(check1);

	label1 = new JLabel("Aceptar términos y condiciones");
	label1.setBounds(10,10,400,30); 
	add(label1);

	boton1 = new JButton("Continuar");
	boton1.setBounds(10,100,100,30);
	add(boton1);
	boton1.addActionListener(this);
	boton1.setEnabled(false);
	
 }


 public void stateChanged(ChangeEvent e){
  	String cad="";

	if(check1.isSelected() == true){
		boton1.setEnabled(true);
	} else { 
		boton1.setEnabled(false);
		}
	
	
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1) {
	System.exit(0);
  }
}


  public static void main(String args[]) {
	Formulario_Terminosycondiciones formulario1 = new Formulario_Terminosycondiciones();
	formulario1.setBounds(0,0,350,200);
	formulario1.setVisible(true);
	formulario1.setResizable(false);
	formulario1.setLocationRelativeTo(null);
  }
}
