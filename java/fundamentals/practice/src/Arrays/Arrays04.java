package Arrays;

import java.util.Arrays;

public class Arrays04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		 int[] num = { 1,2 ,4 ,5,2,3,6,5,7,56,43,12,321
		 };
		 String [] words ={
			 "Omar", "Ahmed", "Daraa", "Nawa", "Homs"
		 };
		 System.out.println(" ohne Edition " + Arrays.toString(num));
		 Arrays.sort(num);
		 System.out.println(Arrays.toString(num));
		 
		 System.out.println(" ohne Edition " + Arrays.toString(words));
		 Arrays.sort(words);
		 System.out.println(Arrays.toString(words));

	}

}
