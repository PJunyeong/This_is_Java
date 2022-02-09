package sec05.exam01_bounded_type;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		// Number라는 추상 클래스를 상속하는 T
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
		// v1이 Doulbe 클래스 제공하는 compare 내장 함수를 사용한다.
	}
}
