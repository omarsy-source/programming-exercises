package LOOPS;

import java.util.Scanner;

public class While06 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		do {
			System.out.println("Geben Sie eine Zahl ein: ");
			int n = o.nextInt();
			if (n < 0) {
				break;
			} else if (n > 0) {
				isPrim(n);
				if (isPrim(n) == true) {
					System.out.println("Ihre Zahl ist eine Primäre Zahl!");
				} else {
					System.out.println("Ihre Zahl ist keine Primäre Zahl!");
				}
			}
		} while (true);
		o.close();
	}

	// Prüfen, ob die Zahl einen passenden Teiler besitzt.
	public static boolean isPrim(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;

	}

}
