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
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(600, 600));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		//Gör en ny timer och startar den.
		timer = new Timer(delay, new TimerListener());
		timer.start();
		
		JLabel scoreLabel = new JLabel("Poäng: ");
		JButton reset = new JButton("Nollställ");
		
		reset.addActionListener(new resetListener()); //Lägger till en lyssnare för "Reset"-knappen
		addMouseListener (new catchListener()); //Lägger till en lyssnare för musen.
		
		// Bestämmer var "Reset", "Poäng: " och poängen ska vara på panelen.
		scoreLabel.setBounds(240, 2, 120, 20);
		score.setBounds(285, 2, 120, 20);
		reset.setBounds(2, 2, 80, 20);
		
		add(reset);
		add(score);
		add(scoreLabel);
	}
	
	public void paintComponent(Graphics g) { //Ritar upp taz.
		super.paintComponent(g);
		taz.getImg().paintIcon(this, g, taz.getX(), taz.getY());
	}
	
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) { //Efter en rand tidpunkt målas creature ut igen.
			taz.rand(); //Ger creature nya koordinater
			repaint();
		}
	}
	
	private class catchListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent event) { //if-sats som kontrollerar om creature är på den plats man klickat.
			if (taz.caughtCreature(event.getPoint().getX(), event.getPoint().getY())) { //Skickar med koordinaterna där man klickade.
				//Lägger till 1 poäng.
				String newpoint = Integer.toString(Integer.parseInt(score.getText())+1);
				score.setText(newpoint);
				taz.rand(); //Ger creature nya koordinater
				repaint();
			}
		}		
	}
	
	private class resetListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			score.setText("0"); //Återställer poängen vid klick på "Reset"-knappen.
			
		}
	}
}
