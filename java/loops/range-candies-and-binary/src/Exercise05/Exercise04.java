package Exercise05;

import java.util.Scanner;

public class Exercise04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Bitte eine ganze Zahl eingeben: "); 
		int decimalNumber = in.nextInt(); 
		String binary = ""; 
		while ( decimalNumber> 0) {
		int rest = (decimalNumber % 2);
		binary = rest + binary; // Die nächste Binärziffer vorne an den bisherigen Text anhängen.
		decimalNumber = decimalNumber / 2; // Ganzzahlig durch zwei teilen; Nachkommastellen werden verworfen.
	
		}
		System.out.println("Ergebnis: " +  binary);
		in.close();
	}

}
