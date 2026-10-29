package Exercise03;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Car extends Vehicle implements Refuelabe {
	public Car(int model, double speed) {
		super(model, speed);
	}

	@Override
	// Den Tank nach den vorhandenen Bedingungen auffüllen.
	public void refuel() {
		System.out.println("Diesel");
	}

	@Override
	// Die für diesen Objekttyp vorgesehene Bewegung ausführen.
	public void move() {
		System.out.println("Model des Autos " + super.model);
		System.out.println("Die Speed ist " + super.speed);

	}

}
