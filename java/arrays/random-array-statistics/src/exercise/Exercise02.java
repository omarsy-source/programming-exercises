package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise02 {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbersValue = null;
		// null bedeutet, dass das Array noch nicht erzeugt wurde.

		boolean repeat = true;
		do {
			System.out.println("Bitte auswählen: 1, 2 oder 3 ");
			int choice = scn.nextInt();
			switch (choice) {
			case 1:
				numbersValue = createArray(scn);
				System.out.println("Array erstellt: " + Arrays.toString(numbersValue));
				break;
			case 2:
				if (numbersValue == null)
					System.out.println(" Um ein Array zu erstteln, tippen Sie die 1 ein ");
				else {
					int sum = calculateSum(numbersValue);
					System.out.println(" Summe = " + sum);
					break;
				}
				/*
				 * In diesem Java-Programm wird numbersValue == null verwendet, um zu prüfen, ob das
				 * Array numbersValue bereits erstellt wurde oder nicht. Wenn numbersValue noch null ist,
				 * bedeutet das, dass der Benutzer noch keine Zahlen eingegeben bzw. generiert
				 * hat.
				 */
				if (numbersValue == null) {
					System.out.println("Bitte zuerst die Option 1 wählen, um ein Array zu erstellen.");
				}

			case 3:
				if (numbersValue == null)
					System.out.println(" Um ein Array zu erstteln, tippen Sie die 1 ein ");

				else {
					double avg = calculateMean(numbersValue);
					System.out.println(" Durchschnitt = " + avg);
					break;
				}

			default:
				System.out.println(" 404 ");
				break;
			}
		} while (repeat);

		scn.close();

	}

	// Ein Array mit der gewünschten Anzahl von Werten erzeugen.
	public static int[] createArray(Scanner scn) {
		System.out.println("Bitte geben Sie die Anzahl der Zahlen ein: ");
		int quantity = scn.nextInt();
		int[] numbersValue = new int[quantity];

		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(1, 10);
		System.out.println("Die Zahl " + randomNumber + " wurde generiert.");
		for (int i = 0; i < quantity; i++) {
			numbersValue[i] = randomGenerator.nextInt(1, 10);
		}
		return numbersValue;

	}

	// Alle Zahlen zur Summe addieren.
	public static int calculateSum(int[] numbersValue) {
		int totalSum = 0;
		for (int i = 0; i < numbersValue.length; i++) {
			totalSum += numbersValue[i];
		}
		return totalSum;
	}

	// Den Mittelwert aus Summe und Anzahl berechnen.
	public static double calculateMean(int[] numbersValue) {
		double mean = 0;
		mean = ((double) calculateSum(numbersValue) / numbersValue.length);
		return mean;
	}

}
