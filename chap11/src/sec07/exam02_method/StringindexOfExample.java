package sec07.exam02_method;

public class StringindexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹ� ����");
		} else {
			System.out.println("�ڹ� ����");
		}
	}

}
