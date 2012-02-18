/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * CatchCreature.java
 */
package lab1.uppg4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchCreature extends JPanel {
	private Creature taz = new Creature();
	private Random rnd = new Random();
	private int delay = 400+rnd.nextInt(2000);
	private Timer timer;
	private JLabel score = new JLabel("0");
	
	public CatchCreature () {
		
		// Panel egenskaper
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(600, 600));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		// initierar v�r timer och startar den
		timer = new Timer(delay, new TimerListener());
		timer.start();
		
		// Kopplar p� v�r catchListener
		addMouseListener (new catchListener());
		
		// Panel junk, po�ngtext bla bla bla
		JPanel creaturePanel = new JPanel();

		JLabel scoreLabel = new JLabel("Po�ng: ");
		scoreLabel.setBounds(240, 2, 120, 20);
		
		score.setBounds(285, 2, 120, 20);
			
		JButton reset = new JButton("Nollst�ll");
		reset.addActionListener(new resetListener());
		reset.setBounds(2, 2, 80, 20);
		
		add(reset);
		add(creaturePanel);
		add(score);
		add(scoreLabel);
	}
	
	// Ritar v�r grafik
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		taz.getImg().paintIcon(this, g, taz.getX(), taz.getY());
	}
	
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			rnd = new Random(); // Denna g�r ingenting!
			taz.rand();
			repaint();
		}
	}
	
	// Om spelaren tryckt p� v�rt monster uppdateras po�ng, och en ny timer ges
	private class catchListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent event) {
			
			
			if (taz.caughtCreature(event.getPoint().getX(), event.getPoint().getY())) {
				
				String newpoint = Integer.toString(Integer.parseInt(score.getText())+1);
				score.setText(newpoint);
				
				timer.stop();
				timer.setDelay(400+rnd.nextInt(2000));
				timer.start();
			}
			
		}		
	}
	
	// Lyssnaren f�r Reset-knappen
	private class resetListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			score.setText("0");
			
		}
	}
}
