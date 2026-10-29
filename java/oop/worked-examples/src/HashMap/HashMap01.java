package HashMap;

import java.util.*;

public class HashMap01 {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// Namen und Noten der Studierenden in einer HashMap speichern und ausgeben.
		// Zu jedem Namen die zugehörige Note ausgeben.
		
		// Nur Einträge mit einer Note über 60 ausgeben.
		HashMap<String, Integer> bankNote = new HashMap<>();
		bankNote.put("Omar", 87);
		bankNote.put("Ahmed", 50);
		bankNote.put("Mustafa", 59);
		bankNote.put("Osama", 90);
		bankNote.put("Sami", 20);
		bankNote.put("Wali",67);
		bankNote.put("Khali", 60);
		int count = 0;
		for (HashMap.Entry<String, Integer> ar : bankNote.entrySet()) {
			if (ar.getValue() > 60) {
				System.out.println(ar);
				count++;
				
			}
			
		}
		System.out.println("Anzahl der Studierende, die mehr als 60 in den Klausuern bekommen. " + count);
	}
}
