package Exercise01;

public class GameStatistics {
	public static int playerCount  = 0;
	public static int totalDamage;
	// Die aktuellen Spielwerte anzeigen.
	public static void printStats() {
		System.out.println("---SpielInfos---");
		System.out.println("Anzahl der Spieler ist" + " " + playerCount );
		System.out.println("Der gesamte Schaden aller Spieler" + " " +totalDamage);
	}
}
