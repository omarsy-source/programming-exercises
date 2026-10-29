package LOOPS;

public class FOR07 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int multi = i * j;
				System.out.print(multi + " ");
				if (multi >= 100) {
					break;
				}

			}
			System.out.println(" ");
		}

	}

}
