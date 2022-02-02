package sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			try {
				Action action = (Action) clazz.newInstance();
				action.execute();
				//문자열에 따라 실행된다.
				//clazz newInstance()는 object 클래스를 리턴한다.
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
