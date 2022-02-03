package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(2);
		// seed 값을 줄 수 있다. 디폴트는 현재 시간
		System.out.print("선택 번호: ");
		for (int i = 0; i <6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		int[] winningNumber = new int[6];
		random = new Random(2);
		System.out.print("당첨 번호: ");
		for (int i = 0; i <6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(winningNumber, selectNumber);
		
		if (result) {
			System.out.println("당첨");
		} else {
			System.out.println("당첨 X");
		}
	}

}
