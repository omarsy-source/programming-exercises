package Exercise01;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Button extends FormElement {
	
	public Button(int x, int y) {
		super.positionX = x;
		super.positionY = y;
	}

	@Override
	public void render() {
		System.out.println("Button bei ( " + positionX + " , " + positionY + " )" + " " + "gerendert");

	}

}
