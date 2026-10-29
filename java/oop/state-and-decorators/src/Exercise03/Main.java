package Exercise03;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Character character = new BaseCharacter();
		printStats(character);
		
		character = new StrengthBuff (character);
		printStats(character);
		
		character = new SpeedBuff (character);
		printStats(character);
		
		character = new ArmorBuff (character);
		printStats(character);
	}
	
	// Die aktuellen Spielwerte anzeigen.
	public static void printStats (Character character) {
		System.out.println("=== Character Informationen ===");
		System.out.println("Power " + character.getPower());
		System.out.println("Description " + character.getDescription());
		System.out.println("------------------------------------");
		System.out.println();
	}

}
