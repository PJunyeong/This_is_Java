package sec16.exam01_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		// get date
		LocalDate currDate = LocalDate.now();
		System.out.println("current date: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2022, 2, 7);
		System.out.println("desired date: " + targetDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("currTime: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 1);
		System.out.println("targetTime: " + targetTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("currDateTime: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(targetDate, targetTime);
		System.out.println("targetDateTime: " + targetDateTime);
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("utcDateTime: " + utcDateTime);
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		for (String id: availableIDs) {
			System.out.println(id);
		}
		
		ZonedDateTime NewyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("utcDateTime: " + NewyorkDateTime);
		
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		// 충분한 차이값을 만들기 위한 현재 싱글 스레드 sleep
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("1 faster");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("2 faster");
		} else {
			System.out.println("same");
		}
		
		System.out.println("diff: " + instant1.until(instant2, ChronoUnit.NANOS));
	}

}
