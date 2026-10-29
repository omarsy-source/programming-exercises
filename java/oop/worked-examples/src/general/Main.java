package general;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Shape [] shapes = {new Circle () , new Rectangle () };
		
		for ( Shape f : shapes ) {
			f.draw();
		}

	}

}
