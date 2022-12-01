package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Exit {
	
	private List<Village> gateway_V = new ArrayList<Village>();
	private List<Room> door = new ArrayList<Room>();
	
	class exits { public Area  a ,b; }
	
	public Exit(Area a, Area b) {
		 // exits{a,b};
	}
	
	
	
	public List<Village> getGateway() {
		return gateway_V;
	}
	
	public List<Room> getDoor(){
		return door;
	}
}
