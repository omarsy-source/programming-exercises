package oop_animal;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Cats extends Animal {
	public Cats(String name) {
		super(name);
	}

	@Override
	// Die für diesen Objekttyp vorgesehene Bewegung ausführen.
	public void move() {
		System.out.println("Mewwwwwww");
	}

	@Override
	// Den zum Tier gehörenden Laut ausgeben.
	public void makeSound() {
		System.out.println("يمشي بخفة");
	}
}
