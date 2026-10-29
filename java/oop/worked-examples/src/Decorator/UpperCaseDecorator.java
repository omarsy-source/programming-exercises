package Decorator;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class UpperCaseDecorator implements TextFormatter {
	// Dieser Dekorator wandelt den Text in Großbuchstaben um.
	// Die gemeinsame Schnittstelle erlaubt es, Dekoratoren zu verschachteln.
	// Das innere Objekt kann der Basisheld oder ein weiterer Dekorator sein.
	private TextFormatter inner;
	
	public UpperCaseDecorator (TextFormatter inner) {
		this.inner = inner;
		 // Das verpackte Objekt speichern.
	}
	// Den Text nach der Regel dieses Formatters zurückgeben.
	public String format(String text) {
        return inner.format(text).toUpperCase(); // Zuerst den inneren Formatter ausführen, danach dessen Ergebnis ändern.
    }
}
