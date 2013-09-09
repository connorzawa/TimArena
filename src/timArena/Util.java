package timArena;

import menu.menuClasses.Menu;

public class Util {
	
	
	public static void newLine()
	{
		TextBoxGame.output.append("\n\n");
	}
	
	public static void clear()
	{
		TextBoxGame.output.setText("");
		TextBoxGame.display.setText("");
	}
	
	public static void writeOutput(String str)
	{
		TextBoxGame.output.append(str);
		newLine();
	}
	
	public static void writeDisplay(String str)
	{
		TextBoxGame.display.setText("");
		TextBoxGame.display.append(str);
		newLine();
	}
	
	public static void writeEvent(String str)
	{
		TextBoxGame.event.append(str);
		newLine();
	}
	
	public static void changeMenus(Menu menuOld, Menu menuNew)
	{
		menuOld.close();
		Main.currentMenu = menuNew;
		Main.currentMenu.initialize();
	}
	
	public static void hold(int hold)
	{
		try {
			Thread.sleep(hold);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
