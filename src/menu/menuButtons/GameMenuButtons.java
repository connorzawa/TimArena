package menu.menuButtons;



import menu.menuButtons.GameMenuButtonsButtons.CitizensMenuButtons;
import menu.menuClasses.GameMenu;
import menu.menuClasses.NewGameMenu;
import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

@SuppressWarnings("all")
public class GameMenuButtons extends MenuButtons {

	@Override
	protected void checkAction(String name)
	{
		if(name == "Citizens")
		{
			Util.changeMenus(Main.currentMenu, new CitizensMenu());
		}
		
		else if(name == "Buildings")
		{
			System.out.println("ASDJKSALDK");
		}
		
		else if(name == "Materials")
		{
			
		}
		
		else if(name == "Explore")
		{
			
		}
		else if(name == "Shop Keepers")
		{
			System.out.println("qweqweqweeqw");
		}

	}
}
