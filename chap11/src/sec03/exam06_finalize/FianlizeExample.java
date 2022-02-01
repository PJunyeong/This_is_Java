package sec03.exam06_finalize;

public class FianlizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for (int i=1; i <=50; i++) {
			counter = new Counter(i);
			counter = null;
			// null 곧바로 대입하면 Garbage 된다
			System.gc();
			// System에게 곧바로 garbage collector 실행해달라고 요구함
			// 무작위로 선택해서 finalize된다. 
		}
	}

}
