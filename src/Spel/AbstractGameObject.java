package Spel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class AbstractGameObject extends JPanel implements GameObject {

	// Skyddade variabler
	protected int x, y, width, height;
	
	public AbstractGameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void setWidth(int width) { this.width = width; }
	public void setHeight(int height) { this.height = height; }

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
