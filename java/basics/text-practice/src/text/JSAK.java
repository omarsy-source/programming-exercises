package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSAK {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		try {
		readFile(in);
		} catch (FileNotFoundException error ) {
			System.out.println(error.getMessage());
		}

	}
	// Die vorhandene Datei öffnen und ihre Daten einlesen.
	public static void readFile(Scanner in) throws FileNotFoundException {
		System.out.println("Dateiname eingeben:");
		String fileName = in.next();
		File file = new File(fileName);
		
		if (file.exists()) {
			 in = new Scanner (file);
			int quantity = getQuantity(in);
			System.out.println("Anzahl der Einträge: " + quantity);
			in = new Scanner(file);
			double[][] valueList = createList(in,quantity);
			printList(valueList);
		} else {
			String messageValue = "Die Datei " + fileName + "wurde nich gefunden";
			System.out.println(messageValue);
		}
		
	}
	// Die eingelesenen Werte in einer Liste bzw. einem Array sammeln.
	public static double [][] createList (Scanner in , int n) {
		double [][] valueList = new double [n][2];
		int lineNumber = 0;
		while (lineNumber < n && in.hasNextDouble()) {
			double studentNumber = in.nextDouble();
			valueList[lineNumber][0] = studentNumber;
			double note = in.nextDouble();
			valueList[lineNumber][1] = note;
			lineNumber = lineNumber + 1;
			
		}
		return valueList;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static int getQuantity (Scanner in) {
		int n = 0;
		while (in.hasNextLine()) {
			String lineContent = in.nextLine();
			if (lineContent.length() > 0 ) {
				n = n +1;
			}
		}
		return n;
	}
	// Die gespeicherten Listenelemente ausgeben.
	public static void printList(double [][] valueList) {
		for (double[] entry : valueList) {
			System.out.println(Math.round(entry[0]) + "\t" + entry[1]);
		}

	}

}
