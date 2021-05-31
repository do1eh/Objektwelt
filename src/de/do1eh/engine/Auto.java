package de.do1eh.engine;

import java.awt.Color;


public abstract class Auto implements Runnable
{
  
	Fahrer fahrer;
	int positionx=20;
   int positiony=20;
   int geschwindigkeit=60;
   
   Color farbe;
   protected char richtung='N';
   Welt welt;
  
   
   
   public Auto(Fahrer fahrer, Color color, char richtung,int levelpositionx,int levelpositiony)
	{
		this.fahrer=fahrer;
		this.fahrer.setAuto(this);
	   setFarbe(color);
	this.richtung=richtung;
	
	setPositiony((levelpositiony*20)+4);
	setPositionx((levelpositionx*20)+4);	

	}
   
   public Auto(Fahrer fahrer, Color color)
	{
	   this.fahrer=fahrer;
		this.fahrer.setAuto(this);
	   setFarbe(color);
	this.richtung=Constants.NORDEN;
	
	setPositiony((1*20)+4);
	setPositionx((1*20)+4);
	}
   
	@Override
	public void run()
	{
		fahrer.autopilot();
	}
   
   private void weltAktualisieren()
   {
 
	  try
	{
		Thread.sleep(110-geschwindigkeit);
	} catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   welt.repaint();
	 
	

   }
   
/**
 * Dreht das Auto um 90° nach links.
 */
   public void  linksAbbiegen()
{
	if(richtung=='N') {richtung='W';}else
	if(richtung=='W') {richtung='S';}else
	if(richtung=='S') {richtung='O';}else
	if(richtung=='O') {richtung='N';}else
	weltAktualisieren();
}
   

/**
 * Fährt das Auto um einen Schritt nach vorne.
 */
   public void vorwaerts()
{
	for (int i=0;i<20;i++)
	{
		fahranimation();
	}
	
   if (welt.level.isKollision(this)) {welt.setGameOver(true);}
   if (welt.level.isZiel(this)) {welt.setWin(true);}
  
}
   
private void fahranimation()
{
	if(richtung=='N') {positiony--;};
	if(richtung=='W') {positionx--;};
	if(richtung=='S') {positiony++;};
	if(richtung=='O') {positionx++;};
	weltAktualisieren();
}


protected int getPositionx()
{
	return positionx;
}

protected void setPositionx(int positionx)
{
	this.positionx = positionx;
}
protected int getPositiony()
{
	return positiony;
}
protected void setPositiony(int positiony)
{
	this.positiony = positiony;
}

/**
 * Gibt die X-Position des Autos im Level zurück. (x=0 ist ganz links, x=20 ist ganz rechts.)
 * @return
 */
public int getLevelPositionx()
{
	return ((getPositionx() - 4) / 20) -1;
}

/**
 * Gibt die y-Position des Autos im Level zurück (y=0 ist ganz oben, y=20 ist ganz unten. )
 * @return
 */
public int getLevelPositiony()
{
	return ((getPositiony() - 4) / 20) -1;
}


/**
 * Gibt die Farbe es Autos zurück.
 * @return
 */
public Color getFarbe()
{
	return farbe;
}

/**
 * Setzt die Farbe des Autos zB: setFarbe(Color.GREEN) färbt das Auto grün.
 * @param farbe
 */
public void setFarbe(Color farbe)
{
	this.farbe = farbe;
}

protected Welt getWelt()
{
	return welt;
}

protected void setWelt(Welt welt)
{
	this.welt = welt;
	this.fahrer.setLevel(welt.getLevel());
}

/**
 * Gibt die Richtung (Norden,Süden,Osten,Westen) in die das Auto beim nächsten vorwaerts() fahren wird zurück.
 * @return
 */
public char getRichtung()
{
	return richtung;
}


/**
 * Legt die Richtung fest in die das Auto beim nächsten vorwaerts() fahren soll zB: setRichtung(Constants.NORDEN).
 * @param richtung
 */
public void setRichtung(char richtung)
{
	this.richtung = richtung;
}

@Override
public int hashCode()
{
	final int prime = 31;
	int result = 1;
	result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
	result = prime * result + positionx;
	result = prime * result + positiony;
	result = prime * result + richtung;
	return result;
}



@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Auto other = (Auto) obj;
	if (farbe == null)
	{
		if (other.farbe != null)
			return false;
	} else if (!farbe.equals(other.farbe))
		return false;
	if (positionx != other.positionx)
		return false;
	if (positiony != other.positiony)
		return false;
	if (richtung != other.richtung)
		return false;
	return true;
}

@Override
public String toString()
{
	return "Auto [positionx=" + positionx + ", positiony=" + positiony
			+ ", farbe=" + farbe + ", richtung=" + richtung + "]";
}


/**
 * Gibt die Geschwindigkeit des Autos zurück (1=langsam 100=schnell)
 * @return
 */

public int getGeschwindigkeit()
{
	return geschwindigkeit;
}

/**
 * Die Geschwindigkeit kann zwischen 1(langsam) und 100(schnell) eingestellt werden.
 * @param geschwindigkeit
 */
public void setGeschwindigkeit(int geschwindigkeit)
{
	if(geschwindigkeit>100) geschwindigkeit=100;
	if(geschwindigkeit<1) geschwindigkeit=1;
	this.geschwindigkeit = geschwindigkeit;
}

   
   
   
	
}
