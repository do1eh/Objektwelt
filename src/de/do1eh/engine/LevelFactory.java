package de.do1eh.engine;

import java.awt.Color;

import de.do1eh.autos.Kreisler;
import de.do1eh.fahrer.Georg;
import de.do1eh.fahrer.LaLinea;

public class LevelFactory
{
   public static Level loadLevel1(Auto auto)
   {
	   Level level=new Level();
	   
	   level.setText("Level 1 (Tutorial - Einführung)\n\n" +
		   		"" +
		   		"Ein Computer tut immer genau das was man ihm sagt. Um das Auto ins Ziel zu fahren muss man 4x geradeaus fahren. Um das Auto" +
		   		"einmal geradeausfahren zu lassen öffne die Klasse Michael (das ist der Fahrer) und füge in die noch leere Methode level1loesung() zwischen den geschweiften Klammern" +
		   		"entsprechenden Befehl ein. Das sollte dann so aussehen: \n\n" +
		   		"public void level1loesung()\n" +
		   		"{\n" +
		   		"auto.vorwaerts();\n" +
		   		"}\n\n Wenn das Auto nun also 4 mal geradeausfahren soll, muss der Befehl innerhalb der geschweiften Klammer der Methode 4 mal untereinander geschrieben werden.");
	   
	   level.setUserStartpunktX(12);
	   level.setUserStartpunktY(17);
	   
	   //oben links ist Position 0,0
	   char[][] welt = {	
		   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
		   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
		   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
		   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
		   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
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
		   
		   level.setWelt(welt);
		   auto.setRichtung(Constants.NORDEN);
		   level.addUserAuto(auto);
	   
		   
		   
	    return level;
	   
	   };
	   
	   public static Level loadLevel2(Auto auto)
	   {
		   Level level=new Level();
		
		   level.setText("Level 1 (Tutorial - Schleifen)\n\n" +
			   		"" +
			   		"Um hier das Ziel zu erreichen muss man 13 mal geradeaus fahren, links abbiegen und noch einmal 8 mal geradeaus fahren. " +
			   		"Doch nun für jeden Schritt den Befehl einzugeben wäre umständlich. Aus diesem Grund gibt es For-Schleifen. " +
			   		"Diese werden immer dann eingesetzt, wenn man bereits vorher weiß wie oft man einen Befehl oder eine Befehlsfolge ausführen will." +
			   		"Eine For Schleife sieht folgendermaßen aus:\n\n" +
			   		
			   		"for(int i=0;i<5;i++)\n" +
			   		"{\n" +
			   		"auto.vorwaerts();\n" +
			   		"}\n\n " +
			   		"In diesem Beispiel zählt die Schleife eine Varible namens i von 0 bis 4 hoch und führt also 5 mal den Befehl auto.vorwaerts() aus." +
			   		"i++ ist eine Kurzform für i=i+1, sprich in jedem Schleifendurchlauf wird i um 1 erhöht und das so lange wie die Bedingung i<5 zutrifft.\n\n" +
			   		"Der Befehl links abzubiegen lautet: auto.linksAbbiegen();. In Eclipse genügt es im übrigen nur die ersten Buchstaben einzugeben (z.B. auto.li) " +
			   		"und dann STRG+Leertaste zu drücken und der Rest wird automatisch ergänzt. Gibt mehr mehr als eine Möglichkeit öffnet sich ein Fenster in " +
			   		"dem man auswählen kann wie der Befehl ergänzt wird.\n\n Wenn du sehen möchtest was das Auto sonst noch kann schreibe einfach auto gefolgt von einem Punkt. " +
			   		"Es öffnet sich ein Fenster in dem alle Befehle aufgelistet sind die beim Auto Möglich sind. ");
		   
		   
		   
		   level.setUserStartpunktX(12);
		   level.setUserStartpunktY(17);
		   
		   //oben links ist Position 0,0
		   char[][] welt = {	
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','Z','H','H','H','H','H','H','H','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
			   
			   level.setWelt(welt);
			auto.setRichtung(Constants.NORDEN);
			   level.addUserAuto(auto);
		   
			   
			   
		    return level;
		   
		   };
		   
		   public static Level loadLevel3(Auto auto)
		   {
			   Level level=new Level();
			   
			   level.setText("Level 3 (Tutorial - Methoden)\n\n" +
				   		"" +
				   		"Einige Dinge, wie z.B. die For Schleife aus dem letzten Level wird man immer wieder jedoch mit unterschiedlichen " +
				   		"Werten benötigen. Z.B. wie in diesem Level 10x gerade aus und 5x geradaus. Es wäre doch schön, wenn man die For-Schleife nur " +
				   		"einmal schreiben müsste, und ihr nur noch mitteilen könnte wie oft sie den vorwärts-befehl ausführen soll. In diesem Fall kann man die" +
				   		"Funktion in eine Methode auslagern:\n\n" +
				   		"" +
				   		"public void geradeausfahren(int schritte)\n" +
				   		"{\n" +
				   		"  for(int i=0;i<schritte;i++)\n" +
				   		"  {\n" +
				   		"    auto.vorwaerts();\n" +
				   		"   }\n" +
				   		"}\n\n" +
				   		"" +
				   		"Diese Methode schreibt man einfach unter die autopilot-Methode und kann diese nun z.B. mit " +
				   		"geradeaus(10) im autopiloten aufrufen und das Auto wird 10 Schritte geradeaus fahren.\n\n" +
				   		"" +
				   		"Um das Level zu lösen, braucht aber auch das Auto eine neue Methode. Bisher kann das Auto nur rechts abbiegen. Öffne also auch die " +
				   		"Autoklasse und füge eine Methode linksabbiegen() ein. Diese kannst du dann in der autopilotmethode des Fahrers mit auto.linksabbiegen()" +
				   		"aufrufen. Tipp: Um einmal linksabzubiegen muss man einfach 3 mal rechtsabbiegen.");
			   
			   
			   level.setUserStartpunktX(12);
			   level.setUserStartpunktY(17);
			   
			   //oben links ist Position 0,0
			   char[][] welt = {	
				   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','H','H','H','H','Z','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
				   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
				   
				   level.setWelt(welt);
				   auto.setRichtung(Constants.NORDEN);
				   level.addUserAuto(auto);
			   
				   
				   
			    return level;
			   
			   };
			   
			   
			   
			   public static Level loadLevel4(Auto auto)
			   {
				   Level level=new Level();
				   
				   level.setText("Level 4 (Tutorial - Variable Variablen)\n\n" +
					   		"Diese Level lässt sich mit einer FOR-Schleife, die 2 Anweisungen enthält lösen. " +
					   		"Versuche zunächst das System herauszubekommen wie das Auto fahren muss um zum Ziel zu gelangen.\n" +
					   		"Die Strecke bis zur ersten Linkskurve beträgt genau 11 Schritte.\n\n" +
					   		"Tip: FOR-Schleifen können auch mit i-- (statt i++) abwärts zählen. " +
					   		"Man kann die Variable i auch innerhalb der Schleife auslesen und so die jeweils aktuelle Zahl erhalten." );
				   
				   
				   
				   
				   level.setUserStartpunktX(4);
				   level.setUserStartpunktY(4);
				   
				   //oben links ist Position 0,0
				   char[][] welt = {	
					   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','H','H','H','H','H','H','H','H','H','H','H','V','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','H','H','H','H','H','H','H','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','0','0','0','0','0','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','H','H','H','V','0','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','V','0','0','V','0','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','V','0','Z','H','0','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','V','0','0','0','0','V','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','V','H','H','H','H','H','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','0','0','0','0','0','0','0','0','V','0','0','0','0','W'},
					   {'W','0','0','0','0','V','H','H','H','H','H','H','H','H','H','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
					   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
					   
					   level.setWelt(welt);
					   auto.setRichtung(Constants.OSTEN);
					   level.addUserAuto(auto);
				   
					   
					   
				    return level;
				   
				   };
				   
				   public static Level loadLevel5(Auto auto)
				   {
					   Level level=new Level();
					   
					   
					   level.setText("Level 5 (Tutorial - Bedingungen)\n\n" +
						   		"Der Fahrer kann man nicht nur das Auto steuern und dessen Werte (Farbe, Geschwindigkeit,...) " +
						   		"auslesen, sondern auch aus dem Fenster schauen und so Informationen über das Level" +
						   		"erhalten. So wie auf das auto mit auto. zugegriffen wird, kann auch auf das Level mit level. zugegriffen werden." +
						   		"Die wichtigste Methode hierbei ist in diesem Level ist level.getLevelobjekt(posx, posy)\n\n" +
						   		"Diese Methode liefert zurück was sich an der angegeben Position befinden. Um z.B. auszulesen was sich direkt vor" +
						   		"dem Auto befindet kann schreibt man: char objekt=getLevelobjekt(auto.getLevelPostionX, auto.getLevelPostionX)\n\n" +
						   		"Nun Befindet sich die Information in der Variable objekt.\n\n" +
						   		"Mit einer If-Abfrage kann man nun bestimmen was passiert was passiewren soll wenn das objekt bestimmte Werte hat. " +
						   		"Eine If-Abfrage sieht so aus\n\n" +
						   		"if(BEDINGUNG)\n{\nHier kommt rein was passieren soll\n}\n\n" +
						   		"Man kann nun also eine Methode schreiben die zurück gibt (true oder false) ob  sich vor dem Auto in Hindernis befindet:\n\n" +
						   		"" +
						   		"public boolean isVorneFrei()\n" +
						   		"{" +
						   		"if(kreisler.getRichtung()==Constants.NORDEN) {return isStrasse(kreisler.getLevelPositionx(), kreisler.getLevelPositiony()-1);}\n"+
						   			"if(kreisler.getRichtung()==Constants.OSTEN) {return isStrasse(kreisler.getLevelPositionx()+1, kreisler.getLevelPositiony());}\n"+ 
						   			"if(kreisler.getRichtung()==Constants.SUEDEN) {return isStrasse(kreisler.getLevelPositionx(), kreisler.getLevelPositiony()+1);}\n"+ 
						   			"if(kreisler.getRichtung()==Constants.WESTEN) {return isStrasse(kreisler.getLevelPositionx()-1, kreisler.getLevelPositiony());}\n" +
						   			"return false;\n"+
						   		"}\n\n" +
						   		"Diese nutzt noch eine Hilfmethode, ob es sich um eine Strasse handelt:\n\n" +
						   		"public boolean isStrasse(int x, int y)\n"+
						   		"{\n"+
						   		"	char objekt=level.getLevelobjekt(y,x);\n"+
		
								"	if (objekt==Constants.STRASSEHORIZONTAL|objekt==Constants.STRASSEVERTIKAL |objekt==Constants.ZIEL) {return true;}\n"+
								"	return false;\n"+
				   					"}");
						   		
	
	

					   
					   
					   
					   level.setUserStartpunktX(12);
					   level.setUserStartpunktY(17);
					   
					   //oben links ist Position 0,0
					   char[][] welt = {	
						   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','Z','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','H','H','V','H','H','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','V','B','B','B','V','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','H','H','V','H','H','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
						   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
						   
						   level.setWelt(welt);
						   level.addUserAuto(auto);
					   
						   
						   
					    return level;
					   
					   };
					   
					   
					   
					   public static Level loadLevel6(Auto auto)
					   {
						   Level level=new Level();
						   
						   level.setText("Level 6 (Querverkehr)\n\n" +
						   		"Es sollten jetzt alle Grundlagen zum Lösen der Level vorhanden sein. Viel Erfolg.");
						   
						   level.setUserStartpunktX(12);
						   level.setUserStartpunktY(17);
						   
						   //oben links ist Position 0,0
						   char[][] welt = {	
							   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','Z','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','H','H','H','V','H','H','H','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','H','H','H','V','H','H','H','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','H','H','H','V','H','H','H','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','H','H','H','V','H','H','H','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','V','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
							   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
							   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
							   
							   level.setWelt(welt);
							   auto.setRichtung(Constants.NORDEN);
							   level.addUserAuto(auto);
						   
							   Fahrer linea1=new LaLinea();
							   Fahrer linea2=new LaLinea();
							   Fahrer linea3=new LaLinea();
							   Fahrer linea4=new LaLinea();
							   
							   Auto bot1=new Kreisler(linea1,Color.blue,Constants.WESTEN,9,5);
							   bot1.setGeschwindigkeit(95);
							   
							   Auto bot2=new Kreisler(linea2,Color.yellow,Constants.OSTEN,10,8);
							    bot2.setGeschwindigkeit(90);
							   
							   Auto bot3=new Kreisler(linea3,Color.green,Constants.WESTEN,10,10);
							   bot3.setGeschwindigkeit(95);
							   
							   Auto bot4=new Kreisler(linea4,Color.pink,Constants.OSTEN,14,14);
						       bot4.setGeschwindigkeit(90);
							   
							   level.addLevelAuto(bot1);
							   level.addLevelAuto(bot2);
							   level.addLevelAuto(bot3);
							   level.addLevelAuto(bot4);
							   
						    return level;
						   
						   };					   
	   
	   public static Level loadLevel7(Auto auto)
	   {
		   Level level=new Level();
		   
		   
		   
		   level.setUserStartpunktX(2);
		   level.setUserStartpunktY(10);
		   
		   
		   //oben links ist Position 0,0
		   char[][] welt = {	
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','V','H','H','H','V','0','0','V','H','H','H','V','0','0','0','W'},
			   {'W','0','0','0','V','0','0','0','V','0','0','V','0','0','0','V','0','0','0','W'},
			   {'W','H','H','H','V','0','0','0','V','H','H','V','0','0','0','V','H','Z','0','W'},
			   {'W','0','0','0','V','0','0','0','V','0','0','V','0','0','0','V','0','0','0','W'},
			   {'W','0','0','0','V','H','H','H','V','0','0','V','H','H','H','V','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','W'},
			   {'W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W','W'}};
			   
			   level.setWelt(welt);
			   auto.setRichtung(Constants.OSTEN);
			   level.addUserAuto(auto);
		   
			   //Fahrer
			   Fahrer lefti1=new Georg(Georg.LEFTI);
			   Fahrer lefti2=new Georg(Georg.LEFTI);
			   Fahrer lefti3=new Georg(Georg.LEFTI);
			   Fahrer lefti4=new Georg(Georg.LEFTI);
			   
			   Fahrer righti5=new Georg(Georg.RIGHTI);
			   Fahrer righti6=new Georg(Georg.RIGHTI);
			   Fahrer righti7=new Georg(Georg.RIGHTI);
			   Fahrer righti8=new Georg(Georg.RIGHTI);
			   //Autos
			   //1. Kreisverkehr
			   Auto bot1=new Kreisler(lefti1,Color.blue,Constants.OSTEN,12,5);
			   bot1.setPositiony((12*20)+4);
			   bot1.setPositionx((5*20)+4);
			   
			   Auto bot2=new Kreisler(lefti2,Color.green,Constants.WESTEN,8,9);
			   bot2.setPositiony((8*20)+4);
			   bot2.setPositionx((9*20)+4);
			   
			   Auto bot3=new Kreisler(lefti3,Color.pink,Constants.SUEDEN,8,5);
			   bot3.setPositiony((8*20)+4);
			   bot3.setPositionx((5*20)+4);
			   
			   Auto bot4=new Kreisler(lefti4,Color.yellow,Constants.NORDEN,12,9);
			   bot4.setPositiony((12*20)+4);
			   bot4.setPositionx((9*20)+4);
			   
			   //2.Kreisverkehr
			   
			   Auto bot5=new Kreisler(righti5,Color.blue,Constants.NORDEN,12,12);
			   bot5.setPositiony((12*20)+4);
			   bot5.setPositionx((12*20)+4);
			   bot5.setGeschwindigkeit(90);
			   
			   Auto bot6=new Kreisler(righti6,Color.green,Constants.SUEDEN,8,12);
			   bot6.setPositiony((8*20)+4);
			   bot6.setPositionx((16*20)+4);
			   bot6.setGeschwindigkeit(90);
			   
			   Auto bot7=new Kreisler(righti7,Color.PINK,Constants.OSTEN,8,12);
			   bot7.setPositiony((8*20)+4);
			   bot7.setPositionx((12*20)+4);
			   bot7.setGeschwindigkeit(90);
			   
			   Auto bot8=new Kreisler(righti8,Color.yellow,Constants.WESTEN,12,16);
			   bot8.setPositiony((12*20)+4);
			   bot8.setPositionx((16*20)+4);
			   bot8.setGeschwindigkeit(90);
			   
			   
			   
			   level.addLevelAuto(bot1);
			   level.addLevelAuto(bot2);
			   level.addLevelAuto(bot3);
			   level.addLevelAuto(bot4);
			   level.addLevelAuto(bot5);
			   level.addLevelAuto(bot6);
			   level.addLevelAuto(bot7);
			   level.addLevelAuto(bot8);
		    return level;
		   
		   };
	   
   }

