package sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	// 객체, 배열 등은 deep copy를 통해 '자체'를 복제하자.
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Member cloned = (Member) super.clone();
		// thin copy를 먼저 cloned에 해놓는다!
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		//scores, car 등은 '새로' 복제해서 만든 객체를 대입한다.
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
		//deep_copy된 객체가 호출된다!
	}
}
