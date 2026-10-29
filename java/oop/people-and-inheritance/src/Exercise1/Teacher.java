package Exercise1;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Teacher extends Person {
	private String subject;
	public Teacher (String name , int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	@Override
	// Die Person mit ihren gespeicherten Angaben vorstellen.
	public void introduce() {
		System.out.println("Hallo, ich bin [" + getName() + "], [" + getAge() + "] Jhre alt und unterrichte [" + subject + "]." );
	}
}
