package test;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

import javax.swing.*;
public class testing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("RotateImage");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(600,400);
	       Toolkit toolkit = Toolkit.getDefaultToolkit();
	   	   Image image = toolkit.getImage("data\\img\\Boss.png");
	       RotateImage a = new RotateImage(image,(Math.PI*3)/2);
	       frame.setContentPane(a);  
	       frame.setVisible(true);  
	}
}
