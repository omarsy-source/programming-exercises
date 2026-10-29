package Statments;

import java.util.Scanner;

public class if08 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Bitte geben Sie 10 Zahlen ein: ");
		int[] arr = new int[10];
		System.out.println("Geben Sie ihr Target");
		int target = o.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = o.nextInt();
			if (target == arr[i]) {
				System.out.println("Your target: " + target);
			} else {
				System.out.println("Not found!");
			}
		}
		o.close();
	}

}
