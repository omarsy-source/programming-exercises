package oop;

public class Student {

		private String name;
		private  int age;
		private  double grade;
		public Student ( String n, int a , double g) {
			name = n;
			age = a;
			grade = g;
		}
		// Die gespeicherten Informationen in der Konsole ausgeben.
		public void printInfo() {
			System.out.println("Name: " + name + " "+ "Age: " + age + " "+ "grade: " + grade);
		}
		// Die zugehörige Zustandsbedingung prüfen.
		public boolean isPassed() {
			if ( grade > 50 ) {
				return true;
			} else {
				return false;
			}
		}
	}


