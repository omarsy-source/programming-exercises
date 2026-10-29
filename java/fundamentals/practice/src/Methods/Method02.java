package Methods;

import java.util.Arrays;

public class Method02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		try {
			int[][] a = { { 1, 3 , 2 }, { 5, 4 , 6}, { 8, 7,11}};
			int searchedNumber = 2;
			int[][] transpose = transpose(a);
			int diagonalSum = diagonalSum(a);
			int [] position = find(a, searchedNumber);
			System.out.println("Transpose:\n" + Arrays.deepToString(transpose));
			System.out.println("Die Summe ist " + diagonalSum);
			System.out.println("Die Position der eingegebenen Zahl: " + Arrays.toString(position));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

		}

		// Zeilen und Spalten der Matrix vertauschen.
		public static int[][] transpose(int[][] m) {
			if (m.length == 0) {
				throw new IllegalArgumentException("Leere Matrix!");
			}
			int rows = m.length;
			int cols = m[0].length;
			for (int i = 0; i < rows; i++) {
				if (m[i].length != cols) {
					throw new IllegalArgumentException("Nicht rechteckig!");
				}
			}
			int[][] transposematrix = new int[cols][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					transposematrix[j][i] = m[i][j];
					System.out.print(transposematrix[j][i] + " ");
				}
				System.out.println();
			}
			
			return transposematrix;
		}
		// Die vorgesehenen Diagonalwerte der Matrix addieren.
		public static int diagonalSum(int[][] m) {
	        int rows = m.length;
	        int cols = m[0].length;
	        if (rows != cols) {
	        	throw new IllegalArgumentException ("Nicht quadratisch!");
	        }
	        int [][] diagnoal = new int [rows] [cols];
	        int sum = 0;
	        for ( int i = 0 ; i < rows ; i++) {
	        		sum = sum + m[i][i];
	        }
			return sum;
	    }
		// Die Daten nach der angegebenen Bedingung durchsuchen.
		public static int[] find(int[][] m, int value) {
	        for ( int i = 0 ; i < m.length; i++) {
	        		for ( int j = 0 ; j < m[i].length; j++) {
	        			if (value == m[i][j]) {
	        				return new int[]{i, j};	
	        			}
	        			
	        		}
	        		
	        }
			return null;

	}

}
