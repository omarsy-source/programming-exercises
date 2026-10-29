package LOOPS;

import java.util.Scanner;

public class FOR06 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 System.out.print("Enter n (rows) and m (cols): ");
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        int counter = 1; // Den Zähler nach jeder Ausgabe erhöhen.
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= m; j++) {
	                System.out.printf("%3d ", counter);
	                counter++;
	            }
	            System.out.println();
	        }
	        sc.close();

	}

}
