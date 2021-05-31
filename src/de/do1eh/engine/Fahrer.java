package de.do1eh.engine;


public abstract class Fahrer
{

	public Auto auto;
	public Level level;
	
	
	
	
	public Auto getAuto()
	{
		return auto;
	}



	public void setAuto(Auto auto)
	{
		this.auto = auto;
	}



	public Level getLevel()
	{
		return level;
	}



	public void setLevel(Level level)
	{
		this.level = level;
	}



	public abstract void autopilot();
}
