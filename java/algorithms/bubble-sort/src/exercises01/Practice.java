package exercises01;

import java.util.Scanner;

public class Practice {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		countHighAlerts(arr, 5);
	    System.out.println(countHighAlerts(arr, 5));
	   
	
	}


// Die Einträge zählen, deren Wert die angegebene Grenze überschreitet.
public static int countHighAlerts(int[] alerts, int threshold) {
	    threshold = 5 ;
	    int sum = 0;
		    for (int i = 1 ; i < alerts.length ; i++) {
		        if (alerts [i] >= threshold ) {
		        	sum +=1;
		        }
		    }
		    return (sum);
		

		}

	}
