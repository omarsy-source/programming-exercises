package Exercise1;

import java.util.ArrayList;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		/* Osama :
		 * „Es wäre besser, hier new ArrayList<Person>() zu verwenden, 
		 * damit kein Raw‑Type entsteht.“
		 */
		ArrayList<Person> valueList = new ArrayList();
		Person a = new Person("Omar", 39);
		a.introduce();
		Student b = new Student("Omar", 39, "0993254");// Die Methode wird hier direkt aufgerufen.
		b.introduce();
		valueList.add(b);
		Teacher c = new Teacher("Omar", 39, "Programmieren");
		c.introduce();
		valueList.add(c);
		/* Über die gemeinsame Basisklasse Person lassen sich alle Listenelemente durchlaufen. */
		for (Person l : valueList) {
			// println() gibt die Objekte der Liste aus.
			// Getter liefern einen Wert; introduce() gibt seinen Text selbst aus.
			// Eine void-Methode kann nicht als Wert an println() übergeben werden.
			l.introduce();

			if (l instanceof Student) // Prüfen, ob das Objekt eine Student-Instanz ist.
			{
				// Student s = (Student) l; // Casting
				// System.out.println(s.getStudentId());
				// instanceof erkennt den konkreten Untertyp eines Objekts.
				// Danach können die besonderen Methoden der Unterklasse verwendet werden.
				System.out.println("Martikel Nummer ist : " + ((Student) l).getStudentId());
			}
		}
		/*
		 * Hier ist die Antwort auf letzte Frage. Wenn wir die Modifkation von private
		 * auf protected ändern, dann können wir Z.B in der introduce methode ohne get
		 * auf das Attribut zu greifen
		 */
	}

}
