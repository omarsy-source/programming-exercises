package Exercise01;
public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Thread thread1 = new Thread (new Bell ("Ding", 5, 500));
		Thread thread2 = new Thread (new Bell ("Dong" , 900, 3000));
		thread1.start();
		thread2.start();
	}

}
