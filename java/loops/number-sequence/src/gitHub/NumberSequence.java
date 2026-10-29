package gitHub;

import java.util.Scanner;

public class NumberSequence {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein: ");
		int n = o.nextInt();
		for (int i =1; i <= n; i++) {
			System.out.print(i + " ");
		}

	}

}
