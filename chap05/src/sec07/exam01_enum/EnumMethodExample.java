package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SATURDAY;
		String name = today.name();
		System.out.println(name);
		// name �޼ҵ�
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		// ordinal �޼ҵ�
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		//compareTo �޼ҵ�. ���� ��ü �� �ε��� ��
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		// valueOf �޼ҵ�
		if (weekDay == Week.SUNDAY || weekDay == Week.SATURDAY) {
			System.out.println("�ָ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		Week[] days = Week.values();
		// values �޼ҵ�
		for (Week day: days) {
			System.out.println("DAY: " + day);
		}
		
	}

}
