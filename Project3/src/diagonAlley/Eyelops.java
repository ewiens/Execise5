package diagonAlley;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eyelops extends Shop{
	
	protected int EMerch(int o){
	
		JFrame Shopping = new JFrame();
		Shopping.setLayout(new GridLayout(2,1));
		Shopping.setSize(800, 700);
		SContainer= Shopping.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1,2));
		
		ImageIcon EIcon = new ImageIcon("EeylopsOwl.jpg");
		JLabel EImage = new JLabel(EIcon);
		
		JLabel ELabel = new JLabel("<html><font color = 'green'> Welcome to Eeylops Owl Emporium! What would you like?");
		
		top.add(EImage);
		top.add(ELabel);
		
		JPanel EControl = new JPanel();
		
		JButton Snowy = new JButton("<html><font color = 'green'> Snowy Owl");
		JButton Barn = new JButton("<html><font color = 'green'> Barn");
		JButton Great = new JButton("<html><font color ='green'>Great Horned Owl");
		
		Snowy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				return;
			}
		});
		
		
		EControl.add(Snowy);
		EControl.add(Great);
		EControl.add(Barn);
		
		
		
		
		o=1;
		return o;
				
	}
	
}
