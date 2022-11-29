package SIGN;


public enum Consumable {
	BREAD("b",7), APPLE("app",5), HEAL_POTION("hp",15), MANA_POTION("mp",15), ALCOHOL("al",10), SANDWICH("s",12), KEY("k", 0);
		
	private String brand;
	private int buff;
	
	private Consumable(String name, int b) {
		brand = name;
		buff = b;
	}
	
	public static Consumable getConsumable(String name) {
		Consumable[] conso = Consumable.values();
		for(Consumable c : conso) {
			if(c.brand == name) {
				return c;
			}
		}
		return null;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getBuff() {
		return buff;
	}
	
}
