package SIGN;

public enum Weapon {
	
	SWORD("sword",10), MAGIC_STAFF("magic_staff",20), KNIFE("knife",5), STONE("stone",3);	
	
	private String brand;
	private int damage;
	
	private Weapon(String s,int d) {
		brand = s;
		damage = d;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getDamage() {
		return damage;
	}
	
	
	public static Weapon getWeapon(String name) {
		Weapon[]  tab = Weapon.values();
		for(Weapon w : tab) {
			if(w.brand == name) {
				return w;
			}
		}
		return null;
	}
	
	
	public void Upgrade_weapon(int new_d) {
		damage = new_d;
		System.out.println("Your weapon can inflict " + new_d + " damage now!");
	}
}

