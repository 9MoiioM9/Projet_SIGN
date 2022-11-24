package SIGN;


public enum Consumable {
	BREAD("b"), APPLE("app"), POTION("p"), ALCOHOL("al"), SANDWICH("s");
		
	private String brand;
	
	private Consumable(String name) {
		brand = name;
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
	
}
