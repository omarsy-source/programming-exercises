package exercise;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise10 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
	
			Scanner inputValue = new Scanner(System.in);
			System.out.println(" Bitte eine positive und ganze Zahl eingeben : ");
			int x = inputValue.nextInt();
			int[][] matrix = createMatrix(x);
			System.out.println(Arrays.deepToString(matrix));
			inputValue.close();
			}
			// Die quadratische Matrix mit den vorgesehenen Zahlen füllen.
			public static int[][] createMatrix(int x){
			int[ ][ ] matrix = new int[ x ][ x ];
			int num = x;
			if ( num > 0 && (num % 2) == 0 ) {
			for ( int i =0; i < matrix.length ; i++) {
				for ( int m =0; m < matrix[i].length ; m++) {
					matrix [i][m] = num;
					num +=2;
					
					
				} 
			
				
				}
			
			
			}
			return matrix;
			
			}
	}
