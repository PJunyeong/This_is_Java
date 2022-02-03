package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		for (int i=0; i <10; i++) {
			int num = (int) (Math.random()*45) + 1;
			System.out.println(num);
		}
		// 랜덤으로 정수 값을 리턴하는 방법. Math.random()은 0.0 이상 1.0 미만 값을 반환하기 때문에 int로 캐스팅 이후 시작 정수 값을 더한다!
		
	}

}
