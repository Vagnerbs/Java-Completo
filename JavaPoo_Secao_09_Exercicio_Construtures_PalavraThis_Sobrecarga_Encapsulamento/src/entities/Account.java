package entities;

public class Account {

	// Account: representa uma conta bancária com número, titular e saldo
	private int number; // account number
	private String holder; // account holder
	private double balance; // account balance

	/*------Construtores-----*/
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		/*
		 * O construtor delega o depósito ao método deposit, centralizando a regra de
		 * negócio e facilitando futuras alterações
		 */
		deposit(initialDeposit);
	}

	/*------Métodos-----*/
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	/*------Getters & Setters-----*/
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account "
				+ this.number
				+ ", Holder: "
				+ this.holder
				+", Balance: $ "
				+ String.format("%.2f", this.balance);	
	}
	
}
