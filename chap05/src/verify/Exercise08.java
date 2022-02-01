package verify;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for (int[] rows: array) {
			for (int col: rows) {
				sum += col;
				cnt += 1;
			}
		}
		// for each문으로 nested for 문을 풀 수 있다.
		avg = (double) sum / cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
