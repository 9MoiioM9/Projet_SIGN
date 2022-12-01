package SIGN;

public class Enemy extends Charactere {
	
	private Item stuff = new Item("knife");  
	
	public Enemy() {
		super("Skeleton");
	}
	
	public Item getStuff() {
		return stuff;
	}
	
	
	
}
