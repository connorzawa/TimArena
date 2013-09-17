package timArena;

import menu.menuClasses.Menu;

public class Util {
	
	
	public static void newLine()
	{
		TextBoxGame.output.append("\n");
	}
	
	public static void clear()
	{
		TextBoxGame.output.setText(null);
		TextBoxGame.display.setText(null);
	}
	
	public static void clearOutput()
	{
		TextBoxGame.output.setText(null);
	}
	
	public static void clearDisplay()
	{
		TextBoxGame.display.setText(null);
	}
	
	public static void clearInput()
	{
		TextBoxGame.input.setText("");
	}
	
	public static void writeOutput(String str)
	{
		TextBoxGame.output.append(str);
		newLine();
	}
	
	public static void writeDisplay(String str)
	{
		TextBoxGame.display.setText(str);
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
	
	public static void hold(int i)
	{
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}
		
}
