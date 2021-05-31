package de.do1eh.fahrer;

import de.do1eh.autos.Kreisler;
import de.do1eh.engine.Fahrer;

public class Georg extends Fahrer
{

	Kreisler kreisler;
	public static final char	LEFTI	= 'L';
	public static final char	RIGHTI	= 'R';
	private char typ;

	public Georg(char typ)
	{
		this.typ=typ;
		
	}
	
	@Override
	public void autopilot()
	{
		kreisler=(Kreisler) this.auto;
		
		while (true)
		{
			kreisler.vorwaerts(4);
			if (typ==LEFTI)
			{
				kreisler.linksAbbiegen();
			} else
			{
				kreisler.rechtsAbbiegen();
			}

		}

	}
	
	

}
