package SIGN;

public class Hero_Heroine extends Charactere {
	
	public static final String STARTER = "v1";
	public static final int HP_DEFAULT = 30;
	public static final int MAX_HP = 50;

	protected int hp;
	
	private String location;
	
	private Backpack inventory;
	
	public Hero_Heroine(String name) {
		super(name);
		location = STARTER;
		hp = HP_DEFAULT;
	}
	
	public String getLocation() {
		return location;
	}
	public int getHP() {
		return hp;
	}
	
	public int getConst() {
		return MAX_HP;
	}
	
	public void changeLocation(String newLocation) {
		location = newLocation;
		System.out.println("You walk to "+newLocation);
	}
	
	public int getWeaponAtk() {
		int atk = 0;
		for(Item i : inventory.getInventory()) {
			if(i.getName() == "sword" || i.getName() == "magic_staff" || i.getName() == "knife" || i.getName() == "stone") {
				atk = i.getEquipment().getDamage();
			}
		}
		return atk;
	}
	
	public int getArmorPoint() {
		int armorP = 0;
		for(Item i : inventory.getInventory()) {
			if(i.getName() == "iron_armor" || i.getName() == "guard_armor") {
				armorP = i.getEquipment().getArmor();
			}
		}
		return armorP;
		
	}
}
