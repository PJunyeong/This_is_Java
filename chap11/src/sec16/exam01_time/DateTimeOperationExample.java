package sec16.exam01_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("CurrTime: " + now);
		LocalDateTime targetDateTime = now.plusYears(1);
		System.out.println("targetDateTime: " + targetDateTime);
		
		
		targetDateTime = now.plusMonths(13);
		System.out.println("targetDateTime: " + targetDateTime);
		
		targetDateTime = now.plusDays(36);
		System.out.println("targetDateTime: " + targetDateTime);
	
		targetDateTime = now.minusHours(6);
		System.out.println("targetDateTime: " + targetDateTime);
	
		targetDateTime = now.minusMinutes(5);
		System.out.println("targetDateTime: " + targetDateTime);
		
		// 한 번에 연산 가능
		
		targetDateTime = now
				.plusYears(1)
				.plusMonths(4)
				.minusDays(5)
				.minusHours(10)
				.minusMinutes(10);
		System.out.println("targetDateTime: " + targetDateTime);
	}

}
