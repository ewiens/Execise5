package diagonAlley;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.*;
import java.io.*;
import java.util.Scanner;

public class Olivanders extends Shop {
	
public String wood;
public String core;
public String flex;
public double Length;
	
protected Container WContainer;
	protected int OMerch(int w){
		
		JFrame Shopping = new JFrame("Ollivander's");
		Shopping.setLayout(new GridLayout(2,1));
		Shopping.setSize(800, 700);
		Shopping.setVisible(true);
		SContainer= Shopping.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		ImageIcon OIcon= new ImageIcon("Ollivanders.jpg");
		JLabel OLabel = new JLabel(OIcon);
		
		JButton WandButton= new JButton("<html><font color = green> Get your Wand!");
		
		WandButton.setFont(new Font(null, Font.PLAIN,20));
		
		
		JPanel ShopPanel= new JPanel();		
		ShopPanel.add(WandButton);
				
		Shopping.add(OLabel);
		Shopping.add(ShopPanel);
		//Shopping.add(WandLabel);
		Shopping.setVisible(true);
		
		WandButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Shopping.setVisible(false);
				YourWand();
				return;
			}
		});
		
		w=1;
		return w;
	}
	protected void YourWand(){
		JFrame WandFrame = new JFrame("Ollivander's");
		WandFrame.setSize(800, 700);
		WandFrame.setLocationRelativeTo(null);
		WandFrame.setLayout(new GridLayout(2,1));
		WContainer = WandFrame.getContentPane();
		WContainer.setBackground(Color.WHITE);
		
		ImageIcon WandIcon = new ImageIcon("WandBoxes.jpg");
		JLabel ShowWand= new JLabel(WandIcon);
		
		setWand();
		String MyWand = getWand();
		System.out.println(MyWand);
		JLabel WandLabel = new JLabel("<html><font color = 'green'>"+MyWand);
		WandLabel.setFont(new Font(null, Font.PLAIN,20));
		
		
		WandFrame.add(ShowWand);
		WandFrame.add(WandLabel);
		WandFrame.setVisible(true);
		
//		try{Thread.sleep(2000);}
//		catch(Exception e){};
		
//		WandFrame.setVisible(false);
		return;
	}
	
	protected void setWand(){
		setWood();
		setCore();
		setFlexibility();
		setLength();
		return;
	}
	
	protected String getWand(){
		wood= getWood(wood);
		core= getCore(core);
		flex= getFlexibility(flex);
		Length= getLength(Length);
		String wand = "Your wand is "+wood+" and "+core+", "+Length+" inches, "+flex+"!";
		//System.out.println(wood+" "+ core +" "+ flex +" "+ Length);
		return wand;
	}
	protected String setWood(){
		File Woods= new File("Wood.txt");
		String [] W = new String [15];
		
		try{
		Scanner in = new Scanner(Woods);
		
			for (int i=0; i<W.length; i++){
			W[i]= in.next();
			//System.out.println(W[i]);
			} //end for loop
			in.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(14);
		
		wood = W[type];
		//System.out.println(wood);
		return wood;
	}
	
	protected String getWood(String wood){
		//System.out.println(wood);
		return wood;
	}
	protected String setCore(){
		File Cores= new File("core.txt");
		String [] C = new String [3];
		
		try{
		Scanner in = new Scanner(Cores);
		
			for (int i=0; i<C.length; i++){
			C[i]= in.next();
			//System.out.println(C[i]);
			} //end for loop
			in.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(3);
		
		core = C[type];
		//System.out.println(core);
		return core;
	}
	protected String getCore(String core){
		return core;
	}
	
	protected String setFlexibility(){
		File Flex= new File("flexibility.txt");
		String [] F = new String [11];
		
		try{
		Scanner in = new Scanner(Flex);
		
			for (int i=0; i<F.length; i++){
			
			F[i]= in.next();
			//System.out.println(F[i]);
			} //end for loop
			in.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(10);
		
		flex = F[type];
		//System.out.println(flex);
		return flex;
	}//end setFlexibility
	
	protected String getFlexibility(String flex){
		//System.out.println(flex);
		return flex;
	}
	
	protected double setLength(){
		double length=0;
		
		SecureRandom myRandom= new SecureRandom();
		Length = myRandom.nextInt(20);
		//System.out.println(Length);
		length = (Length+36);
		//System.out.println(Length);
		Length= length/4;
		//System.out.println(Length+" inches");
		
		return Length;
	}
	protected double getLength(double Length){
		return Length;
	}
}
