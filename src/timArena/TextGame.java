package timArena;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;
@SuppressWarnings("all")
public class TextGame extends JFrame  {
//
//	public static TextArea textArea = new TextArea("", 0 ,0 , TextArea.SCROLLBARS_VERTICAL_ONLY);
//	public static boolean running = false; 
//	public static boolean first = true;
//	public static boolean inBattle = false;
//	public static Citizen Hero;
//	public static Scanner in = new Scanner(System.in);
//	public static String message;
//
//	public TextGame()
//	{
//		this.setSize(500,300);
//		this.setTitle("Java Tutorial");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		textArea.setEditable(false);
//		textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
//		this.getContentPane().setLayout(new BorderLayout());
//		this.getContentPane().add(textArea);
//	}
//
//	public static void gameloop()
//	{
//		while(running)
//		{
//			update();
//			draw();
//		}
//		close();
//	}
//
//
//	public static void update()
//	{
//
//	}
//
//	public static void draw()
//	{
//		if(first)
//		{
//			boolean start = false;
//
//			message = "N for new game.\r\n" +
//					"E to exit.\r\n" +
//					"L to Load.\r\n" +
//					"Please give first input: ";
//
//			System.out.print("Welcome to the text game.\r\n" + message);
//
//			while(!start)
//			{
//				String c = in.next();
//				c = c.toUpperCase();
//	
//				start = true;
//				switch(c)
//				{
//				case "N":
//					newGame();
//					break;
//				case "E":
//					close();
//					break;
//				case "L":
//					//loadGame();
//					break;
//				default:
//					System.out.print("Input not recognized...\r\n" + message);
//					start = false;
//				}
//			}
//			first = false;
//		}
//
//
//	}
//
//	public static void close()
//	{
//		message = "\r\n\r\nClosing the game....\r\n\r\n";
//		System.out.println(message);
//		System.exit(0);
//	}
//
//
//	public static void main(String[] args) {
//		running = true;
//
//		TextGame text = new TextGame();
//		gameloop();
//
//	}
//
//
//	public static void newGame()
//	{
//		
//		Hero =  new Citizen(10, 0, 0, 100, " ");
//		System.out.println("What is your name? ");
//		
//		Hero.setName((in.next()));
//		System.out.print("Hello, " + Hero.name +"!\r\n");
//		 
//		message = "Welcome, to Tim Arena. The text based game where you grind your way to top!\r\n"; 
//		
//		System.out.println(message);
//		
//		toPreMenu();
//	}
//	
//	public static void toPreMenu()
//	{
//		inBattle = false;
//		while(!inBattle)
//		{
//			message = "C: Character Stats\r\nI: Inventory\r\nE: Equipment\r\nB: Battle\r\nQ: Save and Quit\r\nPlease make a selection:";
//			
//			System.out.print(message);
//			String c = in.next();
//			c = c.toUpperCase();
//			
//			switch(c)
//			{
//			case "C":
//				Hero.printStats();
//				break;
//			case "Q":
//				close();
//				break;
//			case "B":
//				inBattle = true;
//				break;
//			default:
//				System.out.print("Input not recognized...\r\n");
//			}
//									
//		}
//		
//		System.out.println("To BATTLE!");
//		BattleSim.battle(Hero, new Citizen(10,0,50,50, "Goblin"));
//	}
//	
//	
}
