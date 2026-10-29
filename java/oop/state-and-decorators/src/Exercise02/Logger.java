package Exercise02;

import java.time.LocalDateTime;

public class Logger {
	static private Logger instance = null;

	private Logger() {

	}

	// Eine Nachricht mit dem verwendeten Logger verarbeiten.
	public void log(String message) {
		System.out.println(message + " " + LocalDateTime.now());
		// LocalDateTime.now() ist für den Zeitstampel
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
}
