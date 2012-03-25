/*
 * Authors: Simon Metsi & Mathias Andreasen
 * Player.java
 */
package Spel;

public class Player {
	
	private int x, y, width, height;
	
	/*
	 * Spelarna är egentligen "tomma objekt" som bara håller x,y, width och height värden
	 * som senare används för att rita upp dem i PongPanel.java
	 */
	public Player(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	// Simpla get-metoder
	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	/*
	 * Här uppdaterar vi Y-koordinaten för våra spelar-brädor,
	 * vi har också två if-satser som checkar om spelaren nått
	 * slutet av skärmen
	 */
	public void setY(int y) {	
		
		this.y += y;
		
		if (this.y <= 0) 
			this.y = 0;
		if (this.y >= 450)
			this.y = 450;
	}

}
