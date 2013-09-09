package menu.menuButtons;
import java.awt.event.*;

import javax.swing.*;

import timArena.Main;

import menu.menuClasses.GameMenu;



@SuppressWarnings("all")
public class MenuButtons implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {

		Main.needsAction = false;
		
		String name = ((JButton) e.getSource()).getActionCommand();	
		checkAction(name);
	}

	protected void checkAction(String name) 
	{
		
	}

}
