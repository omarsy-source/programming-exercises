package Exercise02;

// Schnittstelle: legt gemeinsame Methoden für mehrere Implementierungen fest.

public interface Storage {
	public void save(String data);

	public String load();
}
