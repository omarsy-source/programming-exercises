package Decorator;

// Dieser Dekorator hängt drei Ausrufezeichen an den Text an.
// Der Aufbau entspricht dem UpperCaseDecorator.
public class ExclamationDecorator implements TextFormatter {
	private TextFormatter inner;
	// Das innere Objekt kann der Basisheld oder ein weiterer Dekorator sein.
	
	public ExclamationDecorator (TextFormatter inner) {
		this.inner = inner;
	}
	@Override
	// Den Text nach der Regel dieses Formatters zurückgeben.
	public String format(String text) {
		return inner.format(text) + "!!!";
		// Jeder Dekorator übernimmt genau eine Änderung.
	}
}
