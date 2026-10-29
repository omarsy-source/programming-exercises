package oop_animal;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Dogs extends Animal {

	public Dogs(String name) {
		super(name);
	}

	@Override
	// Die für diesen Objekttyp vorgesehene Bewegung ausführen.
	public void move() {
		System.out.println("عوووو عوووو انا العووو ");

	}

	@Override
	// Den zum Tier gehörenden Laut ausgeben.
	public void makeSound() {
		System.out.println("انا بمشي مطوبز");

	}

}
