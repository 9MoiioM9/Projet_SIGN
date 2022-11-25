package SIGN;

public class Hero_Heroine extends Charactere {
	
	public Hero_Heroine() {
		super("Billy");
	}
	
	public static void main(String argv[]) {
		Hero_Heroine test = new Hero_Heroine();
		
		System.out.println(test.getName()+"\nhp : "+test.getHp());
		System.out.println("mana : "+test.getMana());
		System.out.println("attack : "+test.getPtAttack());
		System.out.println("shield : "+test.getShield());
		
	}
}
