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
	public void useEquipment(Equipment e, Hero_Heroine p) {
		if(e.getDamage() != 0) {
			if(p.getHp() >= e.getDamage()) {
				p.hp -= e.getDamage();
				System.out.println("You lost "+e.getDamage()+p.getHp()+" less");
			}else p.hp = 0;
		}else p.setShield(p.getShield() + e.getArmor());
	}
	
	@Override
	public void useConsumable(Consumable c, Hero_Heroine p) {
			if(p.hp + c.getBuff() >= p.getConst()) {
				p.hp = p.getConst();
			}else p.hp += c.getBuff();
			p.getBackpack().removeItem(new Item(c.getBrand()));
	}
		
}
