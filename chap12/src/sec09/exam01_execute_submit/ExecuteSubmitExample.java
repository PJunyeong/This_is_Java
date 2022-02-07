package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample{

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i <10; i++) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
				int poolSize = threadPoolExecutor.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.print("total # of threads: " + poolSize + " ");
				System.out.println(threadName + " works");
				int value = Integer.parseInt("��");
				// ���� ó�� �� �����带 ��� ó���� ������ execute �Ǵ� submit
			}
		};
		
		//executorService.execute(runnable);
		executorService.submit(runnable);
		// -> submit�� �״�� �����ϹǷ� ���� ȿ������
		Thread.sleep(10);
		}
		// 10���� �۾��� ������Ǯ �� �����尡 ó����
		executorService.shutdown();
		
	}

}
