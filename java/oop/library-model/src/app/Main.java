package app;

import model.Book;
import model.Library;
public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {

		Book a = new Book("Puls", " Adham Scharkawi");
		Book b = new Book ("les misérables", " Victor Hugo");
        System.out.println("Titel von a: " + a.getTitle());
		a.setAuthor("Omar");
		a.displayDetails();
		b.displayDetails();
		
		
		a.markAsRead();
		System.out.println("Wurde das Buch " + a.getTitle() + " gelesen? " + " " + a.isRead());
		System.out.println("Wurde das Buch" + a.getTitle() + " gelesen? " + b.isRead());
		
		
		Library bi = new Library();
		bi.addBook(b);
		bi.listBooks();
		/* Osama:
		 * "in Library hast du eine Methode hinzugefügt (listBooks),
		 *  die sieht schön aus, aber es fehlt der richtige Methodenaufruf.
		 *  Du solltest s.displayDetails() statt System.out.println(s) verwenden,
		 *   da sonst nur die Speicheradresse des Objekts ausgedruckt wird."
		 */
	}

}
