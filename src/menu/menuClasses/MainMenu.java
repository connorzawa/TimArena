package menu.menuClasses;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import menu.menuButtons.GameMenuButtons;
import menu.menuButtons.MainMenuButtons;
import menu.menuButtons.MenuButtons;
import timArena.TextBoxGame;
import timArena.Util;



@SuppressWarnings("all")
public class MainMenu extends Menu{

	public MenuButtons al = new MainMenuButtons();

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
		TextBoxGame.button1.addActionListener(new MainMenuButtons());

		TextBoxGame.button2.setText("Load Game");
		TextBoxGame.button2.addActionListener(new MainMenuButtons());

		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(new MainMenuButtons());

		TextBoxGame.button4.setText(" ");
		TextBoxGame.button4.addActionListener(new MainMenuButtons());

		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(new MainMenuButtons());

		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(new MainMenuButtons());

		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(new MainMenuButtons());

		TextBoxGame.button8.setText(" ");
		TextBoxGame.button8.addActionListener(new MainMenuButtons());	
	}

}


