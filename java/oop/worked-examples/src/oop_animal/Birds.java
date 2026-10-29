package oop_animal;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Birds extends Animal {
	public Birds(String name) {
		super(name);
	}

	@Override
		// Die für diesen Objekttyp vorgesehene Bewegung ausführen.
		public void move() {
			System.out.println("تشير تشير");
		}

	@Override
		// Den zum Tier gehörenden Laut ausgeben.
		public void makeSound() {
		System.out.println("يطير ثم يطيح");
		}
}
