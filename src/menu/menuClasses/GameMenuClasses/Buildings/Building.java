package menu.menuClasses.GameMenuClasses.Buildings;

import menu.menuClasses.Menu;
import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Citizen;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class Building extends Menu {

	protected Citizen keeper;
	protected boolean hasKeeper = false;
	protected String title;
	protected boolean checkBuild = false;
	
	protected void changeKeeper()
	{
		checkBuild = true;
		Util.clearOutput();
		Util.writeOutput("Click the name of the keeper you would like to set.");
		Util.setButtons();
		
		int page = 0;
		if(Main.player.buildersPop > page*4+0)
		{
			Util.setButtons(1,Main.player.Builders[(page*4)+0].getName(),true);
		}
		else
		{
			Util.setButtons(1,"",false);
		}

		if(Main.player.buildersPop > page*4+1)
		{
			Util.setButtons(2,Main.player.Builders[(page*4)+1].getName(),true);
		}
		else
		{
			Util.setButtons(2,"",false);
		}

		if(Main.player.buildersPop > page*4+2)
		{
			Util.setButtons(3,Main.player.Builders[(page*4)+2].getName(),true);
		}
		else
		{
			Util.setButtons(3,"",false);
		}

		if(Main.player.buildersPop > page*4+3)
		{
			Util.setButtons(4,Main.player.Builders[(page*4)+3].getName(),true);
		}
		else
		{
			Util.setButtons(4,"",false);
		}
		hasKeeper = true;
		Util.setButtons(5,"Previous",true);
		Util.setButtons(6,"Next",true);
		Util.setButtons(7,"Remove",true);
		Util.setButtons(8,"Done",true);
		
	}
	
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
