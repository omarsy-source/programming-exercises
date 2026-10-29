package Decorator;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class PlainText implements TextFormatter {
	// Das Basisobjekt gibt den Text unverändert zurück.
	// Dies ist das unverpackte Basisobjekt des Decorator-Musters.
	@Override
	// Den Text nach der Regel dieses Formatters zurückgeben.
	public String format(String text) {
		return text;
		// Den Text ohne Änderung zurückgeben.
	}
	
	
	
}
