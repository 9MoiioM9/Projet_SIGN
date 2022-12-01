package SIGN;

public abstract class Charactere implements Use {
	
	public static final int ATTACK_DEFAULT = 1;
	public static final int SHIELD_DEFAULT = 10;
	
	private String name;
	
	private int hp;
	
	private int shield;
	
	private int ptAttack;
	
	public Charactere(String n) {
		name = n;
		shield = SHIELD_DEFAULT;
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

	public void setShield(int shield) {
		this.shield = shield;
	}

	public void setPtAttack(int ptAttack) {
		this.ptAttack = ptAttack;
	}

	public int getPtAttack() {
		return ptAttack;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
<<<<<<< HEAD
<<<<<<< Updated upstream
	public void useEquipment(Equipment e, Charactere p) {
=======
	public void useEquipment(Equipment e, Hero_Heroine p) {
>>>>>>> 941bdf23d5663ce20905ac97e330f1dbeeafa1c0
		if(e.getDamage() != 0) {
			if(p.getHp() >= e.getDamage()) {
				p.hp -= e.getDamage();
				System.out.println("You lost "+e.getDamage()+p.getHp()+" less");
			}else p.hp = 0;
<<<<<<< HEAD
		}else p.shield += e.getArmor();
=======
	public void useWeapon(Weapon w, Charactere p) {
		//
		if(p.hp > w.getdamage()) {
			p.hp -= w.getdamage();
		}
		else p.hp = 0;
>>>>>>> Stashed changes
=======
		}else p.setShield(p.getShield() + e.getArmor());
>>>>>>> 941bdf23d5663ce20905ac97e330f1dbeeafa1c0
	}
	
	@Override
	public void useConsumable(Consumable c, Hero_Heroine p) {
			if(p.hp + c.getBuff() >= p.getConst()) {
				p.hp = p.getConst();
			}else p.hp += c.getBuff();
	}
		
}
