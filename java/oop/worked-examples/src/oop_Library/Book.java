package oop_Library;

public class Book {
		private String title;
		private String author;
		private int year;
		// Die Informationen dieses Objekts ausgeben.
		public void displayInfo () {
			System.out.println("Book name is: " + title + " " + "Author name is: " + author + " " + "Publication date is: " + year);
		}
		public Book(String title, String author, int year) {
			this.title = title;
			this.author = author;
			this.year = year;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public String getTitle() {
			// TODO Auto-generated method stub
			return title;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public String getAuthor() {
			return author;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setAuthor(String author) {
			this.author = author;
		}
		// Den zugehörigen gespeicherten Wert zurückgeben.
		public int getYear() {
			return year;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setYear(int year) {
			this.year = year;
		}
		// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
		}
		
}
