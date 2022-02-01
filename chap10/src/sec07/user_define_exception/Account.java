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
			// throw는 예외를 발생시킨다.
			// throws를 통해 예외를 '넘긴다'.
		}
		this.balance -= money;
	}
}
