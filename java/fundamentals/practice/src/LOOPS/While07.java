package LOOPS;

import java.util.Scanner;

public class While07 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Bitte geben Sie 10 Zahlen ein: ");
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = o.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Die Summe der eingegebenen Zahlen beträgt: " + sum);
		double avarage = sum / arr.length;
		System.out.println("Der Durchschnitt beträgt: " + avarage);
		int max = arr[0];
		if (max < arr[1])
			max = arr[1];
		if (max < arr[2])
			max = arr[2];
		if (max < arr[3])
			max = arr[3];
		if (max < arr[4])
			max = arr[4];
		if (max < arr[5])
			max = arr[5];
		if (max < arr[6])
			max = arr[6];
		if (max < arr[7])
			max = arr[7];
		if (max < arr[8])
			max = arr[8];
		if (max < arr[9])
			max = arr[9];
		int min = arr[0];
		if (min > arr[1])
			min = arr[1];
		if (min > arr[2])
			min = arr[2];
		if (min > arr[3])
			min = arr[3];
		if (min > arr[4])
			min = arr[4];
		if (min > arr[5])
			min = arr[5];
		if (min > arr[6])
			min = arr[6];
		if (min > arr[7])
			min = arr[7];
		if (min > arr[8])
			min = arr[8];
		if (min > arr[9])
			min = arr[9];
		System.out.println("Die größte Zahl ist: " + max);
		System.out.println("Die kleinste Zahl ist: " + min);
	}

}
