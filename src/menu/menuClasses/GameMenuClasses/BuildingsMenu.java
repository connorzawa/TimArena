package menu.menuClasses.GameMenuClasses;

import menu.menuClasses.Menu;
import menu.menuClasses.GameMenuClasses.Buildings.Tavern;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class BuildingsMenu extends Menu {
	public void initialize()
	{
		super.name = "BuildingssMenu";

		display();
		update();
		run();
	}

	// INITIAL BUTTON NAMES AND LISTENERS
	public void display()
	{

		TextBoxGame.button1.setText("Tavern");
		TextBoxGame.button1.addActionListener(this);

		TextBoxGame.button2.setText(" ");
		TextBoxGame.button2.addActionListener(this);

		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(this);

		TextBoxGame.button4.setText(" ");
		TextBoxGame.button4.addActionListener(this);

		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(this);

		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(this);

		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(this);

		TextBoxGame.button8.setText(" ");
		TextBoxGame.button8.addActionListener(this);	
	}

	@Override
	protected void checkAction(String name)
	{

		// UPDATE BUTTONS FOR DIFFERENT SHOP KEEPERS
		if(name == "Tavern")
		{
			Util.changeMenus(this, new Tavern());
		}
		
	}
}
