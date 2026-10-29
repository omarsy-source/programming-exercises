package Exercise05;

import java.util.Scanner;

public class Exercise03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int candyPrice = 10;
		int quantity = 0;
		double candyCost =0;
		System.out.println(" Wie viel Gled haben SIe? ");
		double moneyAmount = in.nextDouble();
		double remainingMoney = moneyAmount;
		while ( remainingMoney >= candyPrice && quantity < 10) {
			quantity++;
            remainingMoney -= candyPrice;
            candyPrice += 10;  
		}
		System.out.println("Bonbon Anzahl: " + quantity);
        System.out.println("Restgeld: " + remainingMoney + " Cent");
        System.out.println("Gesamtkosten: " + (moneyAmount - remainingMoney) + " Cent");
        
        in.close();
	}
}
