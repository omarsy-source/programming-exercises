package Exercise02;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class Countdown implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			if (i == 0 ) {
				System.out.println("Liftoff!");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
