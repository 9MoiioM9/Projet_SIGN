package SIGN;

public enum Equipment {
	
	SWORD("sword",10, 0), MAGIC_STAFF("magic_staff",20, 0), KNIFE("knife",5, 0), STONE("stone",3, 0), IRON_ARMOR("iron_armor", 0, 5), GUARD_ARMOR("guard_armor", 0, 7);	
	
	private String brand;
	private int damage;
	private int armor;
	
	private Equipment(String s,int d, int a) {
		brand = s;
		damage = d;
		armor = a;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getArmor() {
		return armor;
	}
	

	public static Equipment getEquipment(String name) {
		Equipment[]  tab = Equipment.values();
		for(Equipment w : tab) {
			if(w.brand == name) {
				return w;
			}
		}
		return null;
	}
	
	
	public void Upgrade_Equipment(int new_d) {
		damage = new_d;
		System.out.println("Your weapon can inflict " + new_d + " damage now!");
	}
}
