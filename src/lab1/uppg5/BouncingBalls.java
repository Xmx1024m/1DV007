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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BouncingBalls extends JPanel {
	private ImageIcon img = new ImageIcon("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab1\\uppg5\\ball.png");
	private int imgX =300;
	private int imgY = 300;
	private Timer timer;
	private ArrayList<TheBall> balls = new ArrayList<>();
	
	
	public BouncingBalls() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(600, 600));
		setFont(new Font("Arial", Font.BOLD, 32));
		
		timer = new Timer(33, new TimerListener());
		timer.start();
		
		JPanel ballPanel = new JPanel();
		ballPanel.setBackground(Color.white);
		
		JButton newBall = new JButton("Ny Boll");
		newBall.setBounds(100, 2, 50, 22);
		newBall.addActionListener(new addBallListener());
	}
	
	public ImageIcon getImg() {
		return img;
	}
	
	public int getX() { return imgY; }
	public int getY() { return imgX; }
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		getImg().paintIcon(this, g, getX(), getY());
	}
	
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
		}
	}
	
	private class addBallListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			TheBall aBall = new TheBall();
			repaint();
		}
	}
}
