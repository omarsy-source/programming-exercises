package Exercise05;

import java.util.Scanner;

public class Exercise02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Geben Sie x ein : ");
		int x = in.nextInt();
		System.out.println (" Geben Sie y ein : ");
		int y = in.nextInt();
		if ( x > y) {
			int o = x;
			x = y;
			y = o;
	}
		for ( int i = y ; i >=x ; i--) {
			System.out.println (i);
		}
		in.close();
	}
}
