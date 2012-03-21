package spel;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends AbstractGameObject {

	public Player(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.white);
		g.fillRect(10, (600/2), 5, 25);
	}

}
