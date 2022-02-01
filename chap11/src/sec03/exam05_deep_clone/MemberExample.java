package sec03.exam05_deep_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("박준영", 25, new int[] {90, 80, 70, 60}, new Car("그렌저"));
		Member cloned = original.getMember();
		
		System.out.println(original.name);
		System.out.println(original.age);
		for (int score: original.scores) {
			System.out.println(score);
		}
		
		System.out.println(original.car.model);
		
		
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		for (int score: cloned.scores) {
			System.out.println(score);
		}
		
		System.out.println(cloned.car.model);
		
		original.scores[0] = 100;
		System.out.println(original.scores[0]);
		System.out.println(cloned.scores[0]);
		original.car.model = "벤츠";
		System.out.println(original.car.model);
		System.out.println(cloned.car.model);
		// 배열, 객체 등은 deep copy를 통해 복사한다!
	}

}
