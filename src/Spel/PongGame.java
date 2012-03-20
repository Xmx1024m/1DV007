package Spel;

import javax.swing.JFrame;

public class PongGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Pong-Game");
		PongPanel pong = new PongPanel();
		
		frame.add(pong);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
