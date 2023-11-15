package practice_java;

public class Bank {
		static int current_Balance=1000;
	public static void greeting() {
		System.out.println("hi vasu...welcome to the hdfc Bank");
		
	}
	
	public void deposit(int amount) {
		current_Balance=current_Balance+amount;
		System.out.println("amount deposited "+ amount+" succesfully...");
	}
	
	public static void withdrawl(int amount) {
		current_Balance=current_Balance-amount;
		System.out.println("amount withdrawl "+amount +" succesfully...");
	}
	
	public int  get_currentbal() {
		return current_Balance;
		
	}

	public static void main(String[] args) {
		Bank bank=new Bank();
		greeting();
		System.out.println("current balance : "+bank.get_currentbal());
		bank.deposit(450);
		System.out.println("current balance : "+bank.get_currentbal());
		withdrawl(500);
		System.out.println("current balance : "+bank.get_currentbal());
		
	}

}
