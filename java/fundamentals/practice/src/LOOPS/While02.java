package LOOPS;

import java.util.Scanner;

public class While02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.println (" Geben Sie erste Zahl ein : ");
		int num = in.nextInt();
		
		while (num!=0) {
			sum += num;
			System.out.println (" Geben Sie zweite Zahl ein : ");
			num = in.nextInt();// Die nächste Eingabe innerhalb der Schleife lesen, damit neue Werte und der Abbruch möglich sind.
				
					}	
		System.out.println (" sum = " + sum );
		in.close();

	}

}
