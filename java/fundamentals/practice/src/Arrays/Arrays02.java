package Arrays;

import java.util.Scanner;

public class Arrays02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		int [] nums = new int [6];
		int answer = 15;
	
		sc.close();
		for (int i = 0; i < nums.length; i++ ){
			System.out.println( " Versuch #" +(i+1)+ ":");
			nums [i] = sc.nextInt();
			if (nums[i] == answer) {
				System.out.println( " Great Job Habibi ");
				break;
			}
		else {
				System.out.println( " Try again Habibi ");
				
			}

		}

	}

}
