package menu.menuClasses.GameMenuClasses.Buildings;

import menu.menuClasses.Menu;
import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Citizen;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class Building extends Menu {

	protected Citizen keeper;
	protected String title;
	
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
	
	
	public void initialize()
	{
		super.name = "GameMenu";

		display();
		update();
		run();
	}
	
	
}
