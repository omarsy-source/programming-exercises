package LOOPS;

import java.util.Scanner;

public class FOR05 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		System.out.println (" Geben Sie eine Zahl ein : ");
		int n = in.nextInt();
		int result = 1; // Ein Produkt beginnt bei eins, da ein Startwert null jedes Ergebnis null machen würde.
		for (int i = 1; n >= i ; i++ ) {
		result *= i;
		}
		System.out.println ( result );
		in.close ();

	}

}
