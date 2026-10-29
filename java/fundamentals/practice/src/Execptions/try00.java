package Execptions;

import java.util.Scanner;

public class try00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println ("Please enter your age:" );
			int x = in.nextInt();
			if (x > 60) {
				System.out.println ( "You are an old man");
			} else if (x < 60 && x >= 19) {
				System.out.println ("You are an Adult");
			} else if ( x <= 18 && x >= 13) {
				System.out.println ("You are a jung man");
			} else {
					System.out.println (" You are a Baby! fuck off");
				}
		}

	}

}
