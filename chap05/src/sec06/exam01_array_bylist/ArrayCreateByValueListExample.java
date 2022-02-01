package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30};
		System.out.println("score[0]: " + scores[0]);
		System.out.println("score[1]: " + scores[1]);
		System.out.println("score[2]: " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ: " + sum);
		
		double avg = (double) sum / 3;
		System.out.println("Æò±Õ: " + avg);
	}

}
