package SIGN;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Game party = new Game(); 
		Scanner yes = new Scanner(System.in);
		Scanner no = new Scanner(System.in);
		party.initGame(yes);
		
		party.play(no);
	}
}
