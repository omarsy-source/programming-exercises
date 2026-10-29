package oop1;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Car a = new Car(); // Ein Objekt der Klasse Car erzeugen.
		// Das private Feld ist von außen nicht direkt zugänglich.
		a.setName("KIA"); // Den Namen über die vorgesehene Methode setzen.
		a.setModel(2014); // Den neuen Wert über einen Setter übernehmen.
		// Private Felder werden über Setter geändert, damit die Klasse den Zugriff steuern kann.
		
		System.out.println(a.getName() + " " + a.getModel());

	}

}
