package Exercise03;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class StrengthBuff implements Character {
	private Character upgrade;
	
	public StrengthBuff (Character upgrade) {
		this.upgrade = upgrade;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getPower() {
		return  upgrade.getPower() + 5;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getDescription () {
		return upgrade.getDescription() ;
	}
}
