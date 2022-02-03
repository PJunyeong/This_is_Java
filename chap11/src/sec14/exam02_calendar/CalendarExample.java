package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + " " + month + " " + day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.SUNDAY:
			strWeek = "��";
			break;
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		default: strWeek = "��";	
		}
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + " " + minute + " " + second);
	}

}
