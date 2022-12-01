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
		
		v1 = new Village("v1");
		v2 = new Village("v2");
		v3 = new Village("v3");
		v4 = new Village("v4");
		
		String nameHero;
		System.out.println("What's your name");
		
		nameHero = commande.nextLine();
		h = new Hero_Heroine(nameHero);
		
		
	}
	
	public void play(Scanner commande) {
		while() {
			while(true) {
				r.background(r.getNumber());
				//r.fight(h, r.getEnemies().get(1), commande);
				
			}
		}
	}
	
}
