package Spel;

import java.awt.Graphics;

public interface GameObject {
	
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	
	public void setX(int x);
	public void setY(int y);
	public void setWidth(int width);
	public void setHeight(int height);
	public void setLocation(int x, int y);			// Vart ett objekt ska "spawna" på skärmen

}
