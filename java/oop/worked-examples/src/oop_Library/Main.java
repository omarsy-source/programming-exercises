package oop_Library;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Library lib = new Library();
		Book b1 = new Book("Java", "Omar", 2010);
		lib.addBook(b1);
		lib.displayAll();


	}

}
