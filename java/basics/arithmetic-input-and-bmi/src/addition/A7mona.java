package addition;

import java.util.Scanner;

public class A7mona {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in = new Scanner(System.in);
		
			System.out.print("n1 : ");
			Double n1 = in.nextDouble();

			System.out.print("n2 : ");
			Double n2 = in.nextDouble();

			Double z = n1 + n2;
			System.out.print("z = " + z);

			in.close();
		

	}

}
