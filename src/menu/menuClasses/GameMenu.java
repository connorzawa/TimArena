package menu.menuClasses;


import menu.menuClasses.GameMenuClasses.CitizensMenu;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;




public class GameMenu extends Menu{

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
		TextBoxGame.button1.addActionListener(this);

		TextBoxGame.button2.setText("Buildings");
		TextBoxGame.button2.addActionListener(this);

		TextBoxGame.button3.setText("Materials");
		TextBoxGame.button3.addActionListener(this);

		TextBoxGame.button4.setText("Explore");
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

	public void run()
	{
		String status = (Main.player.Name + " of " + Main.player.townName + 
				"\nGold: " + Main.player.gold + "\nPopulation: "
				+ (Main.player.buildersPop + Main.player.warriorsPop));
		Util.writeDisplay(status);
	}
	
	@Override
	protected void checkAction(String name)
	{
		if(name == "Citizens")
		{
			Util.changeMenus(Main.currentMenu, new CitizensMenu());
		}
		
		else if(name == "Buildings")
		{
			System.out.println("ASDJKSALDK");
		}
		
		else if(name == "Materials")
		{
			
		}
		
		else if(name == "Explore")
		{
			
		}
		else if(name == "Shop Keepers")
		{
			System.out.println("qweqweqweeqw");
		}

	}
}
