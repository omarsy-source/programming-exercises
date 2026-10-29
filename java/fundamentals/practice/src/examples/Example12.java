package examples;

public class Example12 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		/* Die Ergebnisvariable vor if/else deklarieren, damit sie auch nach den Zweigen sichtbar ist. */
		int x = 3; 
		String outcome;
		if ( x < 6 ) { 
			outcome = "x ist kleiner als 6"; 
		} else { 
			outcome = " x ist nicht kleiner als 6"; 
		} 
		System.out.println(outcome);

	}

}
