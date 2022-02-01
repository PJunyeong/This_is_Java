package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// hashmap을 통해 key 객체 번호를 비교한다.
		hashMap.put(new Key(1), "박준영");
		String value = hashMap.get(new Key(1));
		// equals에서 num만 같으면 true 호출하지만 hash code가 서로 다르기 때문에 equals를 호출하기 이전에 false return.
		// hashCode를 override한 뒤 다시 비교!
		System.out.println(value);
		// hashCode를 두 번 호출 이후 equals를 호출한다!
	}

}
