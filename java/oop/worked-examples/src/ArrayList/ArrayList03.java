package ArrayList;
import java.util.*;
public class ArrayList03 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// Aus einer Liste mit wiederholten Zahlen jede Zahl nur einmal übernehmen.
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4, 9));
		ArrayList<Integer> list2 = new ArrayList<>();
		for (Integer num : list) {
		    if (!list2.contains(num)) {
		        list2.add(num);
		    }
		}

		System.out.println(list2);
		
	}

}