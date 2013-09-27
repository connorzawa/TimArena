package menu.menuClasses.GameMenuClasses.Buildings;

import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Citizen;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class Tavern extends Building{

	// MENU METHODS

	public void initialize()
	{
		name = "Tavern";
		hasKeeper = checkKeeper();
		
		

		display();
		update();
		run();
		Util.writeOutput("Welcome to the Tavern. This is the Warriors' Domain.\n");
		
	}

	public void display()
	{
		
		
		TextBoxGame.button1.setText("Make A Party");
		TextBoxGame.button1.addActionListener(this);


		TextBoxGame.button2.setText("Disband A Party");
		TextBoxGame.button2.addActionListener(this);

		TextBoxGame.button3.setText("View A Party");
		TextBoxGame.button3.addActionListener(this);

		TextBoxGame.button4.setText("Post A Quest");
		TextBoxGame.button4.addActionListener(this);

		TextBoxGame.button5.setText("Remove A Quest");
		TextBoxGame.button5.addActionListener(this);

		TextBoxGame.button6.setText("View Quest Status");
		TextBoxGame.button6.addActionListener(this);

		TextBoxGame.button7.setText("Food");
		TextBoxGame.button7.addActionListener(this);

		
		TextBoxGame.button8.setText("Change Keeper");
		TextBoxGame.button8.addActionListener(this);	

	}		

	public void run()
	{
		
		
		if(!hasKeeper)
		{
			TextBoxGame.button1.setEnabled(false);
			TextBoxGame.button2.setEnabled(false);
			TextBoxGame.button3.setEnabled(false);
			TextBoxGame.button4.setEnabled(false);
			TextBoxGame.button5.setEnabled(false);
			TextBoxGame.button6.setEnabled(false);
			TextBoxGame.button7.setEnabled(false);
		}
		else
		{
			TextBoxGame.button1.setEnabled(true);
			TextBoxGame.button2.setEnabled(true);
			TextBoxGame.button3.setEnabled(true);
			TextBoxGame.button4.setEnabled(true);
			TextBoxGame.button5.setEnabled(true);
			TextBoxGame.button6.setEnabled(true);
			TextBoxGame.button7.setEnabled(true);
		}
	}

	public void createParty()
	{
		Util.writeOutput("Click on the names of the warriors you want to add.\r\n "
				+ "Up to four may be added. Click DONE to finish.");
		TextBoxGame.button5.setText("Previous");
		TextBoxGame.button6.setText("Next");
		TextBoxGame.button7.setText("Remove");
		TextBoxGame.button8.setText("Done");
	}


	@Override
	protected void checkAction(String name)
	{
		if(name == "Make A Party")
		{
			createParty();
		}

		else if(name == "Disband A Party")
		{

		}

		else if(name == "View A Party")
		{

		}

		else if(name == "Post A Quest")
		{

		}
		else if(name == "Remove A Quest")
		{

		}
		else if(name == "View Quest Status")
		{

		}
		else if(name == "Food")
		{

		}
		else if(name == "Change Keeper")
		{
			changeKeeper();
		}
		
		for(int i = 0; i < Main.player.buildersPop; i++)
		{
			if(name == Main.player.Builders[i].getName())
			{
				setKeeper(Main.player.Builders[i]);
				hasKeeper = true;
				initialize();
			}
		}

	}
	
	private boolean checkKeeper()
	{
		for(int i = 0; i < Main.player.buildersPop; i++)
		{
			if(Main.player.Builders[i].getShop() && Main.player.Builders[i].getName() == name)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
}
