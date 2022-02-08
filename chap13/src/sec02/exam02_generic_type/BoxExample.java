package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("박준영");
		String str = box.get();
		System.out.println(str);
		// 강제 타입 캐스팅 없이 그대로 반환 가능
		// int num = box.get();
		// box.get()이 반환하는 객체 타입은 String으로 고정된다. 
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(123456);
		int int1 = box2.get();
		// box2는 <Integer>로 제네릭 타입 명시하였기 때문에 get으로 바로 꺼내온다.
		System.out.println(int1);
	}

}
