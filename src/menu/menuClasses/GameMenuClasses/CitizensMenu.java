package menu.menuClasses.GameMenuClasses;


import menu.menuButtons.GameMenuButtonsButtons.*;
import menu.menuClasses.Menu;
import timArena.Citizen;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;

public class CitizensMenu extends Menu{
	private Citizen[] cz;
	private int page;
	private boolean war;

	public void initialize()
	{
		super.name = "CitizensMenu";

		display();
		update();
		run();
	}

	// INITIAL BUTTON NAMES AND LISTENERS
	public void display()
	{

		TextBoxGame.button1.setText("Shop Keepers");
		TextBoxGame.button1.addActionListener(this);

		TextBoxGame.button2.setText("Warriors");
		TextBoxGame.button2.addActionListener(this);

		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(this);

		TextBoxGame.button4.setText(" ");
		TextBoxGame.button4.addActionListener(this);

		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(this);

		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(this);

		TextBoxGame.button7.setText("Previous");
		TextBoxGame.button7.addActionListener(this);

		TextBoxGame.button8.setText("Next");
		TextBoxGame.button8.addActionListener(this);	
	}

	@Override
	protected void checkAction(String name)
	{

		// UPDATE BUTTONS FOR DIFFERENT SHOP KEEPERS
		if(name == "Shop Keepers")
		{
			war = false;
			page = 0;
			cz = Main.player.Builders;

			if(Main.player.buildersPop > page*4+0)
			{
				TextBoxGame.button3.setText(Main.player.Builders[0].getName());
				TextBoxGame.button3.setToolTipText(Main.player.Builders[0].getName());
				TextBoxGame.button3.setEnabled(true);
			}
			else
			{
				TextBoxGame.button3.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+1)
			{
				TextBoxGame.button4.setText(Main.player.Builders[1].getName());
				TextBoxGame.button4.setToolTipText(Main.player.Builders[1].getName());
				TextBoxGame.button4.setEnabled(true);
			}
			else
			{
				TextBoxGame.button4.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+2)
			{
				TextBoxGame.button5.setText(Main.player.Builders[3].getName());
				TextBoxGame.button5.setToolTipText(Main.player.Builders[3].getName());
				TextBoxGame.button5.setEnabled(true);
			}
			else
			{
				TextBoxGame.button5.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+3)
			{
				TextBoxGame.button6.setText(Main.player.Builders[4].getName());
				TextBoxGame.button6.setToolTipText(Main.player.Builders[4].getName());
				TextBoxGame.button6.setEnabled(true);
			}
			else
			{
				TextBoxGame.button6.setEnabled(false);
			}
		}
		
		// UPDATE BUTTONS FOR DIFFERENT WARRIORS
		else if(name == "Warriors")
		{
			page = 0;
			cz = Main.player.Warriors;
			war = true;

			if(Main.player.warriorsPop > page*4+0)
			{
				TextBoxGame.button3.setText(Main.player.Warriors[0].getName());
				TextBoxGame.button3.setToolTipText(Main.player.Warriors[0].getName());
				TextBoxGame.button3.setEnabled(true);
			}
			else
			{
				TextBoxGame.button3.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+1)
			{
				TextBoxGame.button4.setText(Main.player.Warriors[1].getName());
				TextBoxGame.button4.setToolTipText(Main.player.Warriors[1].getName());
				TextBoxGame.button4.setEnabled(true);
			}
			else
			{
				TextBoxGame.button4.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+2)
			{
				TextBoxGame.button5.setText(Main.player.Warriors[3].getName());
				TextBoxGame.button5.setToolTipText(Main.player.Warriors[3].getName());
				TextBoxGame.button5.setEnabled(true);
			}
			else
			{
				TextBoxGame.button5.setEnabled(false);
			}

			if(Main.player.buildersPop > page*4+3)
			{
				TextBoxGame.button6.setText(Main.player.Warriors[4].getName());
				TextBoxGame.button6.setToolTipText(Main.player.Warriors[4].getName());
				TextBoxGame.button6.setEnabled(true);
			}
			else
			{
				TextBoxGame.button6.setEnabled(false);
			}
		} 

		else if(name == "Previous")
		{

		}
		else if(name == "Next")
		{

		}

		/* DISPLAYS STATS FOR THE CHOSEN CITIZEN */

		// IF A WARRIOR
		else if(war)
		{
			if(name == Main.player.Warriors[(page*4 + 0)].getName())
			{
				printStats(Main.player.Warriors[page*4+0]);
			}
			else if(name == Main.player.Warriors[(page*4 + 1)].getName())
			{
				printStats(Main.player.Warriors[page*4+1]);
			}
			else if(name == Main.player.Warriors[(page*4 + 2)].getName())
			{
				printStats(Main.player.Warriors[page*4+2]);
			}
			else if(name == Main.player.Warriors[(page*4 + 3)].getName())
			{
				printStats(Main.player.Warriors[page*4+3]);
			}
		}
		
		// IF A BUILDER
		else if(!war)
		{
			if(name == Main.player.Builders[(page*4 + 0)].getName())
			{
				printStats(Main.player.Builders[(page*4 + 0)]);
			}
			else if(name == Main.player.Builders[(page*4 + 1)].getName())
			{
				printStats(Main.player.Builders[(page*4 + 1)]);
			}
			else if(name == Main.player.Builders[(page*4 + 2)].getName())
			{
				printStats(Main.player.Builders[(page*4 + 3)]);
			}
			else if(name == Main.player.Builders[(page*4 + 3)].getName())
			{
				printStats(Main.player.Builders[(page*4 + 4)]);
			}
		}
	}



	public static void printStats(Citizen c)
	{
		TextBoxGame.display.setText(" ");
		Util.writeDisplay("==" + c.getName() + "==\nVitality: " + c.getVitality() 
				+"\nStrength: " + c.getStrength() 
				+ "\nToughness: " + c.getToughness() 
				+ "\nDexterity: " + c.getDexterity()
				+ "\nIntellect: " + c.getIntellect());
	}
}
