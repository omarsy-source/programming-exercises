package Singleton01;

public class LoggerMain {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Logger logger = Logger.getInstace();
		logger.log("Hallo");
		logger.log("Moin");
		logger.log("Wallah");

	}

}
