package SIGN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room extends Area{
	
	private int number;
	public static final String TYPE = "room";
	private boolean util;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private int nbEnemy;
	
	
	public Room(int nb, int nbEn) {
		number = nb;
		util = true;
		nbEnemy = nbEn;
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
	
	public void addEnemy(Enemy en) {
		enemies.add(en);
	}
	
	
	public void background(int number) {
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
	
	
	public void fight(Hero_Heroine h, Enemy e, Scanner scan) {
		while(h.getHp() > 0 || e.getHp() > 0) {
			Command.askCommand(scan);
			if(scan.nextLine() != "ATTACK") {
				System.out.println("You are in a fight, you can't do anythings else ");
				Command.afficheHELP();
			}else {
				 e.setHp(e.getHp()- h.getPtAttack());
				 System.out.println("You do 5 damage");
				 h.setHp(h.getHp() - e.getPtAttack());
				 System.out.println("You suffer 5 damage");
			}
		}
	}
	
	public List<Enemy> initRoom() {
		for(int i = 0; i < nbEnemy; i++) {
			Enemy n = new Enemy();
			addEnemy(n);	
		}
		return enemies;
	}
}
