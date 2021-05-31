package de.do1eh.fahrer;

import de.do1eh.autos.Kreisler;
import de.do1eh.engine.Constants;
import de.do1eh.engine.Fahrer;

public class LaLinea extends Fahrer
{

	Kreisler kreisler;
	
	
	@Override
	public void autopilot()
	{
		kreisler=(Kreisler) this.auto;
		
		while (true)
		{
			while(isVorneFrei())
			{	
			kreisler.vorwaerts();
			}
			kreisler.wenden();
		}

	}
	
	public boolean isVorneFrei()
	{
		if(kreisler.getRichtung()==Constants.NORDEN) {return isStrasse(kreisler.getLevelPositionx(), kreisler.getLevelPositiony()-1);}
		if(kreisler.getRichtung()==Constants.OSTEN) {return isStrasse(kreisler.getLevelPositionx()+1, kreisler.getLevelPositiony());} 
		if(kreisler.getRichtung()==Constants.SUEDEN) {return isStrasse(kreisler.getLevelPositionx(), kreisler.getLevelPositiony()+1);} 
		if(kreisler.getRichtung()==Constants.WESTEN) {return isStrasse(kreisler.getLevelPositionx()-1, kreisler.getLevelPositiony());} 
		return false;
	}
	
	
	public boolean isStrasse(int x, int y)
	{
		char objekt=level.getLevelobjekt(y,x);
		
		if (objekt==Constants.STRASSEHORIZONTAL|objekt==Constants.STRASSEVERTIKAL |objekt==Constants.ZIEL) {return true;}
		return false;
	}

}
