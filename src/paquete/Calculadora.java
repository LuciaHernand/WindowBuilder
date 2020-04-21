package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


import javax.swing.SwingConstants;

import javax.swing.AbstractAction;


public class Calculadora extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Calculadora() {
		 
		setTitle("Calculadora ");
        setSize(406,356);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	    JPanel panel1 =new JPanel();
	    getContentPane().add(panel1);
		
		          panel1.setLayout(null);
		 
		          setVisible(true);
		          
		     
		          JLabel num1 = new JLabel("Numero 1:");
		          num1.setBounds(10, 13, 63, 14);
		          panel1.add(num1);
		     

		          setVisible(true);
		     JTextField numero1 = new JTextField();
		     numero1.setBounds(71, 10, 60, 20);
		     panel1.add(numero1);
		     numero1.setColumns(5);

		JLabel num2 = new JLabel("Numero 2:");
		num2.setBounds(149, 13, 77, 14);
		panel1.add(num2);

        setVisible(true);
		JTextField numero2 = new JTextField();
		numero2.setBounds(214, 10, 63, 20);
		numero2.setHorizontalAlignment(SwingConstants.CENTER);
		numero2.setColumns(8);
		panel1.add(numero2);
		

        setVisible(true);
		JButton bSumar = new JButton("Sumar");
		bSumar.setSize(102, 60);
		bSumar.setLocation(29, 58);
		panel1.add(bSumar);
		bSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,Double.parseDouble( numero1.getText())+Double.parseDouble(numero2.getText()));
				
			}
		});
	

       
		JButton bResta = new JButton("Restar");
		 bResta.setBounds(141, 58, 102, 60);
		panel1.add(bResta);
		bResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, Double.parseDouble(numero1.getText())-Double.parseDouble(numero2.getText()));
				
			}
		});
       
	
		JButton bMultiplicar = new JButton("Multiplicar");
		bMultiplicar.setSize(102, 60);
		bMultiplicar.setLocation(141, 141);
		panel1.add(bMultiplicar);
		bMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, Double.parseDouble(numero1.getText())*Double.parseDouble(numero2.getText()));
				
				
			}
		});
		
		JButton bDividir = new JButton("Dividir");
	
		bDividir.setSize(102, 60);
		bDividir.setLocation(29, 141);
		
		panel1.add(bDividir);
	bDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, Double.parseDouble(numero1.getText())/Double.parseDouble(numero2.getText()));
				
				
			}
		});
	
	setVisible(true);
	
	}

	  

	//panel1.setVisible(true);
	 
	
	
	/**
		 * Launch the application.
		 * 
		 * @param args
		 */
	
	public static void main(String[] args) {

		new Calculadora();
		

	}

	/**
	 * Open the window.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

	}


		
}
