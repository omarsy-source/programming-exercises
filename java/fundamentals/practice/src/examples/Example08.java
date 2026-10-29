package examples;

import java.util.Scanner;

public class Example08 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("💖 Bitte gib den Namen deiner Lieblingsperson ein: ");
		String name = in.nextLine();
		System.out.printf(" 🌹%s, du bringst mein Herz zum Leuchten!\n" , name);
				/* %s wird durch den übergebenen Namen ersetzt; \n erzeugt einen Zeilenumbruch. */
				in.close();
	}

}
