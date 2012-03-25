package Spel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class PongPanel extends JPanel {
	
	private final int WIDTH = 800, HEIGHT = 600;
	private Player p1, p2;
	private JLabel score_left, score_right;
	
	public PongPanel () {
		
		// Knapplysnare för våra spelare
		addKeyListener(new playerOneListener());		
		addKeyListener(new playerTwoListener());			
		
		// Instancierar våra spelare
		p1 = new Player(10, (WIDTH / 2), (WIDTH / 40), (HEIGHT / 4));
		p2 = new Player(770, (WIDTH / 2), (WIDTH / 40), (HEIGHT / 4));
		
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);			// måste vara true för att vi skall kunna röra spelarna
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		// I hedlig pong-anda så är spelarna vita
		g.setColor(Color.white);
		
		// Spelare 1
		g.fillRect(p1.getX(), p1.getY(), p1.getWidth(), p1.getHeight());
		
		// Spelare 2
		g.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());
	}
	
	private class playerOneListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			
			switch (e.getKeyCode()) {
			
			case KeyEvent.VK_W:
				p1.setY(-20);
				break;
				
			case KeyEvent.VK_S:
				p1.setY(20);
				break;
			}
			
			repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
		
		
	}
	
	private class playerTwoListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			
			switch (e.getKeyCode()) {
			
			case KeyEvent.VK_UP:
				p2.setY(-20);
				break;
				
			case KeyEvent.VK_DOWN:
				p2.setY(20);
				break;
			}
			
			repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
		
	}

}
