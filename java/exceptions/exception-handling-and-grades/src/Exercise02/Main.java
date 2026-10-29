package Exercise02;

import java.util.Scanner;

public class Main {
	public static void check (double numericValue) throws InvalidInputException {
		if (numericValue <= 0 ) {
			throw new InvalidInputException ("Eingabe darf nicht negativ sein");
		} else {
			System.out.println(numericValue);
		}
	}
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner (System.in);
		System.out.println("Bitte gebe die erste Zahl ein");
		int a =o.nextInt();
		System.out.println("Bitte gebe die zweite Zahl ein");
		int b = o.nextInt();
		double div = a/b;
		try {
			check(div);
		} catch (InvalidInputException e) {
			System.out.println("Fehler: " + e.getMessage());
		}

	}

}
