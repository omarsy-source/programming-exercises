package oop2;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Circle c1 = new Circle(), c2 = new Circle();
		c1.setRadius(3.0);
		c1.setColor("Black");
		System.out.println(c1.toString() + " " +"C1 Area = " + " " + c1.getArea());
		c2.setRadius(2.0);
		c2.setColor("Blue"); 
		System.out.println(c2.toString() + " " + "C2 Circumference = " + " " + c2.getCircumference());
		

	}

}
