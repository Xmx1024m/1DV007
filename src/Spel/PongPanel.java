package Spel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class PongPanel extends JPanel {
	
	private final int WIDTH = 800, HEIGHT = 600;
	private JLabel score_left, score_right;
	private Player p1, p2;						// våra två spelare
	
	public PongPanel() {
		
		// Poäng markör på varje planhalva
		score_left = new JLabel("0");
		score_right = new JLabel("0");
		
		p1 = new Player(10, (HEIGHT / 2), 32, 150);
		p1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					p1.setY(10);
				}
				
				p1.repaint();
				
			}
		});
		
		add(p1);
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		setLayout(null);
	}

}
