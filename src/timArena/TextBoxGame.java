package timArena;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


import timArena.TextBoxGameButtons.QuitListener;
import timArena.TextBoxGameButtons.SendListener;



@SuppressWarnings("all")
public class TextBoxGame extends JFrame{

	public static TextArea output = new TextArea("", 0 ,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	public static TextArea display = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	public static TextArea event = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	public static TextArea input = new TextArea("",1,1,TextArea.SCROLLBARS_HORIZONTAL_ONLY);

	public static JButton store = new JButton("Send");

	public static JButton button1 = new JButton(" ");
	public static JButton button2 = new JButton(" ");
	public static JButton button3 = new JButton(" ");
	public static JButton button4 = new JButton(" ");
	public static JButton button5 = new JButton(" ");
	public static JButton button6 = new JButton(" ");
	public static JButton button7 = new JButton(" ");
	public static JButton button8 = new JButton(" ");

	public static JButton main = new JButton("Main");
	public static JButton back = new JButton("Back");
	public static JButton save = new JButton("Save");
	public static JButton quit = new JButton("Quit");
	public static GridBagConstraints c = new GridBagConstraints();

	TextBoxGame()
	{

		// ========== TEXT AREAS ON GUI ==========

		this.setSize(600,650);
		this.setTitle("Tim Arena");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setLayout(new GridBagLayout());


		c.fill = GridBagConstraints.BOTH;
		c.weighty = .2;
		c.weightx = .3;
		c.gridheight = 10;
		c.gridx = 0;       
		c.gridy = 0;       
		output.setEditable(false);
		this.add(output,c);


		c.fill = GridBagConstraints.BOTH;
		c.gridheight = 1;
		c.gridwidth = 2;

		c.weighty = 1;
		c.weightx = .3;
		c.gridx = 2;
		c.gridy = 4;
		display.setEditable(false);
		this.add(display,c);
		
		c.gridy = 5;
		event.setEditable(false);
		this.add(event,c);


		// ========== Send Form ==========		

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weighty = .3;
		c.weightx = .3;
		c.gridx = 2;
		c.gridy = 6;
		this.add(input,c);

		c.gridx = 3;
		c.gridy = 6;
		this.add(store,c);
		store.addActionListener(new TextBoxGameButtons.SendListener());


		// ========== BUTTONS ON GUI ===========

		// ========== TOP 8 BUTTONS ==========
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = .3;
		c.gridheight = 1;
		c.gridwidth = 1;

		c.gridy = 0;
		c.gridx = 2;
		this.add(button1, c);
		Menu menu = new Menu();
				
		c.gridy = 0;
		c.gridx = 3;
		this.add(button2, c);


		c.gridy = 1;
		c.gridx = 2;
		this.add(button3, c);
		

		c.gridy = 1;
		c.gridx = 3;
		this.add(button4, c);
	

		c.gridy = 2;
		c.gridx = 2;
		this.add(button5, c);
	

		c.gridy = 2;
		c.gridx = 3;
		this.add(button6, c);


		c.gridy = 3;
		c.gridx = 2;
		this.add(button7, c);


		c.gridy = 3;
		c.gridx = 3;
		this.add(button8, c);
	
		// ========== BOTTOM 4 BUTTONS ==========		

		c.gridy = 8;
		c.gridx = 3;
		this.add(main, c);
		main.addActionListener(new TextBoxGameButtons.MainListener());
		main.setEnabled(false);

		c.gridy = 8;
		c.gridx = 2;
		this.add(back, c);
		back.addActionListener(new TextBoxGameButtons.BackListener());

		c.gridy = 9;
		c.gridx = 2;
		this.add(save, c);

		c.gridy = 9;
		c.gridx = 3;
		this.add(quit, c);
		quit.addActionListener(new TextBoxGameButtons.QuitListener());


		// ========== END GUI SET UP ==========

		setVisible(true);
	}


	
}


