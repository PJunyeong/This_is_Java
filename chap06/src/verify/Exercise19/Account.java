package verify.Exercise19;

public class Account {
	private int balance;
	// 외부 접근 막고 메소드로만 조작 가능하도록 한다.
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {return;}
		this.balance = balance;
	}
	
	
}
