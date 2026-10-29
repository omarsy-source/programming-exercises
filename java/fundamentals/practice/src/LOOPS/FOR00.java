package LOOPS;

public class FOR00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		String sentence = "Hallo ich möchte schalfen";
		char letter = 'l';
		int quantity = countLetters(letter, sentence);
		System.out.println(quantity + " Buchstaben wurden ersetzt: \"" + replaceWithX(letter, sentence) + "\"");

	}

	// Passende Buchstaben ohne Beachtung der Großschreibung durch X ersetzen.
	public static String replaceWithX(char letter, String sentence) {
		String newSentence = "";
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (Character.toLowerCase(c) == Character.toLowerCase(letter)) {
				newSentence += 'X';
			} else {
				newSentence += c;
			}

		}
		sentence = newSentence;
		return sentence;

	}

	// Die passenden Buchstaben im Satz zählen.
	public static int countLetters(char letter, String sentence) {
		int quantity = 0;
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (Character.toLowerCase(c) == Character.toLowerCase(letter))
				quantity++;	
	}
				
			
		
		
		return quantity;

	}

}
