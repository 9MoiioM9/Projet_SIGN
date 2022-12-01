package SIGN;

public class Hero_Heroine extends Charactere {
	
	public static final String STARTER = "Village_1";

	private String location;
	
	private Backpack inventory;
	
	public Hero_Heroine(String name) {
		super(name);
		location = STARTER;
	}
	
	public String getLocation() {
		return location;
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
	
	
	public void setNewAtk() {
		setPtAttack(getPtAttack() + getWeaponAtk()) ;
	}
	
	public void setNewShield() {
		setShield(getShield() + getArmorPoint());
	}
}
