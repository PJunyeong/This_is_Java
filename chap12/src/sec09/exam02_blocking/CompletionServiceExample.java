package sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
	);
		CompletionService<Integer> completionService =
				new ExecutorCompletionService <Integer>(executorService);
		System.out.println("작업 처리 요청");
		for (int i =1; i <=3; i++) {
			completionService.submit(new Callable<Integer>() {
				// 작업 큐에 들어갔다고 해서 어떤 Callable 객체가 먼저 처리될지 모른다.
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i =1; i <=10; i ++) {
						sum+=i;
					}
					return sum;
				}
				
			});
		}
		
		System.out.println("처리 완료된 작업을 확인");
		// 완료된 작업을 알아낸 뒤 이를 종료하자.
		
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				while(true) {
				try {
					Future<Integer> future = completionService.take();
					int value = future.get();
					// 이 get은 즉시 결과값을 (take로 가져왔으므로) 리턴
					System.out.println("처리 결과: " + value);
				} catch (Exception e) {
					break;
				}	
				}			
				// take 메소드를 통해 blocking을 한다.
			}});
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		executorService.shutdownNow();
	}
	

}
