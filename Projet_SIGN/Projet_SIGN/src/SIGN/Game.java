package SIGN;

import java.util.Scanner;

public class Game {
	
	private Castle c;
	private Village v1;
	private Village v2;
	private Village v3;
	private Village v4;
	private Hero_Heroine h;
	
	public void initGame(Scanner commande) {
		c = new Castle();
		c.initCastle();
		
		v1 = new Village("village 1");
		v2 = new Village("village 2");
		v3 = new Village("village 3");
		v4 = new Village("village 4");
		
		String nameHero;
		System.out.println("What your name");
		
		
		h = new Hero_Heroine();
		
		
	}
	
	public void play(Scanner commande) {
		for(Room r : c.getRooms()) {
			while(true) {
				r.background(r.getNumber());
				r.fight(h, r.getEnemies().get(1), commande);
				
			}
		}
	}
	
}
