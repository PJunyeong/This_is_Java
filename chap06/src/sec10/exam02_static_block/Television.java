package sec10.exam02_static_block;

public class Television {
	static String company ="Apple";
	static String model = "Mac";
	static String info;
	static int from1To10Sum;
	
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i =0; i <10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
	// static 블록으로 static 필드 초기화한다.
	
}
