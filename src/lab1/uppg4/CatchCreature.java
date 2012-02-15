/*
 * Författare: Simon Metsi & Mathias Andreasen
 * CatchCreature.java
 */
package lab1.uppg4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchCreature extends JPanel {
	private Creature taz = new Creature();
	private Random rnd = new Random();
	private int delay = rnd.nextInt(5000);
	private Timer timer = new Timer(delay, new TimerListener());
	
	public CatchCreature () {
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(600, 600));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		timer.start();
		
		JPanel creaturePanel = new JPanel();

		JLabel scoreLabel = new JLabel("Poäng: ");
		scoreLabel.setBounds(240, 2, 120, 20);
		
		JLabel score = new JLabel("14");
		score.setBounds(285, 2, 120, 20);
		
		JButton reset = new JButton("Reset");
		reset.setBounds(2, 2, 80, 20);
		
		add(reset);
		add(creaturePanel);
		add(score);
		add(scoreLabel);
	}
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		taz.getImg().paintIcon(this, page, taz.getX(), taz.getY());
	}
	
	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			taz.rand();
			repaint();
		}
		
	}
}
