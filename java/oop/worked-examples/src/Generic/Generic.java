package Generic;

public class Generic<A, B> {// Der Typparameter T legt den gemeinsamen Datentyp dieses Objekts fest.
	private A a;
	private B b;

	public Generic(A a, B b) {
		this.a = a;
		this.b = b;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public A getA() {
		return a;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public B getB() {
		return b;
	}
	// Den aktuellen Inhalt anzeigen.
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}
	// Den größten Wert in den übergebenen Daten suchen.
	public static Comparable findMax (Comparable  a[]) {
		Comparable max = a[0];
		for (int i = 0 ; i < a.length ; i++) {
			if (a[i].compareTo(max) > 0) {
				max = a[i];
			} 
			
			
		}
		return max;
	}
}
