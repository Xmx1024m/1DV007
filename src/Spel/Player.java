/*
 * Authors: Simon Metsi & Mathias Andreasen
 * Player.java
 */
package Spel;

public class Player {
	
	private int x, y, width, height;
	
	/*
	 * Spelarna �r egentligen "tomma objekt" som bara h�ller x,y, width och height v�rden
	 * som senare anv�nds f�r att rita upp dem i PongPanel.java
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
	 * H�r uppdaterar vi Y-koordinaten f�r v�ra spelar-br�dor,
	 * vi har ocks� tv� if-satser som checkar om spelaren n�tt
	 * slutet av sk�rmen
	 */
	public void setY(int y) {	
		
		this.y += y;
		
		if (this.y <= 0) 
			this.y = 0;
		if (this.y >= 450)
			this.y = 450;
	}

}
