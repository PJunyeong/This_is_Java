package sec07.user_define_exception;

public class BalanceInsufficientException extends Exception{
	//Runtime Exception �� extends ���
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
