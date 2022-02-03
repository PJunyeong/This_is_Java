package sec16.exam01_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		LocalDateTime targetDateTime = now
				.withYear(2024).withMonth(12).withDayOfMonth(5).withHour(13).withMinute(30).withSecond(20);
		System.out.println("manual change: " + targetDateTime);
		
		targetDateTime = null;
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("auto change: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("auto change2: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("auto change3: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("auto change4: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("auto change5: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("auto change6: " + targetDateTime);
	}
	

}
