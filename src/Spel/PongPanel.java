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
		
		addKeyListener(new playerOneListener());		// lyssnare för spelare 1
		addKeyListener(new playerTwoListener());			// lyssnare för spelare 2
		
		// Add players
		p1 = new Player(10, (WIDTH / 2), (WIDTH / 40), (HEIGHT / 6));
		
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.white);
		
		// Spelare 1
		g.fillRect(p1.getX(), p1.getY(), p1.getWidth(), p1.getHeight());
		
		// Spelare 2
		//g.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());
	}
	
	private class playerOneListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			
			switch (e.getKeyCode()) {
			
			case KeyEvent.VK_W:
				p1.setY(-5);
				System.out.print("Upp");
				break;
				
			case KeyEvent.VK_S:
				p1.setY(5);
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
				p2.setY(-5);
				System.out.print("UP");
				break;
				
			case KeyEvent.VK_DOWN:
				p2.setY(5);
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
