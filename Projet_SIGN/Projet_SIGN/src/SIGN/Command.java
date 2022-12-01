package SIGN;

import java.util.Scanner;

public class Command {
	
	public void gestionCommand(String command) {
		switch(command){
			case "GO" : System.out.println("List Of Command from HELP :");
			break;
		}
	}
	
	public static void afficheHELP() {
		System.out.println("List Of Command from HELP :");
		System.out.println("GO -> Permit to move on another location;");
		System.out.println("LOOK -> Display a description of the current location;");
		System.out.println("TAKE -> Take an item;");
		System.out.println("USE -> Use an Item;");
		System.out.println("QUIT -> Quit the game;");
		System.out.println("ATTACK -> Attack an enemy;");
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
			
			case "ATTACK" : System.out.println("You've dealt damage to your ennemy");
			break;
			
			default : 
				afficheHELP();
				System.out.println();
				askCommand(ask);
		}
	}
	
	public static void locationHELP() {
		System.out.println("N : Go to the NORTH");
		System.out.println("E : Go to The EST");
		System.out.println("S : Go to The SOUTH");
		System.out.println("W : Go to The WEST");
	}
	
	public static void choiceDirection(Scanner moveto) {
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
				choiceDirection(moveto);
				System.out.println();
		}
	}
	
	public static void directionInfo(String north, String south, String west, String est) {
		System.out.println("North you can find "+north); 
		System.out.println("South you can find "+south);
		System.out.println("West you can find "+west);
		System.out.println("Est you can find "+est);
	}// dans villageMap faire methode qui renvoie un String pour chaque location north south ...
	
	public void gestionLOOK(String look) {
		
	}
	
	
	
	public void fight(Hero_Heroine h, Enemy e, Scanner scan) {
		while(h.getHp() > 0 || e.getHp() > 0) {
			Command.askCommand(scan);
			if(scan.nextLine() != "ATTACK") {
				System.out.println("You are in a fight, you can't do anything else ");
				Command.afficheHELP();
			}else {
				 e.setHp(e.getHp()- h.getPtAttack());
				 System.out.println("You did 5 damage");
				 h.setHp(h.getHp() - e.getPtAttack());
				 System.out.println("You suffered 5 damage");
			}
		}
	}
	
}
