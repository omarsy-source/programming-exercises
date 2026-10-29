package Exercise03;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class BaseCharacter implements Character {
	
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getPower() {
		return 10;
		
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getDescription() {
		return "Einfacher Held";
	}
}
