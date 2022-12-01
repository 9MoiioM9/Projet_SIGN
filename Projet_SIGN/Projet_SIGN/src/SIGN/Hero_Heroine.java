package SIGN;

public class Hero_Heroine extends Charactere {
	
	public static final String STARTER = "Village_1";

	private String location;
	
	private Backpack inventory;
	
	public Hero_Heroine() {
		super("Billy");
		location = STARTER;
	}
	
	public String getLocation() {
		return location;
	}
	
	public static void main(String argv[]) {
		Hero_Heroine test = new Hero_Heroine();
		
		System.out.println(test.getName()+"\nhp : "+test.getHp());
		System.out.println("mana : "+test.getMana());
		System.out.println("attack : "+test.getPtAttack());
		System.out.println("shield : "+test.getShield());
		
	}
	
	
	public void changeLocation(String newLocation) {
		location = newLocation;
	}
	
	public void moveTO(String newlocation) {
		
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
	
	
	// finir fight
	public void setNewAtk() {
		setPtAttack(getPtAttack() + getWeaponAtk()) ;
	}
	
	public void setNewShield() {
		setShield(getShield() + getArmorPoint());
	}
}
