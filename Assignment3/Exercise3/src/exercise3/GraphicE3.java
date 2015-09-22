package exercise3;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class GraphicE3 extends JPanel{

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		
		int width=getWidth();
		int height= getHeight();
		int n=20;
		
		for(int i=0; i<20; i++) {
			g.drawLine(width, height-height*(n-i)/n,width-(width*i/n),height);
			g.setColor(Color.magenta);
			//System.out.printf(" "+i); 
		}
		
		for(int i=0; i<20; i++) {
			g.drawLine(0, height-height*(n-i)/n, width-(width*i/n), 0);
			g.setColor(Color.green);
			//System.out.printf(" "+i); 
			}
		
		for(int i=0; i<20; i++) {
			g.drawLine(0,height*i/n,width*i/n, height);
			g.setColor(Color.blue);
			//System.out.printf(" "+i); 
			}
		
		for(int i=0; i<20; i++) {
			g.drawLine(width,height*i/n,width*i/n, 0);
			g.setColor(Color.blue); 
			//System.out.printf(" "+i); 
			}
		
		
		
	}

}
