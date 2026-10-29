package Exercise03;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {

		String[] names = { "Anna", "Ben", "Clara" };
		int[][] grades = { { 85, 90, 78 }, { 92, 88, 95 }, { 70, 65, 80 }};
		StudentGradeCalculator calc = new StudentGradeCalculator(names, grades);
		for (int i = 0; i < names.length; i++) {
			System.out.println("Durchschnitt␣" + names[i] + ":␣" + calc.calculateAverage(i));
		}
		System.out.println("Beste*r␣Student*in:␣" + calc.getBestStudent());
	}

}
