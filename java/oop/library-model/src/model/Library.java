package model;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> valueList = new ArrayList<>();

	// Ein Buch zur Bibliotheksliste hinzufügen.
	public void addBook(Book c) {
		valueList.add(c);
		System.out.println(c.getTitle() + " wurde hinzugefügt.");
	}

	// Das gesuchte Buch aus der Bibliotheksliste entfernen.
	public void removeBook(String title) {
		for (int i = 0; i < valueList.size(); i++) {
			if (valueList.get(i).getTitle().equals(title)) {
				// Den Titel des aktuellen Buchs mit dem gesuchten Titel vergleichen.
				valueList.remove(i);
				break;
			}
		}
	}
	// Die gespeicherten Bücher nacheinander ausgeben.
	public void listBooks() {
		for (Book s : valueList) {
			System.out.println(s);
		}
	}
}