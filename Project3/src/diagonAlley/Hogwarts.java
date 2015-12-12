package diagonAlley;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class Hogwarts {
	
protected Container	HContainer;
protected Container HouseContainer;
protected String House;
protected String [] H = new String [3];
	protected void Welcome(){
		
		JFrame HogFrame = new JFrame("Hogwarts");
		HogFrame.setSize(800, 700);
		HogFrame.setLocationRelativeTo(null);
		HogFrame.setLayout(new GridLayout(3,1));
		HContainer = HogFrame.getContentPane();
		HContainer.setBackground(Color.white);
		
		ImageIcon HIcon = new ImageIcon("HogwartsCrest.png");
		JLabel ShowCrest = new JLabel(HIcon);
		
		JLabel WelcomeLabel = new JLabel("<html><font color = 'green' > Welcome to Hogwarts",JLabel.CENTER);
		WelcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
		JPanel WelcomePanel = new JPanel();
		
		JButton Sort= new JButton("<html><font color = 'green' > Get Sorted");
		
		WelcomePanel.add(Sort);
		
		HogFrame.add(ShowCrest);
		HogFrame.add(WelcomeLabel);
		HogFrame.add(WelcomePanel);
		
		HogFrame.setVisible(true);
//		try{Thread.sleep(1000);}
//		catch(Exception e){};
		
		Sort.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				HogFrame.setVisible(false);
				MyHouse();
			}
		});
		
		
		return;
	}
	protected void MyHouse(){
		JFrame HouseFrame = new JFrame();
		HouseFrame.setSize(800, 700);
		HouseFrame.setLocationRelativeTo(null);
		HouseFrame.setLayout(new GridLayout(1,2));
		HouseContainer=HouseFrame.getContentPane();
		HouseContainer.setBackground(Color.white);
		
		getHouse();
		House = setHouse();
		
		String myCrest="";
		String myLabel="";
		switch(House)
		{
			case "Gryffindor":
				myCrest="GryffindorCrest.jpg";
				myLabel="Congratulations you are a Gryffindor! Known for bravery and courage, Gryffindor has had the entire Weasly family and Harry Potter himself!"
						+ " Gryffindor was founded by Godric Gryffindor when Hogwarts was created!";
			
			case "Ravenclaw":
				myCrest="RavenclawCrest.jpg";
				myLabel="Welcome to Ravenclaw! Students in Ravenclaw are known to be clever, in fact they have to answer a riddle to enter their common room!"
						+ " Ravenclaw was founded by Rowena Ravenclaw when Hogwarts was created.";
			
			case "Hufflepuff":
				myCrest="HufflepuffCrest.jpg";
				myLabel="Welcome to Hufflepuff! Hufflepuffs is where everyone else goes, but never fear Cedric Diggory was a Hufflepuff!"
						+ " This house was founded by Helga Hufflepuff when Hogwarts was created.";
			
			case "Slytherin":
				myCrest="SlytherinCrest.png";
				myLabel="Welcome to Slytherin! They say that there wasn't a witch or wizard in Slytherin that didn't go bad, but most Slytherins become powerful witches and wizards! "
						+ "Slytherin was founded by Salazar Slytherin who believed only pure bloods should be allowed magical education.";
				
		}
		
		
		
		ImageIcon CrestIcon = new ImageIcon(myCrest);
		JLabel showCrest = new JLabel(CrestIcon);
		
		JLabel HouseLabel = new JLabel("<html><font color = 'green'>"+ myLabel);
		HouseLabel.setFont(new Font(null, Font.PLAIN,20));
		
		HouseFrame.add(showCrest);
		HouseFrame.add(HouseLabel);
		HouseFrame.setVisible(true);
		
	}
	
	protected String getHouse(){
		SecureRandom myRandom = new SecureRandom();
		int house = myRandom.nextInt(4);
		System.out.println(house);
		H[1]="Gryffindor";
		H[2]="Ravenclaw";
		H[3]="Hufflepuff";
		H[4]="Slytherin";
		
		House = H[house];
		System.out.println(House);
		return House;
	}

	protected String setHouse(){
		return House;
		
	}
}
