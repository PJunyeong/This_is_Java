package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("���ؿ�", "����", 80),
			new Student("�����", "����", 70),
			new Student("�̹���", "����", 87),
			new Student("������", "����", 77)
			);
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student: list) {
			if (predicate.test(student)) {
				count += 1;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("[���� ���]: " + maleAvg);
		double femaleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("[���� ���]: " + femaleAvg);
		
	}

}
