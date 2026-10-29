package Statments;

import java.util.Scanner;

public class ConditionalOperator01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner (System.in);
		System.out.println("Geben Sie Ihre Note ein! ");
		int x = o.nextInt();
		String rating = (x < 0 && x >100)?("Ungültig"):
		(x >= 90 && x <= 100)? "Sehr gut(1)":
		(x <= 89&& x >= 80)? "Gut(2)":
		(x <= 79 && x >=70)? "Befriedigend (3)":
		(x <= 69 && x >=60)? "Ausreichend (4)":
		( x < 60)? "Nicht bestanden (5)":"" ;
		System.out.println("Ihr Notbereich ist " + rating);

	}

}
