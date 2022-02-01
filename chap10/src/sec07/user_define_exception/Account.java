package sec07.user_define_exception;

public class Account {
	private long balance;
	public Account() {}
	public long getBalance() {
		return this.balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if (this.balance < money) {
			throw new BalanceInsufficientException("balance is smaller");
			// throw�� ���ܸ� �߻���Ų��.
			// throws�� ���� ���ܸ� '�ѱ��'.
		}
		this.balance -= money;
	}
}
