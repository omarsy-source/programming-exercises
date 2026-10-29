package Challenge;

public class GameStats {
	static int itemsCollected;
	static int totalValueCollected;
	
	static void printStats() {
		System.out.println("--- Spielstatistiken ---");
	    System.out.println("Gesammelte Gegenstände: " + itemsCollected);
	    System.out.println("Gesamtwert aller Gegenstände: " + totalValueCollected);
	}
}
