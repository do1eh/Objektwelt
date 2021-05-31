package de.do1eh.level;

import java.awt.Color;

import de.do1eh.autos.Kreisler;
import de.do1eh.engine.Auto;
import de.do1eh.engine.Constants;
import de.do1eh.engine.Fahrer;
import de.do1eh.engine.Level;
import de.do1eh.fahrer.LaLinea;

public class Testlevel extends Level
{

	public Testlevel(Auto auto)
	{
		 this.setText("Userlevel\n\n" +
			   		"" +
			   		"Dies ist ein Beispiel für ein eigenes Level.\n\n" +
			   		"Level:\n Die festen Bestandteile des Levels werden in der Matrix welt festgelegt." +
			   		"Dafür stehen folgende Zeichen zur Verfügung: H=Horizontale Strasse, V=vertikale Strasse, Z=Ziel, B=Baum, W=Wasser, " +
			   		"Die Marix ist dabei so geschrieben, dass die wie das angezeigt Lebel aussieht. Schreibt man also z.B. ganz oben links ein B " +
			   		"zwischen die Hochkommata, da wird im Spiel auch an dieser Stelle ein Baum angezeigt.\n\n" +
			   		"" +
			   		"Benutzerauto:\n" +
			   		"Die Startposition und die Richtung des Spielerautos werden mit setUserStartpunkt und setRichtung eingestellt.\n\n" +
			   		"" +
			   		"Bots:\n" +
			   		"Es können beliebig viele Bots eingefügt werden.\n" +
			   		"Um einen Bot einzufügen muss zunächst ein Fahrer und dann ein Auto definiert werden. Es gibt ein paar Standardfahrer" +
			   		"mit folgenden Eigenschaften:\n\n" +
			   		"LaLinea - fährt immer hin und her bis zum ende der Strasse\n" +
			   		"Georg - Fährt immer im Quadrat, die Seitenlänge wird per Parameter mitgegeben.\n" +
			   		" Georg und Lalinea fahren nur Kreisler.\n\n" +
			   		"" +
			   		"für das Auto muss die der Fahrer, die Farbe, die Richtung und die Startposition definiert werden. ");
		   
		
		   
		   //oben links ist Position 1,1
		   char[][] welt = {	
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','V','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','Z','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
			   
			   this.setWelt(welt);
			   
			   //Festlegen des Userautos:
			   this.setUserStartpunktX(12);
			   this.setUserStartpunktY(17);
			   auto.setRichtung(Constants.NORDEN);
			   this.addUserAuto(auto);
			   
			   //einfügen einen Bots:
			   Fahrer linea1=new LaLinea();
			   Auto bot1=new Kreisler(linea1,Color.blue,Constants.SUEDEN,3,4);
			   bot1.setGeschwindigkeit(95);
			   this.addLevelAuto(bot1);
			   
			   
	}
	
}
