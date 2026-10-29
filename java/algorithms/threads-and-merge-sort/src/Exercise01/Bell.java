package Exercise01;

// Implementierung: erfüllt die Methoden der angegebenen Schnittstelle.

public class Bell implements Runnable{
		String messageValue;
		int hitCount;
		int sleep;
		
		public Bell (String messageValue , int hitCount , int sleep) {
			this.messageValue = messageValue;
			this.hitCount = hitCount;
			this.sleep = sleep;
		}

		


	@Override
	public void run() {
		for (int i = 0 ; i < hitCount ; i++) {
			System.out.println(messageValue + " .... ");
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
