package de.do1eh.engine;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;



public final class Welt extends JFrame
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	Level	level;
	private Image bufferimage;
	private Graphics grafik;
	private boolean gameOver=false;
	private boolean win=false;
    List<Thread> threads=new LinkedList<Thread>();
    
	public Welt(Level level)
	{
		this.level = level;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		
		if(level.getText().length()>0)
		{
			LevelInfo info=new LevelInfo(level.getText());
			info.setVisible(true);
		}	
		

	}

	public Welt()
	{
	}

	private void init ()
	{  
		// Zeichne zuerst in einen Puffer um flackern zu verhindern
		bufferimage=createImage(500,500);
		grafik=bufferimage.getGraphics();
		paintWelt(grafik);
		
	}

@Override
public void paint(Graphics g) {
init();
g.drawImage(bufferimage,0,0,this);


	
};
	
	
	
	/**
	 * Level auslesen.
	 * @return
	 */
	public Level getLevel()
{
	return level;
}

	protected boolean isGameOver()
{
	return gameOver;
}
	
	private void stopThreads()
	{
		for (Iterator<Thread> iterator = threads.iterator(); iterator.hasNext();)
		{
			Thread thread = (Thread) iterator.next();
			thread.stop();
			
		}
	}

protected void setGameOver(boolean gameOver)
{
	this.gameOver = gameOver;
}

protected boolean isWin()
{
	return win;
}

protected void setWin(boolean win)
{
	this.win = win;
}

	private void paintWelt(Graphics g)
	{
		// super.paint( g );

		zeichneWelt(g);
		zeichneAutos(g);
		if (isGameOver()) {zeichneGameOver(g); stopThreads();}
		if (isWin()) {zeichneWin(g); stopThreads();}

	}

	protected void animate()
	{
		for (Iterator<Auto> iterator = level.getAutos().iterator(); iterator
				.hasNext();)
		{
			Auto auto = (Auto) iterator.next();
			auto.setWelt(this);

			Thread thread = new Thread(auto);
			thread.start();
			threads.add(thread);

		}
	}

	private void zeichneAuto(int x, int y, Color farbe, Graphics g)
	{
		g.setColor(farbe);
		g.fillRect(x, y, 10, 10);

	}

	/**
	 * Die Welt wird in 20x20er Blöcken gezeichnet. 
	 * @param g
	 */
	private void zeichneWelt(Graphics g)
	{
		
		g.setColor(Color.ORANGE);
		g.fillRect(20, 20, Constants.WELTBREITE*20, Constants.WELTHOEHE*20);
		
		for (int y = 0; y < Constants.WELTHOEHE; y++)
		{
			for (int x = 0; x < Constants.WELTBREITE; x++)
			{
				zeichneWeltobjekt((x+1) * 20, (y+1) * 20, level.getLevelobjekt(y, x), g);
			}
		}
	}

	
	private void zeichneGameOver(Graphics g)
	{
		g.setColor(Color.RED);
		g.setFont(new Font(Font.DIALOG,Font.BOLD,50));
		g.drawString("GameOver", Constants.TEXTPOSX, Constants.TEXTPOSY);
	}
	
	private void zeichneWin(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.setFont(new Font(Font.DIALOG,Font.BOLD,50));
		g.drawString("GEWONNEN", Constants.TEXTPOSX, Constants.TEXTPOSY);
	}
	
	/**
	 * Autos erhalten direkt die Koordinaten, damit eine saubere Animation möglich ist.
	 * @param g
	 */
	private void zeichneAutos(Graphics g)
	{

		for (Iterator<Auto> iterator = level.getAutos().iterator(); iterator.hasNext();)
		{
			Auto auto = (Auto) iterator.next();
			zeichneAuto((auto.positionx+1), (auto.positiony+1),
					auto.getFarbe(), g);
		}
	}

	/**
	 * Zeichnen Straßen Längs (L) oder Quer (Q).
	 * 
	 * @param x
	 * @param y
	 * @param richtung
	 * @param g
	 */
	private void zeichneWeltobjekt(int x, int y, char objekt, Graphics g)
	{
		

		switch (objekt)
		{
		case Constants.STRASSEVERTIKAL:
			g.setColor(Color.BLACK);
			g.fillRect(x, y, 20, 20);
			g.setColor(Color.WHITE);
			g.fillRect(x + 8, y, 4, 4);
			g.fillRect(x + 8, y + 7, 4, 5);
			g.fillRect(x + 8, y + 14, 4, 5);
			break;

		case Constants.STRASSEHORIZONTAL:
			g.setColor(Color.BLACK);
			g.fillRect(x, y, 20, 20);
			g.setColor(Color.WHITE);
			g.fillRect(x, y + 8, 5, 4);
			g.fillRect(x + 7, y + 8, 5, 4);
			g.fillRect(x + 14, y + 8, 6, 4);
			break;
			
		case Constants.WASSER:
		    g.setColor(Color.BLUE);
			g.fillRect(x, y , 20, 20);
			break;	
			
		case Constants.ZIEL:
		    g.setColor(Color.BLACK);
			g.fillRect(x, y , 20, 20);
			g.setColor(Color.WHITE);
			g.fillOval(x+5, y+5, 10, 10);
			break;	
			
		case Constants.BAUM:
		    g.setColor(Color.green);
			g.fillOval(x, y , 20, 20);
			break;	
			
		default:
			break;
		}

	}

}