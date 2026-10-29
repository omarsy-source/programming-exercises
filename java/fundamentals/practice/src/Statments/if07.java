package Statments;

import java.util.Scanner;

public class if07 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println(" Gebne Sie 3 Zahlen ein: ");
		int a = o.nextInt();
		int b = o.nextInt();
		int c = o.nextInt();
		int max = a;
		int min = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		System.out.println("Max; " + max);
		System.out.println("Min; " + min);
		o.close();
	}

}
