package oop2;

public class Circle {
	private double radius; // this.radius bezeichnet das Feld; radius bezeichnet den gleichnamigen Parameter.
	private String color;
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getRadius() {
		return radius;
	}
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getColor() {
		return color;
	}
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setColor(String color) {
		this.color = color;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getArea() {
		return Math.PI * radius * radius; // mathe.PI = 3.14
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getCircumference () {
		return Math.PI * 2 * radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
