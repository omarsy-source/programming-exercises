package LOOPS;

import java.util.Scanner;

public class While03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numberToGuess = (int) (Math.random() * 100) + 1;
		System.out.println(" خمن الرقم أو ادخل الرقم -1 للخروج");
		int x = in.nextInt();
		while ( x != numberToGuess) {
			if ( x == -1) {
				System.out.println( " لقد انسحب, رقم التخمين هو : " + numberToGuess);
				break;
			}
			if ( x > numberToGuess) {
				System.out.println(" الرقم المدخل اكبر");
				x = in.nextInt();
				} else if ( x < numberToGuess ){
					System.out.println( " الرقم المدخل اصغر ");
					 x = in.nextInt();
				} else {
					System.out.println(" مبارك");
				}
					
			}
		System.out.println( x );
		in.close();

	}

}
