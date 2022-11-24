package SIGN;

public enum Weapon {
	
	SWORD("sword"), MAGIC_STAFF("magic_staff"), KNIFE("knife"), STONE("stone");
	
	
	private String brand;
	private Weapon(String s) {
		brand = s;
	}
	
	public String getBrand() {
		return brand;
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
	
}

