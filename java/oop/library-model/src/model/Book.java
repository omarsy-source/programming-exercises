package model;

public class Book {
		private String title;
		private String author;
		private boolean isRead = false;
		public Book (String t, String a) {
			title = t;
			author = a;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public String getTitle() {
			return title;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setTitle(String title) {
			this.title = title;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public String getAuthor() {
			return author;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setAuthor(String author) {
			this.author = author;
		}
		// Die Einzelheiten dieses Objekts ausgeben.
		public void displayDetails() {
			System.out.println("Buchname ist : " + title);
			System.out.println("Autorname ist : " + author);
		}
		// Das Buch als gelesen markieren.
		public void markAsRead() { // Das Buch als gelesen markieren.
			 isRead = true;
			
		}
		// Die zugehörige Zustandsbedingung prüfen.
		public boolean isRead() { // Zurückgeben, ob das Buch bereits gelesen wurde.
			return isRead;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setRead() {
			// Ein Parameter erlaubt unterschiedliche Werte bei jedem Aufruf.
			// Ohne Parameter führt die Methode ihre festgelegte Aktion aus.
			this.isRead = isRead;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", isRead=" + isRead + "]";
		}
		
		
}
