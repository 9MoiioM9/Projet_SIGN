package SIGN;

public class Rooms extends Areas{
	
	private Integer number;
	
	public static final String TYPE = "room";
	
	private boolean util;
	
	public Rooms(Integer nb) {
		number = nb;
		util = true;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public boolean isUtil() {
		return util;
	}
	
	public void changeUtil() {
		util = false;
	}
}
