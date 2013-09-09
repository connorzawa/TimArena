package menu.menuButtons;

import menu.menuClasses.GameMenu;
import menu.menuClasses.NewGameMenu;
import timArena.Citizen;
import timArena.Main;
import timArena.Player;
import timArena.TextBoxGame;
import timArena.Util;

@SuppressWarnings("all")
public class NewGameMenuButtons extends MenuButtons{

	public static String cit1 = " ";
	public static String cit2 = " ";
	public static String cit3 = " ";
	public static String cit4 = " ";
	
	@Override
	protected void checkAction(String name)
	{
		if(name == "Player Name")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Player Name Set to: " + Main.heldInput);
			Util.newLine();
			Main.player.Name = Main.heldInput;
		}
		
		else if(name == "Town Name")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Town Name Set to: " + Main.heldInput);
			Util.newLine();
			Main.player.townName = Main.heldInput;

		}
		
		else if(name == "Male Shop Keeper")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Male Shop Keeper Set to: " + Main.heldInput);
			Util.newLine();
			cit1 = Main.heldInput;

		}
		
		else if(name == "Female Shop Keeper")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Female Shop Keeper: " + Main.heldInput);
			Util.newLine();
			cit2 = Main.heldInput;

		}
		
		else if(name == "Male Warrior")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Male Warrior Set to: " + Main.heldInput);
			Util.newLine();
			cit3 = Main.heldInput;

		}
		
		else if(name == "Female Warrior")
		{
			TextBoxGame.output.append("Reading Held input...");
			Util.newLine();
			Util.hold(500);
			TextBoxGame.output.append("Female Warrior Set to: " + Main.heldInput);
			Util.newLine();
			cit4 = Main.heldInput;
			
		}
		
		Main.currentMenu.run();		
		
		if(name == "Finish")
		{
			Main.player.gold = 0;
			
			Main.player.Warriors[0] = new Citizen(10, 10, 10, 10, 100, 0, cit3, true, true);
			Main.player.Builders[0] = new Citizen(10, 10, 10, 10, 100, 0, cit1, true, false);
			Main.player.Warriors[1] = new Citizen(10, 10, 10, 10, 100, 0, cit4, false, true);
			Main.player.Builders[1] = new Citizen(10, 10, 10, 10, 100, 0, cit2, false, false);
			
			Main.player.warriorsPop = 2;
			Main.player.buildersPop = 2;
			
			Util.changeMenus(Main.currentMenu, new GameMenu());
			TextBoxGame.main.setEnabled(true);
		}
	}
}
