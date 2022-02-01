package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4 == v5);
		// double과 float 간이 같은 값을 가지고 있어도 정밀도 차이가 존재한다.
		System.out.println((float)v4 == v5);
		// double -> float 강제 캐스팅 이후 비교하면 동일한 값이므로 true return.
		
		System.out.println((int)(v4*10)==(int)(v5*10));
	}

}
