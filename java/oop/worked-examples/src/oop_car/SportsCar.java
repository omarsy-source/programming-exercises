package oop_car;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class SportsCar extends Car {
		private double maxSpeed = 300;
		public SportsCar (String brand, double speed) {
			super(brand, speed);
		} 
		@Override
		// Die Geschwindigkeit entsprechend der Methode erhöhen.
		public void accelerate (double increase) {
			if (speed + increase> maxSpeed) {
				System.out.println("تم تجاوز الحد الاقصى");
			} else {
				super.accelerate(increase);
			}
			
		}
}
