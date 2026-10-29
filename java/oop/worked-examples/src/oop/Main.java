package oop;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Student boo = new Student("Ali" , 24 , 53.5);
		boo.printInfo();
		System.out.println(boo.isPassed());

	}

}
