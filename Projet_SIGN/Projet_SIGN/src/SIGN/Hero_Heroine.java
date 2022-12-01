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
	
	
	public Equipment getWeapon(Equipment w) {
		for(Item i : inventory.getInventory()) {
			if(i == "sword")// || i == "magic_staff" || i == "knife" || i == "stone")
				return i;
		}
	}
	
	public Equipment getArmor(Equipment a) {
		for(Item i : inventory.getInventory()) {
			return i;
		}
		
	}
	
	//mettre à jour les stat atk et shield
	// recuperer armure et arme
	// finir fight
	public void setNewAtk(Equipment w) {
		setPtAttack(getPtAttack() + w.getDamage()) ;
	}
	
	public void setNewShield(Equipment w) {
		setShield(getShield() + w.getArmor());
	}
}
