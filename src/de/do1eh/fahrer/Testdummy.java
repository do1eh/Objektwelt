package de.do1eh.fahrer;

import de.do1eh.autos.Kreisler;
import de.do1eh.engine.Constants;
import de.do1eh.engine.Fahrer;

public class Testdummy extends Fahrer
{

	Kreisler	kreisler;

	@Override
	public void autopilot()
	{
		kreisler = (Kreisler) this.auto;
		kreisler.setGeschwindigkeit(100);
		level7loesung();

	}

	private void level4loesung()
	{
		for (int i = 11; i > 0; i--)
		{
			kreisler.vorwaerts(i);
			kreisler.rechtsAbbiegen();
		}
	}

	private void level5loesung()
	{
		vorbisHindernis();
		ausweichen();
		vorbisHindernis();
	}

	private void level6loesung()
	{
		while (true)
		{

			if (!isStrasse(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony() - 1)
					|| isFrei())
			{
				kreisler.vorwaerts();
			}
		}
	}

	private void level7loesung()
	{
		vorbisHindernis();
		kreisler.setGeschwindigkeit(60);
		kreisverkehr(1, 'r');
		kreisler.setGeschwindigkeit(100);
		vorbisHindernis();
		kreisler.setGeschwindigkeit(90);
		kreisverkehr(1, 'l');
		vorbisHindernis();
	}

	/**
	 * Fährt in der Angegebenen Richtung durch einen Kreisverkehr ind nimmt die angegebe Ausfahrt. 
	 * @param ausfahrt
	 * @param richtung
	 */
	private void kreisverkehr(int ausfahrt, char richtung)
	{
		boolean ausfahrterreicht = false;
		int ausfahrtnr = 0;

		if (richtung == 'l')
		{
			kreisler.linksAbbiegen();
			kreisler.vorwaerts();

			while (!ausfahrterreicht)
			{
				while (isVorneFrei() && !isLinksFrei())
				{
					kreisler.vorwaerts();
				}
				if (isLinksFrei())
				{
					ausfahrtnr++;
					if (ausfahrtnr == ausfahrt)
					{
						// Raus hier
						kreisler.linksAbbiegen();
						kreisler.vorwaerts();
						ausfahrterreicht = true;
					}
				} else
				{
					kreisler.rechtsAbbiegen();
					kreisler.vorwaerts();
				}
			}
		} else
		{

			kreisler.rechtsAbbiegen();
			kreisler.vorwaerts();

			while (!ausfahrterreicht)
			{
				while (isVorneFrei() && !isRechtsFrei())
				{
					kreisler.vorwaerts();
				}
				if (isRechtsFrei())
				{
					ausfahrtnr++;
					if (ausfahrtnr == ausfahrt)
					{
						// Raus hier
						kreisler.rechtsAbbiegen();
						kreisler.vorwaerts();
						ausfahrterreicht = true;
					}
				} else
				{
					kreisler.linksAbbiegen();
					kreisler.vorwaerts();
				}

			}
		}

	}

	private void ausweichen()
	{
		kreisler.linksAbbiegen();
		for (int i = 0; i < 3; i++)
		{
			kreisler.vorwaerts(2);
			kreisler.rechtsAbbiegen();
		}
		kreisler.wenden();
	}

	private void vorbisHindernis()
	{
		while (isVorneFrei())
		{
			kreisler.vorwaerts();
		}
	}

	public boolean isFrei()
	{

		return (isVorneFrei() && isVorneLinksFrei() && isVorneRechtsFrei());
	}

	public boolean isVorneFrei()
	{
		if (kreisler.getRichtung() == Constants.NORDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() - 1);
		}
		if (kreisler.getRichtung() == Constants.OSTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony());
		}
		if (kreisler.getRichtung() == Constants.SUEDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() + 1);
		}
		if (kreisler.getRichtung() == Constants.WESTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony());
		}
		return false;
	}

	public boolean isLinksFrei()
	{
		if (kreisler.getRichtung() == Constants.NORDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony());
		}
		if (kreisler.getRichtung() == Constants.OSTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() - 1);
		}
		if (kreisler.getRichtung() == Constants.SUEDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony());
		}
		if (kreisler.getRichtung() == Constants.WESTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() + 1);
		}
		return false;
	}

	public boolean isRechtsFrei()
	{
		if (kreisler.getRichtung() == Constants.NORDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony());
		}
		if (kreisler.getRichtung() == Constants.OSTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() + 1);
		}
		if (kreisler.getRichtung() == Constants.SUEDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony());
		}
		if (kreisler.getRichtung() == Constants.WESTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx(),
					kreisler.getLevelPositiony() - 1);
		}
		return false;
	}

	public boolean isVorneLinksFrei()
	{
		if (kreisler.getRichtung() == Constants.NORDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony() - 1);
		}
		if (kreisler.getRichtung() == Constants.OSTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony() - 1);
		}
		if (kreisler.getRichtung() == Constants.SUEDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony() + 1);
		}
		if (kreisler.getRichtung() == Constants.WESTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony() + 1);
		}
		return false;
	}

	public boolean isVorneRechtsFrei()
	{
		if (kreisler.getRichtung() == Constants.NORDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony() - 1);
		}
		if (kreisler.getRichtung() == Constants.OSTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() + 1,
					kreisler.getLevelPositiony() + 1);
		}
		if (kreisler.getRichtung() == Constants.SUEDEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony() + 1);
		}
		if (kreisler.getRichtung() == Constants.WESTEN)
		{
			return !level.isKollision(kreisler.getLevelPositionx() - 1,
					kreisler.getLevelPositiony() - 1);
		}
		return false;
	}

	public boolean isStrasse(int x, int y)
	{
		char objekt = level.getLevelobjekt(y, x);

		if (objekt == Constants.STRASSEHORIZONTAL
				| objekt == Constants.STRASSEVERTIKAL
				| objekt == Constants.ZIEL)
		{
			return true;
		}
		return false;
	}

}
