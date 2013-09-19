package menu.menuClasses.GameMenuClasses.Buildings;

import timArena.Citizen;

public class Building {

	protected Citizen keeper;
	protected String name;
	
	public void setKeeper(Citizen keeper)
	{
		this.keeper = keeper;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Citizen getKeeper()
	{
		return this.keeper;
	}
	
	public String getName()
	{
		return this.name;
	}
}
