package Exercise03;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Bicycle extends Vehicle {
	public Bicycle(int model, double speed) {
		super(model, speed);
	}

	@Override
	// Die für diesen Objekttyp vorgesehene Bewegung ausführen.
	public void move() {
		System.out.println("Model des Fahrrad " + super.model);
		System.out.println("Die Speed ist " + super.speed);

	}

}
