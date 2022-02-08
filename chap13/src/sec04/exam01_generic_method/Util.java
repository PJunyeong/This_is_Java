package sec04.exam01_generic_method;

public class Util {
	public static <T> Box<T> boxing(T t){
		// generic method로 선언한다. 구체적인 T 타입의 t가 들어가 T를 리턴한다.
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
