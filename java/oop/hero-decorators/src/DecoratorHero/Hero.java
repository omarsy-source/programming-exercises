package DecoratorHero;

// Schnittstelle: legt gemeinsame Methoden für mehrere Implementierungen fest.

public interface Hero {
	// Das Interface legt die gemeinsamen Methoden aller Implementierungen fest.
	// Die gemeinsame Schnittstelle verbindet Basisobjekt und Dekoratoren.
	int getHP();
    int getAttack();
    int getDefense();
    String getName();
}
