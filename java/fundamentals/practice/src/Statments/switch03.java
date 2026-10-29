package Statments;

import java.util.Scanner;

public class switch03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Geben Sie eine davon : + - * / % ");
		char o = in.next().charAt(0);
		System.out.println (" Geben Sie Die erste Nummer ein : ");
		double N1= in.nextDouble();
		System.out.println (" Geben Sie Die zweite Nummer ein : ");
		double N2= in.nextDouble();
		switch (o) {
		case '+':
			System.out.println (" result = " + (N1+N2));
			break;
		case '-':
			System.out.println (" result = " + (N1-N2));
			break;
		case '*':
			System.out.println (" result = " + (N1*N2));
			break;
		case '/':
			System.out.println (" result = " + (N1/N2));
			break;
		case '%':
			System.out.println (" result = " + (N1%N2));
			break;
		}
		in.close();

	}

}
