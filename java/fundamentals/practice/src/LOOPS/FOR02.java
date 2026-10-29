package LOOPS;

public class FOR02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int x =4;
		int y=9;
		for ( int i= 1; i <= x; i++) {
			for ( int o=1; o <= y ; o++) {
				if ( (o == 5 && i ==1) ||
				( o > 3 && o < 7 && i ==2) || 
				( o > 2 && o <8 && i ==3) || 
				( o > 1 && o < 9 && i ==4)) 
				{
				
				System.out.print("*");
				
			
			} else { 
				System.out.print("-");
		}
			
			}
	
			System.out.println();
}

	}

}
