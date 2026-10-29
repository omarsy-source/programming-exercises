package oop_Library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();

	/* Eine ArrayList verwaltet ihre Größe dynamisch und bietet Methoden wie add() und remove(). */
	public void addBook(Book b) {
		books.add(b);
		System.out.println(b.getTitle() + " wurde hinzugefügt. ");
	}

	// Das gesuchte Buch aus der Bibliotheksliste entfernen.
	public void removeBook(String title) {
		/* books.size() liefert die aktuelle Anzahl der gespeicherten Bücher. */
		for (int i = 0; i < books.size(); i++) {
			/* books.get(i) liefert das Buch an der Position i. */
			if (books.get(i).getTitle().equals(title)) {
				// Das ausgewählte Buch aus der Liste entfernen.
				books.remove(i);
				break;
			}
		}
	}

	// Alle gespeicherten Einträge anzeigen.
	public void displayAll() {
		/* Alle Book-Objekte der Liste durchlaufen und displayInfo() aufrufen. */
		for (Book b : books) {
			b.displayInfo();
		}
	}

	// Den gesuchten Eintrag in den gespeicherten Daten suchen.
	public void search(String s) {
		boolean found = false;
		for (Book b : books) {
			if (b.getTitle().equals(s)) {
				b.displayInfo();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Sorry we do not have this Book!");
		}
	}

	
}
