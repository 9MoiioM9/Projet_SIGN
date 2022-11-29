package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Chest{
	
	private boolean locked;
	private Item item;
	public static final boolean DEFAULT_LOCKED = false;
	
	public Chest() {
		
		locked = DEFAULT_LOCKED;
		item = null;
		
	}
	
	public void take_C(Chest c) {
		if(locked == false) {
			if(Backpack.isFull() == false) {
				Backpack.addItem(c.item);
				System.out.println("You get an item !");
			}
		}else System.out.println("the chest is locked, you need a key");
	}
	
	public void unlock_chest(Item i) {
		if(locked == false) {
			System.out.println("The chest is open don't need a key ");
		}else if(i.getName() == "key") {
			
			locked = false;
		}
	}
}