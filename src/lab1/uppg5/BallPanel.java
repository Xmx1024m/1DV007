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
	
	private final int WIDTH = 640, HEIGHT = 480;
	private final int DELAY = 10, IMAGE_SIZE = 35;
	
	private JButton bollKnapp;
	
	private ImageIcon image;
	private Random rnd;
	private Timer timer;
	private int moveX, moveY, speedX, speedY;
	private Ball ball;
	private int ballRadius = 35;
	
	
	// Ställer in panelen, inkluderar timern för animation
	public BallPanel () {
		
		timer = new Timer(DELAY, new BallListener());
		
		image = new ImageIcon ("C:\\Users\\metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab1\\uppg5\\happyface.gif");
		
		moveX = 50;
		moveY = 200;
		speedX = 2;
		speedY = 3;
		
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
		image.paintIcon(this, page, moveX, moveY);
	}
	
	// Actionlistener för vår timer
	private class BallListener implements ActionListener {
		
		// Uppdaterar positionen av bilden och riktning när bollen når kanten, vid varje timer-intervall
		public void actionPerformed (ActionEvent event) {
				moveX += speedX;
				moveY += speedY;
				
				if (moveX - ballRadius < 0) {
					speedX = - speedX;
					moveX = ballRadius;
				} else if (moveX + ballRadius > WIDTH) {
					speedX = - speedX;
					moveX = WIDTH-ballRadius;
				}
				
				if (moveY - ballRadius < 0) {
					speedY = - speedY;
					moveY = ballRadius;
				} else if (moveY + ballRadius > HEIGHT) {
					speedY = -speedY;
					moveY = HEIGHT-ballRadius;
				}
				
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
