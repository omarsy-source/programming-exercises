package Exercise07;

import java.util.Scanner;

public class Exercise02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Bitte geben Sie die Zahl ein : ");
		int inputValue = sc.nextInt();
		String  output = ""; 
		output = numberToWords (inputValue);
		System.out.println(output);
		sc.close();
	}
	// Für eine einzelne Ziffer das passende Wort liefern.
	public static String digitToWord (int digitValue) {
		String word="";
		
			switch (digitValue) {
			case 0 : word = "Null";break; 
			  case 1: word = "Eins"; break;
			  case 2: word = "Zwei "; break;
			  case 3: word = "Drei "; break;
			  case 4: word = "Vier "; break;
			  case 5: word = "Fünf "; break;
			  case 6: word = "Sechs "; break;
			  case 7: word = "Sieben "; break;
			  case 8: word = "Acht "; break;
			  case 9: word = "Neun "; break;
			  default: word = "404";

			}
		return word;
			
		}
		 
		 
		
	 // Die Ziffern der Zahl nacheinander in Wörter umwandeln.
	 public static String numberToWords (int numericValue) { 
		 int n;
		  String  wordsValue = ""; 
		  while (numericValue > 0) {
				n = numericValue % 10; 
				numericValue = numericValue / 10;
				wordsValue = digitToWord(n) +""+ wordsValue;
	
	 }
		  return wordsValue; 
	 }
}
