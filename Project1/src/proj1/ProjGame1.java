package proj1;

import javax.swing.JOptionPane;

public class ProjGame1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q=0;
		 
		//Opening remarks
				Remarks();
				
				//loop to play multiple times
				for(int i=0; i<3; i++){
				//runs the quiz method and returns the number correct
				int x=Quiz(q); 
				
				//displays number correct
				JOptionPane.showMessageDialog(null,"You got "+ x + " correct!");
				// runs the grade method and displays your grade
				Grade(x);
				
				//prompts playing again
				String g1=
						JOptionPane.showInputDialog(null,"Would you like to play again?");
				String g1a= g1.toUpperCase();
				// to make the quiz restart max 2 times
				switch(g1a){
					case "YES":
						if (i==2){
							JOptionPane.showMessageDialog(null, "Sorry you can only play 3 times.");
						}
						break;
					
					default:
						i=i+3;
				}
				
				} 

	}
	
	private static void Remarks(){
		String title = JOptionPane.showInputDialog("What is your title, i.e. Mr., Mrs., etc.?");
		String name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Welcome to the Quiz, %s %s!", title, name);	
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showMessageDialog(null, "There are 10 math problems. Good Luck!");
		
	}

	private static int Quiz(int x){
		
		
			//Quiz, string question, then integer answer, then if else for correctness.
				x=0;
				String q1=
						JOptionPane.showInputDialog(null,"What is the square root of 64?","Question 1",JOptionPane.PLAIN_MESSAGE);
				String q1a =q1.toUpperCase();
				switch (q1a)
				{
					case "8":
					case "EIGHT":	
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q2=
						JOptionPane.showInputDialog(null,"What is the product of 4*6?","Question 2",JOptionPane.PLAIN_MESSAGE);
				String q2a =q2.toUpperCase();
				switch (q2a)
					{
						case "24":
						case "TWENTY FOUR":
							JOptionPane.showMessageDialog(null,"You are correct!");
							x++;
							break;
							
						default:
							JOptionPane.showMessageDialog(null,"You are wrong.");
												
					}
				
				String q3=
						JOptionPane.showInputDialog(null,"What is the derivatie of f(x)=2x^2?","Question 3",JOptionPane.PLAIN_MESSAGE);
				String q3a =q3.toUpperCase();
				switch (q3a)
				{
					case "4X":
					case "FOUR X":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q4=
						JOptionPane.showInputDialog(null,"What is the slope of 2y=4x+1?","Question 4",JOptionPane.PLAIN_MESSAGE);
				String q4a =q4.toUpperCase();
				switch (q4a)
				{
					case "2":
					case "TWO":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q5=
						JOptionPane.showInputDialog(null,"What is 3 cubed?","Question 5",JOptionPane.PLAIN_MESSAGE);
				String q5a =q5.toUpperCase();
				switch (q5a)
				{
					case "27":
					case "TWENTY SEVEN":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q6=
						JOptionPane.showInputDialog(null,"If y=3x+4, what is y if x=-1?","Question 6",JOptionPane.PLAIN_MESSAGE);
				String q6a =q6.toUpperCase();
				switch (q6a)
				{
					case "1":
					case "ONE":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q7=
						JOptionPane.showInputDialog(null,"What is the second derivative of f(x)=6x^2+4x+2?","Question 7",JOptionPane.PLAIN_MESSAGE);
				String q7a =q7.toUpperCase();
				switch (q7a)
				{
					case "12":
					case "TWELVE":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q8=
						JOptionPane.showInputDialog(null,"What is 101+202*2?","Question 8",JOptionPane.PLAIN_MESSAGE);
				String q8a =q8.toUpperCase();
				switch (q8a)
				{
					case "505":
					case "FIVE HUNDRED FIVE":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q9=
						JOptionPane.showInputDialog(null,"What is the product of 11*9?","Question 9",JOptionPane.PLAIN_MESSAGE);
				String q9a =q9.toUpperCase();
				switch (q9a)
				{
					case "99":
					case "NINETY NINE":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q10=
						JOptionPane.showInputDialog(null,"What is the cube root of 8?","Question 10",JOptionPane.PLAIN_MESSAGE);
				String q10a =q10.toUpperCase();
				switch (q10a)
				{
					case "2":
					case "TWO":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				//End of Quiz questions
				
				return x;
			
		
	}

	private static void Grade(int x){
		
		switch (x)
		{
			case 9:
			case 10:
				JOptionPane.showMessageDialog(null,"You got an A!");
				break;
				
			case 8:
				JOptionPane.showMessageDialog(null,"You got a B!");
				break;
				
			case 7:
				JOptionPane.showMessageDialog(null,"You got a C.");
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null,"You got a D.");
				break;
				
			default: 
				JOptionPane.showMessageDialog(null,"You have failed.");
				break;
				
		}
		
	}

}
