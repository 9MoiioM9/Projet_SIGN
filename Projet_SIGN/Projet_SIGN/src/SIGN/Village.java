package SIGN;

public class Village extends Area {
		
	private String name;
	
	public static final String TYPE = "village";
	
	private boolean util;
	
	public Village(String n) {
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
