package Execptions;

import java.util.Scanner;

public class try02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		try {
			double balance = 57894.457;

			System.out.println("=== Smart ATM ===");
			balance = withdrawMoney(o, balance); // Den gespeicherten Kontostand aktualisieren.
			System.out.println("Finale Balance: " + balance);
			o.close();
		} catch (java.util.InputMismatchException e) {
			System.out.println("404");
		}
	}

	static boolean checkPIN(int pin) {
		return pin == 1234;
	}

	static double getBalance(Scanner o, double currentBalance) {
		System.out.println("Um Ihre Balance zu sehen, geben Sie Ihre Pin ein:");
		int pin = o.nextInt();
		if (checkPIN(pin)) {
			System.out.println(" Ihre aktuelle Balance beträgt: " + currentBalance);
			return currentBalance;
		} else {
			System.out.println(" Falsche Eingabe. Bitte versuchen SIe erneut! ");
			return -1;
		}

	}

	static double withdrawMoney(Scanner o, double currentBalance) {
		System.out.println("Geben Sie Ihre PIN ein:");
		int pin = o.nextInt();
		if (!checkPIN(pin)) {
			System.out.println("Falsche PIN! Kein Zugriff.");
			return currentBalance; // Der bisherige Zustand bleibt erhalten.
		}

		System.out.println("Aktuelle Balance: " + currentBalance);
		System.out.println("Wie viel möchten Sie auszahlen?");
		double amount = o.nextDouble();

		if (amount > currentBalance) {
			System.out.println("Zu wenig Geld auf dem Konto!");
			return currentBalance;
		}

		double newBalance = currentBalance - amount;
		System.out.println("Auszahlung erfolgreich!");
		System.out.println("Neue Balance: " + newBalance);

		return newBalance;


	}

}
