package sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread =new SumThread();
		sumThread.start();
		// run �޼ҵ带 �����ϰ� sum�� ������Ų��.
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		// sumThread ����� ���� ������ main �����带 ���� ���·� �����.
		System.out.println("sum: " + sumThread.getSum());
		// ���� ���� �� ����� �߱� ������ ����� ��� sum�� ��µ��� �ʴ´�.
		
	}

}
