import javax.swing.*;

public class main {
	public static void main(String[] args){
//	Tutorial 25 Finish oval program			
//		TheWindow w = new TheWindow();
//		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		w.setSize(230, 280);
//		w.setVisible(true);
		
		//Tutorial 26 Threads
		
		Thread t1  = new Thread(new Tuna("one"));
		Thread t2  = new Thread(new Tuna("second"));
		Thread t3  = new Thread(new Tuna("third"));
		Thread t4  = new Thread(new Tuna("fourth"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	
	}
	
}
