package Exercise01;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		FormElement button = new Button(5, 6);
		button.render();
		FormElement textField = new TextField(3, 4);
		textField.render();
	}

}
