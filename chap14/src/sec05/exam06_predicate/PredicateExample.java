package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("박준영", "남자", 80),
			new Student("김원남", "남자", 70),
			new Student("이민정", "여자", 87),
			new Student("감예원", "여자", 77)
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
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("[남자 평균]: " + maleAvg);
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("[여자 평균]: " + femaleAvg);
		
	}

}
