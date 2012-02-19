/*
 * Författare: Simon Metsi & Mathias Andreasen
 * BallPanel.java
 */
package lab1.uppg5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;


public class BallPanel extends JPanel {
	
	private final int WIDTH = 600, HEIGHT = 300;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	
	private JButton bollKnapp;
	
	private ImageIcon image;
	private Random rnd;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	
	// Ställer in panelen, inkluderar timern för animation
	public BallPanel () {
		
		timer = new Timer(DELAY, new BallListener());
		
		image = new ImageIcon ("C:\\Users\\mmpa\\workspace\\1DV007\\src\\lab1\\uppg5\\happyface.gif");
		
		x = 0;
		y = 200;
		moveX = moveY = 5;
		
		bollKnapp = new JButton("Ny Boll");
		bollKnapp.addActionListener(new buttonListener());
		bollKnapp.setBounds(2, 2, 80, 20);
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);
		setLayout(null);
		add(bollKnapp);
		timer.start();
	}
	
	// Ritar bilden i den nuvarnade positionen
	public void paintComponent (Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}
	
	// Actionlistener för vår timer
	private class BallListener implements ActionListener {
		
		// Uppdaterar positionen av bilden och riktning när bollen når kanten, vid varje timer-intervall
		public void actionPerformed (ActionEvent event) {
			x += moveX;
			y += moveY;
			
			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				moveX = moveX * -1;
			
			if (y <= 0 || y <= HEIGHT-IMAGE_SIZE)
				moveY = moveY * -1;
			
			repaint();
		}
	}
	
	private class buttonListener implements ActionListener {
		
		// Skapar en ny boll för varje tryckning
		public void actionPerformed (ActionEvent event) {
			
			int delay = (rnd.nextInt());
			timer.setDelay(delay);
			timer.restart();
		}
	}
	

}
