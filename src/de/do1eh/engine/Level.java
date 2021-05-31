package de.do1eh.engine;

import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.do1eh.autos.Kreisler;
import de.do1eh.autos.Porsche;
import de.do1eh.fahrer.LaLinea;


public class Level
{

	private char[][]	welt			= new char[Constants.WELTBREITE][Constants.WELTBREITE];
	private List<Auto>	autos			= new LinkedList<Auto>();
	private int			UserStartpunktX	= 0;
	private int			UserStartpunktY	= 0;
	private String text="";

	/**
	 * Prüfen ob an der Postion des Autos eine Kollision vorliegt.
	 * @param auto
	 * @return
	 */
	
	public boolean isKollision(int levelpositionx,int levelpositiony)
	{

		//int posx = (((levelpositionx+1)*20)+4);
		//int posy = (((levelpositiony+1) *20) +4);

		Kreisler auto=new Kreisler(new LaLinea(),Color.GREEN,Constants.NORDEN,levelpositionx+1,levelpositiony+1);
		
	
		return isKollision(auto);
	}
	
	
	protected boolean isKollision(Auto auto)
	{

		int posx =((auto.getPositionx() - 4) / 20) - 1;
		int posy = ((auto.getPositiony() - 4) / 20) - 1;

		// Grenzen
		if (posx > Constants.WELTBREITE || posx < 0
				|| posy > Constants.WELTHOEHE || posy < 0)
		{
			//System.out.println("Grenze");
			return true;
		}

		// keine Strasse
		if (welt[posy][posx] != Constants.STRASSEHORIZONTAL
				&& welt[posy][posx] != Constants.STRASSEVERTIKAL
				&& welt[posy][posx] != Constants.ZIEL)
		{
			
			//System.out.println("keine Strasse");
			return true;
		}

		// Autos

		for (Iterator<Auto> iterator = autos.iterator(); iterator.hasNext();)
		{
			Auto listauto = (Auto) iterator.next();

			if (!auto.equals(listauto))
			{
				if (auto.getPositionx() - listauto.getPositionx() < 20
						&& auto.getPositionx() - listauto.getPositionx() > -20
						&& auto.getPositiony() - listauto.getPositiony() < 20
						&& auto.getPositiony() - listauto.getPositiony() > -20)
				{
					//System.out.println("auto");
					return true;
				}
			}

		}

		return false;
	}

	/**
	 * Prüfen ob sich das Ziel an der Position des Autos befindet.
	 * @param auto
	 * @return
	 */
	protected boolean isZiel(Auto auto)
	{

		int posx = ((auto.getPositionx() - 4) / 20) - 1;
		int posy = ((auto.getPositiony() - 4) / 20) - 1;

		if (welt[posy][posx] == Constants.ZIEL)
		{
			return true;
		}

		return false;
	}

	/**
	 * Das Auto des Users zum Level hinzufügen.
	 * 
	 * @param auto
	 */
	protected void addUserAuto(Auto auto)
	{
		auto.setPositionx((UserStartpunktX * 20) + 4);
		auto.setPositiony((UserStartpunktY * 20) + 4);
		this.autos.add(auto);
	}

	/**
	 * Auslesen was sich an der Position im Level befindet.
	 * 
	 * @param posx
	 * @param posy
	 * @return
	 */
	public char getLevelobjekt(int posx, int posy)
	{
		return welt[posx][posy];
	}

	

	/**
	 * Bots für das Level hinzufügen
	 * 
	 * @param auto
	 */
	protected void addLevelAuto(Auto auto)
	{
		this.autos.add(auto);
	}

	/**
	 * Komplette Welt erstellen.
	 * 
	 * @param welt
	 */
	protected void setWelt(char[][] welt)
	{
		this.welt = welt;
	}

	protected void setUserStartpunktX(int userStartpunktX)
	{
		UserStartpunktX = userStartpunktX;
	}

	protected void setUserStartpunktY(int userStartpunktY)
	{
		UserStartpunktY = userStartpunktY;
	}

	/**
	 * Eine Liste aller Autos (User + Bots) des Levels auslesen.
	 * @return
	 */
	public List<Auto> getAutos()
	{
		return autos;
	}

	public String getText()
	{
		return text;
	}

	protected void setText(String text)
	{
		this.text = text;
	}
	

}
