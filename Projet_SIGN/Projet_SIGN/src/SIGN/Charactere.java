package SIGN;

public abstract class Charactere {
	
	//TODO valeur à adapter j'ai mis au hasard ..
	public static final int ATTACK_DEFAULT = 1;
	public static final int HP_DEFAULT = 30;
	public static final int MANA_DEFAULT = 2;
	public static final int SHIELD_DEFAULT = 10;
	
	
	private String name;
	
	private int hp;
	
	private int shield;
	
	private int mana;
	
	private int ptAttack;
	
	
	public Charactere(String n) {
		name = n;
		hp = HP_DEFAULT;
		shield = SHIELD_DEFAULT;
		mana = MANA_DEFAULT;
		ptAttack = ATTACK_DEFAULT;
	}
	
	//TODO gestion de l'attaque (surement par interface)
	public void attack() { // faire par rapport au dmg de l'arme mis en paramètre
		
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getShield() {
		return shield;
	}

	public int getMana() {
		return mana;
	}

	public int getPtAttack() {
		return ptAttack;
	}
	
	//TODO gestion de l'armure
	public void setNewShield() { //adapter la stat de shield par rapport à la stat de l'armure mis en paramètre
		
	}
	
	
}
