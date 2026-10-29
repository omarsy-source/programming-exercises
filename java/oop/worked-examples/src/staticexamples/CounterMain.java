package staticexamples;

public class CounterMain {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Counter n1 = new Counter();
		Counter n2 = new Counter();
		int s = Counter.getCount();
		System.out.println(s);
	}

}
/* Das statische Feld zählt alle erzeugten Counter-Objekte; getCount() liefert den gemeinsamen Wert. */