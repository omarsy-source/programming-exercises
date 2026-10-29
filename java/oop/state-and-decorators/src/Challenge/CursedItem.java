package Challenge;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class CursedItem implements Item {
	private Item item;
	public CursedItem (Item item ) {
		this.item = item;
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return item.getName() + "" + "Verflucht";
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getValue() {
		return item.getValue() - 5;
	}
}
