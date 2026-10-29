package Exercise04;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class UpdatePlugin implements Plugin {
	String name;

	public UpdatePlugin(String name) {
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
		System.out.println("Update");
	}
}
