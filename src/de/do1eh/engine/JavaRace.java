package de.do1eh.engine;

import java.awt.Color;

import de.do1eh.autos.Kreisler;
import de.do1eh.fahrer.Testdummy;
import de.do1eh.level.Testlevel;


public class JavaRace
{

	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		
		Fahrer fahrer=new Testdummy();
		Auto auto=new Kreisler(fahrer,Color.RED);
		//Level level=LevelFactory.loadKreisverkehrLevel(auto);
		Level level=LevelFactory.loadLevel7(auto);
		//Level level=new Testlevel(auto);
		start(level);
		
		    
		    
		  
		    

	}
	
	 
	public static void start(Level level)
	{
       Welt fenster=new Welt(level);
		
		fenster.setVisible(true);
		fenster.animate();
	}

}
