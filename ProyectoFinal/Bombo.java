import javax.swing.*;

//import javax.sound.sampled.*;

public class Bombo extends JFrame {

	

   public Bombo() {
	setLayout(null);
	setTitle("Bombo Leguero - Ritmos folcklóricos");
	getContentPane().setBackground(new Color(255,0,0));	

	
	

   }


	
   

public static void main(String args[]){
	
	Bombo formPrincipal = new Bombo();
	formPrincipal.setBounds(0,0,600,300);
	
	formPrincipal.setVisible(true);
	formPrincipal.setResizable(false);
	formPrincipal.setLocationRelativeTo(null);
	
   }  

}

    
