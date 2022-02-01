package sec04.exam07_condition;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 70;
		char grade = (score>90) ? 'A' : (score>80) ? 'B' : 'C';
		System.out.println("Score " + score + " is " + grade);
	
	}

}
