package Exercise02;

import java.util.Arrays;



public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		printArry(arr);
		
		Double[] arr2= {1.5,3.9,7.8};
		printArry(arr2);
		
		String [] arr3 = {"Hal" , "Gala","AlIraaaqqqq","Jahziiieeen Jahziiieeen"};
		printArry(arr3);
	}
	
	// Die Werte des Arrays der Reihe nach ausgeben.
	public static <T> void printArry(T[] array) {
		System.out.println(Arrays.toString(array));
	}
}
