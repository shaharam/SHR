package Maman13.question1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disc extends JPanel{
	Color color;
	//panel
	//value 0 / 1
	
	public Disc() {
		color = getBackground();
	}
	
	public Disc(int player) {
		if (player == 1)
			this.color = Color.RED;
		else
			this.color = Color.BLUE;
//		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(this.color);
		g.fillOval(0, 0, getWidth(), getHeight());
	}
}