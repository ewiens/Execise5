package secondproject;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Assign2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creates a scanner		
		Scanner input = new Scanner(System.in);
	
		//JFrame
		/*
				JFrame myJFrame =new JFrame();
				myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myJFrame.setSize(250, 250);
				myJFrame.setLocation(500,250);
				myJFrame.setVisible(true);
				//myJFrame.setLabel("Quadratic Formula");
		*/		
				try{Thread.sleep(0750);}//Puts in a pause 
				catch(Exception e){};
				
		
		//JOption tell explain the format of the input panes
		JOptionPane.showMessageDialog(null, "Let's use the quadratic formula! Format your input as y= ax^2+bx+c.");
				
		//Opens input strings to input numbers
		String a1=
	    		  JOptionPane.showInputDialog("Enter a");
		String b1=
	    		  JOptionPane.showInputDialog("Enter b");
		String c1=
	    		  JOptionPane.showInputDialog("Enter c");
		
		// Turns the strings into integers
		double a=Double.parseDouble(a1);
		double b=Double.parseDouble(b1);
		double c=Double.parseDouble(c1);	
		
		//Uses the integers for math with decimals
		double sum =(Math.pow(b,2) - 4*a*c); 
		double sum1 =(-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);  
		double sum2 =(-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);  
		
		// Shows the solutions
		JOptionPane.showMessageDialog(null, sum, "Discriminant",JOptionPane.PLAIN_MESSAGE);
		
		if(sum < 0)
			JOptionPane.showMessageDialog(null, "Sorry your equation has no real solutions", "Quadratic Formula Solution",JOptionPane.PLAIN_MESSAGE);
		
		if(sum == 0)
			JOptionPane.showMessageDialog(null, "x= "+ sum1, "Quadratic Formula Solution",JOptionPane.PLAIN_MESSAGE);
				
		if(sum > 0)
			JOptionPane.showMessageDialog(null, "x= "+ sum2 + " or " + sum1, "Quadratic Formula Solution",JOptionPane.PLAIN_MESSAGE);
		
		// Shows the final message
		JOptionPane.showMessageDialog(null,"Thank you for using the Quadratic Formula!");
	}

}
