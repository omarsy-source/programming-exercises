package Statments;

import java.util.Scanner;

public class switch04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Geben Sie eine Zahl zwischen 1 bis 7 : ");
		int numberValue = in.nextInt();
		String N = switch(numberValue) {
		case 1 -> "Montag";
		case 2 -> "Dienstag";
		case 3 -> "Mittwoch";
		case 4 -> "Donnerstag";
		case 5 -> "Freitag";
		case 6 -> "Samstag";
		case 7 -> "Sonntag";
		default -> "Ungültig";
				};
		System.out.println (N);
		in.close();
		

	}

}
