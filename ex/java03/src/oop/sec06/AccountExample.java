package oop.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(10000);
		System.out.println("잔고: " + account.getBalance());		
		
		try {
			account.withdraw(30000);
		}
		catch (InsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		System.out.println("잔고: " + account.getBalance());
	}

}
