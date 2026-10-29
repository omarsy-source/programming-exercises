package LOOPS;

public class While00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int x = 1;
		while (x < 10) {
			System.out.println("Das Doppelte von " + x + " ist " + (x + x));
			x = x + 1;
		}
	}

}
