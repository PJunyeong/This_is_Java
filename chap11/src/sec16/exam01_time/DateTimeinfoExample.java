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
		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		DayOfWeek dow = now.getDayOfWeek();
		switch(dow) {
		case MONDAY:
			strDateTime += "������ ";
			break;
		case TUESDAY:
			strDateTime += "ȭ���� ";
			break;
		case WEDNESDAY:
			strDateTime += "������ ";
			break;
		case THURSDAY:
			strDateTime += "����� ";
			break;
		case FRIDAY:
			strDateTime += "�ݿ��� ";
			break;
		case SATURDAY:
			strDateTime += "����� ";
			break;
		default:
			strDateTime += "�Ͽ��� ";
		}
		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
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
