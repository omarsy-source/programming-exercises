package DecoratorHero;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class BaseHero implements Hero {
	// Der Basisheld liefert die unveränderten Standardwerte.
	// Dies ist das unverpackte Basisobjekt des Decorator-Musters.
	private int HP = 100;
	private int Attack = 10;
	private int Defense = 5;
	private String nameValue = "Base Hero";
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getHP() {
		return HP;
	}
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getAttack() {
    	return Attack;
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public int getDefense() {
    	return Defense;
    }
    // Den zugehörigen gespeicherten Wert zurückgeben.
    public String getName() {
    	return nameValue;
    }
    
}
