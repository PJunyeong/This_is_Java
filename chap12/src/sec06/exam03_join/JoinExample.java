package sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread =new SumThread();
		sumThread.start();
		// run 메소드를 실행하고 sum을 누적시킨다.
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		// sumThread 계산이 끝날 때까지 main 스레드를 정지 상태로 만든다.
		System.out.println("sum: " + sumThread.getSum());
		// 실행 도중 값 출력을 했기 때문에 기대한 결과 sum이 출력되지 않는다.
		
	}

}
