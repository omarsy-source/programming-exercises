package DecoratorHero;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class FireDecorator extends BaseDecorator {
	// Der Feuer-Dekorator erhöht den Angriff und verringert die Verteidigung.
	// Ein Dekorator kann auch einen Wert verschlechtern.
	public FireDecorator (Hero inner) {
		super(inner);
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getHP() { 
		return inner.getHP();
	}
	
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getAttack() {
		return inner.getAttack() + 40 ;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getDefense () {
		return inner.getDefense() - 5 ;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName () {
		return inner.getName() + " [Fire]";
	}
}
