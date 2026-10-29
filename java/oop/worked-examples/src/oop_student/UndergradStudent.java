package oop_student;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class UndergradStudent extends Student {
	private String major;
	
	public UndergradStudent (String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
	@Override
	// Die gespeicherten Informationen in der Konsole ausgeben.
	public void printInfo() {
		super.printInfo();
		System.out.println("Major : " + this.major);
	}
}
