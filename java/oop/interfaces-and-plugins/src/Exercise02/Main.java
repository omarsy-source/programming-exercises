package Exercise02;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Storage fileStorage = new FileStorage();
		fileStorage.save("SQL Aufgabe");
		fileStorage.load();

		Storage memoryStorage = new MemoryStorage();
		memoryStorage.save("SQL Aufgabe ");
		memoryStorage.load();
	}

}
