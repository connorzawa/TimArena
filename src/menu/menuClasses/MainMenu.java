package menu.menuClasses;

import java.awt.event.ActionListener;

import javax.swing.JButton;


import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;



@SuppressWarnings("all")
public class MainMenu extends Menu{

	public void initialize()
	{
		super.name = "MainMenu";

		Util.writeOutput("========== WELCOME TO TIM ARENA ==========");

		display();
		update();
		run();
	}

	@Override
	public void display()
	{

		TextBoxGame.button1.setText("New Game");
		TextBoxGame.button1.addActionListener(this);

		TextBoxGame.button2.setText("Load Game");
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


