package lab1.uppg5;

import javax.swing.ImageIcon;

public class TheBall {
	private ImageIcon img = new ImageIcon("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab1\\uppg5\\ball.png");
	private int imgX = 300;
	private int imgY = 300;
	private int course;
	
	public void moveBall() {
		imgX += 1;
		imgY += 1;
	}
	
	public ImageIcon getImg() { return img; }
	public int getX() { return imgY; }
	public int getY() { return imgX; }
}
