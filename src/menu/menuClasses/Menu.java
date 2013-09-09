package menu.menuClasses;

import java.awt.event.ActionListener;

import menu.menuButtons.MenuButtons;
import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;


public class Menu {
	
	public String name;

	public Menu()
	{
		this.display();
		this.update();
	}
	
	public void initialize()
	{
		
	}
	
	public void update()
	{
		TextBoxGame.button1.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button2.setToolTipText(TextBoxGame.button2.getText());
		TextBoxGame.button3.setToolTipText(TextBoxGame.button3.getText());
		TextBoxGame.button4.setToolTipText(TextBoxGame.button4.getText());
		TextBoxGame.button5.setToolTipText(TextBoxGame.button5.getText());
		TextBoxGame.button6.setToolTipText(TextBoxGame.button6.getText());
		TextBoxGame.button7.setToolTipText(TextBoxGame.button7.getText());
		TextBoxGame.button8.setToolTipText(TextBoxGame.button8.getText());
		
		if(TextBoxGame.button1.getText() == " ")
		{
			TextBoxGame.button1.setEnabled(false);
		}
		else
		{
			TextBoxGame.button1.setEnabled(true);
		}
		
		if(TextBoxGame.button2.getText() == " ")
		{
			TextBoxGame.button2.setEnabled(false);
		}
		else
		{
			TextBoxGame.button2.setEnabled(true);
		}
		
		if(TextBoxGame.button3.getText() == " ")
		{
			TextBoxGame.button3.setEnabled(false);
		}
		else
		{
			TextBoxGame.button3.setEnabled(true);
		}
		
		if(TextBoxGame.button4.getText() == " ")
		{
			TextBoxGame.button4.setEnabled(false);
		}
		else
		{
			TextBoxGame.button4.setEnabled(true);
		}
		
		if(TextBoxGame.button5.getText() == " ")
		{
			TextBoxGame.button5.setEnabled(false);
		}
		else
		{
			TextBoxGame.button5.setEnabled(true);
		}
		
		if(TextBoxGame.button6.getText() == " ")
		{
			TextBoxGame.button6.setEnabled(false);
		}
		else
		{
			TextBoxGame.button6.setEnabled(true);
		}
		
		if(TextBoxGame.button7.getText() == " ")
		{
			TextBoxGame.button7.setEnabled(false);
		}
		else
		{
			TextBoxGame.button7.setEnabled(true);
		}
		
		if(TextBoxGame.button8.getText() == " ")
		{
			TextBoxGame.button8.setEnabled(false);
		}
		else
		{
			TextBoxGame.button8.setEnabled(true);
		}		
	}
	
	public void close()
	{
		Main.lastMenu = this;
		removeActionListeners();
		Util.clear();
	}
	
	public void display()
	{
		
		TextBoxGame.button1.setText(" ");
		TextBoxGame.button1.addActionListener(new MenuButtons());
		
		TextBoxGame.button2.setText(" ");
		TextBoxGame.button2.addActionListener(new MenuButtons());
		
		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(new MenuButtons());
		
		TextBoxGame.button4.setText(" ");
		TextBoxGame.button4.addActionListener(new MenuButtons());
		
		TextBoxGame.button5.setText(" ");
		TextBoxGame.button5.addActionListener(new MenuButtons());
		
		TextBoxGame.button6.setText(" ");
		TextBoxGame.button6.addActionListener(new MenuButtons());
		
		TextBoxGame.button7.setText(" ");
		TextBoxGame.button7.addActionListener(new MenuButtons());
		
		TextBoxGame.button8.setText(" ");
		TextBoxGame.button8.addActionListener(new MenuButtons());	

	}
	
	public void run(){
		
	}
	
	public void removeActionListeners()
	{
		for( ActionListener al : TextBoxGame.button1.getActionListeners() ) {
			TextBoxGame.button1.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button2.getActionListeners() ) {
			TextBoxGame.button2.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button3.getActionListeners() ) {
			TextBoxGame.button3.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button4.getActionListeners() ) {
			TextBoxGame.button4.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button5.getActionListeners() ) {
			TextBoxGame.button5.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button6.getActionListeners() ) {
			TextBoxGame.button6.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button7.getActionListeners() ) {
			TextBoxGame.button7.removeActionListener( al );
		}
		for( ActionListener al : TextBoxGame.button8.getActionListeners() ) {
			TextBoxGame.button8.removeActionListener( al );
		}	}
}
