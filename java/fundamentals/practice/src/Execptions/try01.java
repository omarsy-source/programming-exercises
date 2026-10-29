package Execptions;

import java.util.Scanner;

public class try01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println(" Geben Sie # ein ");
			int a = scn.nextInt();
			System.out.println(" Geben Sie #" + 1 + " ein ");
			int b = scn.nextInt();
			System.out.println(" Geben Sie #" + 2 + " ein ");
			int c = scn.nextInt();
			boolean res = hasMidpoint(a, b, c);
			System.out.println(" Das Resualt ist : " + res);
			scn.close();
		} catch (java.util.InputMismatchException e) {
			System.out.println("404");
		}

	}

	public static boolean hasMidpoint(int a, int b, int c) {
		return (a == (b + c) / 2 || b == (a + c) / 2 || c == (a + b) / 2);


	}

}
