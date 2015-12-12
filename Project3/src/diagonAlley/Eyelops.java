package diagonAlley;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eyelops extends Shop{
	
	protected Container OContainer;
	
	protected int EMerch(int o){
	
		JFrame Shopping = new JFrame();
		Shopping.setLayout(new FlowLayout());
		Shopping.setSize(800, 700);
		Shopping.setLocationRelativeTo(null);
		SContainer= Shopping.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1,2));
		
		ImageIcon EIcon = new ImageIcon("EeylopsOwl.jpg");
		JLabel EImage = new JLabel(EIcon);
		
		JLabel ELabel = new JLabel("<html><font color = 'green'> Welcome to Eeylops Owl Emporium! What would you like?",JLabel.CENTER);
		ELabel.setFont(new Font(null, Font.PLAIN,20));
		
//		top.add(EImage);
//		top.add(ELabel);
		
		JPanel EControl = new JPanel();
		
		JButton Snowy = new JButton("<html><font color = 'green'> Snowy Owl");
		JButton Barn = new JButton("<html><font color = 'green'> Barn Owl");
		JButton Great = new JButton("<html><font color ='green'>Great Horned Owl");
		
		Snowy.setFont(new Font(null, Font.PLAIN,20));
		Barn.setFont(new Font(null,Font.PLAIN,20));
		Great.setFont(new Font(null, Font.PLAIN,20));
		
		EControl.add(Snowy);
		EControl.add(Great);
		EControl.add(Barn);
		
		//Shopping.add(top);
		Shopping.add(EImage);
		Shopping.add(ELabel);
		Shopping.add(EControl);
		
		Shopping.setVisible(true);
		
		Snowy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Shopping.dispose();
				SnowyOwl();
				return;
			}
		});
		
		Barn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Shopping.dispose();
				BarnOwl();
				return;
			}
		});
		
		Great.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Shopping.dispose();
				GreatOwl();
				return;
			}
		});
		
				
		o=1;
		return o;
				
	}
	
	protected void SnowyOwl(){
		JFrame OwlFrame = new JFrame("Your Owl");
		OwlFrame.setSize(800,700);
		OwlFrame.setLocationRelativeTo(null);
		OwlFrame.setLayout(new FlowLayout());
		
		OwlFrame.setVisible(true);
		
		OContainer = OwlFrame.getContentPane();
		OContainer.setBackground(Color.WHITE);
		
		ImageIcon SnowyIcon = new ImageIcon("SnowyOwl.jpg");
		JLabel ShowOwl = new JLabel(SnowyIcon);
		
		JLabel OwlLabel = new JLabel("<html><font color = 'green'>Congratulations on your new Snowy Owl!", JLabel.CENTER);
		OwlLabel.setFont(new Font(null, Font.PLAIN,20));
		JPanel OwlPanel = new JPanel();
		
		OwlPanel.add(ShowOwl);
		OwlFrame.add(OwlPanel);
		OwlFrame.add(OwlLabel);
		OwlFrame.setVisible(true);
//		
//		try{Thread.sleep(3000);}
//		catch(Exception e){};
//		
		//OwlFrame.dispose();
		return;
	}
	protected void BarnOwl(){
		JFrame OwlFrame = new JFrame("Your Owl");
		OwlFrame.setSize(800,700);
		OwlFrame.setLocationRelativeTo(null);
		OwlFrame.setLayout(new FlowLayout());
		
		OwlFrame.setVisible(true);
		
		OContainer = OwlFrame.getContentPane();
		OContainer.setBackground(Color.WHITE);
		
		ImageIcon SnowyIcon = new ImageIcon("BarnOwl.jpg");
		JLabel ShowOwl = new JLabel(SnowyIcon);
		
		JLabel OwlLabel = new JLabel("<html><font color = 'green'>Congratulations on your new Barn Owl!",JLabel.CENTER);
		OwlLabel.setFont(new Font(null, Font.PLAIN,20));
		JPanel OwlPanel = new JPanel();
		
		OwlPanel.add(ShowOwl);
		OwlFrame.add(OwlPanel);
		OwlFrame.add(OwlLabel);
		OwlFrame.setVisible(true);
		
//		try{Thread.sleep(3000);}
//		catch(Exception e){};
//		
		//OwlFrame.dispose();
		return;
	}
	protected void GreatOwl(){
		JFrame OwlFrame = new JFrame("Your Owl");
		OwlFrame.setSize(800,700);
		OwlFrame.setLocationRelativeTo(null);
		OwlFrame.setLayout(new FlowLayout());
		
		OwlFrame.setVisible(true);
		
		OContainer = OwlFrame.getContentPane();
		OContainer.setBackground(Color.WHITE);
		
		ImageIcon SnowyIcon = new ImageIcon("GreatOwl.jpg");
		JLabel ShowOwl = new JLabel(SnowyIcon);
		
		JLabel OwlLabel = new JLabel("<html><font color = 'green'>Congratulations on your new Great Horned Owl!",JLabel.CENTER);
		OwlLabel.setFont(new Font(null, Font.PLAIN,20));
		JPanel OwlPanel = new JPanel();
		
		OwlPanel.add(ShowOwl);
		OwlFrame.add(OwlPanel);
		OwlFrame.add(OwlLabel);
		OwlFrame.setVisible(true);
		
//		try{Thread.sleep(3000);}
//		catch(Exception e){};
//		
//		OwlFrame.dispose();
		return;
	}
}
