package review;

import java.util.Arrays;
import java.util.Scanner;

public class Example01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner (System.in);
		
		System.out.println("Geben Sie die Zahlen ein!");
		int inputValue = o.nextInt();
		int [] numericValue = new int [inputValue];
		for(int i = 0 ; i < numericValue.length ; i++) {
			System.out.println ("Gibt zahl ");
			numericValue [i] = o.nextInt();
		}
		int max = numericValue[0];
		for (int i = 1 ; i < numericValue.length; i++) {
			if (numericValue[i] > max) {
				max = numericValue [i];
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(numericValue));
		o.close();

}
}