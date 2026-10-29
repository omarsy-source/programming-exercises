package Exercise03;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Car car = new Car(2017, 131.5);
		car.move();
		car.refuel();
		Vehicle bicycle = new Bicycle(2020, 32);
		bicycle.move();

	}

}
