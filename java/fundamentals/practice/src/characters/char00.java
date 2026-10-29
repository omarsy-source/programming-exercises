package characters;

import java.util.Scanner;

public class char00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner (System.in);
		System.out.println("Schreiben Sie einen Satz: ");
		String sentence = o.nextLine();
		System.out.println("wählen Sie die buchstabe: ");
		char letter = o.next().charAt(0);
		int letterCount = 0;
		for (int i =0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == letter) {
				letterCount++;
			}
		}
		System.out.println(letterCount);
		o.close();

	}

}
