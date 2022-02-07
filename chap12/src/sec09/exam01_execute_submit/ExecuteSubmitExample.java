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
				int value = Integer.parseInt("삼");
				// 예외 처리 시 스레드를 어떻게 처리하 것인지 execute 또는 submit
			}
		};
		
		//executorService.execute(runnable);
		executorService.submit(runnable);
		// -> submit은 그대로 재사용하므로 보다 효율적임
		Thread.sleep(10);
		}
		// 10개의 작업을 스레드풀 내 스레드가 처리함
		executorService.shutdown();
		
	}

}
