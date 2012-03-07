package lab1.uppg5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Formatter;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bounce extends JPanel {
   // Container box's width and height
   private static final int WIDTH = 640;
   private static final int HEIGHT = 480;
   
   private Random rnd = new Random();
  
   // Ball's properties
   private float ballRadius = 100; // Ball's radius
   private float ballX = ballRadius + 25; // Ball's center (x, y)
   private float ballY = ballRadius + 10; 
   private float ballSpeedX = 1+(5*rnd.nextFloat());   // Ball's speed for x and y
   private float ballSpeedY = 1+(5*rnd.nextFloat());
  
   private static final int UPDATE_RATE = 30; // Number of refresh per second
  
   /** Constructor to create the UI components and init game objects. */
   public Bounce() {
      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      run();
   }
   
   public void run() {
       while (true) { // Execute one update step
          // Calculate the ball's new position
          ballX += ballSpeedX;
          ballY += ballSpeedY;
          // Check if the ball moves over the bounds
          // If so, adjust the position and speed.
          if (ballX - ballRadius < 0) {
             ballSpeedX = -ballSpeedX; // Reflect along normal
             ballX = ballRadius; // Re-position the ball at the edge
          } else if (ballX + ballRadius > WIDTH) {
             ballSpeedX = -ballSpeedX;
             ballX = WIDTH - ballRadius;
          }
          // May cross both x and y bounds
          if (ballY - ballRadius < 0) {
             ballSpeedY = -ballSpeedY;
             ballY = ballRadius;
          } else if (ballY + ballRadius > HEIGHT) {
             ballSpeedY = -ballSpeedY;
             ballY = HEIGHT - ballRadius;
          }
          // Refresh the display
          repaint(); // Callback paintComponent()
       }
    }
   
   /** Custom rendering codes for drawing the JPanel */
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);    // Paint background
  
      // Draw the box
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, WIDTH, HEIGHT);
  
      // Draw the ball
      g.setColor(Color.BLUE);
      g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius),
            (int)(2 * ballRadius), (int)(2 * ballRadius));
   }
}