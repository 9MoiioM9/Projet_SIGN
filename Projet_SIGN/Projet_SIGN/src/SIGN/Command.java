package SIGN;

import java.util.Scanner;

public class Command {
	
	public static void afficheHELP() {
		System.out.println("List Of Command from HELP :");
		System.out.println("GO -> Permit to move on another location;");
		System.out.println("LOOK -> Display a description of the current location;");
		System.out.println("TAKE -> Take an item;");
		System.out.println("USE -> Use an Item;");
		System.out.println("QUIT -> Quit the game;");
	}
	
	
	public static void askCommand(Scanner ask) {
		
		String command;
		
		System.out.print("Please Choose a Command : ");
		command = ask.nextLine();
		
		
		switch(command) {
			case "TAKE" : System.out.println("Yes");
			break;
			
			case "GO" : System.out.println("GO -> Permit to move on another location;");
			break;
			
			case "LOOK" : System.out.println("Check around");
			break;
			
			case "USE" : System.out.println("Yes");
			break;
			
			case "QUIT" : System.out.println("Have a Good Day");
			break;
			
			default : 
				afficheHELP();
				System.out.println();
				askCommand(ask);
		}
		//ask.close();
	}
	
	public static void locationHELP() {
		System.out.println("N : Go to the NORTH");
		System.out.println("E : Go to The EST");
		System.out.println("S : Go to The SOUTH");
		System.out.println("W : Go to The WEST");
	}
	
	
	public static void moveTO(Scanner moveto) {
		String direction;
		
		
		System.out.print("\nPlease Choose a Direction : ");
		direction = moveto.nextLine(); 
		
		switch(direction) {
			case "N" : System.out.println("You have chosen the NORTH");
			break;
			
			case "E" : System.out.println("You have chosen the EST");
			break;
			
			case "S" : System.out.println("You have chosen the SOUTH");
			break;
			
			case "W" : System.out.println("You have chosen the WEST");
			break;
			
			default : 
				locationHELP();
				moveTO(moveto);
				System.out.println();
		}
			
		//moveto.close();
	}
	
	public static void directionInfo() {
		System.out.println("North you can find [Location]"); 
		System.out.println("South you can find [Location]");
		System.out.println("West you can find [Location]");
		System.out.println("Est you can find [Location]");
	}
	
	public static void main(String argv[]) {
		System.out.println("TEST");
		
		Scanner t = new Scanner(System.in);
		
		Command.askCommand(t);
		
		Command.moveTO(t);
		
		t.close();
		
	}
	
}
