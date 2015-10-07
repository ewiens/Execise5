package proj1;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class GraphicP1 extends JPanel{

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		
		int width=getWidth();
		int height= getHeight();
		int n=20;
		
		for(int i=0; i<20; i++) {
			g.drawLine(width, height-height*(n-i)/n,width-(width*i/n),height);
			g.setColor(Color.BLUE);
			//System.out.printf(" "+i); 
		}
		
		for(int i=0; i<20; i++) {
			g.drawLine(0, height-height*(n-i)/n, width-(width*i/n), 0);
			g.setColor(Color.BLUE);
			//System.out.printf(" "+i); 
			}
		
		for(int i=0; i<20; i++) {
			g.drawLine(0,height*i/n,width*i/n, height);
			g.setColor(Color.CYAN);
			//System.out.printf(" "+i); 
			}
		
		for(int i=0; i<20; i++) {
			g.drawLine(width,height*i/n,width*i/n, 0);
			g.setColor(Color.CYAN); 
			//System.out.printf(" "+i); 
			}
	}
}
