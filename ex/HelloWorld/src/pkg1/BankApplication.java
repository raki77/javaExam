package pkg1;

public class BankApplication {
	
	Account[] acc;
	
	public BankApplication() {
		acc = new Account[100];		
	}
	
	public Account[] getAccount() {
		return acc;
	}
	
	public boolean setAccount(int idx, Account accPrm) {
		try {
			acc[idx] = accPrm;
			return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
