package Statments;

import java.util.Scanner;

public class if04 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" please enter your name: ");
		String name = in.nextLine();
		System.out.println("✨ Wähle eine Zahl von 1 bis 3 für eine Botschaft: ");
		int choice = in.nextInt();
		if ( choice == 1) {
			System.out.printf (" 💪 %s, du schaffst das! Gib niemals auf!\n", name);
			// Nach dem Formattext folgt ein Komma vor den einzusetzenden Werten.
		} else if (choice ==2) {
			System.out.printf (" 🌟 %s, dein Mut ist stärker als jede Angst.\n", name);
		} else if ( choice == 3) {
			System.out.printf(" 🔥 %s;  du bist ein echtes Vorbild!\n", name);
		} else {
			System.out.println ("😅 Ungültige Auswahl, aber du bist trotzdem großartig!");
			in.close();
		}

	}

}
