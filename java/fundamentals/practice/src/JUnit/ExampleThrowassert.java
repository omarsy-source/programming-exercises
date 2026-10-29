package JUnit;

public class ExampleThrowassert {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Das erste Element der gespeicherten Daten liefern.
	public static int getFirstElement(int[] cells) throws NullPointerException {
		if (cells == null) {
			NullPointerException e = new NullPointerException("Leet!");
			throw e;
		} else {
			return cells[0];
		}
	}
}
