package Exercise02;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class MemoryStorage implements Storage {
	String data;

	@Override
	// Den übergebenen Inhalt im gewählten Speicher ablegen.
	public void save(String data) {
		this.data = data;
		System.out.println(data + " wurde gespeichert..");
	}

	@Override
	// Die vorbereiteten Daten oder Objekte laden.
	public String load() {
		return data + " wird geladen...";

	}
}
