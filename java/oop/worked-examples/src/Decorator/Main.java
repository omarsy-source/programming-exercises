package Decorator;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		TextFormatter text = new PlainText();
		System.out.println(text.format("hello"));
		text = new UpperCaseDecorator(text);
		System.out.println(text.format("hello"));
		text = new ExclamationDecorator(text);
		System.out.println(text.format("hello"));

	}

}
