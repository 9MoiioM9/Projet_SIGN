package SIGN;

public class Enemy extends Charactere {
	
	private Item stuff = new Item("knife");
	public static final int HP_DEFAULT = 15;
	private int hp;

	
	public Enemy(String name) {
		super(name);
		hp = HP_DEFAULT;
	}
	
	public Item getStuff() {
		return stuff;
	}
	
	public void setStuff(Item i) {
		stuff = i;
	}
	
	public int getHP() {
		return hp;
	}
	
}
