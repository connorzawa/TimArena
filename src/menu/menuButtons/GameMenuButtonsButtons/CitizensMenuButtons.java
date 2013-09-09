package menu.menuButtons.GameMenuButtonsButtons;

import java.util.ArrayList;

import timArena.Citizen;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;
import menu.menuButtons.*;
public class CitizensMenuButtons extends MenuButtons {

	private Citizen[] cz;
	private int page;
	




	@Override
	protected void checkAction(String name)
	{

		if(name == "Shop Keepers")
		{
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

		else if(name == "Warriors")
		{
			page = 0;
			cz = Main.player.Warriors;

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

		//////////////////////// A PLAYER FUNCTION //////////////////


		else if(name == Main.player.Warriors[(page*4 + 0)].getName())
		{
			System.out.println(Main.player.Warriors[(page*4 + 0)].getName());
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

		//else if(name == Main.player.Builders[])
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
