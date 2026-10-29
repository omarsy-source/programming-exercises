package Exercise04;

import java.util.ArrayList;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Plugin p1 = new BackupPlugin("DatabaseBackupPlugin");
		Plugin p2 = new BackupPlugin("PhotoBackupPlugin");

		Plugin p3 = new UpdatePlugin("SecurityUpdatePlugin");
		Plugin p4 = new UpdatePlugin("DriverUpdatePlugin");

		ArrayList<Plugin> obj = new ArrayList();
		obj.add(p1);
		obj.add(p2);
		obj.add(p3);
		obj.add(p4);

		for (Plugin p : obj) {
			System.out.println(p.getName());
			p.execute();
		}

	}

}
