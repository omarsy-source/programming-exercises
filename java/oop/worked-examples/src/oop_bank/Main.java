package oop_bank;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		Account Exercise1 = new Account(), Exercise2 = new Account(), Exercise3 = new Account();
		Exercise1.insert(4451238, "Mohammed", 10000);
		Exercise1.depoist(12000);
		Exercise1.withdraw(2000);
		System.out.println(Exercise1.toString());
		System.out.println(" ");
		Exercise2.insert(9563145, "Belal", 100);
		Exercise2.depoist(50);
		Exercise2.withdraw(160);
		System.out.println(Exercise2.toString());
		System.out.println(" ");
		Exercise3.insert(4451238, "Ahmed", 500);
		Exercise3.depoist(550);
		Exercise3.withdraw(10);
		System.out.println(Exercise3.toString());
	}

}
