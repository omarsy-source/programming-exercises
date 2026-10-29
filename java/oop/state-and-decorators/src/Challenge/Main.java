package Challenge;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		GameManager gm = GameManager.getInstance();

		Item sword = new BasicItem("Schwert", 10);
		sword = new EnchantedItem(sword);    
		sword = new LegendaryItem(sword);   

		gm.addItem(sword);
		gm.addItem(new CursedItem(new BasicItem("Schild", 10)));

		gm.listItems();
		System.out.println("Total: " + gm.getTotalValue());
		GameStats.printStats();

	}

}
