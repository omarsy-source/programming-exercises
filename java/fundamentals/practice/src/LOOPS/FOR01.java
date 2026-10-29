package LOOPS;

public class FOR01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) throws InterruptedException {
		 java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Enter name (no spaces) or press Enter for 'Omar': ");
	        String name = sc.nextLine().trim();
	        if (name.isEmpty()) name = "Omar";

	        System.out.print("Enter maxPos (how far to move right, e.g. 6): ");
	        int maxPos = 6;
	        if (sc.hasNextInt()) maxPos = sc.nextInt();

	        System.out.print("Enter repeats (how many times to repeat the back-and-forth): ");
	        int repeats = 2;
	        if (sc.hasNextInt()) repeats = sc.nextInt();

	        System.out.print("Enter delay in ms between lines (e.g. 200): ");
	        int delayMs = 200;
	        if (sc.hasNextInt()) delayMs = sc.nextInt();

	        // Simple wave: 0..maxPos, then maxPos-1..0 to avoid double-print at the ends
	        for (int rep = 0; rep < repeats; rep++) {
	            for (int pos = 0; pos <= maxPos; pos++) {
	                printSpaces(pos);
	                System.out.println(name);
	                Thread.sleep(delayMs);
	            }
	            for (int pos = maxPos - 1; pos >= 0; pos--) {
	                printSpaces(pos);
	                System.out.println(name);
	                Thread.sleep(delayMs);
	            }
	            // optional blank line between repeats
	            if (rep < repeats - 1) System.out.println();
	        }

	        sc.close();
	    }

	    // Die geforderte Anzahl von Leerzeichen ausgeben.
	    private static void printSpaces(int n) {
	        for (int i = 0; i < n; i++) System.out.print(" ");

	}

}
