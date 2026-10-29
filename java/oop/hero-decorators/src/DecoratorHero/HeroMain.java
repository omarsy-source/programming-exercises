package DecoratorHero;

public class HeroMain {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Hero hero = new BaseHero();
		printStats(hero);
		
		hero = new ArmorDecorator (hero);
		printStats(hero);
		
		hero = new SwordDecorator (hero);
		printStats(hero);
		
		hero = new FireDecorator (hero);
		printStats(hero);
	}
	// Die aktuellen Spielwerte anzeigen.
	public static void printStats(Hero h) {
        System.out.println("=== " + h.getName() + " ===");
        System.out.println("HP:      " + h.getHP());
        System.out.println("Attack:  " + h.getAttack());
        System.out.println("Defense: " + h.getDefense());
        System.out.println(); 
    }

}
