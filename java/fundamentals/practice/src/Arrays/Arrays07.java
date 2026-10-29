package Arrays;

public class Arrays07 {
// Beim Transponieren werden Zeilen und Spalten vertauscht.
	public static void main(String[] args) {
//		Scanner o = new Scanner(System.in);
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] transpose = new int[3][2];
		for (int i = 0; i < 2; i++) {
			for (int m = 0; m < 3; m++) {
				transpose[m][i] = matrix[i][m];
			}
		}
		System.out.println("transpose: ");
		for (int[] row : transpose) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
// Die transponierte Matrix mit verschachtelten Indexschleifen ausgeben.
//for(int i = 0; i < transpose.length; i++)
// for(int j = 0; j < transpose[i].length; j++)
// System.out.print(transpose[i][j] + " ");
