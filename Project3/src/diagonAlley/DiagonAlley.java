package diagonAlley;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class DiagonAlley {
	
protected JFrame Welcome;
protected JLabel WelcomeLabel;
protected ImageIcon DAIcon;
protected JLabel DAImage;
protected Container WContainer;

protected JFrame Stores;
protected JLabel StoresLabel;
protected Container SContainer;
protected JPanel StoresControl;

public int w=0;
public int o=0;

public String wood;
public String core;
public String flex;
public double Length;

	public void main() {
		// TODO Auto-generated method stub
			
		IntroStatements();
		Stores();
		//RunOliv();
		
	}
	
	protected void RunOliv(){
	
		Olivanders myWand = new Olivanders();
		myWand.OMerch(w);
//		Olivanders.setWood();
//		Olivanders.setCore();
//		Olivanders.setFlexibility();
//		Olivanders.setLength(Length);
		
		System.out.println("Your wand is "+Length+" inches, "+wood+" and "+core+", "+flex);
	}
	
	protected void IntroStatements() {
		
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
		
		try{Thread.sleep(3000);}
		catch(Exception e){};
		
		Welcome.dispose();
		return;
		
	}
	protected void Stores(){
		
		JFrame Stores = new JFrame("Where to?");
		Stores.setLayout(new GridLayout(2,1));
		
		SContainer = Stores.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		JLabel StoresLabel = new JLabel("<html><font color = 'Green'> Where should we go?", JLabel.CENTER);
		StoresLabel.setFont(new Font(null, Font.PLAIN,20));
		
		JButton Wand = new JButton("<html><font color = 'green'> Ollivanders");
		JButton Go = new JButton("<html><font color = 'green'> Board the Hogwarts Express");
//		JButton Books = new JButton("<html><font color = 'green'> Books");
		JButton Owl = new JButton("<html><font color = 'green'> Eeylops Owl Emporium");		
		
		Wand.setFont(new Font(null, Font.PLAIN,20));
		Go.setFont(new Font(null, Font.PLAIN,20));
//		Books.setFont(new Font(null, Font.PLAIN,20));
		Owl.setFont(new Font(null, Font.PLAIN,20));
		
		Wand.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Wand.setVisible(false);
				Olivanders myWand = new Olivanders();
				myWand.OMerch(w);
				//System.out.println("Going to Ollivanders");
				w++;
				return;
			}
		});
		
		Go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Stores.setVisible(false);
				Hogwarts myHogwarts = new Hogwarts();
				myHogwarts.Welcome();
				//System.out.println("Going to Madame Malkins");
				return;
			}
		});
		
//		Books.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				Books.setVisible(false);
//				//Shop.ShopPot();
//				System.out.println("Going to Florence and Blotts");
//				b++;
//				return;
//			}
//		});
		
		Owl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Owl.setVisible(false);
				Eyelops myEeylops = new Eyelops();
				myEeylops.EMerch(o);
				//System.out.println("Going to Eeylops");
				o++;
				return;
			}
		});
		
		JPanel StoresControl = new JPanel();
		Stores.setSize(800, 700);
		Stores.setLocationRelativeTo(null);
		StoresControl.setLayout(new GridLayout(3,1));
			
		StoresControl.add(Wand);
		StoresControl.add(Owl);
//		if(o=1){
//			if(w=1){
		StoresControl.add(Go);
//		}}
		//System.out.print(r);
		
		Stores.add(StoresLabel);
		Stores.add(StoresControl);
		
		Stores.setVisible(true);
		
				
		return;
	}
	
}
