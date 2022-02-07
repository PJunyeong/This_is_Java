package sec09.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("작업 처리 요청");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <=10; i ++) {
					sum += i;
				}
				System.out.println("처리 결과: " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		// future을 통해서 get 호출한다.
		
		try {
			future.get();
			System.out.println("작업 처리 완료");
		} catch (InterruptedException e) {
			System.out.println("예외 발생" + e.getMessage());
		} catch (ExecutionException e) {
			System.out.println("예외 발생" + e.getMessage());
		}
		// get을 토해 blcoking 된다. UI/UX에서 호출하지 않도록 하자.
		executorService.shutdown();
		
		
	}

}
