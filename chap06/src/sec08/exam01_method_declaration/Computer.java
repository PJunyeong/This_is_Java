package sec08.exam01_method_declaration;

public class Computer {
	public int sum1(int[] values) {
		// 매개 변수의 수를 사전에 알 수 없을 때 배열로 선언한다.
		int sum = 0;
		for (int value: values) {
			sum += value;
		}
		return sum;
	}
	public int sum2(int ... values) {
		int sum = 0;
		for (int value: values) {
			sum += value;
		}
		return sum;
	}
}
