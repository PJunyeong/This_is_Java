package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SATURDAY;
		String name = today.name();
		System.out.println(name);
		// name 메소드
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		// ordinal 메소드
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		//compareTo 메소드. 열거 객체 간 인덱스 차
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		// valueOf 메소드
		if (weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
		}
		
		Week[] days = Week.values();
		// values 메소드
		for (Week day: days) {
			System.out.println("DAY: " + day);
		}
		
	}

}
