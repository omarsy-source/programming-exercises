package LOOPS;

import java.util.Scanner;

public class While08 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ادخل رقم: ");
		int x = sc.nextInt();

		System.out.println("palindrome: " + isPalindrome(x));

	}

	// Die ursprüngliche und die umgekehrte Zahl vergleichen.
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false; // Negative Zahlen erfüllen diese Bedingung nicht.

		int original = x;
		int reversed = 0;

		while (x > 0) {
			// Mit dem Rest bei Division durch zehn die letzte Ziffer ermitteln.
			int digit = x % 10;
			// Die letzte Ziffer an die umgekehrte Zahl anhängen.
			reversed = reversed * 10 + digit;
			// Durch ganzzahlige Division durch zehn die letzte Ziffer entfernen.
			x /= 10;
		}

		return original == reversed;
	}

}
