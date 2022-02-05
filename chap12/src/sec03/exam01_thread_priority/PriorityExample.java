package sec03.exam01_thread_priority;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			Thread thread = new CalcThread("Thread_" + i);
				if (i!=10) {
					thread.setPriority(Thread.MIN_PRIORITY);
				} else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
			thread.start();
			// thread_10이 MAX_PRIORITY이므로 10이 가장 빨리 끝난다.
			// 이후 JVM이 자동으로 (동일한 PRIORITY로 주었으므로) 나머지 THREAD를 출력한다.
			
			}
		}
	}
