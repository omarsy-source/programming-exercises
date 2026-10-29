package Arrays;

import java.util.Scanner;
// Die Werte zweier Matrizen an derselben Position addieren.
public class Arrays06 {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int m = 0; m < 2; m++) {
				System.out.print("a[" + i + "][" + m + "] = ");
				a[i][m] = o.nextInt();
			}

		}
		for (int i = 0; i < 2; i++) {
			for (int m = 0; m < 2; m++) {
				System.out.print("b[" + i + "][" + m + "] = ");
				b[i][m] = o.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int m = 0; m < 2; m++) {
				c[i][m] = a[i][m] + b[i][m];
				System.out.print(c[i][m] + " ");
			}
			System.out.println();
		}

		o.close();
	}

}
