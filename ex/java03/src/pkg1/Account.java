package pkg1;

public class Account {
	
	public String accNum;
	public String accName;
	public int asset;
	
	public Account() {
		asset = 0;
		accName = "";
		accNum = "";
	}
	
	public void setBalance(int prm) {
		asset += prm;	
	}	
	public int getBalance() {
		return asset;
	}
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}	
	
	
}
