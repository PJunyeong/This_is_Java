package sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	// ��ü, �迭 ���� deep copy�� ���� '��ü'�� ��������.
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Member cloned = (Member) super.clone();
		// thin copy�� ���� cloned�� �س��´�!
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		//scores, car ���� '����' �����ؼ� ���� ��ü�� �����Ѵ�.
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
		//deep_copy�� ��ü�� ȣ��ȴ�!
	}
}
