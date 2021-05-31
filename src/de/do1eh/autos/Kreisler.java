package de.do1eh.autos;

import java.awt.Color;

import de.do1eh.engine.Auto;
import de.do1eh.engine.Fahrer;

public class Kreisler extends Auto
{

	public Kreisler(Fahrer fahrer, Color color)
	{
		super(fahrer, color);
		
		// TODO Auto-generated constructor stub
	}
	
	public Kreisler(Fahrer fahrer, Color color,char richtung,int positionx, int positiony)
	{
		super(fahrer, color,richtung,positionx,positiony);
				
	}



	public void vorwaerts(int schritte)
	{
		for (int i = 0; i < schritte; i++)
		{
			vorwaerts();
		}
	}

	public void rechtsAbbiegen()
	{
		linksAbbiegen();
		linksAbbiegen();
		linksAbbiegen();
	}

	
	public void wenden()
	{
		linksAbbiegen();
		linksAbbiegen();
	}
	
}
