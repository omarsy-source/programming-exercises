package oop_student;

public class Student {
		protected String name;
		protected int age;
		public Student () {
			name = "غير معروف " ;
			age = 0;
		}
		public Student (String name , int age) {
			this.name = name;
			this.age = age;
		}
		// Die gespeicherten Informationen in der Konsole ausgeben.
		public void  printInfo() {
			System.out.println("Name des Students : " + this.name + " , " + "Alter des Students : " + this.age);
		}
}
