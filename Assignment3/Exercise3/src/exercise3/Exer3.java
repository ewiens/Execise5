package exercise3;

import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Opening remarks
		String title = JOptionPane.showInputDialog("What is your title, i.e. Mr., Mrs., etc.?");
		String name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Welcome to the Quiz, %s %s!", title, name);	
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showMessageDialog(null, "There are 10 math problems. Good Luck!");
		
		//And now the questions
		int x=0;
		int g=1;
		
		
		do{
		//Quiz
			
			String q1=
					JOptionPane.showInputDialog(null,"What is the square root of 64?","Question 1",JOptionPane.PLAIN_MESSAGE);
			int q1a =Integer.parseInt(q1);	
			if (q1a==8){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			String q2=
					JOptionPane.showInputDialog(null,"What is the product of 4*6?","Question 2",JOptionPane.PLAIN_MESSAGE);
			int q2a =Integer.parseInt(q2);	
			if (q2a==24){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}
			
			String q3=
					JOptionPane.showInputDialog(null,"What is the derivatie of f(x)=4x?","Question 3",JOptionPane.PLAIN_MESSAGE);
			int q3a =Integer.parseInt(q3);	
			if (q3a==4){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			String q4=
					JOptionPane.showInputDialog(null,"What is the slope of 2y=4x+1?","Question 4",JOptionPane.PLAIN_MESSAGE);
			double q4a =Double.parseDouble(q4);	
			if (q4a==2){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			String q5=
					JOptionPane.showInputDialog(null,"What is 3 cubed?","Question 5",JOptionPane.PLAIN_MESSAGE);
			double q5a =Double.parseDouble(q5);	
			if (q5a==27){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}
			
			String q6=
					JOptionPane.showInputDialog(null,"If y=3x+4, what is y if x=-1?","Question 6",JOptionPane.PLAIN_MESSAGE);
			double q6a =Double.parseDouble(q6);	
			if (q6a==1){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}
			
			String q7=
					JOptionPane.showInputDialog(null,"What is the second derivative of f(x)=6x^2+4x+2?","Question 7",JOptionPane.PLAIN_MESSAGE);
			double q7a =Double.parseDouble(q7);	
			if (q7a==12){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}
			
			String q8=
					JOptionPane.showInputDialog(null,"What is 101+202*2?","Question 8",JOptionPane.PLAIN_MESSAGE);
			int q8a =Integer.parseInt(q8);	
			if (q8a==505){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			String q9=
					JOptionPane.showInputDialog(null,"What is the product of 11*9?","Question 9",JOptionPane.PLAIN_MESSAGE);
			int q9a =Integer.parseInt(q9);	
			if (q9a==99){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			String q10=
					JOptionPane.showInputDialog(null,"What is the cube root of 8?","Question 10",JOptionPane.PLAIN_MESSAGE);
			double q10a =Double.parseDouble(q10);	
			if (q10a==2){
					JOptionPane.showMessageDialog(null, "You are correct!");
					x++;
			} else{
				JOptionPane.showMessageDialog(null, "Sorry, you are incorrect.");
			}

			
			//number correct
			JOptionPane.showMessageDialog(null,"You got "+ x + " correct!");
		/*
		// makes a break between the number and the letter grade
		try{Thread.sleep(1000);} 
		catch(Exception e){};
		*/		
		//Tells what letter grade you got
		if (x>=9){  
				JOptionPane.showMessageDialog(null,"You got an A!");
			}
			else if(x>=8){
				JOptionPane.showMessageDialog(null,"You got a B!");
			}
				else if(x>=7){
					JOptionPane.showMessageDialog(null,"You got a C.");
			}
				else if(x>=6){
					JOptionPane.showMessageDialog(null,"You got a D.");
			}
				else {
					JOptionPane.showMessageDialog(null,"You Failed.");
			}
		String g1=
				JOptionPane.showInputDialog(null,"Would you like to play again? If so input 1, if not input any other integer.");
		int grade=Integer.parseInt(g1);
		if (grade!=1){
			g++;
		}
		
		} while (g==1);
		//Switch case
		
				
		//Creates a panel for the Graphic		
		GraphicE3 panel =new GraphicE3();
		
		//Opens the JFrame and sets it up
		JFrame myJFrame =new JFrame();
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJFrame.setSize(500, 500);
		myJFrame.setLocation(500,250);
		myJFrame.setVisible(true);	
		
		//Adds in the graphic panel
		myJFrame.add(panel);
		
		/*
		//Label in the center of the JFrame
		JLabel thanks= new JLabel();
		thanks.setText("Thank You for Participating! \n Have a nice day!");
		thanks.setHorizontalTextPosition(JLabel.CENTER);
		thanks.setVerticalTextPosition(JLabel.CENTER);
		myJFrame.add(thanks,BorderLayout.CENTER);
		*/
		
	}

}
