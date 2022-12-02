package SIGN;

public class Item {
	
	public static String name;
	
	private Equipment myEquipment;
	private Consumable myConso;
	
	public Item(String n ) {
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
}
