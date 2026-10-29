package Singleton01;

public class Logger {
	static private Logger instance = null;
	private int count = 0;
	private Logger () {
		
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static Logger getInstace() {
		if ( instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	// Eine Nachricht mit dem verwendeten Logger verarbeiten.
	public void log(String message) {
		count++;
		System.out.println("[" + count + "] " + message);
		
	}
}
