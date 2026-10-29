package Exercise03;

public class StudentGradeCalculator {
	private String[] names;
	private int[][] grades;

	public StudentGradeCalculator(String[] names, int[][] grades) {
		this.names = names;
		this.grades = grades;
	}

	// Die gespeicherten Noten zu einem Durchschnitt zusammenfassen.
	public double calculateAverage(int studentIndex) {
		double sum = 0;
		for (int i = 0; i < grades[studentIndex].length; i++) { // = weglassen
			sum += grades[studentIndex][i];
		}
		return sum / grades[studentIndex].length;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getBestStudent() {
		double bestAvg = 0;
		String bestName = "";
		for (int i = 0; i < names.length; i++) {
			double avg = calculateAverage(i);
			if (avg > bestAvg) {
				bestAvg = avg;
				bestName = names[i];
				
			} 
		}
		System.out.println("Beste Note isssssssst :" + bestAvg);
		return bestName;
	}
}
