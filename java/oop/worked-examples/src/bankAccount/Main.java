package bankAccount;

public class Main {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		// BankAccount Exercise1 = new BankAccount();
		// Exercise1.setName("Omar ");
		// Exercise1.setAccountNumber(147859);
		// Exercise1.setBalance(987);
		// Exercise1.withdraw(600);
		// Ein Objekt ohne zusätzliche Konstruktorargumente erzeugen.

		BankAccount Exercise1 = new BankAccount("Omar", 147859, 987); // Ein Objekt über den Konstruktor mit Anfangswerten erzeugen.
		Exercise1.withdraw(600);
		Exercise1.deposit(200);
		Exercise1.displayInfo();
		System.out.println(Exercise1.getBalance() + " " + "Konto Infos " + Exercise1.toString());

	}

}
