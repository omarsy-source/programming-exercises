package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesBetween {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		int[] primes = getPrimesBetween(a, b);
		System.out.println(Arrays.toString(primes));
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static int[] getPrimesBetween(int a, int b) {
		int[] list = new int[b - a + 1]; // Die maximal benötigte Arraygröße aus dem Eingabebereich berechnen.
		int count = 0; // Die Anzahl gefundener Primzahlen zugleich als nächsten Arrayindex verwenden.
		if (a >= 0 && b >= 0) {
			for (int i = a; i <= b; i++) {
				if (i < 2) continue;
				boolean isPrime = true; // Die Prüfvariable für jede neue Zahl zurücksetzen.
				for (int j = 2; j <= i - 1; j++) {
					if (i % j == 0) {
						isPrime = false;
						break; // Die Prüfung abbrechen, sobald ein Teiler gefunden wurde.
					}
				}
				if (isPrime) {
					list[count] = i;
					count++;

				}
			}

		}
		return Arrays.copyOf(list, count); // Das Ergebnisarray auf die tatsächliche Anzahl der Primzahlen kürzen.

	}
}
