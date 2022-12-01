package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Castle {
	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public Castle() {
		rooms = null;
	}
	
	public void addRoom(Room r) {
		rooms.add(r);
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	
	public List<Room> initCastle() {
		
		Room r1 = new Room(1, 2, "r1");
		Room r2 = new Room(2, 2, "r2");
		Room r3 = new Room(3, 2, "r3");
		Room r4 = new Room(4, 2, "r4");
		Room r5 = new Room(5, 2, "r5");
		Room r6 = new Room(1, 2, "r6");
		
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		rooms.add(r5);
		rooms.add(r6);
		
		
		return rooms;
	}
	
	

}
