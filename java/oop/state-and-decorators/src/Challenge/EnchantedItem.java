package Challenge;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class EnchantedItem implements Item{
	private Item item;
	public EnchantedItem (Item item ) {
		this.item = item;
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return item.getName() + "" + "Verzaubert";
	}
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getValue() {
		return item.getValue() + 10;
	}
}
