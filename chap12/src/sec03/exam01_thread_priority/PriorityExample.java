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
			// thread_10�� MAX_PRIORITY�̹Ƿ� 10�� ���� ���� ������.
			// ���� JVM�� �ڵ����� (������ PRIORITY�� �־����Ƿ�) ������ THREAD�� ����Ѵ�.
			
			}
		}
	}
