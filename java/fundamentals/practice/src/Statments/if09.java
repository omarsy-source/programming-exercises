package Statments;

import java.util.Scanner;

public class if09 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Geben Sie r ein : ");
		double r = in.nextDouble();
		System.out.println (" Möchten Sie Umfang oder Fläche rechnen ");
		Double circumference, area;// Hier wird nur eine Variable deklariert; eine Eingabe erfolgt erst durch einen Scanner-Aufruf.
		String choice= in.next();
		if ( choice.equals("Umfang")) {
			circumference = 2*3.14*r;
			System.out.println ( " Umfang = " + circumference);
		} else if (choice.equals("Fläche")) {
			area = 3.14* Math.pow(r,2);
			System.out.println ( "Fläche = " + area);
		} else {
			System.out.println (" 404 ");
			in.close();
		}
		

	}

}
