package bankAccount;

public class BankAccount {
	private String name;
	private int accountNumber;
	private float balance;

	// Den Betrag zum Kontostand hinzufügen.
	public void deposit(float amount) {
		if (amount <= 0) {
			System.out.println("ايداع غير ناجح ");
		} else {
			this.balance = this.balance + amount;
			System.out.println(amount + " " + "wurde eingezahlt");
		}
	}

	public BankAccount(String name, int accountNumber, float balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		// Der Konstruktor initialisiert das neue Objekt.
	}

	// Den Betrag nach der vorhandenen Kontoprüfung abheben.
	public void withdraw(float amount) {
		if (amount > balance) {
			System.out.println("Not enough money!");
		} else {
			this.balance = this.balance - amount;
			System.out.println(amount + " " + "wurde abgehoben");
		}
	}

	// Die Informationen dieses Objekts ausgeben.
	public void displayInfo() {
		System.out.println("Kontoinhaber: " + name);
		System.out.println("IBAN: " + accountNumber);
		System.out.println("Verfügbares Guthaben: " + balance);
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setName(String name) {
		this.name = name;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getAccountNumber() {
		return accountNumber;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public float getBalance() {
		return balance;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
