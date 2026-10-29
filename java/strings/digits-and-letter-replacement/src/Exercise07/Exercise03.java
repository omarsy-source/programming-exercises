package Exercise07;

import java.util.Scanner;

public class Exercise03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println(" Bitte einen Satz eingeben : ");
		String sentence = m.nextLine();
		System.out.println(" Bitte einen Buchstaben eingeben : ");
		char letter = m.next().charAt(0);
		String outcome ="";
		outcome = replaceWithX(letter, sentence);
		int quantity = countLetters(letter, sentence);
		System.out.println(quantity + " buchstaben wurde ersetzt :  " + outcome);
		m.close();
	}
	
	// Passende Buchstaben ohne Beachtung der Großschreibung durch X ersetzen.
	public static String replaceWithX(char letter, String sentence) {
		String newSentence = "";
		for ( int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if ( Character.toLowerCase(c) == Character.toLowerCase(letter)) {
			 newSentence += 'X';
			} else {
				newSentence += c;
			}
			
		}
		sentence = newSentence;
		return sentence;
		
	}
	// Die passenden Buchstaben im Satz zählen.
	public static int countLetters (char letter, String sentence) {
		int quantity = 0;
		for ( int i =0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if ( Character.toLowerCase(c) == Character.toLowerCase(letter)) {
				quantity++;
			}
			
		}
			
		return quantity;
		
	}
}