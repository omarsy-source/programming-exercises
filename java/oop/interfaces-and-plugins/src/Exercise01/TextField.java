package Exercise01;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class TextField extends FormElement {

	public TextField(int x, int y) {
		super.positionX = x;
		super.positionY = y;
	}

	@Override
	public void render() {
		System.out.println("Textfeld bei ( " + positionX + " , " + positionY + " )" + " " + "gerendert");

	}

}
