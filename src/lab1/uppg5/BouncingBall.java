/*
 * Författare: Simon Metsi & Mathias Andreasen
 * Ball.java
 */
package lab1.uppg5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall {
	
	public static void main (String[] args) {
		
		JFrame frame = new JFrame("Balls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new BallPanel());
		frame.pack();
		frame.setVisible(true);
	}

}
