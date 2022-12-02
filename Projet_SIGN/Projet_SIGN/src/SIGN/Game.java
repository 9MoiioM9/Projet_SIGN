package SIGN;

import java.util.ArrayList;
import java.util.List;
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
		
		List<Item> i = new ArrayList<Item>();
		i.add(new Item("hp"));
		i.add(new Item("b"));
		
		v1 = new Village("v1", 1, i  );
		
		
		
		String nameHero;
		System.out.println("What's your name");
		
		nameHero = commande.nextLine();
		h = new Hero_Heroine(nameHero);
		
		
	}
	
	public boolean finalFight(Hero_Heroine h) {
		return h.getLocation() == "r6";
	}
	
	public void background() {
		System.out.println("Your family is accused of treason, for regain your honour you are volunteer to defeat the king of the neighbouring kingdom. Indeed he is suspected to do experiment to transform habitant in monster. Unfortunately you just arrived in the kingdom and a group of bandits attack you still you equipment and knocks you down. You wake up with headache and see a village away.");
	}
	
	public void useComd(String s, Hero_Heroine h, Scanner scan){
		
		switch(s) {
			case "TAKE" : h.take(v1.getItems());
				System.out.println("You got items");
			break;
			
			case "USE" : h.useConsumable(, h);
				System.out.println("you use ");
			break;
			
			case "LOOK" : v1.desc_Enter(v1.getName());
			break;
			
			case "GO" : h.setLocal(Command.choiceDirection(scan));
			break;
			
			case "QUIT" : System.out.println("You quit THE game");
			break;
		}
	}
	
	
	public void play(Scanner commande) {
		
		background();
		String gestion;
		while(true) {
			
			v1.desc_Enter(v1.getName());
			System.out.println("What Would you do ?");
			
			gestion = Command.askCommand(commande);
			useComd(gestion, h, commande);
			
			
			
			
			
			
			if(finalFight(h)) {
				System.out.println("The king take out a great-sword and looking at you : "
						+ "\n « I was waiting for you, since you’re arrived in my kingdom you messed up, that’s why I will kill you, and conquer your kingdom ».");
				System.out.println("He comes next to you with his weapon toward yourself, you take on your weapon, deflect his attack and counterattack and reach his stomach.");
				System.out.println("He steps back, but you don’t give him the time to react, you move closer to hit him in the head, but he grabs you by the neck and start to squeeze.");
				System.out.println("You struggle then you regain your mind and you slice the king from side to side.");
				System.out.println("He leaves you and fall to the ground lifeless, you stand up and take his signet ring as proof.");
				System.out.println("This kingdom is finally free and your family’s honour is restored.");
				break;
			}
		}
	}

	
	
}
