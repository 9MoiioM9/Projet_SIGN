package SIGN;

import java.util.ArrayList;
import java.util.List;

public enum Consumable {
	BREAD, APPLE, POTION, ALCOHOL;
	
	private int buff_hp;
	private int buff_mana;
	
	private static List<Consumable> conso = new ArrayList<Consumable>();
	
	private Consumable(int hp, int mana) {
		buff_hp = hp;
		buff_mana = mana;
	}
	
	public static void fill() {
		boolean filled = false;
		if(!filled) {
			conso.add(APPLE);
			conso.add(BREAD);
			conso.add(POTION);
			conso.add(ALCOHOL);
		}
	}
	
	public static Consumable getConsumable(int hp, int mana) {
		fill();
		for(Consumable c : conso) {
			if(c.buff_hp == hp && c.buff_mana == mana) {
				return c;
			}
		}
		return null;
	}
	
	public int getBuffHP() {
		fill();
		return buff_hp;
	}
	
	public int getBuffMana() {
		fill();
		return buff_mana;
	}
	
	public static void main(String argv[]) {
		Consumable test;
		
		System.out.println("\nhp : "+test.getBuffHP());
		System.out.println("mana : "+test.getBuffMana());
		System.out.println("\n"+test.name());
		System.out.println("\n");
	}
}
