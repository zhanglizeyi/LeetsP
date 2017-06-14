import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;


public class SwingApp extends JApplet {
	//Tutorial 21 & 22
		
	private double sum;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("wow this is what it is " + sum, 25, 25);
	}
		
}
