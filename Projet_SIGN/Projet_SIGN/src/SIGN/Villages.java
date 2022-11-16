package SIGN;

public class Villages extends Areas {
		
	private String name;
	
	public static final String TYPE = "village";
	
	private boolean util;
	
	public Villages(String n) {
		name = n;
		util = true;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isUtil() {
		return util;
	}
	
	public void changeUtil() {
		util = false;
	}
}
