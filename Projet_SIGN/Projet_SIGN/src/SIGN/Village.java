package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Village extends Area {
		
	private String name; 
	
	public static final String TYPE = "village";
	
	private int number;
	private Enemy e = new Enemy("bandit");
	private List<Item> items = new ArrayList<Item>();
	
	public Village(String n, int nb, List<Item> l) {
		name = n;
		number = nb;
		items = l;
	}
	
	public Enemy getEnemy() {
		return e;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void desc_Enter(String name) {
		switch(name) {
			case "v1" : 
				System.out.println("Welcome! You're at the center of the Village"
								+"\n\nYou lay on the ground and you wake up slowly."
									+"\nAn old man is standing next to you, he is holding a backpack and a sword"+"\nIs it for You?");
		        System.out.println("\nThe old man : "
									+"\nAre you awake? How are you ?");
		        System.out.println("\nYou : "
									+"\nFine thank you. What the hell happened?");
		        System.out.println("\nWilliam : "
		        					+"\nFirst my name is William."
									+"\nLot of things my boy... but we don't have much time to talk about it. Time is short,listen to me."
									+"\nThis is your backpack. You need it during your quest. It will allow you to carry items."
									+"\nAnd that's sword is yours now. It's very useful to protect you against the bad encounters you might have"
									+"\nYou have to reach the castle and beat the King. He is the tyrant of this world. Go my boy save the world.");
		        System.out.println("\n***************A wierd sound comes from William and suddenly a strange smoke appeared***************");
		        System.out.println("\nWilliam diseappered, It's the beginning of your adventure.");
		        break ;
			case "v2" : 
				System.out.println("Welcome to the second village!"+"\nYou can see a man in front of a chest who seem to be locked.");
		        System.out.println("\nYou : "
		        					+"\nGood morning sir! What can I find in that chest?");
		        System.out.println("\nThe man : "
		        					+"\nI don't know maybe nothing, this chest doesn't belong to me."
		        					+"\nIf you want to unlock it you have to found the key young boy.");
		        break;
			case "v3" :
				System.out.println("Welcome to the village number 3!"
									+"\nYou can see some houses and locals but they don’t seem to want to talk to you."
									+"\nThere is nothing at the entrance of the village");
				break;
			case "v4" : 
				System.out.println("Welcome to the village number 4. The last one before the castle"
									+"\nThere is 1 armed guard at the entrance of the village, he’s holding 4 villagers hostage"
									+"\nYou hear a young child crying among them..."
									+"\nSuddenly you got a twinge of sorrow"
									+"\n\nYou have to beat him !");
				break;
		}
	}
	
	public void descDirection(String name, String d) {
		System.out.println("\n\n\n--"+d+"--\n\n\n");
			switch(name) {
			case "v1" : if(d == "N") {
							System.out.println("You see an enemy, a slime !, he has behind him 1 heal potion and 1 bread."
											+"\nBeat him to be able to take these items.");
						}else if(d == "W") {
							System.out.println("You can see a little house but you can't go inside."
									+"\nHowever,in the garden you can see 2 apples."
									+"\nMaybe it can be useful..., you can take them or leave them there");
						}else if(d == "E") {
							System.out.println("There is nothing, go along your path");
						}else if(d == "S") {System.out.println("\nYou just come back to the center");}
				break ;
			case "v2" : if(d == "N") {
							System.out.println("You can see an enemy a soldier stand in front of you, behind him you can see 1 key, 1 apple"
											+"\nBeat the ennemy to take items");
						}else if (d == "W") {
							System.out.println("You can see a bird and 1 bread laid on a rock");
						}else if(d == "E") {
							System.out.println("You can see a dark forest far far away");
						}else System.out.println("\nYou just come back to the center");
				break;
			case "v3" : if(d == "N") {
							System.out.println("You hear footsteps"
											+"\nIt’s two soldiers and a new enemy that looks more powerful, an armed guard."
											+"\nThe latter seems to have interesting items"
											+"\nThey seem to keep something"+ "\n ..."
											+"\nfootsteps sound closer behind you."+"\n..."
											+"\nWho are you!? What are you doing here!?");
					    	System.out.println("\nYou : "+"\nOh no ...");
					    	System.out.println("\nIt's the armed guard who spotted you and attacked you, \n Defend yourself !");	
						}else if(d == "W") {
								System.out.println("You can see in a little house, on a table 1 bread and 1 sandwich.");
						}else if(d == "E") {
							System.out.println("You can see 4 child playing and some animals like cows,donkeys...");
						}else System.out.println("\nYou just come back to the center");
		    	break ; 
			case "v4" : if(d == "N") {
							System.out.println("You can see a key on the ground"
									+ "\na Huge door in front of you appears after taking the key"
									+ "\nThe huge door open slowly, You enter inside the Castle");
						}else if(d == "W") {
							System.out.println("You can see the entrance to the castle in the North"
											+"\nIn front of it there are 2 heal potions, 1 sandwich and 1 acohol, maybe an old campfire of guards..");
							System.out.println("You see a sign not so far, you read it :"
											+"\n --Dare to enter and you will suffer to death !-- ");
							System.out.println("Be sure to be ready before enter !");
						}else if(d == "E") {
							System.out.println("You can see an old lady tring to open a chest");
							System.out.println("\nYou : "
												+"\nCan I help you ?");
							System.out.println("\nThe old lady : "
											+"\nOh yes, I lost the key of my chest can you help me find it young adventurer?"
											+"\nIn exchange I will give you its contents");
							System.out.println("\nYou : "
											+"\nOf course, I come back soon.");
							System.out.println("\nYou have to found the key of the chest to unlock it !");
						}else System.out.println("\nYou just come back to the center");
								
			break;
			}
	}
	
	public int desc_West(String name) {
		int ret = 0;
		switch(name) {
		case "v1" : 
			System.out.println("You can see a little house but you can't go inside."
							+"\nHowever,in the garden you can see 2 apples."
							+"\nMaybe it can be useful..., you can take them or leave them there");
			ret = 1;
			break ;
		case "v2" : 
			System.out.println("You can see a bird and 1 bread laid on a rock");
			ret = 1;
			break;
		case "v3" : 
			System.out.println("You can see in a little house, on a table 1 bread and 1 sandwich.");
			ret = 1;
	    	break ; 
		case "v4" : 
			System.out.println("You can see the entrance to the castle"
							+"\nIn front of it there are 2 heal potions, 1 sandwich and 1 acohol, maybe an old campfire of guards..");
	    	System.out.println("You see a sign not so far, you read it :"
							+"\n --Dare to enter and you will suffer to death !-- ");
	    	System.out.println("Be sure to be ready before enter !");
	    	ret = 1;
	    	break;
		}
		return ret;
	}
	
	public int desc_Est(String name) {
		int ret = 0;
		switch(name) {
		case "v1" : 
			System.out.println("There is nothing, go along your path");
			break ;
		case "v2" : 
			System.out.println("You can see a stick and 1 health potion at the entrance of a forest");
			ret = 1;
			break;
		case "v3" : 
			System.out.println("You can see 4 sticks and some animals like cows,donkeys...");
			ret = 1;
	    	break ; 
		case "v4" : 
			System.out.println("You can see an old lady tring to open a chest");
			System.out.println("\nYou : "
							+"\nCan I help you ?");
			System.out.println("\nThe old lady : "
							+"\nOh yes, I lost the key of my chest can you help me find it young adventurer?"
							+"\nIn exchange I will give you its contents");
			System.out.println("\nYou : "
							+"\nOf course, I come back soon.");
			System.out.println("\nYou have to found the key of the chest to unlock it !");
			ret = 1;
	    	break;
		}
		return ret;
	}
}
