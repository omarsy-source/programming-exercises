package LOOPS;

public class While01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		while (num <= 100) {
			sum += num;// Mit += wird der neue Wert zur bisherigen Summe addiert.
			num ++;
		}
		System.out.println ("sum = " + sum);

	}

}
