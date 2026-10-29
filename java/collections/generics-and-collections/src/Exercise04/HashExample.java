package Exercise04;

import java.io.*;
import java.util.*;

public class HashExample {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Map<String, String> myHashMap = new HashMap<>();
		myHashMap.put("Language", "de");
		myHashMap.put("Theme", "dark");
		myHashMap.put("Timeout", "30");

		Properties p = new Properties();
		p.putAll(myHashMap);

		try (FileOutputStream out = new FileOutputStream("config.properties")) {
			p.store(out, "Application Settings");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Properties loaded = new Properties();
		try (FileInputStream in = new FileInputStream("config.properties")) {
			loaded.load(in);
			System.out.println(loaded);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
