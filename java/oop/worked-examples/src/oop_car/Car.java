package oop_car;

public class Car {
		protected String brand;
		protected double speed;
		public Car () {
			brand = "Toyota";
			speed = 0.0;
		}
		public Car (String brand, double speed) {
			this.brand = brand;
			this.speed = speed;
		}
		// Die Geschwindigkeit entsprechend der Methode erhöhen.
		public void accelerate(double increase) {
			speed += increase;
			System.out.println("Die neue Geschwindigkeit ist : " + speed);
		} 
}
