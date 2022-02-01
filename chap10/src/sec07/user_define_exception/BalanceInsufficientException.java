package sec07.user_define_exception;

public class BalanceInsufficientException extends Exception{
	//Runtime Exception ½Ã extends »ç¿ë
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
