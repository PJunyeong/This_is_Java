package sec05.exam01_exit;

public class ExitExample {

	@SuppressWarnings({ "removal", "deprecation" })
	public static void main(String[] args) {
		
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit (int status) {
				if (status != 5) {
					throw new SecurityException();
				}
				// SecurityManager에서 status를 체크해서 종료 여부 결정하는 메소드로 override!
			}
		});
		for (int i = 0; i <10; i++) {
			System.out.println(i);	
			try {
				System.exit(i);
			} catch (SecurityException e) {}
		}
	}

}
