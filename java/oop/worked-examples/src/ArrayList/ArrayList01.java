package ArrayList;
import java.util.*;
public class ArrayList01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> nameList = new ArrayList<>();
		nameList.add("Omar");
		nameList.add("Mohammed");
		nameList.add("Khalid");
		nameList.add("Lea");
		nameList.add("mia");
		for (String name : nameList) {
			if (name.length() > 4) {
				System.out.println(name);
			}
		}
	}

}
