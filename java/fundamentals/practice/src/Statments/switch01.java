package Statments;

import java.util.Scanner;

public class switch01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Please enter one of: + - * / %");
		char c =  in.next().charAt(0);
		int n1,n2;
		System.out.println (" Please enter n1 ");
		n1 = in.nextInt();
		System.out.println (" Please enter n2" );
		n2= in.nextInt();
		switch (c) {
		case '+':
			System.out.println (" result = " + (n1 + n2));
			break;
		case '-':
			System.out.println (" result = " + (n1 - n2));
			break;
		case '*':
			System.out.println (" result = " + (n1 * n2));
			break;
		case '/':
			System.out.println (" result = " + (n1 / n2));
			break;
		case '%':
			System.out.println (" result = " + (n1 % n2));
			break;
			default:
				System.out.println (" Not an option ");
				in.close();
		}

	}

}
