package menu.menuClasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import timArena.Main;
import timArena.TextBoxGame;
import timArena.Util;


public class Menu implements ActionListener{
	
	public String name;

	public Menu()
	{
		this.update();
		display();
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
		Util.clearOutput();
		Util.clearDisplay();
		Main.lastMenu = this;
		removeActionListeners();

	}
	
	public void display()
	{
		
		TextBoxGame.button1.setText(" ");
		TextBoxGame.button1.addActionListener(this);
		
		TextBoxGame.button2.setText(" ");
		TextBoxGame.button2.addActionListener(this);
		
		TextBoxGame.button3.setText(" ");
		TextBoxGame.button3.addActionListener(this);
		
		TextBoxGame.button4.setText(" ");
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
	
	
	public void getSend()
	{
		
	}
	
	/* MENU BUTTONS */
	
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


