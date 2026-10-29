package Arrays;

import java.util.Scanner;

public class Arrays08 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		boolean continueRequested = true;
		while (continueRequested) {
			try {
				System.out.println("Geben Sie die Zahlen ein: ");
				int[][] a = new int[2][2];
				int[][] b = new int[2][2];
				int[][] c = new int[2][2];
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						a[i][j] = o.nextInt();
					}
				}
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						b[i][j] = o.nextInt();
					}
				}
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						c[i][j] = a[i][j] + b[i][j];
						System.out.print(c[i][j] + " ");
					}
					System.out.println();
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("404! ");
				break;
			}
			System.out.println("um zu stoppen tippen Sie false, umweiterzumachen true: ");
			continueRequested = o.nextBoolean();
			if (continueRequested == false) {
				System.out.println("Danke für mitmachen! ");
			}

		}
		o.close();
	}

}
