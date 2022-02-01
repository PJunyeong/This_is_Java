package sec04.exam04_logic;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		if ((charCode >= 65) & (charCode <=90)){
			System.out.println("Uppercase");
		}
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("Lowercase");
		}
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 digits");
			//char가 48 이상, 57 이하
		}
		// &, && 차이점은 &&는 전자가 false면 후자를 검사하지 않는다. 연산이 더 빠르다.
		
		int value = 6;
		
		if ((value%2 ==0) | (value%3==0)) {
			System.out.println("2 or 3 multiplied");
		}
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 or 3 multiplied");
		}
		// |, || 차이점은 ||는 전자가 true면 후자를 검사하지 않는다. 연산이 더 빠르다.
	}

}
