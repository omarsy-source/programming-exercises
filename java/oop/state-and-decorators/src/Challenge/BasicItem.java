package Challenge;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class BasicItem implements Item{
	private String name;
	private int value;
	public BasicItem (String name , int value) {
		this.name =name;
		this.value = value;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name ;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getValue() {
		return value ;
	}
}
