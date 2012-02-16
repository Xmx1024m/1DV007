/*
 * Författare: Simon Metsi & Mathias Andreasen
 * BouncingBallsMain.java
 */
package lab1.uppg5;

import javax.swing.JFrame;


public class BouncingBallsMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bouncing Balls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BouncingBalls panel = new BouncingBalls();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
