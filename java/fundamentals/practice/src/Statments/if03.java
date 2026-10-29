package Statments;

import java.util.Scanner;

public class if03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" ➤ Bitte geben Sie eine Zahl ein :");
		int x = in.nextInt();
		if (x >= 0) {
			System.out.print(" Positiv +");
		} else {
			System.out.print(" Negative +");
		}
		if (x % 2 == 0) {
			System.out.print(" gerade");
		} else {
			System.out.print(" ungerade");
			System.out.printf("➤ Die eingegebene Zahl ist: %d\n", x);

			in.close();

		}

	}
}
