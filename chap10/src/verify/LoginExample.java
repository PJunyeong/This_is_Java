package verify;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("ID not found");
		}
		
		if (!password.equals("12345")) {
			throw new WrongPasswordException("PW not found");
		}
	}

}
