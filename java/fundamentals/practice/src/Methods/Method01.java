package Methods;

public class Method01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		  int[] a = {3, 7};  // Hier den Beispielwert für einen anderen Durchlauf anpassen.
	        int[][] m = {{1,3},{5,3,8},{7,4,9,8}};
	        int row = 0;
	        
	        int sumrow = sumRow(m, row);
	        int maxVal = max(a);
	        
	        System.out.println("Die größte Zahl ist! " + maxVal);  // 7
	        System.out.println("Row sum: " + sumrow);               // 4
	    }

	    // Den größten der übergebenen Werte zurückgeben.
	    public static int max(int[] arr) {
	    	if (arr.length == 0) {
	    	throw new ArrayIndexOutOfBoundsException("Leer!"); // Beispielaufruf zum Prüfen der Methode.
	    	}

	    	int max = arr[0]; // Das erste Element liegt an der Position null.

	    	for (int i = 1; i < arr.length; i++) { // Mit dem Index eins beginnen.
	    	if (arr[i] > max) {
	    	max = arr[i];
	    	}
	    	}
	    	return max;
	    	}

	    // Die Werte einer Matrixzeile addieren.
	    public static int sumRow(int[][] m, int row) {
	        if (row < 0 || row >= m.length) {
	            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
	        }
	        int sum = 0;
	        for (int j = 0; j < m[row].length; j++) {
	            sum += m[row][j];
	        }
	        return sum;
	    }

	    public static int[][] add(int[][] a, int[][] b) {
	        if (a.length != b.length || a[0].length != b[0].length) {
	            throw new IllegalArgumentException("IllegalArgumentException");
	        }
	        int[][] sum = new int[a.length][a[0].length];
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[0].length; j++) {  // Hier den inneren Schleifenindex j verwenden.
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        return sum;

	}

}
