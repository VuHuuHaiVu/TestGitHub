package test;

import java.awt.*;
import javax.swing.*;

public class RotateImage extends JPanel {
	//Image Object
	protected Image image;
	protected double angle;
	public RotateImage(Image image,double d) {
		this.image = image;
		this.angle = d;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g2d.rotate(angle,32,32);
		g2d.drawImage(image,0,0,64,64,this);
	}
}
