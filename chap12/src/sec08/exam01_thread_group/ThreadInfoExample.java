package sec08.exam01_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for (Thread thread: threads) {
			System.out.print("Thread name: " + thread.getName());
			// reference handler, main, autosavethread, finalizer, notification thread 등 실행 중
			System.out.print(" Daemon? :" + thread.isDaemon());
			System.out.println(" Group: " + thread.getThreadGroup().getName());
		}
	}

}
