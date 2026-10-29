package oop_animal;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// Eine abstrakte Klasse kann gemeinsame Teile vorgeben und offene Methoden lassen.
	// Von einer abstrakten Klasse lässt sich kein direktes Objekt erzeugen.
	// Eine abstrakte Methode hat keinen Methodenrumpf; die Unterklasse implementiert sie.
	public abstract void move();

	public abstract void makeSound();

	// Die gespeicherten Informationen in der Konsole ausgeben.
	public void printInfo() {
		System.out.println("Name: " + name);
		move();
		makeSound();
	}
}
