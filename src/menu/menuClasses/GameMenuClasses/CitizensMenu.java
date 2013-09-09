package menu.menuClasses.GameMenuClasses;

import menu.menuButtons.GameMenuButtons;
import menu.menuButtons.GameMenuButtonsButtons.*;
import menu.menuClasses.Menu;
import timArena.TextBoxGame;

public class CitizensMenu extends Menu{

	public void initialize()
	{
		super.name = "CitizensMenu";

		display();
		update();
		run();
	}
	
	public void display()
	{

		TextBoxGame.button1.setText("Shop Keepers");
		TextBoxGame.button1.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button2.setText("Warriors");
		TextBoxGame.button2.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button4.setText(" ");
		TextBoxGame.button4.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(new CitizensMenuButtons());

		TextBoxGame.button7.setText("Previous");
		TextBoxGame.button7.addActionListener(new CitizensMenuButtons());
		
		TextBoxGame.button8.setText("Next");
		TextBoxGame.button8.addActionListener(new CitizensMenuButtons());	
	}

	
}
