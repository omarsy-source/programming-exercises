package Exercise03;

import java.util.Arrays;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		 int[] arr = {14, 54, 97, 24, 36, 48, 75, 14};
	        MergeSort.mergeSort(arr, 0, arr.length - 1);
	        System.out.println(Arrays.toString(arr));
	}

}
