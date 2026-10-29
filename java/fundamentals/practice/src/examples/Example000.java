
package examples;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Example000 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int [][] matrix={ {1, 2, 3} , {4, 5, 6} };
		int n = 0;
		int m = 2;
		int [] updatedValue = arr(matrix,n,m);
		System.out.println(Arrays.toString(updatedValue));
 }
	// Das Array für die Übung vorbereiten.
	public static int[] arr (  int [ ] [ ] matrix , int n, int m) {
		int [] valueList = new int [matrix.length];
		for ( int i = 0; i < matrix.length; i++ ) {
			valueList [i] = matrix[i][n] + matrix[i][m];
		}
		return valueList;
	}
	}
