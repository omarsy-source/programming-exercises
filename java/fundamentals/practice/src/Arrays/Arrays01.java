package Arrays;

import java.util.Scanner;

public class Arrays01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		double nums[]=new double[5];
		double sum = 0;
		in.close();
		for ( int i = 0; i < nums.length; i++ ) {
			System.out.println( " Geben Sie ein #" +(i+1)+ ":");
			nums[i]= in.nextDouble();
			sum += nums[i];
			
		}
		double avar = ( sum / nums.length);
		System.out.println( " Avar : " + avar);

	}

}
