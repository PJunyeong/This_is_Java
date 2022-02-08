package sec04.exam02_generic_method;

public class Util {
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		//compare 메소드는 K, V 객체를 전달받아 비교하는 메소드
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
		// key, value 모두 같으면 true 리턴한다.
	}
}
