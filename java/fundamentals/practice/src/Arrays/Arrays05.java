package Arrays;

import java.util.Scanner;

public class Arrays05 {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Scanner o = new Scanner(System.in);
		System.out.println(" Geben Sie die Zahlen ein: ");
		int totalSum = 0;

		for (int i = 0; i < 3; i++) {
			for (int m = 0; m < 3; m++) {
				matrix[i][m] = o.nextInt();

				totalSum = totalSum + matrix[i][m];
			}

		}
		System.out.println(totalSum);
		o.close();
	}
}
// Die vom Benutzer eingegebenen Zahlen aufsummieren.