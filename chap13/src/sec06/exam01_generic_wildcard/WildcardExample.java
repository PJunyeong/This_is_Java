package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildcardExample {
	public static void registerCourse(Course<?> course) {	
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));

	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));

	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));
		
		Course<Worker> workerCourse = new Course<>("������ ����", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<>("�л� ����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<>("����л� ����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
	}

}
