package sec16.exam01_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeinfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		DayOfWeek dow = now.getDayOfWeek();
		switch(dow) {
		case MONDAY:
			strDateTime += "월요일 ";
			break;
		case TUESDAY:
			strDateTime += "화요일 ";
			break;
		case WEDNESDAY:
			strDateTime += "수요일 ";
			break;
		case THURSDAY:
			strDateTime += "목요일 ";
			break;
		case FRIDAY:
			strDateTime += "금요일 ";
			break;
		case SATURDAY:
			strDateTime += "토요일 ";
			break;
		default:
			strDateTime += "일요일 ";
		}
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate();
		if (nowDate.isLeapYear()) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("utcDateTime: " + utcDateTime);
		
		ZonedDateTime SeoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("SeoulDateTime: " + SeoulDateTime);
		
		ZoneId seoulZoneId = SeoulDateTime.getZone();
		ZoneOffset seoulZoneOffset = SeoulDateTime.getOffset();
		System.out.println(seoulZoneId);
		System.out.println(seoulZoneOffset);
	}

}
