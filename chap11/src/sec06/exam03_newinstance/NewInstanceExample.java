package sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			try {
				Action action = (Action) clazz.newInstance();
				action.execute();
				//���ڿ��� ���� ����ȴ�.
				//clazz newInstance()�� object Ŭ������ �����Ѵ�.
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
