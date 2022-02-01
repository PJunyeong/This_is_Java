package sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
//		today = Week.SATURDAY;
		System.out.println(today == Week.SATURDAY);
		// today 변수가 가리키는 객체는 동일. '참조 객체'임을 주목.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
		}
		
		System.out.println(today);
		
		if (today == Week.SUNDAY) {
			System.out.println("오늘은 SUNDAY입니다!");
		} else {
			System.out.println("오늘은 공부하는 날이예요");
		}
	
	}

}
