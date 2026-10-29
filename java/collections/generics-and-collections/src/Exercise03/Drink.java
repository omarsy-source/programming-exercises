package Exercise03;

import java.util.List;

public class Drink{

	    // Die Beschreibungen der gespeicherten Objekte ausgeben.
	    public static void describeAll(List<? extends Drink> drinks) {
	        for (Drink drink : drinks) {
	            System.out.println(drink.getClass().getName()); 
	        }
		
	}
}
