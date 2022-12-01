package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Castle {
	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public void addRoom(Room r) {
		rooms.add(r);
	}
	
	
	public List<Room> initCastle() {
		Room r;
		for(int i = 0; i < 6; i++) {
			if(i == 1) {
				r = new Room(i, 2);
			}
			else if(i == 3){
				r = new Room(i, 0);
			}
			else r = new Room(i, 1);
			
			addRoom(r);
		}
		return rooms;
	}
	
	public void play() {
		// toute ce qui va se passer dans le chateaux
	}

}
