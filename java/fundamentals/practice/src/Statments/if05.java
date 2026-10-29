package Statments;

import java.util.Scanner;

public class if05 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		System.out.println (" Geben Sie die erste Zahl ein: ");
		int number1 = n.nextInt();
		
		System.out.println("Geben Sie die zweite Zahl ein: ");
		int number2 = n.nextInt();
		
		System.out.println (" Geben Sie die dritte Zahl ein: ");
		int number3 = n.nextInt();
		
		int max;
		if (number1 > number2) {
			max = number1;
		} else  {
			max = number2 ;
		}  if (max < number3){
			max = number3;
		} 
		System.out.printf("Die Größte zahl\n = %s" , max);
		n.close();

	}

}
