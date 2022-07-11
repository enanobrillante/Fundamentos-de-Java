import javax.swing.*;
import java.awt.event.*;


public class Formulario_Video33 extends JFrame implements ActionListener {
		
  private JTextField textfield1,textfield2;
  private JLabel Jlabel1,Jlabel2,Jlabel_Resultado;
   
  private JButton boton_sumar, boton_salir;
  
  

/*El constructor debe tenerel mismo nombre que la clase padre.
* 
*/
	public Formulario_Video33(){
		setLayout(null); // este método permite crear nuestros componentes a traves de coordenadas
		
		//caja de texto
		textfield1 = new JTextField(); //lo dejamos vacio para que el usuario  
		textfield1.setBounds(90,10,150,20);
		add(textfield1);

		textfield2 = new JTextField(); //lo dejamos vacio para que el usuario  
		textfield2.setBounds(90,50,150,20);
		add(textfield2);

		Jlabel1 = new JLabel("Valor 1:");
 		Jlabel1.setBounds(30,10,50,20);
		add(Jlabel1);

		Jlabel2 = new JLabel("Valor 2:");
 		Jlabel2.setBounds(30,50,50,20);
		add(Jlabel2);

		Jlabel_Resultado = new JLabel("Resultado: ");
 		Jlabel_Resultado.setBounds(150,120,80,30);
		add(Jlabel_Resultado);

		boton_sumar = new JButton("Sumar");
		boton_sumar.setBounds(10,120,90,30);
		add(boton_sumar);
		boton_sumar.addActionListener(this);


		boton_salir = new JButton("Salir");
		boton_salir.setBounds(300,120,90,30);
		add(boton_salir);
		boton_salir.addActionListener(this);

	}

//Programamos la funcionalidad de nuestro boton

	public void actionPerformed(ActionEvent e){
		
		

		if(e.getSource() == boton_sumar ) {

			int num1=0 , num2=0 , resultado=0;

			num1 = Integer.parseInt(textfield1.getText());
			num2 = Integer.parseInt(textfield2.getText());
			resultado = num1 + num2;
			Jlabel_Resultado.setText("Resultado: " +resultado);
		}
		if(e.getSource() == boton_salir ) {
	
			System.exit(0);		
		}

		
}

	
	

	//Arranque de nuestro programa con metodo main, donde cargamos la interfaz gráfica
	public static void main(String args[]) {
		Formulario_Video33 formulario1 = new Formulario_Video33(); //Objeto para nuestra interfaz
		formulario1.setBounds(0,0,400,200);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //para que la interfaz se muestre en el centro
		formulario1.setResizable(false);
	 }
}