package Exercise02;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Thread thread = new Thread (new Countdown());
		thread.start();

	}

}
