package SIGN;

public abstract class Item implements Use{
	
	public static String name;
	
	private Weapon myWeapon;
	private Consumable myConso;
	
	private int volume;
	
	private int numberInStock;
	
	private boolean usable;
	
	public Item(String n) {
		name = n;
		myWeapon = Weapon.getWeapon(n);
	}

	public Weapon getWeapon() {
		return myWeapon;
	}
	
	public Consumable getConsumable() {
		return myConso;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberStock() {
		return numberInStock;
	}
	
	public boolean isUsable() {
		return usable;
	}
	
	public int getVolume() {
		return volume;
	}
	
	
}
