/*
 * Authors: Simon Metsi & Mathias Andreasen
 * PongPanel.java
 */
package Spel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PongPanel extends JPanel {
	private final int WIDTH = 800, HEIGHT = 600;
	private Player p1, p2;
	int startDelay;
	
	//Hanterar po�ngen
	private JLabel scoreP1 = new JLabel("0");
	private JLabel divider = new JLabel("--");
	private JLabel scoreP2 = new JLabel("0");
	private JPanel scorePanel = new JPanel();
	
	//Bollen
	private Timer timer;
	private int DELAY = 20;
	Ball boll = new Ball();
	
	public PongPanel () {
		startDelay = 0;
		// Knapplysnare f�r v�ra spelare
		addKeyListener(new playerOneListener());		
		addKeyListener(new playerTwoListener());			
		
		// Instancierar v�ra spelare
		p1 = new Player(10, (WIDTH / 2), (WIDTH / 40), (HEIGHT / 4));
		p2 = new Player(770, (WIDTH / 2), (WIDTH / 40), (HEIGHT / 4));
		
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);			// m�ste vara true f�r att vi skall kunna r�ra spelarna
		
		
		//Startar timern f�r bollen		
		timer = new Timer(DELAY, new BallListener());
		timer.start();

		scorePanel.setBounds(340, 1, 300, 22);
		scorePanel.setBackground(Color.white);
		scoreP1.setBounds(350, 2, 100, 20);
		divider.setBounds(400, 2, 100, 20);
		scoreP1.setBounds(450, 2, 100, 20);
		
		add(scorePanel);
		scorePanel.add(scoreP1);
		scorePanel.add(divider);
		scorePanel.add(scoreP2);
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		// I hedlig pong-anda s� �r spelarna vita
		g.setColor(Color.white);
		
		// Spelare 1
		g.fillRect(p1.getX(), p1.getY(), p1.getWidth(), p1.getHeight());
		
		// Spelare 2
		g.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());
		
		//Bollen
		g.fillOval( (boll.getX() - boll.getRadius()), (boll.getY() - boll.getRadius()), (2 * boll.getRadius()), (2 * boll.getRadius()));
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
	

	
	//�ndra po�ngen n�r det blir 'm�l'
	public void setScoreP1() {
		String newpoint = Integer.toString(Integer.parseInt(scoreP1.getText())+1);
		scoreP1.setText(newpoint);
	}
	public void setScoreP2() {
		String newpoint = Integer.toString(Integer.parseInt(scoreP2.getText())+1);
		scoreP2.setText(newpoint);
	}

	// Uppdaterar positionen av bilden och riktning n�r bollen n�r kanten eller spelarbr�det, vid varje timer-intervall
	private class BallListener implements ActionListener {
		
		public void actionPerformed (ActionEvent event) {
			if (startDelay < 50) {
				startDelay++;
				repaint();
				return;
			}
			
			boll.move();

			if (boll.checkCollision(p1)) {
				boll.reflect();
			}

			if (boll.checkCollision(p2)) {
				boll.reflect();
			}
			
			//Kontrollerar om bollen �kt bakom en spelare och ger isf po�ng
			if (boll.getX() - boll.getRadius() < 0) {
				setScoreP2();
				startDelay = 0;
				boll.setStartP2();
				repaint();
		    } else if (boll.getX() + boll.getRadius() > WIDTH) {
		    	startDelay = 0;
		    	setScoreP1();
		    	boll.setStartP1();
				repaint();
		    }
			
			//Kontrollerar om bollen tr�ffat taket eller botten.
			if (boll.getY() - boll.getRadius() < 0) {
				boll.setSpeedY(-boll.getSpeedY());
		        boll.setY(boll.getRadius());
	        } else if (boll.getY() + boll.getRadius() > (HEIGHT)) {
	            boll.setSpeedY(-boll.getSpeedY());
			    boll.setY((HEIGHT) - boll.getRadius());
	        }
			
			repaint();
		}
	}
}
