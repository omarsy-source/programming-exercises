package exercise;


import java.util.*; 

public class Exercise01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner scn = new Scanner ( System.in);
		int[] x = createArray(scn);
		System.out.println(calculateSum(x));
		System.out.println(Arrays.toString(x));
		double mean = calculateMean(x);
		System.out.println(mean);
		  scn.close(); 

	}
	// Ein Array mit der gewünschten Anzahl von Werten erzeugen.
	public static int[] createArray(Scanner scn) { 
		  System.out.println("Bitte geben Sie die Anzahl der Zahlen ein: "); 
		  int quantity =scn.nextInt(); // Die gewünschte Anzahl vom Benutzer einlesen.
		  int[] numbersValue = new int[quantity]; // Die erzeugten Zufallszahlen im Array speichern.
		  
		  Random randomGenerator = new Random(); 
		  int randomNumber = randomGenerator.nextInt(1, 10); 
		  System.out.println("Die Zahl " + randomNumber + " wurde generiert."); 
		  for ( int i = 0; i < quantity; i++) {
			  numbersValue[i]= randomGenerator.nextInt(1, 10);
		  }
		  return numbersValue;

}
	// Alle Zahlen zur Summe addieren.
	public static int calculateSum(int[] numbersValue) { 
		  int totalSum = 0; 
		  for ( int i = 0; i < numbersValue.length ; i++) {
			  totalSum+= numbersValue[i];
		  }
		  return totalSum;
}
	// Den Mittelwert aus Summe und Anzahl berechnen.
	public static double calculateMean(int[] numbersValue) { 
		  double mean = 0; 
		  mean = ((double) calculateSum(numbersValue)/numbersValue.length);
		  return mean;
	}
	
}
