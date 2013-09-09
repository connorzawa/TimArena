package timArena;


import java.awt.event.ActionListener;
import java.util.Scanner;

import menu.menuClasses.MainMenu;
import menu.menuClasses.Menu;





@SuppressWarnings("all")
public class Main{
	public static Player player  = new Player();
	public static boolean running = false;
	public static TextBoxGame game;
	public static String message, heldInput = " ";
	public static boolean first = true, needsAction = false, needsInput = false;
	public static boolean inBattle = false;
	public static Citizen Hero;
	public static Scanner in = new Scanner(System.in);
	public static Menu lastMenu, currentMenu, tempMenu;
	public static void main(String[] args)	
	{
		
		running = true;
		game = new TextBoxGame();
		currentMenu = new MainMenu();
		currentMenu.initialize();
		gameLoop();
	}

	public static void gameLoop()
	{

		while(running)
		{

			update();
			draw();
					
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}

		
		close();
	}

	public static void update()
	{
		
	}

	public static void draw()
	{
					
	}

	public static void close()
	{
		
		Main.message = "\r\n\r\nClosing the game....\r\n\r\n";
		Util.writeOutput(Main.message);
						
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.exit(0);	
		
	}

}
