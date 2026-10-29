package JUnit;

public class Example02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		try {
			int sumValue = listSum();
			int max = largestNumber();
			int min = smallestNumber();
			double mean = average();
			System.out.println("Die Summe beträgt: " + sumValue);
			System.out.println("Die größte Zahl ist: " + max);
			System.out.println("Die kleinste Zahl ist: " + min);
			System.out.println("Der Durchschnitt ist: " + mean);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("404");
		}

	}

	// Die Werte der Liste aufsummieren.
	public static int listSum() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int totalSum = 0;
		for (int[] row : matrix) {
			for (int Val : row) {

				totalSum = totalSum + Val;
			}

		}

		return totalSum;
	}

	// Die größte Zahl in den Daten suchen.
	public static int largestNumber() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = matrix[0][0];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}

			}

		}
		return max;
	}

	// Die kleinste Zahl in den Daten suchen.
	public static int smallestNumber() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int min = matrix[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	// Den Durchschnitt der übergebenen Zahlen berechnen.
	public static double average() {

		double mean = (listSum() / 9);
		return mean;

	}

}
