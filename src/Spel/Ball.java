/*
 * Författare: Simon Metsi & Mathias Andreasen
 * Ball.java
 */
package Spel;

import java.util.Random;

public class Ball {
	
	private final int RADIUS = 10; // Bollens radie
	
	private Random rnd = new Random();
	private int ballX, ballY, ballSpeedX, ballSpeedY;
	private final int ballStartSpeedP1, ballStartSpeedP2, ballStartX, ballStartY;
	
	public Ball() {
		
		ballX = (800 / 2);
		ballY = (600 / 2);
		
		ballSpeedX = (- rnd.nextInt(5) + 5);
		ballSpeedY = (- rnd.nextInt(5) + 5);
		
		ballStartSpeedP1 = -5;
		ballStartSpeedP2 = 5;
		ballStartX = (800 / 2);
		ballStartY = (600 / 2);
	}
	
	public void setX (int n) { ballX = n; }
	public void setY (int n) { ballY = n; }
	public void setSpeedX (int n) { ballSpeedX = n; }
	public void setSpeedY (int n) { ballSpeedY = n; }
	public void setStartP1() {
		ballSpeedX = -7;
		ballX = ballStartX;
		ballY = ballStartY;
	}
	
	public void setStartP2() {
		ballSpeedX = 7;
		ballX = ballStartX;
		ballY = ballStartY;
	}
	
	public int getX () { return ballX; }
	public int getY () { return ballY; }
	public int getSpeedX () { return ballSpeedX; }
	public int getSpeedY () { return ballSpeedY; }
	public int getRadius () { return RADIUS; }
}
