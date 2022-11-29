package SIGN;

public abstract class Item implements Use{
	
	public static String name;
	
	private Equipment myEquipment;
	private Consumable myConso;
	
	private int volume;
	
	private int numberInStock;
	
	private boolean usable;
	
	public Item(String n) {
		name = n;
	}

	public Equipment getEquipment() {
		return myEquipment;
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
