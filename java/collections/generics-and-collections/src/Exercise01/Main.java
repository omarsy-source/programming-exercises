package Exercise01;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Pair<Integer, Double> pair1 = new Pair<>(3, 14.5);
		System.out.println(pair1.toString());
		Pair<String, Character> pair2 = new Pair<>("Hallo World", 'w');
		System.out.println(pair2.toString());

	}

}
