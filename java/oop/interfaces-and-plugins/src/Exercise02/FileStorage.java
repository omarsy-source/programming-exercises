package Exercise02;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class FileStorage implements Storage {

	@Override
	// Den übergebenen Inhalt im gewählten Speicher ablegen.
	public void save(String data) {
		System.out.println("Datei gespeichert: " + data);
	}

	@Override
	// Die vorbereiteten Daten oder Objekte laden.
	public String load() {
		System.out.println("Datei wird geladen");
		return "..";
	}

}
