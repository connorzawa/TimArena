package menu.menuClasses;

import menu.menuButtons.GameMenuButtons;
import menu.menuButtons.MenuButtons;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;




public class GameMenu extends Menu{

	public MenuButtons al = new GameMenuButtons();

	public void initialize()
	{
		super.name = "GameMenu";

		display();
		update();
		run();
	}
	public void display()
	{
		TextBoxGame.button1.setText("Citizens");
		TextBoxGame.button1.addActionListener(al);

		TextBoxGame.button2.setText("Buildings");
		TextBoxGame.button2.addActionListener(al);

		TextBoxGame.button3.setText("Materials");
		TextBoxGame.button3.addActionListener(al);

		TextBoxGame.button4.setText("Explore");
		TextBoxGame.button4.addActionListener(al);

		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(al);

		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(al);

		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(al);

		TextBoxGame.button8.setText(" ");
		TextBoxGame.button8.addActionListener(al);	
	}		

	public void run()
	{
		String status = (Main.player.Name + " of " + Main.player.townName + 
				"\nGold: " + Main.player.gold + "\nPopulation: "
				+ (Main.player.buildersPop + Main.player.warriorsPop));
		Util.writeDisplay(status);
	}
}
