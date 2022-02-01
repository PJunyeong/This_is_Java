package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for (float x = 0.1F; x<=1.0F; x+=0.1F) {
			System.out.println(x);
		}
		// float 변수를 for 문으로 반복하면 정밀도로 인해 정확한 방식의 Count할 수 없다.
	}

}
