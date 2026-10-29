package easy;

public class Qs {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		System.out.println(findQuarter(6));
	}

	// Den Wert dem passenden Zahlenbereich zuordnen.
	public static int findQuarter(int month) {
		return switch (month) {
		case 1,2,3 -> 1;
		case 4,5,6 -> 2;
		case 7,8,9 -> 3;
		case 10,11,12 -> 4;
		default -> throw new IllegalArgumentException("Invalid month: " + month);
		};
		

	}
}
