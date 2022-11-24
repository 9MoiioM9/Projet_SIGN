package SIGN;

import java.util.ArrayList;
import java.util.List;

public enum Weapon {
	
	SWORD(5), MAGIC_STICK(1), KNIFE(3), STONE(1);
	
	private static List<Weapon> weapons = new ArrayList<Weapon>();
	
	private int value_attack;
	
	private Weapon(int n) {
		value_attack = n;
	}
	
	private static void fill() {
		boolean filled = false;
		if(!filled) {
			weapons.add(KNIFE);
			weapons.add(STONE);
			weapons.add(MAGIC_STICK);
			weapons.add(SWORD);
		}
	}
	
	public int getAttack() {
		return value_attack;
	}
	
	
	public static Weapon getWeapon(int atk) {
		fill();
		for(Weapon w : weapons) {
			if(w.value_attack == atk) {
				return w;
			}
		}
		return null;
	}
}

