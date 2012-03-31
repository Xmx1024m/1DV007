/*
 * Authors: Simon Metsi & Mathias Andreasen
 * PongGame.java
 */
package Spel;

import javax.swing.JFrame;

public class PongGame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pong-Game");
		PongPanel pong = new PongPanel();
		frame.setLocation(300, 300);
		frame.add(pong);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
