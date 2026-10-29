package Exercise01;

import java.util.Scanner;

public class BasicExceptionHandling {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Gibt a ein");
		int a = o.nextInt();
		System.out.println("Gibt b ein");
		int b = o.nextInt();
		try {
			division(a, b);
		} catch (ArithmeticException e) {
			System.out.println("Fehler! : " + e.getMessage());

		}
		o.close();
	}

	// Die Division mit den im Beispiel vorgesehenen Datentypen ausführen.
	public static void division(int a, int b) {
		double  sum  = a / b;
		System.out.println(sum);

	}
}
