package Generic;


public class Main {
	  // Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	  public static void main(String[] args) {
	Generic <Integer, Double> m = new Generic<>(10, 14.3);
	m.display();
	Integer[] arr = {3, 2, 5, 9, 78};
    System.out.println(Generic.findMax(arr));
	  }
}
