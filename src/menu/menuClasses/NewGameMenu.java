package menu.menuClasses;

import menu.menuButtons.MainMenuButtons;
import menu.menuButtons.MenuButtons;
import menu.menuButtons.NewGameMenuButtons;
import timArena.Main;
import timArena.Player;
import timArena.TextBoxGame;
import timArena.Util;
@SuppressWarnings("all")
public class NewGameMenu extends Menu {



	public MenuButtons al = new NewGameMenuButtons();
	public void initialize()
	{
		super.name = "NewGameMenu";
		String text = "Welcome to Tim Arena.";
		Util.writeOutput(text);
		Util.hold(1000);

		text = "You are the leader of a small village and will lead it's population to greatness!";
		Util.writeOutput(text);
		Util.hold(1000);

		text = "Use the buttons on the right to change your name and your town's name.";
		Util.writeOutput(text);
		Util.hold(1000);

		update();
		display();
		run();
	}

	public void display()
	{

		TextBoxGame.button1.setText("Player Name");
		TextBoxGame.button1.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button2.setText("Town Name");
		TextBoxGame.button2.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button3.setText("Male Shop Keeper");
		TextBoxGame.button3.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button4.setText("Female Shop Keeper");
		TextBoxGame.button4.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button5.setText("Male Warrior");
		TextBoxGame.button5.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button6.setText("Female Warrior");
		TextBoxGame.button6.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(new NewGameMenuButtons());

		TextBoxGame.button8.setText("Finish");
		TextBoxGame.button8.addActionListener(new NewGameMenuButtons());	

	}

	public void run()
	{
		String status = "Player Name: "+ Main.player.Name 
				+ "\nTown Name: " + Main.player.townName + "\n\n" 
				+ "Male Shop Keeper: " + NewGameMenuButtons.cit1 + "\n" 
				+ "Female Shop Keeper: " + NewGameMenuButtons.cit2 + "\n" 
				+ "Male Warrior: " + NewGameMenuButtons.cit3 + "\n" +
				"Female Warrior: " + NewGameMenuButtons.cit4 + "\n";

		Util.writeDisplay(status);
	}
}
