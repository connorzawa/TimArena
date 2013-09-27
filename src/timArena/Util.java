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

	// Util Methods for Setting Button methods
	public static void setButtons()
	{

		TextBoxGame.button1.setText("");
		TextBoxGame.button1.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button1.setEnabled(false);


		TextBoxGame.button2.setText("");
		TextBoxGame.button2.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button2.setEnabled(false);


		TextBoxGame.button3.setText("");
		TextBoxGame.button3.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button3.setEnabled(false);


		TextBoxGame.button4.setText("");
		TextBoxGame.button4.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button4.setEnabled(false);


		TextBoxGame.button5.setText("");
		TextBoxGame.button5.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button5.setEnabled(false);


		TextBoxGame.button6.setText("");
		TextBoxGame.button6.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button6.setEnabled(false);


		TextBoxGame.button7.setText("");
		TextBoxGame.button7.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button7.setEnabled(false);


		TextBoxGame.button8.setText("");
		TextBoxGame.button8.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button8.setEnabled(false);
	}

	public static void setButtons(String button1, String button2, String button3, String button4, String button5, String button6, String button7, String button8)
	{

		TextBoxGame.button1.setText(button1);
		TextBoxGame.button1.setToolTipText(TextBoxGame.button1.getText());
		TextBoxGame.button1.setEnabled(true);


		TextBoxGame.button2.setText(button2);
		TextBoxGame.button2.setToolTipText(TextBoxGame.button2.getText());
		TextBoxGame.button2.setEnabled(true);


		TextBoxGame.button3.setText(button3);
		TextBoxGame.button3.setToolTipText(TextBoxGame.button3.getText());
		TextBoxGame.button3.setEnabled(true);


		TextBoxGame.button4.setText(button4);
		TextBoxGame.button4.setToolTipText(TextBoxGame.button4.getText());
		TextBoxGame.button4.setEnabled(true);


		TextBoxGame.button5.setText(button5);
		TextBoxGame.button5.setToolTipText(TextBoxGame.button5.getText());
		TextBoxGame.button5.setEnabled(true);


		TextBoxGame.button6.setText(button6);
		TextBoxGame.button6.setToolTipText(TextBoxGame.button6.getText());
		TextBoxGame.button6.setEnabled(true);


		TextBoxGame.button7.setText(button7);
		TextBoxGame.button7.setToolTipText(TextBoxGame.button7.getText());
		TextBoxGame.button7.setEnabled(true);


		TextBoxGame.button8.setText(button8);
		TextBoxGame.button8.setToolTipText(TextBoxGame.button8.getText());
		TextBoxGame.button8.setEnabled(true);
	}

	public static void setButtons(int button, String buttonName, boolean enab)
	{

		if(button == 1){
			TextBoxGame.button1.setText(buttonName);
			TextBoxGame.button1.setToolTipText(TextBoxGame.button1.getText());
			TextBoxGame.button1.setEnabled(enab);
		}
		else if(button == 2){
			TextBoxGame.button2.setText(buttonName);
			TextBoxGame.button2.setToolTipText(TextBoxGame.button2.getText());
			TextBoxGame.button2.setEnabled(enab);
		}
		else if(button == 3){
			TextBoxGame.button3.setText(buttonName);
			TextBoxGame.button3.setToolTipText(TextBoxGame.button3.getText());
			TextBoxGame.button3.setEnabled(enab);
		}
		else if(button == 4){
			TextBoxGame.button4.setText(buttonName);
			TextBoxGame.button4.setToolTipText(TextBoxGame.button4.getText());
			TextBoxGame.button4.setEnabled(enab);
		}
		else if(button == 5){
			TextBoxGame.button5.setText(buttonName);
			TextBoxGame.button5.setToolTipText(TextBoxGame.button5.getText());
			TextBoxGame.button5.setEnabled(enab);
		}
		else if(button == 6){
			TextBoxGame.button6.setText(buttonName);
			TextBoxGame.button6.setToolTipText(TextBoxGame.button6.getText());
			TextBoxGame.button6.setEnabled(enab);
		}
		else if(button == 7){
			TextBoxGame.button7.setText(buttonName);
			TextBoxGame.button7.setToolTipText(TextBoxGame.button7.getText());
			TextBoxGame.button7.setEnabled(enab);
		}
		else if(button == 8){
			TextBoxGame.button8.setText(buttonName);
			TextBoxGame.button8.setToolTipText(TextBoxGame.button8.getText());
			TextBoxGame.button8.setEnabled(enab);
		}
	}

}
