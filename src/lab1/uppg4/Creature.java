/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * Creature.java
 */
package lab1.uppg4;

import java.util.Random;

import javax.swing.ImageIcon;

public class Creature {
	
	private ImageIcon img = new ImageIcon("C:\\Users\\mmpa\\workspace\\1DV007\\src\\lab1\\uppg4\\taz.jpg"); // V�r monsterbild
	private Random rnd = new Random();
	
	private int imgX = 0;		// X
	private int imgY = 0;		// och Y koordinater
	
	
	// Instansierar ett creature objekt med v�r bild och koordinater.
	public Creature () {
		rand();
	}
	
	// Metod som tittar om spelaren tryckt p� monstret.
	public boolean caughtCreature (double x, double y) { //Kontroll om (x, y) �r inom omr�det f�r creature, isf 'true'.
		if (x >= imgX && x<=(imgX+150)
			&& y>= imgY && y<= imgY+122) {
			return true;
		}
		return false;
	}
	
	// Get metoder som talar f�r sig sj�lva.
	public ImageIcon getImg () { return img; }
	public int getX () { return imgX; }
	public int getY () { return imgY; }
	
	public void rand() { //Ger random koordinaterna f�r creature.
		imgX = rnd.nextInt(450);
		imgY = 22+rnd.nextInt(456);
	}
	
}
