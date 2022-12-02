package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Castle {
	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public Castle() {
		
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	
	public List<Room> initCastle() {
		
		Room r1 = new Room(1, 2, "r1");
		r1.initRoom();
		Room r2 = new Room(2, 2, "r2");
		r2.initRoom();
		Room r3 = new Room(3, 2, "r3");
		r3.initRoom();
		Room r4 = new Room(4, 2, "r4");
		r4.initRoom();
		Room r5 = new Room(5, 2, "r5");
		r5.initRoom();
		Room r6 = new Room(1, 2, "r6");
		r6.initRoom();
		
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		rooms.add(r5);
		rooms.add(r6);
		
		return rooms;
	}
	
	

}
