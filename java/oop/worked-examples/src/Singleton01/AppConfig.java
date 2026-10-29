package Singleton01;

public class AppConfig {
	
    // Dieses Feld speichert die einzige Instanz.
	static private AppConfig instance = null;
	private String appName = "MyApp";
	
	 // Der private Konstruktor verhindert externe new-Aufrufe.
	private AppConfig () {
		
	}
	
	// Bei jedem Aufruf dieselbe Instanz zurückgeben.
	public static AppConfig getInstance() {
		if (instance == null ) {
			instance = new AppConfig();
		}
		return instance;
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getAppName () {
		return appName;
	}
}
