package Exercise03;

public abstract class Vehicle {
	int model;
	double speed;

	abstract public void move();

	public Vehicle(int model, double speed) {
		this.model = model;
		this.speed = speed;
	}
}
