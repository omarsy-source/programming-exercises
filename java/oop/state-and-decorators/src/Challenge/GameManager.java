package Challenge;

import java.util.ArrayList;

public class GameManager {
	static private GameManager instance = null;
	private ArrayList <Item> inventoryList = new ArrayList<>();
	
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}
	// Ein weiteres Objekt in die Sammlung aufnehmen.
	public void addItem(Item item) {
		GameStats.itemsCollected++;
		GameStats.totalValueCollected += item.getValue(); 
		inventoryList.add(item);
	}
	// Die vorhandenen Objekte nacheinander anzeigen.
	public void listItems() {
		System.out.println(inventoryList);
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getTotalValue() {
		int sum = 0;
		for (Item item : inventoryList ) {
			sum += item.getValue();
		}
		return sum;
	}
 }
