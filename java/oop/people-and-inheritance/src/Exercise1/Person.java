package Exercise1;

public class Person {
	protected String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getAge() {
		return age;
	}

	// Die Person mit ihren gespeicherten Angaben vorstellen.
	public void introduce() {
		System.out.println("Hallo, ich bin [" + name + "] und [" + age + "] Jahre alt.");
	}

}
