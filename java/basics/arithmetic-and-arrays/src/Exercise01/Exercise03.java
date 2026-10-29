package Exercise01;

public class Exercise03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int[] a = new int[5];
		/*
		 * Hier wäre es ratsamer, das Array sofort mit den Werten zuzuweisen, z.B.: int
		 * []a={3,5,9,18,29}; , damit sieht der Code etwas ordentlicher
		 */
		a[0] = 3;
		a[1] = 5;
		a[2] = 9;
		a[3] = 18;
		a[4] = 29;
		int totalSum = 0;
		for (int i = 0; i < a.length; i++) {
			totalSum = totalSum + a[i];
		}
		double avg = (double) totalSum / a.length;
		System.out.println("Der Durchschnitt beträgt = " + avg);

	}

}
