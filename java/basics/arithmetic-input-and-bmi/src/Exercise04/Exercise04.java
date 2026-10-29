package Exercise04;

import java.util.Scanner;

public class Exercise04 {


	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner (System.in);
		System.out.println ( " Geben Sie Ihr Gewicht in KG ein ");
		double weight = o.nextDouble();
		
		System.out.println ( " Geben Sie Ihre Größe m ein ");
		double height = o.nextDouble();
		
		double BMI = weight  / ( height * height );
		if ( BMI < 18.5 ) {
				System.out.println (" Sie sind Untergewicht ");
			} else if ( 18.5<= BMI && BMI <25 ) {
				System.out.println ( " Sie sind Normalgewicht");
			} else if ( 25 <= BMI && BMI < 30  ) {
				System.out.println (" Sie sind Leichtes Übergewicht");
			} else {
				System.out.println ("Sie sind Übergewicht");
			} o.close();
		
		
		

	}

}
