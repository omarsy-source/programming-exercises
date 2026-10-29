package Statments;

import java.util.Scanner;

public class if06 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {

		Scanner o = new Scanner(System.in);
		char stopRequested = 'B';
		try {
			while (stopRequested != 'A') {
				System.out.println("Bitte eine ganze Zahl eingeben: ");
				int integerValue = o.nextInt();
				if (integerValue > 0) {
					System.out.println("Ihre Zahl ist eine positive Zahl! ");
				} else if (integerValue == 0) {
					System.out.println("Ihre Zahl ist die Null! ");
				} else {
					System.out.println("Ihre Zahl ist eine negative Zahl! ");
				}
				System.out.println("Um stoppen, tippen Sie A ");
				String input = o.next();
				stopRequested = input.charAt(0);
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Ungültige Angabe ");
		}
		o.close();
	}

}
