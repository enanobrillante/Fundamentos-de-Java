import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

//ActionListener porque crearemos un evento desde un boton y ChangeListener para checkBox
public class Licencia extends JFrame implements ActionListener ,ChangeListener {
    
  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1,boton2;
  private JScrollPane scrollPane1;
  private JTextArea textArea1;
  String nombre = ""; //La usamos para utilizar la variable texto de la clase bienvenida

  public Licencia() {
	setLayout(null);
	setTitle("Licencia de uso");   //Título de Formulario
	setIconImage(new ImageIcon(getClass().getResource("images/email.png")).getImage());

	
	Bienvenida formBienvenida = new Bienvenida(); //Creamos un objeto de donde vamos a pedir la variable
	nombre = formBienvenida.texto; // recuperamos el valor de la variable "texto" y la guardamos en texto


	label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono",1,14)); //Designamos la fuente del label :(tipografía, negrita/cursiva=3, tamaño)
        label1.setForeground(new Color(0,0,0)); //Color del texto
        add(label1);

	textArea1 = new JTextArea();
	textArea1.setEditable(false);
	textArea1.setFont(new Font("Andale Mono",0,11));

	//  \n = enter
	textArea1.setText("\n\n        TÉRMINOS Y CONDICIONES" +
		"\n\n	A.   PROHIBIDA SU DISTRIBUCIÓN... " +
		"\n	B.   PROHIBIDA LA VENTA... " +
		"\n	C.   LA REPRODUCCION DE LA... " +
		"\n\n	  Los acuerdos legales y Rta: Primero porque las preguntas que el hombre"+
		"\n	  comenzó a formularse nacieron del asombro ante el mundo que lo rodeaba,"+ 
		"\n	  luego esas respuestas obtenidas fueron puestas en duda, sometiendo ese "+
		"\n	  conocimiento a nuevas reflexiones sobre su veracidad. Por último esa duda"+ 
		"\n	  lleva al hombre a reflexionar sobre sí mismo, tomando conciencia de las "+
		"\n	  situaciones límites, las cuales el hombre no puede cambiar porque constituyen"+ 
		"\n	  su existencia y su destino. " +
		"\n\n	SI USTED NO ACEPTA ESTOS TÉRMINOS HAGA CLICK EN (NO ACEPTO)... " +
		"\n	EN CASO CONTRATIO MARQUE LA CASILLA CORRESPONDIENTE Y LUEGO ACEPTE... " +
		"\n\n	PARA MAYOR INFORMACIÓN SOLICITARLA A..." +
		"\n	http://www.consultas@gulamail.com " 
	);
	scrollPane1 = new JScrollPane(textArea1);
	scrollPane1.setBounds(10,40,575,200);
	add(scrollPane1);

	check1 = new JCheckBox("Yo, " + nombre + " Acepto.");
	check1.setBounds(10,250,200,30);
	check1.addChangeListener(this);
	add(check1);


	boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
	boton1.addActionListener(this);
	boton1.setEnabled(false);
	add(boton1);

	boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
	boton2.addActionListener(this);
	boton2.setEnabled(true);
	add(boton2);
	
	
	ImageIcon imagen = new ImageIcon("images/pontebonitawhite.jpg");
	label2 = new JLabel(imagen);
	label2.setBounds(320,250,265,70);
	add(label2);

	

  }

  public void stateChanged(ChangeEvent e){ //ChangeEvent para eventos del JCheckBox
	if(check1.isSelected() == true) { //Si está seleccionado
	    boton1.setEnabled(true); // que esté activado
	    boton2.setEnabled(false); // que esté desactivado
	} else {
	    boton1.setEnabled(false);
	    boton2.setEnabled(true);
	}
  }


// Enlazando las interfaces gráficas
  public void actionPerformed (ActionEvent e){  //recupero el evento
	if(e.getSource() == boton1){            // si se originó en el boton1
		
		Principal formPrincipal = new Principal(); //Nos lleva a la página principal
		formPrincipal.setBounds(0,0,640,535);
		formPrincipal.setVisible(true);
		formPrincipal.setResizable(false);
		formPrincipal.setLocationRelativeTo(null);
		this.setVisible(false); 			//ocultamos la clase licencia

	} else if(e.getSource() == boton2){ //Nos enlaza a la clase Bienvenida


		Bienvenida formBienvenida = new Bienvenida();
        	formBienvenida.setBounds(0,0,350,450);
        	formBienvenida.setVisible(true);
        	formBienvenida.setResizable(false);
        	formBienvenida.setLocationRelativeTo(null);
		this.setVisible(false);
	}
  }

  public static void main(String args[]){
	Licencia formLicencia = new Licencia();
	formLicencia.setBounds(0,0,600,370);
	formLicencia.setVisible(true);
	formLicencia.setResizable(false);
	formLicencia.setLocationRelativeTo(null);
	
  }  



}    
