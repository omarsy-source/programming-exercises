package examples;

import java.util.*;

public class Example00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int n = 3;
		int counter = 0;
		for ( int i = n ; i <= n ; i--) {
			for ( int j = 0; j < i ; j++) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}
	}
}
