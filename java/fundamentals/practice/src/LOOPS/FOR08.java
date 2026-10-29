package LOOPS;

public class FOR08 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int[] numx = { 3, 2, 4 };
		int target = 6;
		for (int i = 0; i < numx.length; i++) {
			for (int j = 0; j < numx.length; j++) {
				if (numx[i] + numx[j] == target) {
					System.out.println(numx[i] + numx[j]);
					return;
// Ein Zahlenpaar suchen, dessen Summe dem Zielwert entspricht.
				}
			}

		}

	}
}


