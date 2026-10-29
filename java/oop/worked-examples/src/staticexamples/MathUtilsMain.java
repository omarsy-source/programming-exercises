package staticexamples;

public class MathUtilsMain {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int m = MathUtils.add(5, 10);
		int a = MathUtils.multiply(m, m);
		boolean l = MathUtils.isEven(a);
		System.out.println("Additionsergebnis ist " + m + " , " + "Multiplikationsergbnis ist " + a + " , " + "Ist die Zahl positive " + l);
	}

}
