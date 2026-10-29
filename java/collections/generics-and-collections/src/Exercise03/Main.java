package Exercise03;
import java.util.ArrayList;
import java.util.List; 


public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		List<Beer> beers = new ArrayList<>();
        beers.add(new Beer()); // Elemente mit add() in die Liste einfügen.
        beers.add(new Beer());

        List<Juice> juices = new ArrayList<>();
        juices.add(new Juice());

        Drink.describeAll(beers); 
        Drink.describeAll(juices); 
	}

}
