/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * Creature.java
 */
package lab1.uppg4;

import javax.swing.ImageIcon;

public class Creature {
	
	private ImageIcon img = new ImageIcon("C:\\Users\\mmpa\\Pictures\\taz.jpg");		// V�r monsterbild
	private double imgX = 0.0;		// X
	private double imgY = 0.0;		// och Y koordinater
	
	// Instansierar ett creature objekt med v�ran bild och koordinater
	public Creature () {
		ImageIcon creature = img;
		double X = imgX;
		double Y = imgY;
	}
	
	// Metod som tittar om spelaren tryckt p� monstret
	public boolean caughtCreature () {
		
		return false;
	}
	
	// Get metoder som talar f�r sig sj�lva
	public ImageIcon getImg () { return img; }
	
	public double getX () { return imgX; }
	public double getY () { return imgY; }

}
