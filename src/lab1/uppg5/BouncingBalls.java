/*
 * Författare: Simon Metsi & Mathias Andreasen
 * BouncingBalls.java
 */
package lab1.uppg5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BouncingBalls extends JPanel {
	private Timer timer;
	private ArrayList<TheBall> balls = new ArrayList<>();
	TheBall aBall = new TheBall();	
	
	public BouncingBalls() {
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(600, 600));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		//Gör en ny timer och startar den.
		timer = new Timer(100, new TimerListener());
		timer.start();
		
		JButton newBall = new JButton("Ny Boll");
		newBall.setBounds(100, 2, 75, 22);
		newBall.addActionListener(new addBallListener());

		add(newBall);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		aBall.getImg().paintIcon(this, g, getX(), getY());
	}

	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			aBall.moveBall();
			repaint();
		}
	}
	
	private class addBallListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			TheBall aBall = new TheBall();
			aBall.moveBall();
		}
	}

}
