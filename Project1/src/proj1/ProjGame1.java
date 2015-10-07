package proj1;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

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
					// end switch case
					}
				//end for loop
				} 
				
			ClosingRemarks();
	
	}
	
	private static void Remarks(){
		//Asks questions for input to know name
		String title = JOptionPane.showInputDialog("What is your title, i.e. Mr., Mrs., etc.?");
		String name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Welcome to the Quiz, %s %s!", title, name);	
		// Shows the message that is formated based on previous answers to questions
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showMessageDialog(null, "There are 10 questions. Good Luck!");
		
	}

	private static int Quiz(int x){
		
		
			//Quiz, string question, then integer answer, then if else for correctness.
				x=0;
				String q1=
						JOptionPane.showInputDialog(null,"Who wrote the Harry Potter series?","Question 1",JOptionPane.PLAIN_MESSAGE);
				String q1a =q1.toUpperCase();
				switch (q1a)
				{
					case "J.K. ROWLING":
					case "JK ROWLING":
					case "J.K.ROWLING":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q2=
						JOptionPane.showInputDialog(null,"Who does Tom Hiddleston play in the Marvel Cinematic Universe?","Question 2",JOptionPane.PLAIN_MESSAGE);
				String q2a =q2.toUpperCase();
				switch (q2a)
					{
						case "LOKI":
							JOptionPane.showMessageDialog(null,"You are correct!");
							x++;
							break;
							
						default:
							JOptionPane.showMessageDialog(null,"You are wrong.");
												
					}
				
				String q3=
						JOptionPane.showInputDialog(null,"Which BBC show features the TARDIS?","Question 3",JOptionPane.PLAIN_MESSAGE);
				String q3a =q3.toUpperCase();
				switch (q3a)
				{
					case "DOCTOR WHO":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q4=
						JOptionPane.showInputDialog(null,"What appartment does Sherlock Holmes live in on Baker Street?","Question 4",JOptionPane.PLAIN_MESSAGE);
				String q4a =q4.toUpperCase();
				switch (q4a)
				{
					case "221B":
					case "221 B":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q5=
						JOptionPane.showInputDialog(null,"Who plays Captain Jack Sparrow in Pirates of The Caribbean?","Question 5",JOptionPane.PLAIN_MESSAGE);
				String q5a =q5.toUpperCase();
				switch (q5a)
				{
					case "JOHNNY DEPP":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q6=
						JOptionPane.showInputDialog(null,"What is the last names of the brothers in Supernatural?","Question 6",JOptionPane.PLAIN_MESSAGE);
				String q6a =q6.toUpperCase();
				switch (q6a)
				{
					case "WINCHESTER":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q7=
						JOptionPane.showInputDialog(null,"Mickey is to Minnie as Donald is to who?","Question 7",JOptionPane.PLAIN_MESSAGE);
				String q7a =q7.toUpperCase();
				switch (q7a)
				{
					case "DAISY":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}
				
				String q8=
						JOptionPane.showInputDialog(null,"Which of Batman's enemies works with Harley Quinn?","Question 8",JOptionPane.PLAIN_MESSAGE);
				String q8a =q8.toUpperCase();
				switch (q8a)
				{
					case "JOKER":
					case "THE JOKER":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q9=
						JOptionPane.showInputDialog(null,"Which planet is Queen Amadala from?","Question 9",JOptionPane.PLAIN_MESSAGE);
				String q9a =q9.toUpperCase();
				switch (q9a)
				{
					case "NABOO":
						JOptionPane.showMessageDialog(null,"You are correct!");
						x++;
						break;
						
					default:
						JOptionPane.showMessageDialog(null,"You are wrong.");
											
				}

				String q10=
						JOptionPane.showInputDialog(null,"What color shirt usually dies in Star Trek?","Question 10",JOptionPane.PLAIN_MESSAGE);
				String q10a =q10.toUpperCase();
				switch (q10a)
				{
					case "RED":
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
		// Displays message based on grade
		switch (x)
		{
			case 9:
			case 10:
				JOptionPane.showMessageDialog(null,"Congrats! You are a true nerd!");
				break;
				
			case 8:
			case 7:
				JOptionPane.showMessageDialog(null,"Well Done! You're almost a geek!");
				break;
				
			case 6:
			case 5:
				JOptionPane.showMessageDialog(null,"Good Try! Keep working on it!");
				break;
				
			default: 
				JOptionPane.showMessageDialog(null,"Good Effort. If you try again you might do better!");
				break;
				
		}
		
	}

	private static void ClosingRemarks(){
		//Creates JFrame
		JFrame myJFrame =new JFrame();
		//Adds in Graphic
		GraphicP1 panel =new GraphicP1();
		
		myJFrame.setVisible(true);
		myJFrame.setTitle("Thank You for Playing");
		myJFrame.setSize(300, 300);
		myJFrame.setLocation(600, 400);
		
		myJFrame.add(panel);
		
		try{Thread.sleep(2500);}
		catch(Exception e){};
		myJFrame.dispose();
		
		}
		
			
}
	

