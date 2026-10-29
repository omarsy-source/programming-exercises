package worksheet06;

import java.util.Scanner;

public class Exercise02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		String answer = "";// Die Variable vor der Schleife anlegen und später mit der Benutzereingabe überschreiben.
		do {System.out.println( " Wählen Sie einen Opertaor : + - * / % ");
		String operator= in.next();
		System.out.println(" Geben Sie #1 ein : ");
		int n1 = in.nextInt();
		System.out.println( " Geben Sie #2 ein : ");
		int n2 = in.nextInt();
		switch (operator) {
		case "+": System.out.println(" n1 + n2 = " + (n1+n2));
		break;
		case "-": System.out.println(" n1 - n2 = " + (n1-n2));
		break;
		case "*": System.out.println(" n1 * n2 = " + (n1*n2));
		break;
		case "/": System.out.println(" n1 / n2 = " +((float) n1/n2));
		break;
		case "%": System.out.println(" n1 % n2 = " + (n1%n2));
		break;
		}
		System.out.println("Möchten Sie eine neue Berechnung durchführen? Bitte schreiben Sie yes");
		answer = in.next();   
		} while (answer.equals("yes"));// equals() vergleicht den Inhalt der eingegebenen Antwort.
		in.close();
	}
	
}
