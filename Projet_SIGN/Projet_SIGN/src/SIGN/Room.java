package SIGN;

public class Room extends Area{
	
	private int number;
	public static final String TYPE = "room";
	private boolean util;
	
	public Room(int nb) {
		number = nb;
		util = true;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean isUtil() {
		return util;
	}
	
	public void changeUtil() {
		util = false;
	}
	
	public void background() {
		switch(number) {
			case 1 : System.out.println("You enter in the castle, in this room you can see one door on the left wall and another one in front of you. The wall on the right is damaged. Two guards come to you, they take out their weapons");
			break;
			
			case 2 : System.out.println("You enter in a big dining room, you see a door next to you and another in front of you, the cooker offer you a meal, you can refuse or eat");
			break;
			
			case 3 : System.out.println("You are in a hall, there is a stair and at the top a big door, it is lock you need a password to enter in the final room");
			break;
			
			case 4 : System.out.println("You are in the desk-room of head of guard");
			break;
			
			case 5 : System.out.println("You enter in a jail, there are two people in different cages");
			break;
			
			case 6 : System.out.println(" You are in throne room, you must defeat him and save the kingdom!");
			break;
		}
	}
	
	
	
	
}
