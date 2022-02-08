package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1=  Util.<Integer>boxing(100);
		// <>을 통해 타입 파라미터를 명시화하였을 때 사전에 정해진다.
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("박준영");
		// <>에 정확한 타입 파라미터가 명시되지 않은 경우 컴파일러가 자동 추측.
		String strValue = box2.get();
		System.out.println(strValue);
	
	}	

}
