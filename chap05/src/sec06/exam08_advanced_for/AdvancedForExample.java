package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 74, 85, 100, 51};
		int sum = 0;
		for (int score: scores) {
			sum += score;
		}
		// for each�� ����� �����ϰ� for ���� ó���Ѵ�.
		System.out.println("sum: " + sum);
		System.out.println("avg: " + (double) sum/scores.length);
	}

}
