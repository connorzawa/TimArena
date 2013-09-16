package menu.menuClasses;


import timArena.Citizen;
import timArena.Main;
import timArena.Player;
import timArena.TextBoxGame;
import timArena.Util;

@SuppressWarnings("all")
public class NewGameMenu extends Menu{
	public String cit1 = " ", cit2 = " ", cit3 = " ", cit4 = " ";
public boolean player = false, town = false, msk = false, fsk = false, mw = false, fw = false;

	public void initialize()
	{
		super.name = "NewGameMenu";
		String text = "Welcome to Tim Arena.\n";
		Util.writeOutput(text);
		Util.hold(1000);

		text = "You are the leader of a small village and will lead it's population to greatness!\n";
		Util.writeOutput(text);
		Util.hold(1000);

		text = "Use the buttons on the right to change your name and your town's name.\n";
		Util.writeOutput(text);
		Util.hold(1000);

		update();
		display();
		run();
	}

	public void display()
	{

		TextBoxGame.button1.setText("Player Name");
		TextBoxGame.button1.addActionListener(this);

		TextBoxGame.button2.setText("Town Name");
		TextBoxGame.button2.addActionListener(this);

		TextBoxGame.button3.setText("Male Shop Keeper");
		TextBoxGame.button3.addActionListener(this);

		TextBoxGame.button4.setText("Female Shop Keeper");
		TextBoxGame.button4.addActionListener(this);

		TextBoxGame.button5.setText("Male Warrior");
		TextBoxGame.button5.addActionListener(this);

		TextBoxGame.button6.setText("Female Warrior");
		TextBoxGame.button6.addActionListener(this);

		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(this);

		TextBoxGame.button8.setText("Finish");
		TextBoxGame.button8.addActionListener(this);	

	}

	public void run()
	{
		Util.writeDisplay("");
		String status = "Player Name: "+ Main.player.Name 
				+ "\nTown Name: " + Main.player.townName + "\n\n" 
				+ "Male Shop Keeper: " + cit1 + "\n" 
				+ "Female Shop Keeper: " + cit2 + "\n" 
				+ "Male Warrior: " + cit3 + "\n" +
				"Female Warrior: " + cit4 + "\n";

		Util.writeDisplay(status);
	}
	
	public void getSend()
	{
		if(player)
		{
			Main.player.Name = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Player is named: " + Main.player.Name);
			player = false;
		}
		else if(town)
		{
			Main.player.townName = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Town is named: " + Main.player.townName);
			town = false;
		}
		else if(msk)
		{
			cit1 = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Male Shop Keeper is named: " + cit1);
			msk = false;
		}
		else if(fsk)
		{
			cit2 = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Female Shop Keeper is named: " + cit2);	
			fsk = false;
		}
		else if(mw)
		{
			cit3 = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Male Warrior is named: " + cit3);
			mw = false;
		}
		else if(fw)
		{
			cit4 = TextBoxGame.input.getText();
			Util.clearDisplay();
			Util.clearInput();
			Util.writeOutput("Female Warrior is named: " + cit4);
			fw = false;
		}
		
		run();
	}
	
	/* ACTION LISTENER */
	@Override
	protected void checkAction(String name)
	{
		if(name == "Player Name")
		{
			Util.writeOutput("Please Enter Player Name.");
			player = true; 
			town = false; msk = false; fsk = false; mw = false; fw = false;
		}
		
		else if(name == "Town Name")
		{
			Util.writeOutput("Please Enter Town Name.");
			town = true; 
			player = false; msk = false; fsk = false; mw = false; fw = false;

		}
		
		else if(name == "Male Shop Keeper")
		{
			Util.writeOutput("Please Enter Male Shop Keeper's Name.");
			msk = true; 
			player = false; town = false; fsk = false; mw = false; fw = false;
		}
		
		else if(name == "Female Shop Keeper")
		{
			Util.writeOutput("Please Enter Female Shop Keeper's Name.");
			fsk = true; 
			player = false; msk = false; town = false; mw = false; fw = false;
		}
		
		else if(name == "Male Warrior")
		{
			Util.writeOutput("Please Enter Male Warrior's Name.");
			mw = true; 
			player = false; msk = false; fsk = false; town = false; fw = false;	
		}
		else if(name == "Female Warrior")
		{
			Util.writeOutput("Please Enter Female Warrior's Name.");
			fw = true; 
			player = false; msk = false; fsk = false; mw = false; town = false;
		}
		
		run();		
		
		if(name == "Finish")
		{
			Main.player.gold = 0;
			
			Main.player.Builders[0] = new Citizen(10, 10, 10, 10, 100, 0, cit1, true, false);
			Main.player.Builders[1] = new Citizen(10, 10, 10, 10, 100, 0, cit2, false, false);
			Main.player.Warriors[0] = new Citizen(10, 10, 10, 10, 100, 0, cit3, true, true);
			Main.player.Warriors[1] = new Citizen(10, 10, 10, 10, 100, 0, cit4, false, true);
			
			Main.player.warriorsPop = 2;
			Main.player.buildersPop = 2;
			
			Util.changeMenus(this, new GameMenu());
			TextBoxGame.main.setEnabled(true);
		}
	}

}
