package sec16.exam01_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println(startDateTime);
		LocalDateTime endDateTime = LocalDateTime.of(2023, 1,1,12,0,1);
		System.out.println(endDateTime);
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("���� ��");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("���� �ð�");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("����");
		}
		
		System.out.print("������� ���� �ð�: ");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		System.out.println("���� ��: " + remainYear);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println("���� ��: " + remainMonth
				);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS
				);
		System.out.println("���� ��: " + remainDay);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS
				);
		System.out.println("���� �ð�: " + remainHour);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES
				);
		System.out.println("���� ��: " + remainMinute);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS
				
				);
		System.out.println("���� ��: " + remainSecond);
		
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		System.out.println("���� ��: " + remainYear);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		System.out.println("���� ��: " + remainMonth);
		remainDay = ChronoUnit.DAYS
				.between(startDateTime, endDateTime);
		System.out.println("���� ��: " + remainDay);
		
		// until, between ��� ����ص� ������ ���
		
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("���� �Ⱓ: " + period.getYears() + "�� ");
		System.out.print(period.getMonths() + "�� ");
		System.out.println(period.getDays() + "��");
		
		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("���� ��: " + duration.getSeconds());
		
	}

}
