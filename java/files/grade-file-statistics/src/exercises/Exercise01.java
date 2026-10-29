package exercises;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise01 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {

		try {
	        int quantity = getQuantity();           
	        double[][] notes = createList();
	        calculateMean(notes); 
		} catch (FileNotFoundException e) {
			System.out.println("404");
		}

	}

	// Die vorhandene Datei öffnen und ihre Daten einlesen.
	public static void readFile() throws FileNotFoundException {
		String fileName = "NotenListe.txt";

		java.io.File file = new java.io.File(fileName);

		java.util.Scanner o = new java.util.Scanner(file);

		if (file.exists()) {
			int quantity = getQuantity();
			System.out.println("ِAnzahl der Teilnehmender " + quantity);
		} else {
			System.out.println("Die Datei " + fileName + " wurde nicht gefunden!");
		}
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static int getQuantity() throws FileNotFoundException {
		java.util.Scanner o = new java.util.Scanner(new java.io.File("NotenListe.txt"));

		int counter = 0;
		while (o.hasNextLine()) {
			o.nextLine();
			counter++;
		}
		System.out.println(counter);
		return counter;
	}

	// Die eingelesenen Werte in einer Liste bzw. einem Array sammeln.
	public static double[][] createList() throws FileNotFoundException {
		Scanner o = new Scanner(new java.io.File("NotenListe.txt"));
		int quantity = getQuantity();
		double gradeValues[][] = new double[quantity][5];
		for (int i = 0; i < quantity; i++) {
			double studentNumber = o.nextDouble();
			double note = o.nextDouble();
			gradeValues[i][0] = studentNumber;
			gradeValues[i][1] = note;

		}
		return gradeValues;

	}

	// Den Mittelwert aus Summe und Anzahl berechnen.
	public static void calculateMean(double[][] gradeValues) throws FileNotFoundException {
		double totalSum = 0;
		int count = 0;
		for (int i = 0; i < gradeValues.length; i++) {
			totalSum = totalSum + gradeValues[i][1];
			count++;
		}
		double mean = (totalSum / count);
		System.out.println(" durchschnitt  " + mean);
	}

}
