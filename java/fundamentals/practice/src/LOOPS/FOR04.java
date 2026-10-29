package LOOPS;

public class FOR04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
int n = 3;
		
		
		for (int i = 1; n >= i; i++ ) {
			for (int j = 1; j <= i ; j= j+1){
				
				System.out.print( "*");
			}
			System.out.println();
		}

	}

}
