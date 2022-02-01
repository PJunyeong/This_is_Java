package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 74, 85, 100, 51};
		int sum = 0;
		for (int score: scores) {
			sum += score;
		}
		// for each를 사용해 간단하게 for 문을 처리한다.
		System.out.println("sum: " + sum);
		System.out.println("avg: " + (double) sum/scores.length);
	}

}
