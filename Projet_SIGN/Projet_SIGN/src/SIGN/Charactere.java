package SIGN;

public abstract class Charactere implements Use {
	
	//TODO valeur à adapter j'ai mis au hasard ..
	public static final int ATTACK_DEFAULT = 1;
	public static final int HP_DEFAULT = 30;
	public static final int MANA_DEFAULT = 15;
	public static final int SHIELD_DEFAULT = 10;
	public static final int MAX_HP = 50;
	public static final int MAX_MANA = 25;
	
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
	
	@Override
	public void useWeapon(Weapon w, Charactere p) {
		//TODO p.hp -= w.getDmg; //attente des changements de la classe Weapon
	}
	
	@Override
	public void useConsumable(Consumable c, Charactere p) {
		if(c.getBrand() == "al" || c.getBrand() == "mp") {
			if(p.mana + c.getBuff() >= MAX_MANA) {
				mana = MAX_MANA;
			}else p.mana += c.getBuff();
		}else {
			if(p.hp + c.getBuff() >= MAX_HP) {
				p.hp = MAX_HP;
			}else p.hp += c.getBuff();
		}
	}
	
	//TODO gestion de l'armure
//	public void setNewShield(Armor a) { //adapter la stat de shield par rapport à la stat de l'armure mis en paramètre
//		shield += a.getBuff();
//	}
	
	
}
