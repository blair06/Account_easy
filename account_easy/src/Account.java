public class Account{
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	private String Name;
	
	private int balance;
	
	public String getName() {
		return this.Name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setName (String Name) {
		this.Name = Name;
	}
	
	public void setBalance (int balance) {
		if (balance <  MIN_BALANCE || balance >  MAX_BALANCE) {
			return;
		} else {
			this.balance = balance;
		}
	}
}