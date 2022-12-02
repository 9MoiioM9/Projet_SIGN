package SIGN;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
	
	public static final int STOCK_DEFAULT = 20;
	
	private int stockage;
	
	private List<Item> inventory = new ArrayList<Item>();
	
	public Backpack() {
		stockage = STOCK_DEFAULT;
	}
	
	public int getStockage() {
		return stockage;
	}
	
	public List<Item> getInventory() {
		return inventory;
	}
	
	public void setNewStockage(int newStock) {
		stockage = newStock;
	}
	
	public boolean isFull() {
		return inventory.size() == stockage;
	}
	
	public void addItem(Item i) {
		inventory.add(i);
		
	}
	
	public void removeItem(Item i) {
		System.out.println("You just lost "+Item.name);
		inventory.remove(i);
	}
	
	public void printStock() {
		System.out.println("You have "+inventory.size()+" in your backpack!");
	}
	
}
