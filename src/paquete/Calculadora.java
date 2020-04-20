package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;

public class Calculadora extends JFrame implements ActionListener {
	 String nume1,nume2;
	 String resultado = null;
	
	public Calculadora() {
		  setTitle("Calculadora ");
	         setSize(400,200);
	         setLocation(100,100);
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		
		JLabel num1 = new JLabel("Numero 1:");
		getContentPane().add(num1);
		
		numero1 = new JTextField();
		getContentPane().add(numero1);
		numero1.setColumns(10);
		nume1=numero1+"";
		
		JLabel num2 = new JLabel("Numero 2:");
		getContentPane().add(num2);
		
		numero2 = new JTextField();
		getContentPane().add(numero2);
		numero2.setColumns(10);
		nume2=numero2+"";
		
		JButton bSumar = new JButton("Sumar");
		getContentPane().add(bSumar);
		bSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,Double.parseDouble( numero1.getText())+Double.parseDouble(numero2.getText()));
				
			}
		});
		
		JButton bResta = new JButton("Restar");
		getContentPane().add(bResta);
		bResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, Double.parseDouble(numero1.getText())-Double.parseDouble(numero2.getText()));
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("Multiplicar");
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dividir");
		getContentPane().add(btnNewButton_3);
		setVisible(true);	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Shell shell;
	private JTextField numero1;
	private JTextField numero2;

	/**
	 * Launch the application.
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
		// TODO Auto-generated method stub
		
	}

}
