package Spel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PongPanel extends JPanel {
	
	private final int WIDTH = 800, HEIGHT = 600;
	private Player p1, p2;
	
	//Hanterar poängen
	private JLabel scoreP1 = new JLabel("0");
	private JLabel divider = new JLabel("--");
	private JLabel scoreP2 = new JLabel("0");
	private JPanel scorePanel = new JPanel();
	
	//Bollen
	private Timer timer;
	private Random rnd = new Random();
	private int DELAY = 20;
	Ball boll = new Ball();
	
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
		
		
		//Startar timern för bollen		
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
		
		// I hedlig pong-anda så är spelarna vita
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
	

	
	//Ändra poängen när det blir 'mål'
	public void setScoreP1() {
		String newpoint = Integer.toString(Integer.parseInt(scoreP1.getText())+1);
		scoreP1.setText(newpoint);
	}
	public void setScoreP2() {
		String newpoint = Integer.toString(Integer.parseInt(scoreP2.getText())+1);
		scoreP2.setText(newpoint);
	}

	// Uppdaterar positionen av bilden och riktning när bollen når kanten eller spelarbrädet, vid varje timer-intervall
	private class BallListener implements ActionListener {
		
		public void actionPerformed (ActionEvent event) {
			
//			taz.caughtCreature(event.getPoint().getX(), event.getPoint().getY())
//			(WIDTH / 2), (WIDTH / 40), (HEIGHT / 4)
			boll.setX(boll.getX() + boll.getSpeedX());
			boll.setY(boll.getY() + boll.getSpeedY());
			
			//Kontrollerar om bollen träffar ett spelarbräde
//			if (p1Block()) {
//				boll.setSpeedX(-boll.getSpeedX());
//		        boll.setX(boll.getRadius());
//			} else if (p2Block()) {
//				boll.setSpeedX(-boll.getSpeedX());
//				boll.setX(WIDTH - boll.getRadius());
//			}
			
			//Kontrollerar om bollen åkt bakom en spelare och ger isf poäng
			if (boll.getX() - boll.getRadius() < 0) {
				setScoreP2();
				boll.setStartP2();
				repaint();
		    } else if (boll.getX() + boll.getRadius() > WIDTH) {
		    	setScoreP1();
		    	boll.setStartP1();
				repaint();
		    }
			
			//Kontrollerar om bollen träffat taket eller botten.
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
	
	public boolean p1Block () { //Kontrollerar om bollen träffat spelare 1's spelbräde och var på brädet.
		if (boll.getX()>=p1.getX() && boll.getX()<=(p1.getX()+150)
			&& boll.getY()>=p1.getY() && boll.getY()<=p1.getY()+122) {
			return true;
		}
		return false;
	}
	
	public boolean p2Block () { //Kontrollerar om bollen träffat spelare 2's spelbräde och var på brädet.
		if (boll.getX()>=p1.getX() && boll.getX()<=(p1.getX()+150)
			&& boll.getY()>=p1.getY() && boll.getY()<=p1.getY()+122) {
			return true;
		}
		return false;
	}
}
