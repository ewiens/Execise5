package diagonAlley;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class DiagonAlley {
	
protected static JFrame Welcome;
protected static JLabel WelcomeLabel;
protected static ImageIcon DAIcon;
protected static JLabel DAImage;
protected static Container WContainer;

protected static JFrame Stores;
protected static JLabel StoresLabel;
protected static Container SContainer;
protected static JPanel StoresControl;
//protected static ImageIcon OlivIcon;
//protected static ImageIcon MMIcon;
//protected static ImageIcon EeyIcon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		IntroStatements();
		Stores();
		
	}
	
	protected static void IntroStatements() {
		
		JFrame Welcome = new JFrame();
		Welcome.setLayout(new GridLayout(2,1));
		
		WContainer = Welcome.getContentPane();
		WContainer.setBackground(Color.WHITE);

		JLabel WelcomeLabel = new JLabel("<html> <font color ='Green'> Welcome to Diagon Alley young wizard! "
															+"It's time to go to Hogwarts for your first year! "
															+"But first we need to pick up a few things...", JLabel.CENTER);
		WelcomeLabel.setFont(new Font(null, Font.PLAIN,20));
		
		ImageIcon DAIcon = new ImageIcon("DAEntrance.jpg");
		JLabel DAImage = new JLabel(DAIcon);

		Welcome.setSize(800,700);
		Welcome.setLocationRelativeTo(null);
		
		Welcome.add(DAImage); 
		Welcome.add(WelcomeLabel);
		
		Welcome.setVisible(true);
		
		try{Thread.sleep(1000);}
		catch(Exception e){};
		
		Welcome.dispose();
		return;
		
	}
	protected static void Stores(){
		
		JFrame Stores = new JFrame("Where to?");
		Stores.setLayout(new GridLayout(2,1));
		
		SContainer = Stores.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		JLabel StoresLabel = new JLabel("<html><font color = 'Green'> Where should we start?", JLabel.CENTER);
		
		JButton Wand = new JButton("<html><font color = 'green'> 1 Wand");
		JButton Robes = new JButton("<html><font color = 'green'> 3 Sets of Black Robes");
		JButton pot = new JButton("<html><font color = 'green'>1 Standard Size 2 Black Pewter Cauldron ");
		JButton owl = new JButton("<html><font color = 'green'> Optional: Cat, Owl, or Toad");		
		
		Wand.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Wand.setVisible(false);
				//Shop.ShopWand();
				System.out.println("Going to Olivanders");
				return;
			}
		});
		
		Robes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Robes.setVisible(false);
				//Shop.ShopRobes();
				System.out.println("Going to Madame Malkins");
				return;
			}
		});
		
		pot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pot.setVisible(false);
				//Shop.ShopPot();
				System.out.println("Going to the pot shop");
				return;
			}
		});
		
		owl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				owl.setVisible(false);
				//Shop.ShopOwl();
				System.out.println("Going to Eeylops");
				return;
			}
		});
		
		JPanel StoresControl = new JPanel();
		StoresControl.setLayout(new GridLayout(4,1));
		StoresControl.add(Wand);
		StoresControl.add(Robes);
		StoresControl.add(pot);
		StoresControl.add(owl);
				
		Stores.add(StoresLabel);
		Stores.add(StoresControl);
		
		Stores.setSize(800, 700);
		Stores.setLocationRelativeTo(null);
		Stores.setVisible(true);
		
				
		return;
	}
	
}
