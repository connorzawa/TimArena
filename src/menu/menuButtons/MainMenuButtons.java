package menu.menuButtons;

import menu.menuClasses.NewGameMenu;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class MainMenuButtons extends MenuButtons{


	@Override
	protected void checkAction(String name)
	{
		if(name == "New Game")
		{
			TextBoxGame.output.setText("");
			Util.changeMenus(Main.currentMenu, new NewGameMenu());
		}
		if(name == "Load Game")
		{
			System.out.println("BUGGYYY");
		}

	}
	
}
