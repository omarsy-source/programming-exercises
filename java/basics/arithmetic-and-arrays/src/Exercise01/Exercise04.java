package Exercise01;

public class Exercise04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int x = 4; // Der Code ist elegant und sortiert: Kein einziger Fehler :)
		int y = 5;
		int resultValue = multiply(x, y);
		System.out.println(resultValue);
	}

	// Die übergebenen Zahlen miteinander multiplizieren.
	public static int multiply(int x, int y) {
		int resultValue = x * y;
		return resultValue;
	}
}