/*
 * Författare: Simon Metsi & Mathias Andreasen
 * Creature.java
 */
package lab1.uppg4;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Creature {
	
	private ImageIcon img = new ImageIcon("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab1\\uppg4\\taz.jpg"); // Vår monsterbild
	private Random rnd = new Random();
	
	private int imgX = 0;		// X
	private int imgY = 0;		// och Y koordinater
	
	
	// Instansierar ett creature objekt med våran bild och koordinater
	public Creature () {
		rand();
	}
	
	// Metod som tittar om spelaren tryckt på monstret
	public boolean caughtCreature () {
		
		return false;
	}
	
	// Get metoder som talar för sig själva
	public ImageIcon getImg () { return img; }
		
	public void rand() {
		imgX = rnd.nextInt(450);
		imgY = 22+rnd.nextInt(456);
	}
	
	public int getX () { return imgX; }
	public int getY () { return imgY; }
}
