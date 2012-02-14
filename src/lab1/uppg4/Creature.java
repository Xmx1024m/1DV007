package lab1.uppg4;

import javax.swing.ImageIcon;

public class Creature {
	
	private ImageIcon img = new ImageIcon("C:\\Users\\mmpa\\Pictures\\taz.jpg");
	private double imgX = 0.0;
	private double imgY = 0.0;
	
	public Creature () {
		ImageIcon creature = img;
		double X = imgX;
		double Y = imgY;
	}
	
	public ImageIcon getImg () { return img; }
	
	public double getX () { return imgX; }
	public double getY () { return imgY; }

}
