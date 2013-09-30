package menu.menuClasses.GameMenuClasses.Buildings;

import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Citizen;
import timArena.Main;
import timArena.Party;
import timArena.TextBoxGame;
import timArena.Util;

public class Tavern extends Building{

	private Party partyBuilder = new Party();
	private boolean checkWar = false; 
	// MENU METHODS

	public void initialize()
	{
		name = "Tavern";
		hasKeeper = checkKeeper();

		Util.clearOutput();

		display();
		update();
		run();
		Util.writeOutput("Welcome to the Tavern. This is the Warriors' Domain.\n");
		if(hasKeeper)
		{
			Util.writeDisplay("Shop Keeper: " + keeper.getName());
		}

	}

	public void display()
	{

		removeActionListeners();
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
		checkWar = true;
		
		Util.clearOutput();
		Util.writeOutput("Click on the names of the warriors you want to add.\r\n "
				+ "Up to four may be added. Click DONE to finish.");
		partyBuilder = new Party();
		
		createPartyRefresh();
				
		TextBoxGame.button5.setText("Previous");
		TextBoxGame.button6.setText("Next");
		TextBoxGame.button7.setText("Remove");
		TextBoxGame.button8.setText("Finish");
	}

	protected void createPartyRefresh()
	{
		int page = 0;
		if(Main.player.warriorsPop > page*4+0 && partyBuilder.getSize() < 4 
				&& !Main.player.Warriors[(page*4)+0].getPartyStatus())
		{
			Util.setButtons(1,Main.player.Warriors[(page*4)+0].getName(),true);
		}
		else
		{
			Util.setButtons(1,"",false);
		}

		if(Main.player.warriorsPop > page*4+1 && partyBuilder.getSize() < 4 &&
				!Main.player.Warriors[(page*4)+1].getPartyStatus())
		{
			Util.setButtons(2,Main.player.Warriors[(page*4)+1].getName(),true);
		}
		else
		{
			Util.setButtons(2,"",false);
		}

		if(Main.player.warriorsPop > page*4+2 && partyBuilder.getSize() < 4
				&& !Main.player.Warriors[(page*4)+2].getPartyStatus())
		{
			Util.setButtons(3,Main.player.Warriors[(page*4)+2].getName(),true);
		}
		else
		{
			Util.setButtons(3,"",false);
		}

		if(Main.player.warriorsPop > page*4+3 && partyBuilder.getSize() < 4
				&& !Main.player.Warriors[(page*4)+3].getPartyStatus())
		{
			Util.setButtons(4,Main.player.Warriors[(page*4)+3].getName(),true);
		}
		else
		{
			Util.setButtons(4,"",false);
		}

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

		else if(name == "Finish")
		{
			for(int i = 0; i < Main.player.Parties.length; i++)
			{
				if(Main.player.Parties[i].getEmpty())
				{
					Main.player.Parties[i] = partyBuilder;
					checkWar = false;
					break;
				}
			}
			
			initialize();
		}
		
		else if(checkBuild)
		{
			for(int i = 0; i < Main.player.buildersPop; i++)
			{
				if(name == Main.player.Builders[i].getName())
				{
					setKeeper(Main.player.Builders[i]);
					Main.player.Builders[i].setID(this.name);
					Main.player.Builders[i].setShop(true);
					hasKeeper = true;
					checkBuild = false;
					initialize();
				}
			}
		}

		else if(checkWar)
		{
			for(int i = 0; i < Main.player.warriorsPop; i++)
			{
				if(name == Main.player.Warriors[i].getName())
				{
					for(int j = 0; j < 4; j++)
					{
						if(partyBuilder.getMembers()[j].getEmpty())
						{
							partyBuilder.getMembers()[j] = Main.player.Warriors[i];
							Main.player.Warriors[i].changePartyStatus();
							break;
						}
					}
					Util.writeDisplay("Leader: " + partyBuilder.getMembers()[0].getName()
							+ "\nMember 2: " + partyBuilder.getMembers()[1].getName()
							+ "\nMember 3: " + partyBuilder.getMembers()[2].getName()
							+ "\nMember 4: " + partyBuilder.getMembers()[3].getName());
					partyBuilder.incrSize();
					if(partyBuilder.getMembers().length > 0)
					{
						partyBuilder.setEmpty(false);
					}
					break;
				}
			}
			createPartyRefresh();
		}
	}

	private boolean checkKeeper()
	{
		for(int i = 0; i < Main.player.buildersPop; i++)
		{
			if(Main.player.Builders[i].getShop() && Main.player.Builders[i].getID() == name)
			{
				return true;
			}
		}

		return false;
	}


}
