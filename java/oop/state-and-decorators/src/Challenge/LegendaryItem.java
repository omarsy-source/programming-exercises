package Challenge;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class LegendaryItem implements Item {
	private Item item;
	public LegendaryItem (Item item ) {
		this.item = item;
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return item.getName() + "" + "Legendär";
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getValue() {
		return item.getValue() * 2;
	}

}
