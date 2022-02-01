package sec04.exam01_overriding;

public class Computer extends Calculator {
	@Override
	// override를 통해 부모 객체와 '다른' 재정의 선언이 맞는지 확인한다.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}
