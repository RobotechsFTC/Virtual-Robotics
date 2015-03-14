import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	int x = -25;
	int y = 193;
	int direction;
	protected void paintComponent(Graphics g) {
		g.drawImage(GUI.bg, -2, -2, this);
		g.drawImage(GUI.head, x, y,50,50, this);
	}
	public void moveRht(int amount){
		for(int i=0;i<amount;i++){
			x+=1;
			paintComponent(this.getGraphics());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
