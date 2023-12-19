package com.game.src.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Gameover {
	
	Controller c;
	
	public Gameover(Controller c)
	{
		this.c=c;
	}
	BufferedImage titleImg,backImg,playImg, helpImg, quitImg;
	String backPath = "/Game over.png";

	public Rectangle playButton= new Rectangle(248,270,150,40);
	public Rectangle helpButton= new Rectangle(248,336,150,40);
	
	public void render(Graphics g)
	{
		BufferedImageLoader loader = new BufferedImageLoader();
		try {
			backImg = loader.loadImage(backPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Graphics2D g2d= (Graphics2D) g;
		g.setColor(Color.WHITE);
		
		g2d.drawImage(backImg, null, null);

		// Set up the rectangle dimensions
		int rectX = 215;  // X-coordinate of the rectangle
		int rectY = 130;  // Y-coordinate of the rectangle
		int rectWidth = 225;  // Width of the rectangle
		int rectHeight = 60;  // Height of the rectangle

		// Draw the rectangle background
		g.setColor(Color.DARK_GRAY);  // Choose the color of the rectangle background
		g.fillRect(rectX, rectY, rectWidth, rectHeight);

		// Draw the text on top of the rectangle
		Font font = new Font("Helvetica", Font.BOLD, 30);
		g.setFont(font);
		g.setColor(Color.white);
		String text = "Final Score: " + Integer.toString(c.getEnemykilled());
		int textX = 220;  // X-coordinate of the text
		int textY = 170;  // Y-coordinate of the text
		g.drawString(text, textX, textY);
		
		
	}
	
}