package diagonAlley;

import javax.swing.*;
import java.awt.*;

public class Shop {
	
public String name;
public String Item1name;
public String Item2name;
public String Item3name;
protected JFrame Shopping;
protected JLabel ShopLabel;
protected JPanel ShopPanel;
protected Container SContainer;

	
	protected void Merch(){
		
		JFrame Shopping = new JFrame(name);
		Shopping.setLayout(new GridLayout(2,1));
		Shopping.setSize(800, 700);
		SContainer= Shopping.getContentPane();
		SContainer.setBackground(Color.WHITE);
		
		JButton Item1= new JButton(Item1name);
		JButton Item2= new JButton(Item2name);
		JButton Item3= new JButton(Item3name);
		
		ShopPanel.add(Item1);
		ShopPanel.add(Item2);
		ShopPanel.add(Item3);
		
		Shopping.setVisible(true);
		
		return;
	}

}
