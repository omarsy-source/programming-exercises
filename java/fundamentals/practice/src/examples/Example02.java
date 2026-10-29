package examples;
import java.util.Scanner;

public class Example02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Double n1,n2;
		System.out.print(" die erste Zahl: ");
		 n1 = scn.nextDouble();
		System.out.print(" die Zweite Zahl: ");
		n2 = scn.nextDouble();
		double z = n1 +n2 ;
		System.out.printf("num1 = %f num2 = %f%n" +z);
		
		scn.close();

	}

}
