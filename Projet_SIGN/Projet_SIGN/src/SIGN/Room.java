package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Room extends Area{
	
	private int number;
	public static final String TYPE = "room";
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private int nbEnemy;
	private String name;
	
	
	public Room(int nb, int nbEn, String n) {
		number = nb;
		nbEnemy = nbEn;
		name = n;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void addEnemy(Enemy en) {
		enemies.add(en);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Enemy> getEnemies() {
		return enemies;
	}


	public int background(int number) {
		int ret = 2;
		switch(number) {
			case 1 : System.out.println("You enter in the castle, in this room you can see one door on the left wall and another one in front of you."
									+"There is a door on the right ."
									+ "\nTwo guards come to you, they take out their weapons");
			break;
			
			case 2 : System.out.println("You enter in a big dining room, you see a door on your right and another in front of you."
									+"\nWithout warning the cooker attack you");
			break;
			
			case 3 : System.out.println("You are in the hall, there are stairs in front of you and at the top a big door."
									+"\nIt's locked you need a password to enter in the final room");
			break;
			
			case 4 : System.out.println("You are in the desk-room of the leader's guards,"
									+"there is a door on your left and the desk in front of you");
			ret = 3;
			break;
			
			case 5 : System.out.println("You enter in a jail, there is someone in a cage on your right and a guard in front of you"
									+"\nThe guard seems to be angry and decided to attack you"
									+"\n Fight him !");
			break;
			
			case 6 : System.out.println("You are now in the throne room." 
									+"\nSuddenly, you hear a loud sound in front of you"
									+"\na Huge shadow appears on the wall, several torch light up one by one"
									+"\na long path of flame appears in front of you"
									+ "\nYou must defeat Rufus and save the kingdom!");
			break;
		}
		return ret;
		
	}
	
	public boolean finalFight(Hero_Heroine h) {
		return h.getLocation() == "r6";
	}
	
	
	public void initRoom() {
		for(int i = 0; i < nbEnemy; i++) {
			if(i == 4) {
				enemies = null;
			}else {
				Enemy n = new Enemy("Guard");
				addEnemy(n);
			}
		}
	}
	
	
}
