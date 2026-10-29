package Methods;

import java.util.Scanner;

public class Method00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Von welcher Währung? ");
		String from = in.next();
		System.out.println("Zu welcher Währung ?  ");
		String to = in.next();
		System.out.println(convertCurrency(in, from, to));

	}

	static String convertCurrency(Scanner in, String from, String to) {
		System.out.println(" Geben Sie den Betrag ein: ");
		double amount = in.nextDouble();
		if (from.equals("USD") && to.equals("EUR")) {
			double changeMoney = 0.92;
			amount = (amount * changeMoney);
			return String.format("%.2f €", amount);
		} else if (from.equals("EUR") && to.equals("USD")) {
			double changeMoney = 1.09;
			amount = (amount * changeMoney);
			return String.format("%.2f $", amount);
		} else if (from.equals("USD") && to.equals("SAR")) {
			double changeMoney = 3.75;
			amount = (amount * changeMoney);
			return String.format("%.2f ر.س", amount);
		} else if (from.equals("SAR") && to.equals("USD")) {
			double changeMoney = 0.27;
			amount = (amount * changeMoney);
			return String.format("%.2f $", amount);
		}
		return "Ungültige Währung!";
	}
}