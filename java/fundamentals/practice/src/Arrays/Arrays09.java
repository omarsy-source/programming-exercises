package Arrays;

import java.util.Scanner;

public class Arrays09 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n =3;
		int a [][] = new int [n][n];
		System.out.println("Geben Sie die Zahlen ein; ");
		for (int i=0 ; i < n ; i++) {
			for (int j=0 ; j < n ; j++) {
				 a[i][j] = o.nextInt();
			}
		}
		int sumMain = 0;
		int sumSecondary =0;
		for (int i=0 ; i < n ; i++) {
			sumMain += a[i][i];
			sumSecondary += a[i][n - 1 -i];
		}
        System.out.println("Summe der Hauptdiagonale: " + sumMain);
        System.out.println("Summe der Nebendiagonale: " + sumSecondary);
        o.close();
	}
	

}
