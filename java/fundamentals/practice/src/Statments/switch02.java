package Statments;

import java.util.Scanner;

public class switch02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.println ("Geben Sie einen Monat ein ");
		String monthValue = in.next();
		switch ( monthValue ) {
		case ("Januar") : 
			System.out.println ("1");
			break;
			case ("Februar") : 
				System.out.println ("2");
				break;
			case ("März") : 
				System.out.println ("3");
				break;
			case ("April") : 
				System.out.println ("4");
				break;
			case ("Mai") : 
				System.out.println ("5");
				break;
			case ("Juni") : 
				System.out.println ("6");
				break;
			case ("Juli") : 
				System.out.println ("7");
				break;
			case ("August") : 
				System.out.println ("8");
				break;
			case ("September") : 
				System.out.println ("9");
				break;
			case ("Oktober") : 
				System.out.println ("10");
				break;
			case ("November") : 
				System.out.println ("11");
				break;
			case ("Dezember") : 
				System.out.println ("12");
				break;
				default:
					System.out.println (" 404 ");
		};
		in.close();

	}

}
