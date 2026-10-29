package general;

public abstract  class Person {
	protected String name;
	protected int age;
	public Person (String name , int agr) {
		this.name =name;
		this.age = age;
	}
	public abstract String getRole ();
	
}
