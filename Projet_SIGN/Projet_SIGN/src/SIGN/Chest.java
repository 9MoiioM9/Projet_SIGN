package SIGN;

public class Chest{
	
	private boolean locked;
	private Item item;
	public static final boolean DEFAULT_LOCKED = false;
	
	public Chest() {
		
		locked = DEFAULT_LOCKED;
		item = null;
	}
	
	public boolean isLocked() {
		return locked;
	}
	
	public void takeLoot(Chest c, Backpack b) {
		if(!locked) {
			if(!b.isFull()) {
				b.addItem(c.item);
				System.out.println("You get an item !");
			}
		}else System.out.println("The chest is locked, a key is needed");
	}
	
	public void unlock_Chest(Item i) {
		if(i.getName() == "key") {
			locked = false;
			System.out.println("The Chest is now open");
		}else System.out.println("You don't have a key to open this Chest...");
	}	
}