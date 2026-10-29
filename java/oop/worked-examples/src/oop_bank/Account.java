package oop_bank;

public class Account {
	private int accountNo;
	private String name;
	private float amount;
	
	// Den neuen Eintrag in die vorhandene Datenstruktur aufnehmen.
	public void insert (int a, String n, float amt) { // Die grundlegenden Kontodaten im Konstruktor übernehmen.
		this.accountNo = a;
		this.name = n;
		this.amount = amt;
	}
	// Den Betrag nach den vorhandenen Bedingungen zum Konto hinzufügen.
	public void depoist (float amt) {
		this.amount = this.amount + amt; // Den eingezahlten Betrag zum bisherigen Kontostand addieren.
		System.out.println(amt + " deposited");
	}
	// Den Betrag nach der vorhandenen Kontoprüfung abheben.
	public void withdraw (float amt) {
		if (amount < amt) {
			System.out.println("الرصيد غير كافي");
		} else {
			this.amount = this.amount - amt;
			System.out.println(amt + " withdrawn");
		}
	}
	// Den aktuellen Kontostand anzeigen.
	public void checkBalance() {
		System.out.println("Balance = " + this.amount);
	}
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getAccountNo() {
		return accountNo;
	}
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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
	public float getAmount() {
		return amount;
	}
	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	
}
