package worksheet04;

import java.util.Scanner;

public class Exercise05 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println (" Geben Sie das Jahr ein : ");
		int yearValue = in.nextInt();
		System.out.println (" Geben Sie den Monat ein : ");
		String monthValue = in.next();
		System.out.println (" Geben Sie den Tag ein : ");
		int dayValue = in.nextInt();
		int m = switch(monthValue){
		case "Januar" -> 1;
		case "Februar" -> 2;
		case "März" -> 3;
		case "April" -> 4;
		case "Mai" -> 5;
		case "Juni" -> 6;
		case "Juli" -> 7;
		case "August" -> 8;
		case "September" -> 9;
		case "Oktober" -> 10;
		case "November" -> 11;
		case "Dezember" -> 12;
		default ->0;
		};
		if (m == 0) {
			System.out.println ( " Der eingegebne Monat ist ungültig.");
		} else {
			System.out.println(dayValue + "." + monthValue + "." + yearValue);
		}
			in.close();
	}
}
