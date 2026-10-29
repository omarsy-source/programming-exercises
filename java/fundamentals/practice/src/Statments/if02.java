package Statments;

import java.util.Scanner;

public class if02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Bitte geben Sie die Zahl ein: ");
	        int x = in.nextInt();

	        if (x % 2 == 0) {
	            System.out.println("Ihre Zahl ist gerade"); 
	        } else {
	            System.out.println("Ihre Zahl ist ungerade"); 
	        }

	        in.close();

	}

}
