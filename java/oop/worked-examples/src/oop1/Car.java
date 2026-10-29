package oop1;

public class Car {
	private String name; // Getter lesen den Zustand; Setter ändern ihn kontrolliert.
	private int model; // Private Felder verhindern einen unbeabsichtigten direkten Zugriff von außen.
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setName(String n) {
		name = n;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name;	
	}
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setModel (int m) {
		model = m;
		if ( m > 2014) {
			
		} else {
			System.out.println("We do not accept this model! ");
		}
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getModel () { 
		return model;
		
	}
}
