package easy;

import java.util.*;

public class FastingHours {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		String[] startTimes = { "04:30", "04:29", "04:28" };
		String[] endTimes = { "18:30", "18:31", "18:32" };
		double susu = calculateTotalFastingTime(startTimes, endTimes);
		System.out.println(susu);

	}

	// Die Zeitangaben umrechnen und die gesamte Zeitspanne bestimmen.
	public static double calculateTotalFastingTime(String[] startTimes, String[] endTimes) {
		double[] fastDayhour = new double[startTimes.length];
		double[] fastDayminute = new double[startTimes.length];
		double[] dayHourMinute = new double[startTimes.length];
		double fastDaysSum = 0;

		for (int i = 0; i < startTimes.length; i++) {
			String[] startParts = startTimes[i].split(":");
			/* split(":") zerlegt eine Uhrzeit in Stunden an Index 0 und Minuten an Index 1. */
			String[] endParts = endTimes[i].split(":");
			fastDayhour[i] = Integer.parseInt(endParts[0]) - Integer.parseInt(startParts[0]); // Index 0 enthält die Stunden.
																								// Für die Stunden wird derselbe Index 0 verwendet.
			fastDayminute[i] = Integer.parseInt(endParts[1]) - Integer.parseInt(startParts[1]); // Index 1 enthält die Minuten.
																								// Für die Minuten wird derselbe Index 1 verwendet.
			dayHourMinute[i] = fastDayhour[i] + fastDayminute[i] / 60.0; // Minuten durch 60 teilen, um den Stundenanteil zu erhalten.
																							// Stunden und Minuten sind unterschiedliche Einheiten.
																							// Vor einer Addition beide Angaben in dieselbe Einheit umrechnen.
																							// Die umgerechneten Zeitanteile anschließend zusammenfassen.
			fastDaysSum += dayHourMinute[i];
		}
		return fastDaysSum;

	}

}
