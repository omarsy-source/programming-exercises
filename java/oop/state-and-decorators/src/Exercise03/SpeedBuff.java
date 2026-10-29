package Exercise03;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class SpeedBuff implements Character {
	private Character upgrade;
	
	public SpeedBuff (Character upgrade) {
		this.upgrade = upgrade;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getPower () {
		return upgrade.getPower();
		
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getDescription () {
		return  upgrade.getDescription() + " " + "schnell";
	}
}
