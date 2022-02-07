package sec09.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("�۾� ó�� ��û");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <=10; i ++) {
					sum += i;
				}
				System.out.println("ó�� ���: " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		// future�� ���ؼ� get ȣ���Ѵ�.
		
		try {
			future.get();
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (InterruptedException e) {
			System.out.println("���� �߻�" + e.getMessage());
		} catch (ExecutionException e) {
			System.out.println("���� �߻�" + e.getMessage());
		}
		// get�� ���� blcoking �ȴ�. UI/UX���� ȣ������ �ʵ��� ����.
		executorService.shutdown();
		
		
	}

}
