package easy;

import java.util.Arrays;

public class sumEid {
	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main (String[]args) {
	//
	 float [] buyPrices = {120,80,100};
	  float [] sellPrices = {130,90,110};
	  float a = calculateSacrificeProfit(buyPrices, sellPrices);
	  System.out.println(a);
	}
	    
	     // Den Gewinn aus den Kauf- und Verkaufswerten berechnen.
	     public static float calculateSacrificeProfit (float [] buyPrices , float [] sellPrices) {
	    	 float [] profitHead = new float [buyPrices.length];
	    	 float profit = 0;
	    	 for (int i = 0 ; i < buyPrices.length ; i++) {
	    		 profitHead [i] = sellPrices[i] - buyPrices[i];
	    		 profit += profitHead[i];
	 	      
	    	 }
	    	 return profit;
	   
	  }
	}

