/*
 * Authors: Simon Metsi & Mathias Andreasen
 * Player.java
 */
package Spel;

public class Player {
	
	private int x, y, width, height;
	
	public Player(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public void setY(int y) {	
		
		this.y += y;
	}

}
