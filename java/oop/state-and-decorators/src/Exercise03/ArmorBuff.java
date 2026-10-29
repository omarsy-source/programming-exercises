package Exercise03;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class ArmorBuff implements Character {
	
	private Character upgrade;
	
	public ArmorBuff (Character upgrade) {
		this.upgrade = upgrade;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getPower () {
		return  upgrade.getPower() + 3;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getDescription () {
		return upgrade.getDescription() + " " +  "gepanzert";
	}
}
