package SIGN;

public class Enemy extends Charactere {
	
	private Item stuff = new Item("knife");  
	
	public Enemy(String name) {
		super(name);
	}
	
	public Item getStuff() {
		return stuff;
	}
	
	public void setStuff(Item i) {
		stuff = i;
	}
	
}
