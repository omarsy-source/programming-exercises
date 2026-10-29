package Exercise1;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Student extends Person {

	private String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	/* Osama:
	 * „Die Methode introduce() sollte mit @Override markiert werden, 
	 * da sie die Methode der Oberklasse überschreibt.“
	 */
	public void introduce() {
		System.out.println("Hallo, ich bin [" + getName() + "] und [" + getAge()
				+ "] Jahre alt. Meine Matrikelnumemr ist [" + studentId + "]. ");
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getStudentId() {
		return studentId;
	}

}
