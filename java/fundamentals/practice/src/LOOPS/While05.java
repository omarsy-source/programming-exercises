package LOOPS;

import java.util.Scanner;

public class While05 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println(" Geben Sie eine Zahle : ");
		int numberValue = in.nextInt();
		int sum = 0;
		int n1;
		while ( numberValue > 0) {
			n1 = numberValue % 10;// Der Rest bei Division durch zehn speichert die letzte Ziffer.
			numberValue = numberValue / 10; // Nach dem Speichern die letzte Ziffer durch Division entfernen.
			sum += n1;
		}
		System.out.println( sum );
		in.close();

	}

}
