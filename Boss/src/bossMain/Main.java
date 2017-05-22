package bossMain;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		
		ICritter boss = new gobbo();
		
		while (input != "quit")
		{
			System.out.println("You see...");
			System.out.println(boss.toString());
			System.out.println("--------------------"); 
			System.out.println("MENU");
			System.out.println("1. Attack");
			System.out.println("2. Defend");
			System.out.println("3. Special");
			
			input = keyboard.next();
			System.out.println(input);
			
			switch(input)
			{
				case("1"):
				{
					
				}
				case("2"):
				{
					
				}
				case("3"):
				{
					
				}	
				default:
				{
					System.out.println("What duz dat meanz?");
				}
			}
			
		}
		
		keyboard.close();
	}
}
