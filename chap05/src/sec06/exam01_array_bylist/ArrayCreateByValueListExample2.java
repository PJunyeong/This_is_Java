package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {10, 20, 30};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		int sum2 = add(scores);
		System.out.println(sum2);
		
		int sum3 = add(new int[] {10, 20, 30});
		System.out.println(sum3);
		// �޼ҵ� �Ķ���ͷ� �迭�� �ѱ� �� new�� ����ؾ� �Ѵ�.
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0; i <3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
