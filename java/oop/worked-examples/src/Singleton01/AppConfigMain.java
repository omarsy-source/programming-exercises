package Singleton01;

public class AppConfigMain {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		/* Ein Singleton stellt immer dieselbe AppConfig-Instanz bereit. */
		
		
		AppConfig appConfig = AppConfig.getInstance();

		// getInstance() liefert eine AppConfig-Referenz für weitere Methodenaufrufe.
		// Die Referenz in einer Variablen speichern.
		System.out.println(appConfig.getAppName());
		// System.out.println(AppConfig.getInstance().getAppName()); // MyApp ✅

	}

}
