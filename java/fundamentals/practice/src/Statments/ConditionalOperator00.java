package Statments;

import java.util.Scanner;

public class ConditionalOperator00 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
        System.out.println("Geben Sie 3 ganze Zahlen ein! ");
        int x = o.nextInt();
        int y = o.nextInt();
        int z = o.nextInt();
        
        int maxXY = (x > y) ? x : y;
        int minXY = (x < y) ? x : y;
        int max = (z > maxXY) ? z : maxXY;
        int min = (z < minXY) ? z : minXY;
        
        System.out.println("Die größte Zahl ist: " + max);
        System.out.println("Die kleinste Zahl ist: " + min);
        o.close();

	}

}
