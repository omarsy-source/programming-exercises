package DecoratorHero;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class ArmorDecorator extends BaseDecorator {
	// Die Rüstung erhöht HP und Defense.
	// Andere Werte werden an das innere Objekt weitergeleitet.
	public ArmorDecorator(Hero inner) {
		super(inner); // Das innere Objekt an die Basisklasse übergeben.
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getHP() {
		return inner.getHP() + 30;
	}
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getAttack() {
    	return inner.getAttack();
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getDefense() {
    	return inner.getDefense() + 20;
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public String getName() {
    	return inner.getName() + " [Armor]";
    }
	
	
	
    

}
