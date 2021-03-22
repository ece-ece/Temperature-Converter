package convertTemperature;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main extends JFrame {
	JRadioButton F;
	JRadioButton C;
	JRadioButton K;
	JTextField tf;
	JButton button;
	JLabel label,label2;
	double Fahrenheit,Celsius,Kelvin;
class clickEvent implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=tf.getText();
		double a=Double.parseDouble(s1);
		
		if(F.isSelected()) {
			Celsius=(a-32)*5/9;
			Kelvin=(a+459.67)*5/9;
			label2.setText(" Celsius:"+Celsius+" Kelvin: "+Kelvin);
		}
		if(C.isSelected()) {
			Fahrenheit=(a*9/5)+32;
			Kelvin=273.15+a;
			label2.setText(" Kelvin: "+Kelvin+" Fahrenheit: "+Fahrenheit);
		}
		if (K.isSelected()) {
			Celsius=a-273.15;
			Fahrenheit=a*9/5-459.67;
			label2.setText(" Celsius: "+Celsius+" Fahrenheit: "+Fahrenheit);
		}
	}
}
	public Main() {
		init();
	}
	
	private void addComponent() {
		label=new JLabel("~ Choose and convert ~");
		label2=new JLabel("");
		
		tf=new JTextField(20);
		button=new JButton("CONVERT");
		F=new JRadioButton("Fahrenheit");
		C=new JRadioButton("Celsius");
		K=new JRadioButton("Kelvin");
		
		ButtonGroup bg=new ButtonGroup();
		add(label);
		bg.add(F);
		bg.add(C);
		bg.add(K);
		add(F);
		add(C);
		add(K);
		button.addActionListener(new clickEvent());
		
		add(tf);
		add(button);
		add(label2);
	}
	
	private void init() {
		this.setSize(500,250);
		this.setVisible(true);
		this.setTitle("Temperature Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		addComponent();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Main mygui = new Main();

	}

}
