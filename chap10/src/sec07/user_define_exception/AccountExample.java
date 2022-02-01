package sec07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		System.out.println(account.getBalance());
		try {
			account.withdraw(10011);
			System.out.println(account.getBalance());
		} catch(BalanceInsufficientException e) {
			System.out.println("Exception occurs");
			System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.out.println(e.toString());
			//e.toString()은 Exception을 String으로 간단하게 표현해준다.
		}
	}

}
