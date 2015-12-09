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
	
	protected int OMerch(int w){
		
		JFrame Shopping = new JFrame("Ollivander's");
		Shopping.setLayout(new GridLayout(2,1));
		Shopping.setSize(800, 700);
		SContainer= Shopping.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		ImageIcon OIcon= new ImageIcon("Ollivanders.jpg");
		JLabel OLabel = new JLabel(OIcon);
		
		JButton WandButton= new JButton("<html><font color = green> Get your Wand!");
//		JButton Item2= new JButton(Item2name);
//		JButton Item3= new JButton(Item3name);
		
		
		WandButton.setFont(new Font(null, Font.PLAIN,20));
		
		WandButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				getWood(wood);
				getCore(core);
				getFlexibility(flex);
				getLength(Length);
				ShopPanel.setVisible(false);
				WandLabel.setVisible(true);
				return;
			}
		});
		
	
		double length = getLength(Length);
		String Wood = getWood(wood);
		String Core = getCore(core);
		String Flex = getFlexibility(flex);
		
		JLabel WandLabel = new JLabel("<html><font color = 'green'> Your wand is "+length+" inches, "+Wood+" and "+ Core+", "+Flex+"!");
				
		ShopPanel.add(WandButton);
				
		Shopping.add(OLabel);
		Shopping.add(ShopPanel);
		Shopping.add(WandLabel);
		Shopping.setVisible(true);
		
		
		
		
		
		Shopping.dispose();
		w=1;
		return w;
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
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(14);
		
		wood = W[type];
		System.out.println(wood);
		return wood;
	}
	
	protected String getWood(String wood){
		System.out.println(wood);
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
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(3);
		
		core = C[type];
		System.out.println(core);
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
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} // end try catch
		
		SecureRandom myRandom= new SecureRandom();
		int type = myRandom.nextInt(10);
		
		flex = F[type];
		System.out.println(flex);
		return flex;
	}
	
	protected String getFlexibility(String flex){
		System.out.println(flex);
		return flex;
	}
	
	protected double setLength(double length){
		for (int i=0; i<20; i++){
		SecureRandom myRandom= new SecureRandom();
		Length = myRandom.nextInt(20);
		System.out.println(Length);
		Length = (Length+36);
		System.out.println(Length);
		length= Length/4;
		System.out.println(length+" inches");
		}
		return length;
	}
	protected double getLength(double Length){
		return Length;
	}
}
