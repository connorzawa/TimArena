package timArena;
import java.awt.*;
import java.awt.event.*;

import menu.menuClasses.GameMenu;
import menu.menuClasses.Menu;
import menu.menuClasses.NewGameMenu;

@SuppressWarnings("all")
public class TextBoxGameButtons {

	static class SendListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {

			Main.heldInput = TextBoxGame.input.getText();
			TextBoxGame.input.setText("");
			TextBoxGame.output.append(Main.heldInput + " is now being held.");
			Util.newLine();
		}

	}

	static class QuitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {

			Main.running = false;
			Main.needsAction = false;
		}
	}

	static class BackListener implements ActionListener
	{
		Menu tempMenu;

		public void actionPerformed(ActionEvent e) {

			if(Main.lastMenu != null && Main.lastMenu.name != "NewGameMenu" && Main.lastMenu.name != Main.currentMenu.name)
			{
				tempMenu = Main.lastMenu;
				Util.changeMenus(Main.currentMenu, tempMenu);
			}

		}
	}

	static class MainListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e) {
			if(Main.currentMenu.name != "GameMenu"){
				Util.changeMenus(Main.currentMenu, new GameMenu());
			}
		}
	}


}