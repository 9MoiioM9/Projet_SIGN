package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Chest{
	
	private boolean locked;
	private List<Item> inventory = new ArrayList<Item>();
	public static final boolean DEFAULT_LOCKED = false;
	
	public Chest() {
		
		locked = DEFAULT_LOCKED;
		inventory = null;
		
	}
	
	public void take_C() {
		while(locked==false) {
			//ajouter dans la liste du backpack ce qu'il y a dans la liste de chest
		}
	}
	
	public void unlock_chest(/*key*/) {
		if(locked == false) {
			System.out.println("The chest is open don't need a key ");
		}else if(/*numero de la cle esr la bonne*/) {
			
			locked = false;
		}
	}
}