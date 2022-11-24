package SIGN;

public class Room extends Area{
	
	private Integer number;
	
	public static final String TYPE = "room";
	
	private boolean util;
	
	public Room(Integer nb) {
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
