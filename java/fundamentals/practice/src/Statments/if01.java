package Statments;

import java.util.Scanner;

public class if01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println ("Bitte geben Sie die Temperatur ein: ");
		int X = in.nextInt ();
		if (X > 25) {
			System.out.println (" Es ist heiß 🔥");
		} else if (X <= 25 && X >= 16 ) {
			System.out.println ( "Es ist mild 🌤️ ");
		} else if (X <= 15 && X >=0 ) {
			System.out.println (" Es ist kalt 🧥");
		} else if (X < 0) {
			System.out.println (" Es ist eiskalt ❄️");
		
		}
		 in.close();

	}

}
