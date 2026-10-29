package DecoratorHero;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class BaseDecorator implements Hero {
	// Gemeinsame abstrakte Basisklasse für alle Dekoratoren.
	// Das innere Objekt speichern und seine Methoden weiterleiten.
	// Unterklassen überschreiben nur die Werte, die sie verändern wollen.
	protected Hero inner;
	// Das innere Objekt kann der Basisheld oder ein weiterer Dekorator sein.
    public BaseDecorator(Hero inner) {
        this.inner = inner;
    }

    // Jeden Aufruf an das innere Objekt weitergeben.
    public int getHP()      { return inner.getHP(); }
    public int getAttack()  { return inner.getAttack(); }
    public int getDefense() { return inner.getDefense(); }
    public String getName() { return inner.getName(); }
}
