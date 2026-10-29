package DecoratorHero;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class SwordDecorator extends BaseDecorator {
	// Das Schwert erhöht den Angriff.
	// HP und Defense werden unverändert weitergegeben.
	public SwordDecorator (Hero inner) {
		super(inner);
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getHP() {
    	return inner.getHP();
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getAttack() {
    	return inner.getAttack() + 25;
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getDefense() {
    	return inner.getDefense();
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public String getName() {
    	return inner.getName() + " [Sword] ";
    }
}
