package oop_ex_1_6;

public class Account {
	String id;
	String name;
	int balance;
	static int count;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getID() {
		return id;

	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance = balance + amount;
		return balance;
	}

	public int debit(int amoutn) {
		if (amoutn <= balance) {
			balance = balance - amoutn;
		} else {
			System.out.println("Amount exeeded balance");
		}
		return balance;
	}

	public void transferTo(Account acc2, int sent) {
		if (acc2.balance <= balance) {
			int temp = balance;
			balance = sent + acc2.balance;
			acc2.balance = temp - sent;
		} else {
			System.out.println("Amount exeeded balance");

		}
	}

	public String toString() {
		return count + "Account[id=" + id + "name=" + name + ",balance" + balance + "]";
	}

}
