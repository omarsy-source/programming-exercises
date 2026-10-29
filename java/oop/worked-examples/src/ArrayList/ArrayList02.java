package ArrayList;
import java.util.*;
public class ArrayList02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// Summe und Mittelwert der Zahlen einer ArrayList berechnen.
		ArrayList <Integer> list = new ArrayList<>();
		list.add(12);
		list.add(95);
		list.add(123);
		double totalSum = 0;
		double avrg;
//		 for (int i = 0 ; i < list.size(); i++) {
//			 totalSum += list.get(i);
//		 }
//		 System.out.println(totalSum);
		 for (Integer li : list) {
				totalSum = totalSum+ li;
			}
		 System.out.println("Die Summe der Zahlen : " + totalSum);
		 avrg = totalSum / list.size();
		 System.out.println("Der Durchschnitt ist : " + avrg);
	}

}
