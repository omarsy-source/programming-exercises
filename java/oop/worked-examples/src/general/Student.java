package general;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Student extends Person implements Printable {
	private String role;
	public Student(String name, int agr) {
		super(name, agr);
		this.role = role;
	}
	
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getRole () {
		return role;
	}
	@Override
	// Die gespeicherten Informationen in der Konsole ausgeben.
	public void printInfo() {
		System.out.println("Hallo mein Name ist " + name + " " + "und ich bin " + age + " " + "Jahre alt. " + " " + " Ich bin " + getRole() + " " + "von Beruf");
	}
}
