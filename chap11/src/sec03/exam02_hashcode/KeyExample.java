package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// hashmap�� ���� key ��ü ��ȣ�� ���Ѵ�.
		hashMap.put(new Key(1), "���ؿ�");
		String value = hashMap.get(new Key(1));
		// equals���� num�� ������ true ȣ�������� hash code�� ���� �ٸ��� ������ equals�� ȣ���ϱ� ������ false return.
		// hashCode�� override�� �� �ٽ� ��!
		System.out.println(value);
		// hashCode�� �� �� ȣ�� ���� equals�� ȣ���Ѵ�!
	}

}
