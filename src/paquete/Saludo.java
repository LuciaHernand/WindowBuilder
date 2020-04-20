package paquete;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


	   class Foo {}

	   public class Saludo extends JFrame implements ActionListener {
	      /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextField t1;
	     
	      
	      public void actionPerformed(ActionEvent e) {
	         JOptionPane.showMessageDialog(null, "Hola "+t1.getText()+", esto es un ejemplo de saludo.");
	         
	      }
	      public Saludo() {
	         setTitle("Ejemplo de saludo ");
	         setSize(400,200);
	         setLocation(100,100);
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setLayout(new GridLayout(3,1));
	         
	         JPanel p1=new JPanel(new GridLayout(1,2));add(p1);
	         p1.add(new JLabel("Introduce tu nombre: "));
	         t1=new JTextField(30);t1.addActionListener(this);
	         p1.add(t1);
	         
	         JButton b=new JButton("Saludar");add(b);b.addActionListener(this);

	       
	         setVisible(true);
	      }
	      public static void main(String[] args) {
	         new Saludo();
	      }
	  
	   
}