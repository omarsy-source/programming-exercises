package Exercise01;

public class Main {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main (String [] args ) {
	Player player1 = new Player ("Omar"); 
	player1.attack(15);
	Player player2 = new Player ("Osama"); 
	player1.attack(5);
	Player player3 = new Player ("Maria"); 
	player1.attack(30);
	Player player4 = new Player ("Juliana"); 
	player1.attack(20);
	GameStatistics.printStats();
	}
}
