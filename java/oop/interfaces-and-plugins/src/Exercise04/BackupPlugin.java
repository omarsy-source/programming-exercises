package Exercise04;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class BackupPlugin implements Plugin {
	String name;

	public BackupPlugin(String name) {
		this.name = name;
	}

	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name;

	}

	@Override
	// Die Aktion dieser Plugin-Implementierung ausführen.
	public void execute() {
		System.out.println("Backup");
	}
}
