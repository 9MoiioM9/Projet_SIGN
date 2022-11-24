package SIGN;

public abstract class Item implements Use{
	
	public static String name;
	
	private int volume;
	
	private int numberInStock;
	
	private boolean usable;
	
	public Item(String n) {
		name = n;
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
